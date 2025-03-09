import calculator.Calculators;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculators obj = new Calculators();

        System.out.println("Enter first value: ");
        double value1 = input.nextInt();

        System.out.println("Enter opertor (+,-,*,%): ");
        char operator = input.next().charAt(0);

        System.out.println("Enter second value: ");
        double value2 = input.nextInt();

        if(operator == '+'){
            System.out.println(obj.Add(value1,value2));
        }else if(operator == '-'){
            System.out.println(obj.subtract(value1,value2));
        }else if(operator == '*'){
            System.out.println(obj.multiply(value1,value2));
        }else if(operator == '%'){
            System.out.println(obj.divide(value1,value2));
        }
    }
}