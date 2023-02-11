package com.company.service.inter;


import com.company.bean.Config;

public interface SaveableProcess extends Process{
    default void process() {
        processLogic();
        Config.save();
    }
}
