package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> A = new ArrayList<>();
        while (A.size()< 5){
            A.add(scanner.nextLine());
        }
        System.out.println("Список A: "+ A);

        ArrayList <String> B = new ArrayList<>();
        while (B.size()< 5){
            B.add(scanner.nextLine());
        }
        System.out.println("Список B: " + B);
        ArrayList <String> C = new ArrayList<>();
        A.addAll(B);

        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println(C);

        C.sort(Comparator.comparing(String::length));
        System.out.println(C);
    }
}
