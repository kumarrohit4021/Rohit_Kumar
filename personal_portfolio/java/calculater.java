package java;

import java.util.Scanner;

public class calculater { public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("welcome in calculator");
    System.out.println("chose the given arthimatic function to perform the particular operation");
    System.out.println("enter the first number");
    float fir = sc.nextFloat();
    System.out.println("enter the second number");
    float sec  = sc.nextFloat();
    System.out.println("for addition chose 1");
    System.out.println("for substraction chosee 2");
    System.out.println("for multiplication chose 3");
    System.out.println("for devide chosee 4");
    int a = sc.nextInt();
    switch(a){
        case 1: System.out.println("you chosee addition");
                float add = fir + sec;
                System.out.println("the result is :" +add );
                break ;
        case 2: System.out.println("you chosee substraction");
                float sub = fir - sec;
                System.out.println("the result is :"+ sub);
        case 3: System.out.println("you chosee multiplication");
                float mul = fir*sec;
                System.out.println("the result is :"+ mul);
                break;
        case 4: System.out.println("you chose the devide");
                float div = fir/sec;
                System.out.println("the result is :"+ div);
                break;
        default:System.out.println("you enterd invalid number");




    }
    sc.close();
    }
    
}
