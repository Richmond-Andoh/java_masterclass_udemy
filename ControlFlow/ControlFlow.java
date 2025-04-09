public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;

        if(num > 0 ) {
            System.out.println("The number is a positive number");
        } else {
            System.out.println("The is a negative number");
        }

        if(num % 2 == 0) {
            System.out.println("The is even");
        } else {
            System.out.println("The is odd");
        }

        if(num < 11) {
            for(int i = num; i > 0; i--) {
                if(i % 2 == 0) {
                    break;
                } else {
                    continue;
                }
            }
            
        } else {
            System.out.println("The number is not 10");
        }

        for(int i = 1; i < 10; i++){
            System.out.println("The number is: " + i);
        }
    }
}
