package sample.common.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import sample.common.dao.entity.Task;

@Mapper
public interface TaskMapper {

    // ページングでユーザー別取得
    List<Task> findPagedByUsername(@Param("username") String username,
                                   @Param("limit") int size,
                                   @Param("offset") int offset);
    // 全タスク取得
    List<Task> findAllTasks();

    // ユーザー別タスク件数
    int countAllByUsername(@Param("username") String username);

    // ID で検索
    Task findById(@Param("id") Long id);

    // タスク登録
    void insert(Task task);

    // タスク更新
    void update(@Param("task") Task task, @Param("username") String username);

    // タスク削除
    void delete(@Param("id") Long id, @Param("username") String username);
}
