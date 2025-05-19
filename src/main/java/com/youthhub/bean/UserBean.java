package com.youthhub.bean;

import com.youthhub.dao.UserDAO;
import com.youthhub.model.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UserBean implements Serializable {
    private User user = new User();
    private String loginEmail;
    private String loginPassword;

    private UserDAO userDAO = new UserDAO();

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getLoginEmail() { return loginEmail; }
    public void setLoginEmail(String loginEmail) { this.loginEmail = loginEmail; }

    public String getLoginPassword() { return loginPassword; }
    public void setLoginPassword(String loginPassword) { this.loginPassword = loginPassword; }

    public String register() {
        userDAO.registerUser(user);
        return "login.xhtml?faces-redirect=true";
    }

    public String login() {
        //System.out.println("Login attempt: " + loginEmail + " / " + loginPassword);
        boolean valid = userDAO.login(loginEmail, loginPassword);
        //System.out.println("Login valid? " + valid);
        return valid ? "index.xhtml?faces-redirect=true" : "login.xhtml?error=true";
    }

    public String logout() {
        user = new User();
        return "login.xhtml?faces-redirect=true";
    }
}
