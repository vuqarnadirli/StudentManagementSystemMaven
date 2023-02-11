package com.company.service.menu;


import com.company.bean.Config;
import com.company.bean.Student;
import com.company.service.inter.menu.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void processLogic() {
        Student[] allStudents = Config.instance().getStudents();

        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
        }
    }
}
