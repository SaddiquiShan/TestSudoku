/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author shans
 */
public class MakenVanSudoku {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int multTableSize = 9;
    int[][] multTable = new int[multTableSize][multTableSize];
    
    for (int row = 0; row < multTable.length; row++) {
        for (int column = 0; column < multTable[row].length; column++) {
            multTable[row][column] = (row + 1) * (column + 1);
            System.out.printf("%3d", multTable[row][column]);
        }
        System.out.println();
    }
    }
}
