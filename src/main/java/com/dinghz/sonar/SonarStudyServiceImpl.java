package com.dinghz.sonar;

import java.util.Arrays;
import java.util.List;

/**
 * @author craneding
 * @date 15/12/30
 */
public class SonarStudyServiceImpl implements SonarStudyService {

    @Override
    public String sayHello(String message) {
        String tag;

        switch (message) {
            case "dinghz":
                tag = "Good";
                break;
            case "dingheze":
                tag = "HaHa";
                break;
            default:
                tag = "Bad";
                break;
        }

        return tag + " " + message;
    }

    @Override
    public void good() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        Object[] array = nums.stream().filter(num -> num % 2 == 0).toArray();

        System.out.println(Arrays.toString(array));
    }

}
