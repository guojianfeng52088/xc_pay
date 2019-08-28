package top.guojianfeng.paygate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaygateApplication {

    public static void main(String[] args) {
        System.out.println("程序开始加载...");
        SpringApplication.run(PaygateApplication.class, args);
        System.out.println("程序加载完毕...");
    }

}
