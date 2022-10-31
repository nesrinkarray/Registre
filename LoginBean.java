package net.javaguides.login.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
    /**
     * Créons une classe LoginBean que nous utiliserons dans les balises d'action JSP.
     */
    private static final long serialVersionUID = 1 ;
    public String username;
    public String password;
    public LoginBean(String username,String password)
    {
    	this.username=username;
    	this.password= password;   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}