import java.util.Scanner;  //need for input
public class addition{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = input.nextInt();
        System.out.print("Enter end number: ");
        int end = input.nextInt();
        int sum = 0;
        if(start < end){
            sum = start;
            while(start < end){start = start+1;
                sum += start;
            };
            System.out.printf("Result is: %d", sum);
        }
        else if (start == end){
            sum = start;
            System.out.printf("Result is: %d", sum) ;
        }
        else{
            System.out.println("Wrong input");
        }
    }
}

