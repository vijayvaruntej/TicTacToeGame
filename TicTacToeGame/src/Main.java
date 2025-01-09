import  java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        char player = 'O';
        char[][] gameBoard = new char[3][3];
        boolean gameover = false;

        System.out.println("<<<------- Welcome to Tic Tac Toe Game ------>>>");

        loading(1);

        System.out.println("NOTE: The row and column numbers of this Tic Tac Toe Board.");
        System.out.println("   0 1 2 ");
        System.out.println("0 | | | |");
        System.out.println("1 | | | |");
        System.out.println("2 | | | |");
        System.out.println("Now Start the game.");

        for(int i=0; i<gameBoard.length; i++)
        {
            for(int j=0; j<gameBoard.length; j++)
            {
                gameBoard[i][j] = ' ';
            }
        }

        while(!gameover)
        {

            player = (player == 'O')? 'X' : 'O';
            System.out.println("Player '"+player+"' ");
            System.out.println("Enter Row : ");
            int row = scanner.nextInt();
            System.out.println("Enter Column : ");
            int column = scanner.nextInt();

            if(gameBoard[row][column] == ' ')
            {
                gameBoard[row][column] = player;
                gameBoardFun(gameBoard);
            }
            else
            {
                gameBoardFun(gameBoard);

                System.out.println("Alread value exist. Please put value in another place..!");
                player = (player == 'X')? 'O' : 'X';
            }

            if(won(gameBoard,player))
            {

                System.out.println("Player '"+player+ "' won the match.");
                gameover = true;
            }
        }

    }

    public static boolean won(char[][] gameBoard, char player)
    {
        if(gameBoard[1][1]==player && gameBoard[2][2]==player && gameBoard[3][3]==player) return true;
        if(gameBoard[2][0]==player && gameBoard[1][1]==player && gameBoard[0][2]==player) return true;

        for(int row =0 ; row<3 ; row++)
        {
                if(gameBoard[row][0]==player && gameBoard[row][1]==player && gameBoard[row][2]==player) return true;
        }
        for(int col =0 ; col<3 ; col++)
        {
            if(gameBoard[0][col]==player && gameBoard[1][col]==player && gameBoard[2][col]==player) return true;
        }
        return false;

    }


    public static void gameBoardFun(char[][] gameBoard)
    {
        for(int i=0; i<gameBoard.length; i++)
        {

            System.out.print("|");
            for(int j=0; j<gameBoard.length; j++)
            {
                System.out.print(gameBoard[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }
    public static  void loading( long seconds) throws InterruptedException {
        System.out.print("Loading ");
        for(int i=0; i<3; i++)
        {
            Thread.sleep(seconds*1000);
            System.out.print(". ");
        }
        System.out.println();

    }

}
