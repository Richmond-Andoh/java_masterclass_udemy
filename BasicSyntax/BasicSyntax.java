public class BasicSyntax {
    public static void main(String[] args) {  
        
        // Variables
        int age = 10;
        double salary = 50000.50;
        char grade = 'A';
        boolean isJavaFun  = true;
        String name = "Richmond Andoh";
       
        // Output
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Name: " + name);

        int x = 21;
        int y = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (x + y));
        System.out.println("Substration: " + (x - y));
        System.out.println("Division: " + (x /y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Modulos: " + (x % y));

        // Relational Operators
        System.out.println("Is x greater than y?: " + (x > y));
        System.out.println("Is x less than y?: " + (x < y));
        System.out.println("Is x equall to y?: " + (x == y));
        System.out.println("Is x not equall to y?: " + (x != y));
 
        //Logical operators
        System.out.println("Logical AND: " + (x > y && y < x));
        System.out.println("Logical OR: " + (x > y || y > x));
        System.out.println("Logical NOT: " + (!( x > y && y < x )));


        // Task: Calculate the Area of a rectangle, circle, square and triangle
        double length  = 12.0;
        double breadth = 3.43;
        int height = 5;
        double radius = 7.0;
        double base = 7.23;

        // area a rectangle
        double areaOfRectangle = length * breadth;
        System.out.println("Area of a Rectangle: " + areaOfRectangle);

        // area of circle
        double areaOfCrcle = 3.142 * (radius) * (radius);
        System.out.println("Area of a Crcle: " + areaOfCrcle);
        
        // area of square
        double areaOfSquare = length * length;
        System.out.println("Area of a Square: " + areaOfSquare);

        // area of triangle
        double areaOfTriangle = (base * height) / 2;
        System.out.println("Area of a Triangle: " + areaOfTriangle);
    };
};