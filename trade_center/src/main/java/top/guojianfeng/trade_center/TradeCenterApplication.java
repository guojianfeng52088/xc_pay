package top.guojianfeng.trade_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeCenterApplication {

    public static void main(String[] args) {
        System.out.println("交易中心module开始加载...");
        SpringApplication.run(TradeCenterApplication.class, args);
        System.out.println("交易中心module加载完毕...");
    }

}
