//Allows the program to use scanner to read in info
import java.util.Scanner;

public class Application
{
	// program that will get the user's integer
public static int getFourDigitIntegerFromUser() 
{
	// calls the scanner
Scanner find = new Scanner(System.in);
// declares the integer 
int userinteger;
// asks the user to enter a four digit number
System.out.println("Please enter a four digit integer you wish to encrypt:\n");
userinteger=find.nextInt();
// closes all values for the integer
return userinteger;
}
// program that will get the encrypted number the user wishes to decrypt
public static int getEncryptedNumber()
{
	// calls the scanner
Scanner find = new Scanner(System.in);
// declares the variable
int encryptedinteger;
// askes the user to enter the encrypted number they want to decrpyt 
System.out.print("Enter the encrypted number you would like to decrypt:\n");
encryptedinteger=find.nextInt();
// closes the scanner
find.close();
// closes the values for the integer
return encryptedinteger;
}
// main program that will run the encrypter and decrypter program
public static void main(String[] args)
{
	// calls the get four digit inter function
int userinteger = getFourDigitIntegerFromUser();
// calls the encrypt function from the encrypter class
Encrypter.Encrypt(userinteger); 
// calls the encrypt number function
int encryptedinteger = getEncryptedNumber();
// calls the decrypt function from the decrypter class
Decrypter.Decrypt(encryptedinteger);
}

}
