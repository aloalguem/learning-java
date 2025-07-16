import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char[][] board = {
              {'_', '_', '_'},
              {'_', '_', '_'},
              {'_', '_', '_'}
            };

            printBoard(board);

            for(int i = 0; i < 9; i++){
              if((i%2) == 0){
                System.out.print("\nTurn: X\n");
                int[] choice = askUser(board);
                board[choice[0]][choice[1]] = 'X';
              }else{
                System.out.print("\nTurn: O\n");
                int[] choice = askUser(board);
                board[choice[0]][choice[1]] = 'O';
              }
              printBoard(board);

              int score = checkWin(board);

              if(score == 3){
                System.out.println("X Wins!");
                break;
              }else if(score == -3){
                System.out.println("Y Wins");
                break;
              }else if(i == 8){
                System.out.println("Its a draw!");
              }

            }
        
            scan.close();
        }
    
     public static void printBoard(char[][] array){

        System.out.print("\n");
        for(int i = 0; i < array.length; i++){
          System.out.print("      ");
          for(int j = 0; j < array[i].length; j++){
            System.out.print(array[i][j]);
            System.out.print("  ");
          }
          System.out.print("\n");
        }
     }


     public static int[] askUser(char[][] array){
      int row = 0;
      int column = 0;
      while (true){
        System.out.print("Pick a row: ");
        row = scan.nextInt();
        System.out.print("Pick a column: ");
        column = scan.nextInt();
        
        if(array[row][column] != '_'){
          System.out.print("Spot already taken! Pick another one \n");
        }else{
          break;
        }
      }
      return new int[] {row, column};
     }


     public static int checkWin(char[][] board){

      int rows = countRows(board);
      if(rows == 3 || rows == -3){
        return rows;
      }

      int column = countColumns(board);  
      if(column == 3 || column == -3){
        return column;
      }

      int left = countLeft(board);  
      if(left == 3 || left == -3){
        return left;
      }

      int right = countRight(board);  
      if(right == 3 || right == -3){
        return right;
      }
      return -1;
      
     }

     public static int countRows(char[][] board){


      int score = 0;
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
          if(board[i][j] == 'X'){
            score++;
          }else if(board[i][j] == 'O'){
            score--;
          }
          if(score == 3 || score == -3){
            break;
          }
        }
      }
      return score;
     }

     public static int countColumns(char[][] board){
      int score = 0;
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
          if(board[j][i] == 'X'){
					  score++;
				  }else if(board[j][i] == 'O'){
					  score--;
				  }
        }
      }
      return score;
     }

     public static int countLeft(char[][] board){
      int score = 0;
      for(int i = 0; i < board.length; i++){
        if(board[i][i] == 'X'){
          score++;
        }else if(board[i][i] == 'O'){
          score--;
        }
      }
      return score;
     }

     public static int countRight(char[][] board){
      int score = 0;
      for(int i = 0; i < board.length; i++){
        if(board[i][2-i] == 'X'){
          score++;
        }else if(board[i][2-i] == 'O'){
          score--;
        }
      }
      return score;
     }

    }


