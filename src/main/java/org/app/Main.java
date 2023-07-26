package org.app;

//WRITE A PROG THAT COMPARES YOUR SCORE TO THE AVERAGE SCORE OF A CLASS SCORE WITH YOUR SCORE
//EXCLUDED. PRINT TRUE IF YOU'RE ABOVE AVG AFTER COMPARING & FALSE IF NOT
public class Main {
    public static void main(String[] args) {

        int[] classPoints = new int[]{20, 4, 16, 15, 14, 17, 18, 12, 13};

        int sum = 0;
        int size = classPoints.length;
        for (int i = 0; i < size; i++) {
            sum = sum + classPoints[i];
        }
        int myPoint=0;
        sum += myPoint;
//Notice the use of pre-increment(ie the value is increased by 1 before division happens)
        myPoint = 18;
        int avgScore = sum / ++size;
        if (myPoint > avgScore) {
            System.out.println("IM BAAAD!!!");
        } else {
            System.out.println("WORK HARDER!!!");

        }
    }
}
