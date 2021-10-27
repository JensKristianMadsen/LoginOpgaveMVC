package com.example.loginmvc.Repositories;

import com.example.loginmvc.Domain.Model.User;

public interface UserRepository {

  public User login(String email, String password);

  public User createUser(User user);
}
