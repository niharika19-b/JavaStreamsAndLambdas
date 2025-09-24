package lambda_ex;
import java.util.function.*;

public class functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//predicate
				Predicate<String> isLongName = name -> name.length() > 6;

				System.out.println(isLongName.test("Niharika")); 
				System.out.println(isLongName.test("Amita"));     

				
				//consumer
				Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
				greet.accept("Niharika");
				
				//supplier
				Supplier<Double> randomValue = () -> Math.random();
				System.out.println("Random Value: " + randomValue.get());
				
				//otp generate
				Supplier<String> otpGenerator = () -> String.valueOf((int)(Math.random() * 10000));

				System.out.println("Your OTP is: " + otpGenerator.get());

	}

}
