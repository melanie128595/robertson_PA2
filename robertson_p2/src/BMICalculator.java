// allows for use to call the scanner
import java.util.Scanner;
public class BMICalculator 
{
	// calls the read user data function
public void readUserData()
{
	// calls the read unit type function
	readUnitType();
	// calls the get weight function
	getWeight();
	// calls the get height function
	getHeight();
	readMeasurementData();
}
private int readUnitType()
{
	// calls the scanner
	Scanner read = new Scanner(System.in);
	// declares the variables
	int unittype;
	int metric;
	int imperial;
	// asks the user about units
	System.out.println("Would you like to enter your measurements in metric units(kilograms) or imperial(pounds)?");
	System.out.println("Enter 1 for metric and 2 for imperial\n");
	metric=1;
	imperial=2;
	unittype=read.nextInt();
	// closes the values for the integer
	return unittype;
}
// calls the read measureent data function
private void readMeasurementData()
{
	// calls the read metric data and read imperial data function
readMetricData();
readImperialData();
}
// calls the read metric data function
private int readMetricData()
{
	// declares the integers
	int BMI;
	int weight;
	int height;
	// calls the setweight and setheight function
	setWeight(weight);
	setHeight(height);
	// sets up the BMI formula
	BMI=weight/height;
	return BMI;
}
// calls the read imperial data function
private void readImperialData()
{
	int BMI;
	int weight;
	int height;
	// BMI formula for imperial units
	BMI=(703*weight)/height;
}
// calls the calculate BMI function which calculcates the BMI
public void calculateBmi()
{
	// calls the metric data and imperial data function to calculate bmi
	readMetricData();
	readImperialData();
}
// calls the function that will calculate BMI category
private void calculateBmiCategory()
{
	// gives the bmi values and the categories
if(BMI<18.5)
{
	System.out.printf("underweight");
}
else if(BMI<25)
{
	System.out.printf("normal");
}
else if(BMI<30)
{
	System.out.printf("overweight");
}
else
{
	System.out.printf("obese");
}
}
// displays the BMI
public void displayBmi()
{
	// calls the getBMI function and the getBMIcategory function
	getBmi();
	getBmiCategory();
}
//calls the get weight function
public int getWeight()
{
	// uses scanner to get user input
	Scanner read = new Scanner(System.in);
	int weight;
	// asks for user to enter weight
	System.out.println("Please enter your weight\n");
	weight=read.nextInt();

	return weight;
}
// calls the set weight function
private int setWeight(int getWeight)
{
	int weight;
	// closes the program if the weight is negative
	if (weight < 0)
		System.exit(0);
	return weight;
}
// calls the get height function
public int getHeight()
{
	// uses scanner to get height
	Scanner read = new Scanner(System.in);
	int height;
	// asks user to enter height
	System.out.println("Please enter your height\n");
	height=read.nextInt();
	// closes the scanner
	read.close();
	return height;
}
// calls the set height function
private int setHeight()
{
	// declares the variables
	int height;
	int feet;
	height=feet*12;
	// closes the program if the height value is negative
	if (height < 0)
		System.exit(0);
	return height;
}
// calls the get BMI function
public void getBmi()
{
	// calls the calculate bmi function
	calculateBmi();
}
// calls the getBMIcategory function
public void getBmiCategory()
{
	// calls the calculatebmicategory function
	calculateBmiCategory();
}
// main function
public static void main(String[] args)
{
	// calls the BMIcalculator application
BMICalculator app = new BMICalculator();
// calls readuserdata method
app.readUserData();
// calls calculate bmi method
app.calculateBmi();
// calls display bmi method
app.displayBmi();
	}
}

