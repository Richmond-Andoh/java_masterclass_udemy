import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
       int[] myArray = null;
       
       // Create a new instance of myArray
       myArray = new int[4];
       myArray[0] = (3);
       myArray[1] = (2);
       myArray[2] = (4);
       myArray[3] = (5);

       System.out.println(Arrays.toString(myArray));

       String richieArray[] = {"Richmond", "Javis", "Moris"};
       System.out.println(Arrays.toString(richieArray));


       // Call
       SingleDimensionArray firstArr = new SingleDimensionArray(3);
       firstArr.insert(0, 21);
       firstArr.insert(1, 22);
       firstArr.insert(2, 23);
       firstArr.insert(3, 24);


       // Accessing Element in the Array
       var firstElement = firstArr.richieArr[0];
       System.out.println("First Element: " + firstElement);

       var secondElement = firstArr.richieArr[1];
       System.out.println("Second Element: " + secondElement);

       // Array Traversal
       firstArr.traverseArray();
    }
}
