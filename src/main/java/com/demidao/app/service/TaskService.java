package com.demidao.app.service;

import com.demidao.app.model.Task;
import com.demidao.app.model.User;

public interface TaskService {

    Task createTask(User user, Task task);

    Task deleteTask(User user, Task task);

    Task updateTask(User user, Task task);



}
