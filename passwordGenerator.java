import java.util.Random;

public class PasswordGenerator {
    
   
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

   
    public static String generatePassword(int length) {
      
        String validChars = LOWERCASE_CHARS + UPPERCASE_CHARS + NUMBERS + SPECIAL_CHARS;
        
    
        Random random = new Random();
        
       
        char[] password = new char[length];
        
    
        for (int i = 0; i < length; i++) {
           
            int randomIndex = random.nextInt(validChars.length());
            
       
            password[i] = validChars.charAt(randomIndex);
        }
        
     
        return new String(password);
    }
    
    public static void main(String[] args) {
        int passwordLength = 12; 
        String generatedPassword = generatePassword(passwordLength);
        
        
        System.out.println("Generated Password: " + generatedPassword);
    }
}

