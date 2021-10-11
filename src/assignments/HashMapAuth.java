package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapAuth {
    HashMap<String,String> users=new HashMap<>();
    HashMap<String,String> data=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void signup()
    {

            System.out.println("enter username");
            String name=sc.next();
            System.out.println("enter password");
            String password=sc.next();
            users.put(name,password);
            System.out.println("enter the data");
            String words=sc.next();
            data.put(name,words);



    }

    public void display()
    {
        System.out.print(users);
    }


    public void login()
    {
        System.out.println("enter the username");
        String name=sc.next();


        if(users.containsKey(name))
        {
            System.out.println("user is present");
            System.out.println("enter the password");
            String password=sc.next();
            if(users.containsValue(password))
            {
                System.out.println("password is sucessfull");
                if(data.containsKey(name))
                {
                    System.out.println("username: "+name+" "+"data "+data.values());
                }


            }
            else
            {
                System.out.println("password is incorrect");
            }

        }
        else {
            System.out.println("user is not present");
        }




    }
}

