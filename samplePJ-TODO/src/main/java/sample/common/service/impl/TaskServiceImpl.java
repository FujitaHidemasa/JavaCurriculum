package sample.common.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.common.dao.entity.Task;
import sample.common.dao.mapper.TaskMapper;

@Service
public class TaskServiceImpl implements sample.common.service.TaskService {

	
	private final TaskMapper taskMapper;
	
	
	public TaskServiceImpl(TaskMapper taskMapper) {
		this.taskMapper=taskMapper;
	}
	
	@Override
	public List<Task> getTaskPaged(String username, int page, int size){
		
		int offset = (page - 1)*size;
		System.out.println("--- 最終デバッグ: findPagedByUsername パラメータ ---");
	    System.out.println("Username: [" + username + "]");
	    System.out.println("LIMIT: " + size + ", OFFSET: " + offset);
	    System.out.println("-------------------------------------------------");
		
		return taskMapper.findPagedByUsername(username, offset, size);
	}
	
	@Override
	public int getTaskCount(String username) {
		return taskMapper.countAllByUsername(username);
	}
	
	
	@Override
	public Task getTaskById(Long id, String username) {
		Task task = taskMapper.findById(id);
		return (task != null && task.getUsername().equals(username)) ? task : null;
	}
	
	@Transactional
	@Override
	public void insertTask(Task task, String username) {
		
		LocalDateTime now = LocalDateTime.now().withNano(0);
		task.setCreatedAt(now);
		task.setUpdatedAt(now);
		
		task.setUsername(username);
		taskMapper.insert(task);
	}
	
	@Transactional
	@Override
	public void updateTask(Task task, String username) {
		task.setUpdatedAt(LocalDateTime.now().withNano(0));
		taskMapper.update(task, username);
	}
	
	@Transactional
	@Override
	public void deleteTask(Long id, String username) {
		taskMapper.delete(id, username);
	}
	
	@Override
	public List<Task> getAllTasks() {
	    return taskMapper.findAllTasks();
	}

	
}
