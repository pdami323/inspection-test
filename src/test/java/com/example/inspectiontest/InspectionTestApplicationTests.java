package com.example.inspectiontest;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class InspectionTestApplicationTests {


    @Test
    void test(){
        String member1 = "a";
        String member2 = "b";

        // isEqualTo는 ==, isSameAs는 ref 비교
//        Assertions.assertThat(member1).isEqualTo(member2);
        log.info("test");
        log.info("test2");
        log.info("test3");
        log.info("test4");
        log.info("test5");
    }

}
