

import java.util.Scanner;

public class TakeDoubleAndCastToInt {
    double d;
    int a;
    public static void main(String[] args) {
            TakeDoubleAndCastToInt takeDoubleAndCastToInt = new TakeDoubleAndCastToInt();
            takeDoubleAndCastToInt.takingDoubleAsInput();
            takeDoubleAndCastToInt.castingDoubleToInt();
            takeDoubleAndCastToInt.printingCastedValue();
    }
    void takingDoubleAsInput(){
        System.out.println("Enter a value in Double: ");

        Scanner scanner = new Scanner(System.in);
        d = scanner.nextDouble();
    }
    void castingDoubleToInt(){
         a = (int)d;
    }
    void printingCastedValue(){
        System.out.println("The Casted Value is: "+ a);
    }
}
