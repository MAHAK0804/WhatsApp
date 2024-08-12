package com.example.whatsapp.Models;

public class Users {
    String pic,userName,mail,password,userId,lastMessage;

    public Users(String pic, String userName, String mail, String password, String userId, String lastMessage) {
        this.pic = pic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }
public  Users(){}

//    Sign Up constructor
public Users( String userName, String mail, String password) {
    this.userName = userName;
    this.mail = mail;
    this.password = password;

}
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
