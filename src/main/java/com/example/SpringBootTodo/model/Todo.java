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
    @Column(name = "done_flg")
    private boolean doneFlg;

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

    public boolean getDoneFlg() {
        return doneFlg;
    }

    public void setDoneFlg(boolean doneFlg) {
        this.doneFlg = doneFlg;
    }
}
