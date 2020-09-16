import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int binary2 = Integer.parseInt(binary);
        int returned_decimal = 0;
        int power = 0;
        while (true){
            if (binary2 == 0){
                break;
            }
            else {
                int tempvar = binary2 % 10;
                returned_decimal += tempvar*Math.pow(2,power);
                binary2 = binary2 / 10;
                power++;
            }
        }
        return returned_decimal;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a binary number: ");
        String binary = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(binary));
        scan.close();
    }
}
