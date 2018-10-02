 import java.util.Scanner;

   public class tictacexample extends Game {

public static void main(String[] args) {
        char player='o';
        int row,column;
        Scanner k =  new Scanner (System.in);
        Game g = new Game ();

        g.initializeGame();
        System.out.println("Let the game begins !\n");

while(true)
{   
player=g.changePlayer(player);
System.out.print(" \nChoose your place.. hurry up! (row, column): ");
row=k.nextInt();
column=k.nextInt();

    while (g.checkIfLegal(row,column))
    {
    System.out.println("That slot is not valid, try again (row, column).");
    g.displayBoard();
    row=k.nextInt();
    column=k.nextInt();
    }
g.changeBoard(player,row,column );
g.displayBoard();

if(g.checkIfWinner())
    {
    System.out.println("\nAnd the winner is you "+ player+" !");
    break;

    }
if(g.checkIfTie())
    {
        System.out.println("\nThe game is draw! hahahahah");
        break;
    }
}


    }

    }
	
	
