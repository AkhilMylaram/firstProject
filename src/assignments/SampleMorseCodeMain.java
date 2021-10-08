package assignments;

import java.util.Scanner;

public class SampleMorseCodeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Morse m1=new Morse();
        while(true)
        {
            System.out.println("enter w to convert word to morse code OR m to convert morse code to word ");
            String enter=sc.next();
            switch (enter)
            {
                case "w":
                    System.out.println("Converting word to morse code");
                    m1.toMorseCode();
                    System.out.println();
                    break;

                case "m":
                    System.out.println("converting morse code to word");
                    m1.toWord();
                    System.out.println();
                    break;
            }

            System.out.println("enter q to quit any other to contiue");
            String option=sc.next();
            if(option.equals("q"))
            {
                break;
            }
        }
    }
}
