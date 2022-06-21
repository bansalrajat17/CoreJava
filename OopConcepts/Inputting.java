package OopConcepts;

import java.util.Scanner;

public class Inputting {

    //Q1 - LCM Asked in InfoEdge

    Integer LCM(Integer n1, Integer n2) {
        Integer lcm = n1;
        Integer greaterNo = (n1 > n2 ? n1 : n2);
        for (int i = greaterNo; i <= n1 * n2; i = i + greaterNo) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;break;
            }
        }
        return lcm;
    }

    void lcmInfoEdge() {
        try (Scanner sc = new Scanner(System.in)) {
            Integer T = sc.nextInt();
            Integer[][] a = new Integer[T][2];
            for (Integer i = 0; i < T; i++) {
                for (Integer j = 0; j < 2; j++) {
                    a[i][j] = sc.nextInt();
                }
                System.out.println(LCM(a[i][0], a[i][1]));
            }
        }

    }

}
