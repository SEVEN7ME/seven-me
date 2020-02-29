package xyz.sunf.seven.me.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author 孙飞
 * @date 2020-03-01 3:59
 */
@Slf4j
@Configuration
@EnableScheduling
public class AutoJob {

    @Scheduled(cron = "0/1 * * * * ? ")
    public void index(){
        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
