package edu.neu.csye7374;

import java.util.Scanner;

public class SportyCoupeAuto implements AutoAPI{

    @Override
    public double getPrice() {
        return 5000;
    }

    @Override
    public String getDescription() {
        return "SportyCoupeAuto with decorators:";
    }

    public static void demo(){
        Scanner input = new Scanner(System.in);
        int k;
        for(int i=0 ;i<3 ;i++) { // loop to display 3 different test cases
            AutoAPI autoAPI=new SportyCoupeAuto(); // base auto Class
            System.out.println("Choose Decorator for modification:-");
            System.out.println("1. Bumper to Bumper Warrantee \n2. Air Conditioning \n3. Blind-Side Detection Monitor \n4. Anti Braking System \n5. All wheel Drive \n-1 None\n");
            System.out.print("Enter your choice:- ");
            k=input.nextInt();
            System.out.println();
            while(k!=-1) {
                if(k==1)
                    autoAPI=new BB(autoAPI);
                else if(k==2)
                    autoAPI=new AC(autoAPI);
                else if(k==3)
                    autoAPI=new BDM(autoAPI);
                else if(k==4)
                    autoAPI=new ABS(autoAPI);
                else if(k==5)
                    autoAPI=new AWD(autoAPI);
                else
                    System.out.println("*** Incorrect input *** \t Enter right choice");
                System.out.println("For additional modification select the option or else enter -1");
                k=input.nextInt();
            }


            System.out.println("\nTotal Cost: "+ autoAPI.getPrice());
            System.out.println("Final description with the Modifications:-\n"+autoAPI.getDescription());
            System.out.println("________________________________________________________________");
        }
    }
}
