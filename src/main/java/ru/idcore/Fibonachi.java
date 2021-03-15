package ru.idcore;

public class Fibonachi {
    public static long getNumber(long member) {
        long x1 = 1;
        long x2 = 1;

        for (long i = 2; i < member; i++) {
            x2 = x1 + x2;
            x1 = x2 - x1;
        }
        return x2;
    }
}
