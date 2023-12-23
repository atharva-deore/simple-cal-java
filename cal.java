import java.util.Scanner;

public class cal {
    public static void main(String[] args) 
    {
    Scanner myObj1= new Scanner(System.in);
    int ans=0;
    int choice=1;
    System.out.println("\nEnter 1st Number: ");
    int x= myObj1.nextInt();
    System.out.println("\nEnter 2nd Number: ");
    int y=myObj1.nextInt();

    while(choice!=5){
         System.out.println("\nEnter yor choice: ");
        System.out.println("\n1.Addition \n2.Subtration \n3.Multiplication \n 4.Division  \n5.Exit");
    choice=myObj1.nextInt();
        switch(choice)
        {
            case 1:
                ans=x+y;
                 System.out.println("\nAddition: "+ans);
                 break;
            case 2:
                ans=x-y;
                System.out.println("\nSubtraction: "+ans);
                break;
            case 3:
                ans=x*y;
                System.out.println("\nMultiplication: "+ans);
                break;
            case 4:
                ans=x/y;
                System.out.println("\nDivision: "+ans);
                break;
            case 5:
                break;
                
                
        }
    }
    
    }

}
