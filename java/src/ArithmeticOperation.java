import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        String nums;
		
		Scanner sc = new Scanner(System.in);
		nums = sc.nextLine();
        String[] array = nums.split(" ");

		System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
        System.out.println(Integer.parseInt(array[0]) - Integer.parseInt(array[1]));
        System.out.println(Integer.parseInt(array[0]) * Integer.parseInt(array[1]));
        System.out.println(Integer.parseInt(array[0]) / Integer.parseInt(array[1]));
        System.out.println(Integer.parseInt(array[0]) % Integer.parseInt(array[1]));
        sc.close();
    }
}
