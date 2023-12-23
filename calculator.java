import java.util.*;
public class calculator {
public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum= a+b;
    int subtraction= a-b;
    int multiplication= a*b;
     int division= a/b;
    int button=sc.nextInt();
    switch(button){
       case 1: 
    System.out.println(sum);
    break;
        case 2:
    System.out.println(subtraction);
    break;
        case 3:
        System.out.println(multiplication);
        break;
        case 4:
        System.out.println(division);
    break;
        default:
        System.out.println("invalid authentication");
    }
}
}