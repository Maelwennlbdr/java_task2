import java.util.Scanner;

public class factorilal {
    public factorilal(){}
    public void getFactorial() throws OutOfRange{
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number between 1 and 10 : ");
        int number = input.nextInt();
        int fact=1, temp=number;
        if((number<1) || (number>10)){
            throw new OutOfRange();
        }else {
            while (temp>1){
                fact*=temp;
                temp--;
            }
            System.out.println("The factorial of " + number + " is " + fact + ".");
        }
    }
}
