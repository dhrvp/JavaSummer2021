
public class Homework4_7 {
public static void main(String[] args) {
int aMonthNumber = ReadUserInput.readUserIntegerInput("Enter month number: ");
int aYear = ReadUserInput.readUserIntegerInput("Enter year: ");
switch ((aMonthNumber)) {
case 1: System.out.println("January has 31 days in the year " + aYear);
break;
case 2:
if ((aYear % 4 == 0))
System.out.println("Febuary has 29 days in the year " + aYear);
else
System.out.println("Febuary has 28 days in the year " + aYear);	
break;
case 3: System.out.println("March has 31 days in the year " + aYear);
break;
case 4: System.out.println("April has 30 days in the year " + aYear);
break;
case 5: System.out.println("May has 31 days in the year " + aYear);
break;
case 6: System.out.println("June has 30 days in the year " + aYear);
break;
case 7: System.out.println("July has 31 days in the year " + aYear);
break;
case 8: System.out.println("August has 31 days in the year " + aYear);
break;
case 9: System.out.println("September has 30 days in the year " + aYear);
break;
case 10: System.out.println("October has 31 days in the year " + aYear);
break;
case 11: System.out.println("November has 30 days in the year " + aYear);
break;
case 12: System.out.println("December has 31 days in the year " + aYear);
break;
default:
	System.out.println("This is invalid");
}
}
}
