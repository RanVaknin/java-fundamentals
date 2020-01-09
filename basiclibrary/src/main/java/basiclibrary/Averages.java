package basiclibrary;

import java.nio.file.Path;
import java.util.Arrays;

public class Averages {
    public int calculateAverages(int[] inputArray){
        int averageOfInput = 0;
        for (int i = 0; i <inputArray.length; i++){
            averageOfInput += inputArray[i];

        }
        return averageOfInput/inputArray.length;
    }

    public double averageOfAllArrays(int[][] inputArray){
        double[] averages = new double[inputArray.length];
        for (int i = 0; i < inputArray.length; i++){
            double innerArrayAvg = 0;
            for (int j = 0; j < inputArray[i].length; j++){
                innerArrayAvg += inputArray[i][j];
            }
            innerArrayAvg = innerArrayAvg/inputArray[i].length;
            averages[i] = innerArrayAvg;
        }
        double finalAvg = averages[0];
        for (int i = 0 ; i < averages.length; i++){
            if (finalAvg > averages[i]){
                finalAvg = averages[i];
            }
        }
        return finalAvg;
    }


}
