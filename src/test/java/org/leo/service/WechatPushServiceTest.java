package org.leo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WechatPushServiceTest {

    @Test
    void test1() throws JsonProcessingException {

//       new WechatPushService().publish("hello");
        new WechatPushService().tempPush("oXNV46DQdQWkcWvMzrVpDNw8KtN0","leo","哇塞","http://changliu.science");
    }

}