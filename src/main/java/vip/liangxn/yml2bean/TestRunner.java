package vip.liangxn.yml2bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author xn
 * 2018/9/29 19:22
 */
@Component
@Order(1)
public class TestRunner  implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(TestRunner.class);

    @Resource
    private PersonBean personBean;

    @Override
    public void run(ApplicationArguments args) {
        try {
            LOG.info(personBean.toString());
        } catch (Exception e) {
            LOG.error("TestRunner error:", e);
        }
    }
}
