package apple;

import apple.factory.IPhone11Factory;
import apple.factory.IPhoneFactory;
import apple.factory.IPhoneXFactory;
import apple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");

		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");

		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);

	}
}
