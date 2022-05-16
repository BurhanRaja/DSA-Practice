package com.Burhan;

import java.util.Scanner;

class Richie_Rich {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();

        for (int i = 0; i < t; i++) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            int x = inp.nextInt();

            richieRich(a, b, x);
        }

        inp.close();
    }

    static void richieRich(int a, int b, int x) {
        int ans = (b-a)/x;
        System.out.println(ans);
    }
}