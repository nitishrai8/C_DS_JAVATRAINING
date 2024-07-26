import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter weight in kilogram");
        double weight= scanner.nextDouble();
        System.out.println("Enter your height in meter");
        double height= scanner.nextDouble();

       double BMI=(weight)/(height*height);
        System.out.println("BMI is:" +BMI);
        if(BMI<18.5) {
            System.out.println("Normal weight:" + BMI);
        }
            else if (BMI > 18.5 && BMI < 24.8 ){
            System.out.println("Normal weight:");

        }
        else {
            System.out.println("Over weight:");

        }



    }
}
