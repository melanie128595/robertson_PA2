public class Decrypter 
	{
// runs the decrypt program based on the encryptedinteger
public static int Decrypt(int encryptedinteger)
	{
// declares the variables
int b;
int c;
int d;
int e;
// sets each integer in the right place (hundreds, tens)
b= encryptedinteger/1000;
c= encryptedinteger/100 %10;
d= encryptedinteger/10 %10;
e= encryptedinteger % 10;
// adds three since the encrypted integer added 7
b= (b+3) % 10;
c= (c+3) % 10;
d= (d+3) % 10;
e= (e+3) % 10;
// states the decrypted value
System.out.println("Thank you, the decrpyted value is:\n"+d+e+b+c);
// returns the variables
return (d*1000 + e*100 + b*10 + c);
	
    }

}

