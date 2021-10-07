package assignments;

import java.util.Scanner;

public class Arraysingnup {
    public static void main(String[] args) {
    signup();
    }
    public static  void signup()
    {
        int index=0;
        String [] username=new String[2];
        String [] password=new String[2];
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("enter the username");
            String name=sc.next();
            System.out.println("enter the password");
            String pass=sc.next();
            if(index>=2)
            {
                System.out.println("array is full");
            }
            else
            {

                username[index]=name;
                password[index]=pass;
                index++;
            }
            System.out.println("enter q to quit or any other to continue");
            String option=sc.next();
            if(option.equals("q"))
            {
                break;
            }
        }

        for(String i:username)
        {
            System.out.println(i);
        }
        for(String j:password)
        {
            System.out.println(j);
        }
       System.out.println("enter the username");
        String us=sc.next();
        String ps = "";

        
        for(int i=0;i<username.length;i++)
        {
            if(us.equals(username[i]))
            {
                System.out.println("login sucessfull");
                System.out.println("enter the password");
                ps=sc.next();
                
            }

           
            for(int j=0;j<password.length;j++)
            {
                if(ps.equals(password[j]))
                {
                    
                    System.out.println("password login sucessfull");
                    break;
                }

            }


        }

    }

}
