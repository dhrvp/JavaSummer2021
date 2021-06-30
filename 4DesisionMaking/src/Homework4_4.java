
public class Homework4_4 {
public static void main(String[] args) {
String name = ReadUserInput.readUserStringInput("Student Name : ");

int math = ReadUserInput.readUserIntegerInput("Math Marks : ");
int english = ReadUserInput.readUserIntegerInput("English Marks : ");
int latin = ReadUserInput.readUserIntegerInput("Latin Marks : ");
int science = ReadUserInput.readUserIntegerInput("Science Marks : ");
int tmarks = (math+english+latin+science);
int omarks = (tmarks/4);
String sname = "Subject";
String smarks = "Marks";
String ggrades = "Grade";
System.out.println("Student Name : " + name);
System.out.println("-------------------------------------");
System.out.println("Subject         | Marks   | Grade   |");
System.out.println("-------------------------------------");
	if ( math >=90)
		System.out.println("Math            | " + math + "      |   A+    | ");
	else if (math<90 && math>=80)
		System.out.println("Math            | " + math + "      |   A     | ");
	else if ( math >=70 && math < 80) 
		System.out.println("Math            | " + math + "      |   B+    | ");
	else if (math >= 60 && math < 70)
		System.out.println("Math            | " + math + "      |   B     | ");
	else if (math >= 50 && math < 60)
		System.out.println("Math            | " + math + "      |   C     | ");
	else 
		System.out.println("Math            | " + math + "      |   Fail  | ");

System.out.println("-------------------------------------");

if ( english >=90)
	System.out.println("English         | " + english + "      |   A+    | ");
else if (english<90 && english>=80)
	System.out.println("English         | " + english + "      |   A     | ");
else if ( english >=70 && english < 80) 
	System.out.println("English         | " + english + "      |   B+    | ");
else if (english >= 60 && english < 70)
	System.out.println("English         | " + english + "      |   B     | ");
else if (english >= 50 && english < 60)
	System.out.println("English         | " + english + "      |   C     | ");
else 
	System.out.println("English         | " + english + "      |   Fail  | ");
		
System.out.println("-------------------------------------");

if ( latin >=90)
	System.out.println("Latin           | " + latin + "      |   A+    | ");
else if ( latin<90 && latin>=80)
	System.out.println("Latin           | " + latin + "      |   A     | ");
else if ( latin >=70 && latin < 80) 
	System.out.println("Latin           | " + latin + "      |   B+    | ");
else if (latin >= 60 && latin < 70)
	System.out.println("Latin           | " + latin + "      |   B     | ");
else if (latin >= 50 && latin < 60)
	System.out.println("Latin           | " + latin + "      |   C     | ");
else 
	System.out.println("Latin           | " + latin + "      |   Fail  | ");

System.out.println("-------------------------------------");

if ( science >=90)
	System.out.println("Science         | " + science + "      |   A+    | ");
else if ( science<90 && science>=80)
	System.out.println("Science         | " + science + "      |   A     | ");
else if ( science >=70 && science < 80) 
	System.out.println("Science         | " + science + "      |   B+    | ");
else if (science >= 60 && science < 70)
	System.out.println("Science         | " + science + "      |   B     | ");
else if (science >= 50 && science < 60)
	System.out.println("Science         | " + science + "      |   C     | ");
else 
	System.out.println("Science         | " + science + "      |   Fail  | ");

System.out.println("-------------------------------------");
System.out.println("Overall             | " + tmarks + "                 | ");
if ( omarks >=90)
	System.out.println("Overall %       | " + omarks + "%      |   A+    | ");
else if ( omarks<90 && omarks>=80)
	System.out.println("Overall %       | " + omarks + "%      |   A     | ");
else if ( omarks >=70 && omarks < 80) 
	System.out.println("Overall %       | " + omarks + "%      |   B+    | ");
else if (omarks >= 60 && omarks < 70)
	System.out.println("Overall %       | " + omarks + "%      |   B     | ");
else if (omarks >= 50 && omarks < 60)
	System.out.println("Overall %       | " + omarks + "%      |   C     | ");
else 
	System.out.println("Overall %       | " + omarks + "%      |   Fail  | ");
}
}