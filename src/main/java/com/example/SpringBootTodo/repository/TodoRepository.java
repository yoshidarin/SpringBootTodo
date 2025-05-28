package com.example.SpringBootTodo.repository;

import com.example.SpringBootTodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Repositoryクラスであることを示す
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByDoneFlg(boolean done_flg);


}
