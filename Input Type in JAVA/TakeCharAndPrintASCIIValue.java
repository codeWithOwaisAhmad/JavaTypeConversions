

import java.util.Scanner;

public class TakeCharAndPrintASCIIValue {
    char ch;
    int b;
    public static void main(String[] args) {
        TakeCharAndPrintASCIIValue takeCharAndPrintASCIIValue = new TakeCharAndPrintASCIIValue();
        takeCharAndPrintASCIIValue.takingCharAsInput();
        takeCharAndPrintASCIIValue.convertingToASCII();
        takeCharAndPrintASCIIValue.printingTheASCIIValue();
    }
    void takingCharAsInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value of Char: ");
        ch = scanner.next().charAt(0);
    }
    void convertingToASCII(){
        b = ch;
    }
    void printingTheASCIIValue(){
        System.out.println("The ASCII Value is: "+ b);
    }

}
