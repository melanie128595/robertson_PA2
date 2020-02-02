
public class Encrypter 
{
	// the encrypt function is going to encrypt the integer the user enters
public static int Encrypt(int userinteger)
	{
	// declares the variables
int b;
int c;
int d;
int e;
// establishes the place values for the integers
b= userinteger/1000;
c= userinteger/100 %10;
d= userinteger/10 %10;
e= userinteger % 10;
// adds seven and divides by 10
b= (b+7) % 10;
c= (c+7) % 10;
d= (d+7) % 10;
e= (e+7) % 10;
// prints the encrypted value
System.out.println("Thank you, the encrypted value is:\n"+d+e+b+c);
// returns the variables
return (d*1000 + e*100 + b*10 + c);

	}
}
