package assignments;

import java.util.Locale;
import java.util.Scanner;

public class SampleMorseCode {
    public static void main(String[] args) {
        char[] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        String[] str={"!","@","#","$","%","^","&","*","(",")",",","_",",","/","+","//","**","##","**#","__#","$*","^#%","$!","@$","#@$","&$@"};

        Scanner sc=new Scanner(System.in);
       System.out.println("enter the letter");

        String s=sc.next();
        String s1=s.toLowerCase();

        char c2[]=s1.toCharArray();


        for(int i=0;i<c2.length;i++)
        {
          for(int j=0;j<c.length;j++)
          {
              if(c2[i]==c[j])
              {
                  System.out.print(str[j]);
              }
          }

        }
    }

}
