package com.example.loginmvc.Controllers;

import com.example.loginmvc.Domain.Service.GetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GetController {
  private GetService getService = new GetService();

  @PostMapping("/login")
  public String loginInput(@RequestParam("userEmail") String userEmail, @RequestParam("userPassword") String userPassword) throws LoginSampleException {
    //Retrieve values from HTML form via WebRequest/???@RequestParam???
     boolean input = getService.validateLogin(userEmail, userPassword);
    if(input == true)
      return "redirect:/yes";//end pont = yes
    else
      // If passwords don't match, an exception is thrown
      throw new LoginSampleException("The email or password that you've entered doesn't match any account ");
  }

  @GetMapping("/yes")
  public String validateInput() {
    return "l";
  }
  @ExceptionHandler(LoginSampleException.class)
  public String handleError(Model model, Exception exception) {
    model.addAttribute("message",exception.getMessage());
    return "exceptionPage";
  }
}
