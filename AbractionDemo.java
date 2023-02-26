package basicoops;

abstract class CommonFeatures{
	void login() {
		System.out.println("User Logged In");
	}
	abstract void ContentAccess();
}

class FreeUser extends CommonFeatures{

	@Override
	void ContentAccess() {
		System.out.println("Limited IPL with ADS");
	}
	
}
class VipUser extends CommonFeatures{

	@Override
	void ContentAccess() {
		System.out.println("Full IPL with ADS ");
	}
	void Payment() {
		System.out.println("Payment Method");
	}
	
}

public class AbractionDemo {

	public static void main(String[] args) {
		CommonFeatures v=new VipUser();
		v.login();
		

	}

}
Hello Shubham ..ls
