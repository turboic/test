package com.example.test.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 每间隔10秒输出时间
     */
    //@Scheduled(fixedRate = 1000)
    public void startTaskScheduleExecute(){
        logger.info("定时任务，现在时间："+System.currentTimeMillis());
        logger.error("傻逼");
    }

    //@Scheduled(fixedRate = 1000)
    public void endTaskScheduleExecute(){
        logger.info("好好学习");
        logger.error("天天向上");
    }
}