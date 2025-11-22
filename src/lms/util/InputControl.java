package lms.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import static lms.service.DataStore.BOOK_LIST;

public class InputControl {
    public static final Scanner SC = new Scanner(System.in);


    public static String safeString() {

        return SC.next();

    }

    public static int safeInt() {

        int getCount = SC.nextInt();

        try {
            if (getCount <= 0) {
                System.out.println("输入不合规 请重试");
            }


        } catch (InputMismatchException e) {
            System.out.println("! 输入不合规 (此处只可输入数字) \n请重试: ");
            SC.next();
        }


        return getCount;

    }
}