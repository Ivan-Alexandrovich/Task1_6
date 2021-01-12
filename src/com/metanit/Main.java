package com.metanit;
/*Написать метод, которому в качестве параметра передается строка, обозначающая
имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Insert your name");
    String s = scanner.nextLine();
    Ex(s);
    }

    public static void Ex(String s) {
        System.out.println("Hello, " + s + "!");
    }
}
