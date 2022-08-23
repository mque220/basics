import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        String b = sc.next();
        System.out.println(a * Integer.parseInt(b.substring(2,3)));
        System.out.println(a * Integer.parseInt(b.substring(1,2)));
        System.out.println(a * Integer.parseInt(b.substring(0,1)));
        System.out.println(a * Integer.parseInt(b));
        sc.close();
    }    
}
