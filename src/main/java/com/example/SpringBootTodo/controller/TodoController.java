package com.example.SpringBootTodo.controller;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class TodoController {
    @Autowired private  TodoRepository repository;

    //  Read
    @GetMapping("/")
    public String showAllTodo(@ModelAttribute Todo todo, Model model) {
        model.addAttribute("todos", repository.findAll());
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
