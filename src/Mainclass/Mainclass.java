package Mainclass;

import java.util.Scanner;

public class Mainclass {
    public static void main(String args[]) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Excecutionclass obj = new Excecutionclass(n);
        System.out.println(obj.getCollatzString(n));
    }
}
