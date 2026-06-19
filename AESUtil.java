public class AESUtil {

    public static String encrypt(String password) {
        String result = "";

        for (int i = 0; i < password.length(); i++) {
            result = result + (char)(password.charAt(i) + 3);
        }

        return result;
    }

    public static String decrypt(String password) {
        String result = "";

        for (int i = 0; i < password.length(); i++) {
            result = result + (char)(password.charAt(i) - 3);
        }

        return result;
    }

    public static void main(String[] args) {

        String password = "Pallavi123";

        String encryptedPassword = encrypt(password);
        System.out.println("Encrypted Password: " + encryptedPassword);

        String decryptedPassword = decrypt(encryptedPassword);
        System.out.println("Decrypted Password: " + decryptedPassword);
    }
}
