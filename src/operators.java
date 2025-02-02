public class operators {
        public static void main(String[] args) {
            // 1. Arithmetic Operators
            int a = 10;
            int b = 5;
            int sum = a + b; // Addition
            int diff = a - b; // Subtraction
            int product = a * b; // Multiplication
            int quotient = a / b; // Division
            int remainder = a % b; // Modulus

            System.out.println("Arithmetic Operations:");
            System.out.println("a + b = " + sum);
            System.out.println("a - b = " + diff);
            System.out.println("a * b = " + product);
            System.out.println("a / b = " + quotient);
            System.out.println("a % b = " + remainder);

            // 2. Relational (Comparison) Operators
            boolean isEqual = a == b; // Check if a equals b
            boolean isGreaterThan = a > b; // Check if a is greater than b

            System.out.println("\nRelational Operators:");
            System.out.println("a == b: " + isEqual);
            System.out.println("a > b: " + isGreaterThan);

            // 3. Logical Operators
            boolean x = true;
            boolean y = false;
            boolean andResult = x && y; // Logical AND
            boolean orResult = x || y; // Logical OR
            boolean notResult = !x; // Logical NOT

            System.out.println("\nLogical Operators:");
            System.out.println("x && y: " + andResult);
            System.out.println("x || y: " + orResult);
            System.out.println("!x: " + notResult);

            // 4. Assignment Operators
            int c = 20;
            c += 10; // c = c + 10
            c -= 5; // c = c - 5

            System.out.println("\nAssignment Operators:");
            System.out.println("c after += 10 and -= 5: " + c);

            // 5. Unary Operators
            int d = 5;
            d++; // Increment
            --d; // Decrement

            System.out.println("\nUnary Operators:");
            System.out.println("d after increment and decrement: " + d);

            // 6. Ternary Operator
            String result = (a > b) ? "a is greater" : "b is greater";
            System.out.println("\nTernary Operator:");
            System.out.println("Ternary result: " + result);

            // 7. Instanceof Operator
            String str = "Hello";
            boolean isString = str instanceof String;
            System.out.println("\nInstanceof Operator:");
            System.out.println("Is str an instance of String? " + isString);

            // 8. Type Casting Operator
            double pi = 3.14159;
            int piAsInt = (int) pi; // Explicit type casting

            System.out.println("\nType Casting Operator:");
            System.out.println("pi as an integer: " + piAsInt);
        }
    }


