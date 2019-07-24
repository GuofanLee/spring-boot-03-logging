package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBoot03LoggingApplicationTests.class);

    @Test
    public void contextLoads() {

        LOGGER.trace("这是trace日志");
        LOGGER.debug("这是debug日志");
        LOGGER.info("这是info日志");
        LOGGER.warn("这是warn日志");
        LOGGER.error("这是error日志");

    }

}
