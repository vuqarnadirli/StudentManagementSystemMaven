package com.company.main;


import com.company.bean.Config;
import com.company.util.MenuUtil;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.showMenu();

//        System.out.println(StringUtils.isBlank("      ")); Apache commons Library
    }
}
