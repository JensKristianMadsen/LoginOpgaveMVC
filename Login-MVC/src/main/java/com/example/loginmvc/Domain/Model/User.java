package com.example.loginmvc.Domain.Model;

public class User {

  private int userID;
  private String userEmail;
  private String userPassword;

  public User(int userID, String userEmail, String userPassword) {
    this.userID = userID;
    this.userEmail = userEmail;
    this.userPassword = userPassword;
  }
  // Uden user-ID
  public User(String userEmail, String userPassword) {
    this.userEmail = userEmail;
    this.userPassword = userPassword;
  }

  public User() {
  }

  public int getUserID() {
    return userID;
  }

  public void setUserID(int userID) {
    this.userID = userID;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

}
