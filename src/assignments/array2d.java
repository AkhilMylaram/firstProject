package assignments;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int index=1;
        int[][] a =new int[2][2];
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<index;i++)
       {
           for(int j=0;j<index;j++)
           {
               System.out.println("enter the number:");
               a[i][j]=sc.nextInt();
           }
       }
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j]);

            }
            System.out.println();
        }

    }
}
