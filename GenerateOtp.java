import java.util.Random;
public class GenerateOtp {
    public static void main(String[] args){
        int Bound;
        Random random=new Random();
        int myOTP=random.nextInt(175678);
        System.out.println("your Otp is:"+myOTP);
    }
}
