package ru.netology.sqr;

public class SQRService {

    public int calculate (int startRange, int finishRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
             if (i * i >= startRange) {
                 if (i * i <= finishRange) {
                     count = count + 1;

                 }
             }
        }
        return count;
    }
}
