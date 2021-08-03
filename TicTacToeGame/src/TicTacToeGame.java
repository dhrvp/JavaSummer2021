
public class TicTacToeGame {

	public static char[] cellvalue = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

public boolean playTurn (int aCellNumber, char aSymbol) {
	if (cellvalue[aCellNumber - 1] == ' ') {
		cellvalue[aCellNumber - 1] = aSymbol;
return true;
} else {
		System.out.println("Invalid Input, Please Try Again ");
return false;
		}
}
public String isGameOver() {
if ((cellvalue[0] == 'O' && cellvalue[1] == 'O' && cellvalue[2] == 'O' || cellvalue[3] == 'O' && cellvalue[4] == 'O' && cellvalue[5] == 'O' || cellvalue[6] == 'O' && cellvalue[7] == 'O' && cellvalue[8] == 'O')) {	
	return "Player 2 Won the Game! ";
} else if ((cellvalue[0] == 'O' && cellvalue[3] == 'O' && cellvalue[6] == 'O' || cellvalue[1] == 'O' && cellvalue[4] == 'O' && cellvalue[7] == 'O' || cellvalue[2] == 'O' && cellvalue[5] == 'O' && cellvalue[8] == 'O' ))	{
	return "Player 2 Won the Game! ";
} else if ((cellvalue[0] == 'O' && cellvalue[4] == 'O' && cellvalue[8] == 'O' || cellvalue[2] == 'O' && cellvalue[4] == 'O' && cellvalue[6] == 'O')) {
	return "Player 2 Won the Game! ";
} else if ((cellvalue[0] == 'O' && cellvalue[1] == 'X' && cellvalue[2] == 'X' || cellvalue[3] == 'X' && cellvalue[4] == 'X' && cellvalue[5] == 'X' || cellvalue[6] == 'X' && cellvalue[7] == 'X' && cellvalue[8] == 'X')) {	
	return "Player 1 Won the Game! ";
} else if ((cellvalue[0] == 'O' && cellvalue[3] == 'X' && cellvalue[6] == 'X' || cellvalue[1] == 'X' && cellvalue[4] == 'X' && cellvalue[7] == 'X' || cellvalue[2] == 'X' && cellvalue[5] == 'X' && cellvalue[8] == 'X' ))	{
	return "Player 1 Won the Game! ";
} else if ((cellvalue[0] == 'O' && cellvalue[4] == 'X' && cellvalue[8] == 'X' || cellvalue[2] == 'X' && cellvalue[4] == 'X' && cellvalue[6] == 'X')) {
	return "Player 1 Won the Game! ";
}

if (cellvalue[0] != ' ' && cellvalue[1] != ' ' && cellvalue[2] != ' ' && cellvalue[3] != ' ' && cellvalue[4] != ' ' && cellvalue[5] != ' ' && cellvalue[6] != ' ' && cellvalue[7] != ' ' && cellvalue[8] == 'X' )	{
	return "Its a Draw";
}
	return "Incomplete";
}
public void printGame() {
	printRow(1);
	System.out.println("\t\t-------------------------------");		
	printRow(2);
	System.out.println("\t\t-------------------------------");
	printRow(3);
	System.out.println();
}
private void printRow (int aRowNum) {
	if(aRowNum == 1) {
	System.out.println("\t1\t|\t2\t|\t3\t|");
	System.out.println("\t\t|\t\t|\t\t|");
	System.out.println("\t" + cellvalue[0] + "\t|\t" + cellvalue[1] + "\t|\t" + cellvalue[2] + "\t|");
	}else if (aRowNum == 2) {
	System.out.println("\t4\t|\t5\t|\t6\t|");
	System.out.println("\t\t|\t\t|\t\t|");
	System.out.println("\t" + cellvalue[3] + "\t|\t" + cellvalue[4] + "\t|\t" + cellvalue[5] + "\t|");
	}else if (aRowNum == 3)	{
	System.out.println("\t7\t|\t8\t|\t9\t|");
	System.out.println("\t\t|\t\t|\t\t|");
	System.out.println("\t" + cellvalue[6] + "\t|\t" + cellvalue[7] + "\t|\t" + cellvalue[8] + "\t|");
	
	}	
}
}
