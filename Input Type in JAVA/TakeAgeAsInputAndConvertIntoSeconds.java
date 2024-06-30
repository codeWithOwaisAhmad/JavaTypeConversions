import java.util.Scanner;

public class TakeAgeAsInputAndConvertIntoSeconds {
    int age;
    int ageInSeconds;
    public static void main(String[] args) {
        TakeAgeAsInputAndConvertIntoSeconds takeAgeAsInputAndConvertIntoSeconds = new TakeAgeAsInputAndConvertIntoSeconds();
        takeAgeAsInputAndConvertIntoSeconds.takingAgeAsInput();
        takeAgeAsInputAndConvertIntoSeconds.convertingAgeIntoSeconds();
        takeAgeAsInputAndConvertIntoSeconds.printingAgeInSeconds();
    }
    void takingAgeAsInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Age: ");
        age = scanner.nextInt();
    }
    void convertingAgeIntoSeconds(){
        ageInSeconds = age * 365 * 24 * 60;
    }
    void printingAgeInSeconds(){
        System.out.println("The AGE in Seconds Is: "+ ageInSeconds);
    }
}
