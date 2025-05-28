package com.example.SpringBootTodo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "spring_boot_todo")
@Entity // データの入れ物であるEntityクラスであることを指定する
public class Todo {
    @Id // Entityの主キーを設定する
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Entityの値を自動採番する
    private Long id;
    private String content;
    private int done_flg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDone_flg() {
        return done_flg;
    }

    public void setDone_flg(int done_flg) {
        this.done_flg = done_flg;
    }
}
