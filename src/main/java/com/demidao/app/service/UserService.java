package com.demidao.app.service;

import com.demidao.app.model.Task;
import com.demidao.app.model.User;

public interface UserService {

    User create(User user);

    User delete(User user);

    Task addNewTask(User user, Task task);

    Task deleteTask(User user, Task task);

    Task updateTask(User user, Task task);

}
