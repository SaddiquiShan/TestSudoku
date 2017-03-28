package sudoku;

/**
 *
 * @author shans
 */
public class MakenVanSudoku {
    public static void main(String[]args){
    int multTableSize = 9;
    int[][] multTable = new int[multTableSize][multTableSize]; // 2 arrays
    
    for (int row = 0; row < multTable.length; row++) { // Zolang row kleiner is dan de lengte van multTable (wat 9 is). row++
        for (int column = 0; column < multTable[row].length; column++) { // Zolang column kleiner is dan multTable[row] (wat telkens ook optelt met het vorige). column ++
            
            multTable[row][column] =(int)(Math.random()*9)+1; //
            
            //multTable[column] = (int)(Math.random()*multTableSize)+1;
            //multTable[row][column] = (row + 1) * (column + 1); // Getallen in 
            System.out.printf("%3d", multTable[row][column]);
        }
        System.out.println();
    }
    }
}
