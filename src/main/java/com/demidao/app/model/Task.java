package com.demidao.app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @Column(name = "task")
    private String task;

    @Column(name = "dateOfNotification")
    private Date dateOfNotification;


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDateOfNotification() {
        return dateOfNotification;
    }

    public void setDateOfNotification(Date dateOfNotification) {
        this.dateOfNotification = dateOfNotification;
    }
}
