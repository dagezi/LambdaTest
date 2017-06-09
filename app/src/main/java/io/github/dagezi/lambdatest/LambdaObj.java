package io.github.dagezi.lambdatest;

public class LambdaObj {
    public static void main() {
        for (int i = 0; i < 2; ++i) {
            hoge(new Runnable() {
                @Override
                public void run() {
                }
            });
        }
    }

    static void hoge(Runnable r) {
        System.out.println(r);
    }
}