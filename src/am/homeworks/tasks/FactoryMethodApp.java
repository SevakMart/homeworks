package am.homeworks.tasks;

import am.homeworks.tasks.checkFourDigits.EqualsOne;
import am.homeworks.tasks.checkFourDigits.EqualtyTwoNumbersSums;

import  java.util.Scanner;
public class FactoryMethodApp {
    
    public static void main(String[] args) {
        CheckNumber checkNumber;
        MethodName methodName;
        Scanner scanner =new Scanner(System.in);
        String className=scanner.nextLine();
        switch (className){
            case "EqualsOne":
                methodName = new EqualsOne();
                checkNumber = methodName.chekin();
                checkNumber.calculateResult();
                break;
            case "EqualtyTwoNumbersSums":
                methodName=new EqualtyTwoNumbersSums();
                checkNumber = methodName.chekin();
                checkNumber.calculateResult();
                break;
                default:
                    break;
        }



    }


}
