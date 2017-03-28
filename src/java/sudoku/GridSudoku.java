/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Arrays;

/**
 *
 * @author shans
 */
public class GridSudoku {
    int multTableSize = 9;
    int multTableSize2=9;
    int[][] multTable = new int[multTableSize][multTableSize]; // 2 arrays
    int[][] copyMatrix;
    void makenVanSudoku() {
        for(int row = 0; row < multTable.length; row++) { // Zolang row kleiner is dan de lengte van multTable (wat 9 is). row++
            for (int column = 0; column < multTable[row].length; column++) { // Zolang column kleiner is dan multTable[row] (wat telkens ook optelt met het vorige). column ++

                multTable[row][column] = (int) (Math.random() * 9) + 1;//Random getallen vullen in array.
               

                //multTable[column] = (int)(Math.random()*multTableSize)+1;
                //multTable[row][column] = (row + 1) * (column + 1); // Getallen in
                System.out.printf("%3d", multTable[row][column]);
            }
            System.out.println();
            
        }
        
    }
    void copy(){
        System.arraycopy(multTable, 0, copyMatrix, 0,9);
        System.out.println(Arrays.deepToString(copyMatrix));
        
    }

    void run() {
        makenVanSudoku();
       
    }
}
