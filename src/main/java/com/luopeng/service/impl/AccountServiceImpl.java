package com.luopeng.service.impl;


//import com.luopeng.factory.BeanFactory;
import com.luopeng.service.IAccountService;

import java.sql.SQLOutput;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

//    public AccountServiceImpl(String name){
//        System.out.println("对象创建了");
//    }

    // 第一种方式：使用默认构造函数创建。
    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void init() {
        System.out.println("对象初始化了。。。");
    }

    public void destory() {
        System.out.println("对象销毁了。。。");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了。");
    }
}
