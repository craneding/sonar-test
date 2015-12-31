package com.dinghz.sonar;

import org.junit.Test;

/**
 * @author craneding
 * @date 15/12/30
 */
public class TestSonarStudyService {

    SonarStudyService service = new SonarStudyServiceImpl();

    @Test
    public void testSayHello1() {
        String message = service.sayHello("dinghz");

        org.junit.Assert.assertEquals("Good dinghz", message);
    }

    @Test
    public void testSayHello2() {
        String message = service.sayHello("dingheze");

        org.junit.Assert.assertEquals("HaHa dingheze", message);
    }

    @Test
    public void testSayHello3() {
        String message = service.sayHello("nono");

        org.junit.Assert.assertEquals("Bad nono", message);
    }

    @Test
    public void testGood() {
        service.good();
    }

}
