package eleven_arrays;

public class Demo {
    
    public static void main(String[] args) {
        
        // Array 
        // datatype [] variable_name = new datatype[size];   
        int [] numbersCollection = new int[5];
        String [] textCollection = new String[3];   

        // Assign Data Using Index 
        numbersCollection[0] = 10; // first element
        numbersCollection[3] = 40; // fourth element

        // Access Data Using Index  
        int x = 5;
        System.out.println(x);
        System.out.println(numbersCollection); // [I@6d06d69c (object address i.e array)
        System.out.println(numbersCollection[0]);
        System.out.println(numbersCollection[1]);
        System.out.println(numbersCollection[2]);
        System.out.println(numbersCollection[3]);
        System.out.println(numbersCollection[4]);
        // System.out.println(numbersCollection[5]); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        

        // Different way 
        int [] numbersCollectionNew = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(numbersCollectionNew[0]);
        System.out.println(numbersCollectionNew[1]);
        
        // length will give number of elements array.length
        System.out.println("Size is: "+numbersCollectionNew.length);

        // Access all elements in array using for loop - recommended
        for (int i = 0; i < numbersCollectionNew.length; i++) {
            System.out.println(numbersCollectionNew[i]);
        }

        // Access all elements in array using while loop - not recommended
        int j = 0;
        while (j < numbersCollectionNew.length) {
            System.out.println(numbersCollectionNew[j]);
            j++;
        }

        // Perform Operations 
        int [] allNumbers = {10,20,35,40,33,60,70,85};
        // get me only even numbers out of this array 
        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 2 == 0) {
                System.out.println(allNumbers[i]);
            }
        }

        // give me total and average score 
        int [] marks = {10,20,30,40,50}; // 150
        int totalMarks = 0; // 10

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i]; 
        }

        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Marks: "+totalMarks/marks.length);


        // Multi Dimensional Arrays 
        // datatype [][] variable_name = new datatype[size][size];   
        int [][] twoMatrix = new int[2][2];

        // assign 
        twoMatrix[0][0] = 1;
        twoMatrix[0][1] = 2;

        twoMatrix[1][0] = 3;
        twoMatrix[1][1] = 4;

        System.out.println(twoMatrix[0][0]);
        System.out.println(twoMatrix[1][1]);

        // access all 
        for (int i = 0; i < twoMatrix.length; i++) {
            System.out.println(twoMatrix[i]);
            int [] data = twoMatrix[i];
            for (int k = 0; k < data.length; k++) {
                System.out.println(data[k]);
            }
        }

        // Different way 
        int [][] twoMatrices = {{1,2},{3,4}};
        System.out.println(twoMatrices[0][0]);

    }

}
