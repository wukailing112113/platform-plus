package com.platform;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformPlusApplicationTests {

    @Test
    public void contextLoads() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

    }

}
