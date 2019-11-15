package com.feng.bash.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;


/**
 * @Classname GetUserInfoService
 * @Description TODO
 * @Date 2019/10/25 13:45
 * @Created by FengYu
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GetUserInfoService {

    private ReentrantLock reentrantLock;

    private Integer num = 0;

    public String get(String str) {
        try {
            System.out.println("数值为：" + num++);
            //Thread.sleep(10000);
            System.out.println("线程" + Thread.currentThread().getId() + "调用成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }



}
