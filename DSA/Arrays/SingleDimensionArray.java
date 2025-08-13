public class SingleDimensionArray {
    int richieArr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
       richieArr = new int[sizeOfArray];
       for(int i = 0; i < sizeOfArray; i++) {
         richieArr[i] = Integer.MIN_VALUE;
       }
    }

    public void insert(int location, int valueToInsert) {
        try {
            if(richieArr[location] == Integer.MIN_VALUE){
            richieArr[location] = valueToInsert;
            System.out.println("Element Successfully Inserted");
        } else {
            System.out.println("Failed to insert Element");
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("This cell is Already Occupied");
        }
        
    }


    // Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < richieArr.length; i++) {
            if (richieArr[i] == Integer.MIN_VALUE) {
                System.out.println("Cell " + i + " is empty");
            } else {
                System.out.println("Cell " + i + " contains: " + richieArr[i]);
            }
        }
        } catch (Exception e) {
            System.out.println("An error occurred while traversing the array: " + e.getMessage());
        }
    }
}
