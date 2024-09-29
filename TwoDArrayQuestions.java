import java.util.*;
public class TwoDArrayQuestionsjava{

    public static void spiralMatrix(int arr[][]){
        int startRow =0; int lastRow = 3;
        int startColumn = 0; int lastColumn = 3;

        while(startRow<lastRow){
            // top row
            for(int i=startColumn;i<lastColumn;i++){
                System.out.print( arr[startRow][i]+" ");
            }
            // System.out.println();
            // last column
            for(int j=startRow;j<lastRow;j++){
                System.out.print(arr[j][lastColumn]+" ");
            }
            // System.out.println();
            // last row
            for(int k=lastColumn;k>startColumn;k--){
                System.out.print(arr[lastRow][k]+" ");
            }
            // System.out.println();
            // starting column
            for(int l=lastRow;l>startRow;l--){
                System.out.print(arr[l][startColumn]+" ");
            }
            System.out.println();
            startColumn++;
            startRow++;
            lastColumn--;
            lastRow--;
        }
        
    }

    public static void main(String[] args){
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
               System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " : ");
               arr[i][j] = sc.nextInt(); 
            }
        }
        spiralMatrix(arr);
    }
}