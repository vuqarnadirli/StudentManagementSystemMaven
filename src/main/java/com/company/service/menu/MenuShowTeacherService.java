package com.company.service.menu;


import com.company.bean.Config;
import com.company.bean.Teacher;
import com.company.service.inter.menu.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[] allTeachers = Config.instance().getTeachers();

        for (int i = 0; i < allTeachers.length; i++) {
            System.out.println(allTeachers[i]);
        }
    }
}
