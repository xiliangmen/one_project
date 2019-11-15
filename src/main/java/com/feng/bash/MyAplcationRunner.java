///**
// * Copyright (C), 2019-9999, 喜梁门科技有限公司
// * FileName: MyRunner
// * Author:   xlm
// * Date:     2019/4/22 9:06
// * Description: myruner
// * QQ:475788922
// */
//package com.feng.bash;
//
//import com.feng.bash.thread.MyThread;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//public class MyAplcationRunner implements ApplicationRunner {
//
//	@Resource
//	private MyThread myThread;
//
//	@Override
//	public void run(ApplicationArguments args) {
//		try {
//
//			for (int i = 1; i <=10; i++) {
//				new MyThread().start();
//			}
//		} catch (Exception e) {
//			System.out.println("启动失败！抛出异常:"+e.getMessage());
//		}
//	}
//}
//
