package com.zeo.sec.rmi;

import java.rmi.Naming;

public class RMIClient{

    public static void main(String[] args) {
        try {
            // 查找远程RMI服务 rmi://127.0.0.1:1099/test
            RMITestInterface rt = (RMITestInterface) Naming.lookup(
                    "rmi://127.0.0.1:1099/test");

            // rt 调用远程接口 RMITestInterface类 的test方法
            String result = rt.test();

            // 输出RMI方法调用结果
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

