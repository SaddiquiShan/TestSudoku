/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.Arrays;
/**
 *
 * @author Fredr
 */
public class BasisControleStructuur {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] rij = new int[]{1,6,4,2,3,5,7,8,9};
        //System.out.println(checkRow(rij));
        int[] rij2 = new int[]{1,6,4,2,6,5,7,8,9};
        //System.out.println(checkRow(rij2));
        
        int[] rij3 = new int[]{1,6,8,41,9,5,-2};
        System.out.println(smallest(rij3));
        
    }
    
    public static boolean checkRow(int[] row) {
        Arrays.sort(row);
        for(int i=0;i<9;i++){
            if (row[i]!=i+1){
                return false;
            }
        } 
        return true;
    }
    
     public static int smallest(int[] row) {
        int smallest = row[0];
        for(int i=1;row.length-1 >= i;i++){
            //System.out.println(row[i]);
            if (row[i] < smallest){
                smallest = row[i];
            }
        }
        return smallest;
     }
    
}

