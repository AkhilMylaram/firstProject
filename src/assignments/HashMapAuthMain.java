package assignments;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAuthMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMapAuth h1=new HashMapAuth();
        while(true)
        {
            System.out.println("enter s for signup and l for login and d to display all the users present signed up");
            String enter=sc.next();
            switch (enter)
            {
                case "s":
                    System.out.println("signup");
                    h1.signup();
                    break;



                case "l":
                    System.out.println("Login");
                    h1.login();
                    break;
                case "d":
                    System.out.println("Users Signed Up");
                    h1.display();
                    break;
            }




            System.out.println("enter q to quit and any other to continue");
            String option=sc.next();
            if(option.equals("q"))
            {
                break;
            }



        }

    }
}
