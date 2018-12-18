package com.hwua.md5;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.DigestUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Md5ApplicationTests {

    @Test
    public void contextLoads() {
        String username="张三";
        String password="123456";
        String s = DigestUtils.md5Hex(username+password);
        System.out.println("s = " + s);
//
     //   asHex = ea000b6d22e95b5ae874453918efa533
     //   s = 786b60dcffbbe1e2a042bc77697c1762


//      String s=username+password;
//        String asHex = DigestUtils.md5DigestAsHex(s.getBytes());
//        System.out.println("asHex = " + asHex);
    }

}

