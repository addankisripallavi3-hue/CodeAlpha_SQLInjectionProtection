public class LoginUser {
 public static void main(String[] args) {
	      
	        RegisterUser.register("Pallavi", "abc");

	      
	        String uname = "Pallavi";
	        String pass = "abc";

	        String originalPassword = AESUtil.decrypt(RegisterUser.password);

	        boolean userCheck = uname.equals(RegisterUser.username);

	  
	        boolean passwordCheck = pass.equals(originalPassword);

	
	        if (userCheck && passwordCheck) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Invalid Credentials");
	        }
	    }
	}
