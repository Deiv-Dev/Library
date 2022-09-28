package com.main;

import java.awt.event.ActionEvent;

public class AdminController {
    public void Login(javafx.event.ActionEvent event){
    }

    public void Register(javafx.event.ActionEvent event){
        Admin admin = new Admin();
        admin.adminRegister();
        System.out.println("veikia!");
    }
}
