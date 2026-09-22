import java.util.*;
class rhishi{
    public static void main(String[] args){
        boolean isfinish = false;
        int i;
        int j;
        String currentPlayer = "X";
        Scanner sc = new Scanner(System.in);
        String[][] a= {{" "," "," "},{" "," "," "},{ " "," ", " "}};
        while(isfinish == false){
            for(i =0 ; i < 3 ; i++){
                for(j = 0; j < 3; j++){
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

            System.out.println("Enter row :");
            int row = sc.nextInt();
            System.out.println("enter column : ");
            int col = sc.nextInt();

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || !a[row][col].equals(" ")) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            a[row][col] = currentPlayer;
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            
            i=0;
            while(i<3){
                if (a[i][0].equals(a[i][2]) && a[i][1].equals(a[i][2]) && !a[i][1].equals(" ")){
                    System.out.println(" Match ended");
                    isfinish = true;
                } 
                i++;
            }
            
            j=0;
            while(j< 3){
                if(a[0][j].equals(a[1][j]) && a[1][j].equals(a[2][j])  && !a[1][j].equals(" ")){
                    System.out.println(" Match ended");
                    isfinish = true;
                }
                j++;
            }
            
            i=0;
            if(a[i][i].equals(a[i+1][i+1]) && a[i+1][i+1].equals(a[i+2][i+2]) && !a[i][i].equals(" ")){
                System.out.println(" Match ended");
                isfinish = true;
            }
            
            if( a[0][2].equals(a[1][1]) && a[1][1].equals(a[2][0])  && !a[0][2].equals(" ")){
                System.out.println("match ended");
                isfinish = true;
            }
        }
    }
}
