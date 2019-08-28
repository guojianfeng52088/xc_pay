package top.guojianfeng.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {
        System.out.println("common模块开始加载...");
        SpringApplication.run(CommonApplication.class, args);
        System.out.println("common模块加载完毕...");
    }

}
