package sample.thymeleaf.web;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import sample.common.dao.entity.Login;
import sample.common.dao.entity.Task;
import sample.common.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	
    private final TaskService taskService;
    
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String list(@RequestParam(defaultValue = "1") int page, Model model, HttpSession session) {

        String username = getUsername(session);

        // ★修正: usernameがnullの場合、ログインページにリダイレクト
        if (username == null) {
            // 例外処理をせずに、未ログインユーザーをログイン画面に誘導
            return "redirect:/login"; // ログイン画面のパスに合わせてください
        }
        
        int pageSize = 10;

        // 絞り込みに、セッションから取得したそのままの username を使用
        var tasks = taskService.getTaskPaged(username, page, pageSize);
        int totalTasks = taskService.getTaskCount(username);

        int totalPages = (int) Math.ceil((double) totalTasks / pageSize);
        if (totalPages < 1) totalPages = 1;

        model.addAttribute("tasks", tasks);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "tasks/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        Task task = new Task();
        task.setStartDate(LocalDate.now());
        task.setEndDate(LocalDate.now().plusDays(1));
        model.addAttribute("task", task);
        return "tasks/form-new";
    }

    @PostMapping
    public String createTask(@ModelAttribute Task task, HttpSession session) {
        String username = getUsername(session);
        if (username == null) return "redirect:/login"; // 未ログイン時のガード

        // 💡 ユーザー名の大文字小文字を保持したままDBに保存
        task.setName(username);
        taskService.insertTask(task, username);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String showEditFrom(@PathVariable Long id, Model model, HttpSession session) {
        String username = getUsername(session);
        if (username == null) return "redirect:/login"; // 未ログイン時のガード
        
        Task task = taskService.getTaskById(id, username);

        if (task == null) {
            return "redirect:/tasks"; // 他人のタスクならリダイレクト
        }
        model.addAttribute("task", task);
        return "tasks/form-edit";
    }

    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute Task task, HttpSession session) {
        String username = getUsername(session);
        if (username == null) return "redirect:/login"; // 未ログイン時のガード
        
        task.setId(id);
        task.setUsername(username);
        taskService.updateTask(task, username);
        return "redirect:/tasks";
    }
    
    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id, HttpSession session) {
        String username = getUsername(session);
        if (username == null) return "redirect:/login"; // 未ログイン時のガード
        
        taskService.deleteTask(id, username);
        return "redirect:/tasks";
    }

    // ★修正: ログ出力を削除し、nullチェックだけ残す
    private String getUsername(HttpSession session) {
        Login login = (Login) session.getAttribute("login");
        
        if (login == null) {
            // loginがnullの場合は、nullを返す
            return null; 
        }
        return login.getUsername();
    }
    
    // /test メソッドはデバッグコードのため削除推奨ですが、残します
    @GetMapping("/test")
    public String test(Model model) {
        var tasks = taskService.getAllTasks();
        // System.out.println(tasks); // ログ削除
        model.addAttribute("tasks", tasks);
        return "tasks/list";
    }
}