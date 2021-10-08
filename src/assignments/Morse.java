package assignments;

import java.util.Scanner;

public class Morse {
    char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};
    String[] str = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", ",", "_", ",", "/", "+", "//", "**", "##", "**#", "__#", "$*", "^#%", "$!", "@$", "#@$", "&$@"};

    public void toMorseCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word ");

        String s = sc.next();
        String s1 = s.toLowerCase();

        char c2[] = s1.toCharArray();


        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c2[i] == c[j]) {
                    System.out.print(str[j]);
                }
            }

        }
    }

    public void toWord() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MorseCode use spaces for each letter ");
        String s1 = sc.nextLine();
        String code=s1;
        String [] s3= code.split(" ");


       for(int i=0;i<s3.length;i++)
       {
           for(int j=0;j<str.length;j++)
           {
               if(s3[i].equals(str[j]))
               {
                   System.out.print(c[j]);
               }
           }
       }



    }
}


