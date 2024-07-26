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
        if(BMI<18.5)
            System.out.println("under weight:" + BMI);
            else if (BMI >= 18.5 && BMI < 24.9 )
            System.out.println("healthy weight:");
            else if (BMI>=24.9 && BMI<30)
                System.out.println("Over weight");
            else if (BMI>=30)
                System.out.println("obesity");

            }




        }





