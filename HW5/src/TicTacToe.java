public class TicTacToe
{
    //method to check for rows, columns, or diagnals that match
    public static void checkMatches(int[][] a)
    {
        if((a[0][0] == a[0][1] && a[0][0] == a[0][2]) || (a[1][0] == a[1][1] && a[1][0] == a[1][2]) || (a[2][0] == a[2][1] && a[2][0] == a[2][2]))
        {
            System.out.println("You have a horizontal match!");
        }
       
        if((a[0][0] == a[1][0] && a[0][0] == a[2][0]) || (a[0][1] == a[1][1] && a[0][1] == a[2][1]) || (a[0][2] == a[1][2] && a[0][2] == a[2][2]))
        {
            System.out.println("You have a vertical match!");
        }
       
        if((a[0][0] == a[1][1] && a[0][0] == a[2][2]) || (a[2][0] == a[1][1] && a[2][0] == a[0][2]))
        {
            System.out.println("you have a diagnal match!");
        }
    }
   
    public static void main(String[] args)

    {
        //inititates a new two dimentional array   
        int[][] ticBoard = new int[3][3];

        //cycles through each value in the array and adds a new int, 1 or 0 depending             on what the random 1, so a 50% chance for each.
        for(int i = 0; i < ticBoard.length; i++)
        {
            for(int j = 0; j < ticBoard[i].length; j++)
            {
                if(Math.random() > .5)
                {
                    ticBoard[i][j] = 1;
                }
                else
                {
                    ticBoard[i][j] = 0;
                }
                System.out.print(ticBoard[i][j] + " ");
            }
            System.out.println();
        }
       
        //executes the checkMatches method with ticBoard
        checkMatches(ticBoard);
    }
}