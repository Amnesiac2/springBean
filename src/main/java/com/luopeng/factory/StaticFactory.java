package com.luopeng.factory;

import com.luopeng.service.IAccountService;
import com.luopeng.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类(该类可能存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数)
 */
public class StaticFactory {
    // 第三种方式：使用工厂中的静态方法创建对象(使用某个类中的静态方法创建对象，并存入spring容器中)
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
