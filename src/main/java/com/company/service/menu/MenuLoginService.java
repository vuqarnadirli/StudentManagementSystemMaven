package com.company.service.menu;


import com.company.bean.Config;
import com.company.service.inter.menu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password");
        String password = sc2.nextLine();

        if (!(username.equals("user") && password.equals("11111"))) {
            throw new IllegalArgumentException("user or password is invalid");
        }

        Config.setLoggedIn(true);
    }
}
