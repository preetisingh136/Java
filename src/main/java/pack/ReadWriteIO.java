package pack;

import java.util.Scanner;

public class ReadWriteIO {
    public static void main(String args[]){
        //Read Input using Scanner class
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0; i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for(int j=0;j<a.length;j++) {
            System.out.println(a[j]);
        }
    }
}
