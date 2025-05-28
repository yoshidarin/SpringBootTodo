package com.example.SpringBootTodo.controller;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TodoController {
    @Autowired private  TodoRepository repository;

    //  Read
    @GetMapping("/")
    public String showAllTodo(@RequestParam(name = "done", required = false) String done, @ModelAttribute Todo todo, Model model) {
        List<Todo> todos;
        if ("true".equals(done)) {
            todos = repository.findByDoneFlg(true);
        } else if ("false".equals(done)) {
            todos = repository.findByDoneFlg(false);
        } else {
            todos = repository.findAll();
        }
        model.addAttribute("todos",  todos);
        return "index";
    }

    //  Create
    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        repository.save(todo);
        return "redirect:/";
    }

    //  Update
    @PostMapping("/edit")
    public String editTodo(@ModelAttribute Todo todo) {
        repository.save(todo);
        return "redirect:/";
    }

    //  Delete
    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
