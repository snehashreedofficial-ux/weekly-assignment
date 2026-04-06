import java.util.Scanner;
public class SI {
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time, si;
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        time = sc.nextDouble();
        si = calculateSI(principal, rate, time);
        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
        sc.close();
    }
}