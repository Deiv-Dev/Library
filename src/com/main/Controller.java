package com.main;

import javafx.event.ActionEvent;

public class Controller {
    public void pressButton(ActionEvent event){
        Admin admin = new Admin();
        admin.adminRegister();
        System.out.println("veikia!");
    }
}
