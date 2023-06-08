package com.hillel.zhuravytskii.homeworks.homework8;

public class ArrayValueCalculator {
       static int  doCalc( String[][] matrix ) throws ArraySizeException, ArrayDataException {
         int sum = 0;
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 if (matrix.length != 4 || matrix[i].length != 4) throw new ArraySizeException("Make matrix size 4*4");


                 try {
                     sum += Integer.parseInt(matrix[i][j]);
                 } catch (NumberFormatException e) {
                     throw new ArrayDataException("Incorrect array`s data : " + i + " = " + j);
                 }
             }
         }
         return sum;

     }
}
