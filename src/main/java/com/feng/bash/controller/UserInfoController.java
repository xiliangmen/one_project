package com.feng.bash.controller;

import com.feng.bash.service.GetUserInfoService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Classname UserInfoController
 * @Description TODO
 * @Date 2019/10/25 13:46
 * @Created by FengYu
 */
@RestController
@RequestMapping("/api")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserInfoController {

    @Resource
    private GetUserInfoService getUserInfoService;


    private ReentrantLock reentrantLock;

    private Integer num = 0;

    @RequestMapping(value = "/getuser/{str}")
    public String getuser(@PathVariable String str) {
        System.out.println("当前request线程为：" + Thread.currentThread().getId());
        return getUserInfoService.get(str);
    }

    @RequestMapping(value = "/lock")
    public String lock() {
        System.out.println("主线程为：" + Thread.currentThread().getId());
        for (int i = 5; i > 0; i--) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前request线程为：" + Thread.currentThread().getId());
                    service();
                }
            });
            thread.start();
        }
        return "";
    }

    public void service() {
        //上锁
        try {
            reentrantLock.lock();
            num++;
            System.out.println(Thread.currentThread().getId() + "：被锁定");
        } finally {
            System.out.println(num);
            reentrantLock.unlock();
        }
    }

    public void py() {
        //上锁
        try {
            reentrantLock.lock();
            num++;
            System.out.println(Thread.currentThread().getId() + "：被锁定");
        } finally {
            System.out.println(num);
            reentrantLock.unlock();
        }
    }
}
