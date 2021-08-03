
public class TicTacToeApp {

public static void main(String[] args) {

TicTacToeGame game = new TicTacToeGame();
char ps = 'X';
while (game.isGameOver().equals(" Incomplete ")) {
	game.printGame();
System.out.println("Player Symbol: " + ps);
int cellnum = ReadUserInput.readUserIntegerInput("Enter Cell Number for Turn: ");
game.playTurn(cellnum, ps);
if(game.isGameOver().equals("Draw ") || game.isGameOver().equals("Player 1 Won the Game! ") || game.isGameOver().equals("Player 1 Won the Game! ")) {
System.out.println(game.isGameOver());
System.out.println();
System.out.println("Final Game Summary: ");
System.out.println();
game.printGame();
}
if (ps == 'X') {
	ps = 'O';
}else {
	ps = 'X';
}
}
}
}


