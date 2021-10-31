package com.demidao.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "chatId")
    private String chatId;
    @Column(name = "isActive")
    private boolean isActive;

    @OneToMany
    @JoinColumn(name = "userId")
    @JsonIgnore
    private List<Task> tasks;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> taskList) {
        this.tasks = taskList;
    }


}
