package com.example.loginmvc.Domain.Service;

import com.example.loginmvc.Controllers.LoginSampleException;
import com.example.loginmvc.Domain.Model.User;
import com.example.loginmvc.Repositories.GetRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GetService {

  private GetRepository getRepository = new GetRepository();

  public Boolean validateLogin(String userEmail, String userPassword) {

    User user = getRepository.validateLogin(userEmail, userPassword);
    return (user != null);
  }

}
