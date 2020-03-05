package unit3;

import java.util.Random;

import java.util.Scanner;

public class Hometask301a {

    public static void main(String[] args) {
        int correctAnswers = 0;
        Random numGenerator = new Random();
        Scanner inputScanner = new Scanner(System.in);
        int[] nums =  new int[2];
        while(correctAnswers != 3) {
            nums[0] = numGenerator.nextInt(9)+1;
            nums[1] = numGenerator.nextInt(9)+1;
            System.out.print(nums[0]+" * "+nums[1]+" = ");
            int answer = inputScanner.nextInt();
            if(answer == nums[0]*nums[1]) {
                System.out.println("Верное значение.");
                ++correctAnswers;
            }
            else
                System.out.println("Неверное значение");
        }
        System.out.println("Завершение.");
    }   
}