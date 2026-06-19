public class RegisterUser {

	    static String username, password;

	    public static void register(String uname, String pass) {
	        username = uname;
	        password = AESUtil.encrypt(pass);

	        System.out.println("User Registered Successfully");
	        System.out.println("Encrypted Password = " + password);
	    }
	}
