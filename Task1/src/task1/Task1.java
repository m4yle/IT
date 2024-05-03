/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author bkkat
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        int min = 0;
        int max = 13;
        String stringnum = "";
        
        int[][]matrix = new int[m][n];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                int tnum = (int) ((Math.random() * (max-min)) + min);
                matrix[i][j] = tnum;
                if (tnum < 10) {
                    stringnum += (String.valueOf(matrix[i][j]) + "  ");
                } else {
                    stringnum += (String.valueOf(matrix[i][j]) + " ");
                }
                
            }
            stringnum += "\n";
        }
        
        
        writeToFile("matrix.txt", stringnum);
    }
    
    private static void writeToFile(String fileName, String text) { 
        try {
          File myObj = new File(fileName);
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        
        try {
          FileWriter myWriter = new FileWriter(fileName);
          myWriter.write(text);
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}
