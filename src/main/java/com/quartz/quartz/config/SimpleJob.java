package com.quartz.quartz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**********************************************************************************************
 * @program: Quartz
 * @description:
 * @author: TanYanQing
 * @email: 449330962@qq.com
 * @create: 2020-05-07 20:37
 **********************************************************************************************/

@Configuration
@EnableScheduling   //开启任务调度
public class SimpleJob {

    @Scheduled(cron = "0/2 * * * * ?")

    public void run(){
        System.out.println("==============进行任务调度===============>     "+ LocalDateTime.now());
    }

}
