package oopconcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inputting {

    // InfoEdge DoSelect
    // Q1 - LCM

    private Integer LCM(Integer n1, Integer n2) {
        Integer lcm = n1;
        Integer greaterNo = (n1 > n2 ? n1 : n2);
        for (int i = greaterNo; i <= n1 * n2; i = i + greaterNo) {
            if (i % n1 == 0 && i % n2 == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }

    // TAKING INPUT THROUGH SCANNER

    void inputtingByScanner() {
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

    //TAKING INPUT THROUGH BUFFER READER

    void inputByBufferReader() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            Integer T = Integer.parseInt(stringTokenizer.nextToken());
            Integer[][] a = new Integer[T][2];
            for (Integer i = 0; i < T; i++) {
                for (Integer j = 0; j < 2; j++) {
                    a[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                }
                System.out.println(LCM(a[i][0], a[i][1]));
            }
        }
    }

}
