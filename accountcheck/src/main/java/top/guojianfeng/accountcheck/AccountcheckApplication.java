package top.guojianfeng.accountcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountcheckApplication {

    public static void main(String[] args) {
        System.out.println("对账系统module开始加载...");
        SpringApplication.run(AccountcheckApplication.class, args);
        System.out.println("对账系统module加载完毕...");
    }

}
