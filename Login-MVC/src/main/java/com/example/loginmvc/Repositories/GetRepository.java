package com.example.loginmvc.Repositories;

import com.example.loginmvc.Domain.Model.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetRepository {

  //1. Get a connection to database
  //2. Prepare statement
  //3. Set the parameters
  //4. Execute SQL query
  //5. Display the result set


  public User validateLogin(String userEmail,String userPassword) {
    User user = null;
    String mySql;
    PreparedStatement ps;
    try {
      //1. Get a connection to database
      Connection con = DBManager.getConnection();
      //2. Prepare statement
      mySql = "SELECT * FROM `login-mvc`.user_info WHERE user_email = ? and user_password = ?";

      ps = con.prepareStatement(mySql);
      //3. Set the parameters //index 0
      ps.setString(1, userEmail);
      ps.setString(2, userPassword);

      //Resultset kører igennem databasen
      ResultSet myRs = ps.executeQuery();
      while (myRs.next()) {//index 0
        user = new User(myRs.getString(1), myRs.getString(2));
      }

    } catch (SQLException notValidate) {
      System.out.println("Not Validate");
    }
    return user;
  }
}
