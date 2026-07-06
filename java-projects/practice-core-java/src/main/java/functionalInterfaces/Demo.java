package functionalInterfaces;

import java.util.Scanner;
import java.util.function.*;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== PREDICATE PRIMITIVE INTERFACES ===\n");
        predicateExamples();

        System.out.println("\n=== CONSUMER PRIMITIVE INTERFACES ===\n");
        consumerExamples();

        System.out.println("\n=== FUNCTION PRIMITIVE INTERFACES ===\n");
        functionExamples();

        System.out.println("\n=== ToIntFunction, ToLongFunction, ToDoubleFunction ===\n");
        toFunctionExamples();

        System.out.println("\n=== Primitive to Primitive Conversions ===\n");
        primitiveConversionExamples();

        System.out.println("\n=== SUPPLIER PRIMITIVE INTERFACES ===\n");
        supplierExamples();

        System.out.println("\n=== ObjConsumer Interfaces ===\n");
        objConsumerExamples();

        System.out.println("\n=== ToIntBiFunction, ToLongBiFunction, ToDoubleBiFunction ===\n");
        toBiFunctionExamples();

        System.out.println("\n=== Unary Operators ===\n");
        unaryOperatorExamples();

        System.out.println("\n=== Binary Operators ===\n");
        binaryOperatorExamples();

        scanner.close();
    }

    // 1. PREDICATE PRIMITIVE INTERFACES
    private static void predicateExamples() {
        // IntPredicate
        System.out.print("Enter a number to check if even: ");
        int num = scanner.nextInt();
        IntPredicate even = x -> x % 2 == 0;
        System.out.println("Is " + num + " even? " + even.test(num));

        // LongPredicate
        System.out.print("\nEnter a long number to check if > 100000: ");
        long longNum = scanner.nextLong();
        LongPredicate big = x -> x > 100000L;
        System.out.println("Is " + longNum + " > 100000? " + big.test(longNum));

        // DoublePredicate
        System.out.print("\nEnter a double number to check if positive: ");
        double doubleNum = scanner.nextDouble();
        DoublePredicate positive = x -> x > 0;
        System.out.println("Is " + doubleNum + " positive? " + positive.test(doubleNum));
    }

    // 2. CONSUMER PRIMITIVE INTERFACES
    private static void consumerExamples() {
        // IntConsumer
        System.out.print("Enter an integer to display: ");
        int intVal = scanner.nextInt();
        IntConsumer printInt = x -> System.out.println("You entered: " + x);
        printInt.accept(intVal);

        // LongConsumer
        System.out.print("\nEnter a long number to display: ");
        long longVal = scanner.nextLong();
        LongConsumer displayLong = x -> System.out.println("Long = " + x);
        displayLong.accept(longVal);

        // DoubleConsumer
        System.out.print("\nEnter a double number to square: ");
        double doubleVal = scanner.nextDouble();
        DoubleConsumer squareDouble = x -> System.out.println(x + " squared = " + (x * x));
        squareDouble.accept(doubleVal);
    }

    // 3. FUNCTION PRIMITIVE INTERFACES
    private static void functionExamples() {
        // IntFunction
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        IntFunction<String> message = x -> "Age is " + x;
        System.out.println(message.apply(age));

        // LongFunction
        System.out.print("\nEnter a long number: ");
        long longNum = scanner.nextLong();
        LongFunction<String> f1 = x -> "Number = " + x;
        System.out.println(f1.apply(longNum));

        // DoubleFunction
        System.out.print("\nEnter a double value: ");
        double doubleNum = scanner.nextDouble();
        DoubleFunction<String> f2 = x -> "Value = " + x;
        System.out.println(f2.apply(doubleNum));
    }

    // 4, 5, 6: ToIntFunction, ToLongFunction, ToDoubleFunction
    private static void toFunctionExamples() {
        // ToIntFunction
        System.out.print("Enter a string to get its length (ToIntFunction): ");
        scanner.nextLine(); // consume newline
        String str1 = scanner.nextLine();
        ToIntFunction<String> length = str -> str.length();
        System.out.println("Length: " + length.applyAsInt(str1));

        // ToLongFunction
        System.out.print("\nEnter a string to get its length as long: ");
        String str2 = scanner.nextLine();
        ToLongFunction<String> size = str -> (long) str.length();
        System.out.println("Length as long: " + size.applyAsLong(str2));

        // ToDoubleFunction
        System.out.print("\nEnter a string to get half its length: ");
        String str3 = scanner.nextLine();
        ToDoubleFunction<String> average = str -> str.length() / 2.0;
        System.out.println("Half length: " + average.applyAsDouble(str3));
    }

    // 7-12: Primitive to Primitive Conversions
    private static void primitiveConversionExamples() {
        // IntToLongFunction
        System.out.print("Enter an integer to convert to long (*1000): ");
        int intVal = scanner.nextInt();
        IntToLongFunction convert1 = x -> x * 1000L;
        System.out.println("Result: " + convert1.applyAsLong(intVal));

        // IntToDoubleFunction
        System.out.print("\nEnter an integer to convert to double (/2): ");
        int intVal2 = scanner.nextInt();
        IntToDoubleFunction half = x -> x / 2.0;
        System.out.println("Result: " + half.applyAsDouble(intVal2));

        // LongToIntFunction
        System.out.print("\nEnter a long to convert to int: ");
        long longVal = scanner.nextLong();
        LongToIntFunction convert2 = x -> (int) x;
        System.out.println("Result: " + convert2.applyAsInt(longVal));

        // LongToDoubleFunction
        System.out.print("\nEnter a long to convert to double (/10): ");
        long longVal2 = scanner.nextLong();
        LongToDoubleFunction convert3 = x -> x / 10.0;
        System.out.println("Result: " + convert3.applyAsDouble(longVal2));

        // DoubleToIntFunction
        System.out.print("\nEnter a double to convert to int: ");
        double doubleVal = scanner.nextDouble();
        DoubleToIntFunction convert4 = x -> (int) x;
        System.out.println("Result: " + convert4.applyAsInt(doubleVal));

        // DoubleToLongFunction
        System.out.print("\nEnter a double to convert to long: ");
        double doubleVal2 = scanner.nextDouble();
        DoubleToLongFunction convert5 = x -> (long) x;
        System.out.println("Result: " + convert5.applyAsLong(doubleVal2));
    }

    // 13. SUPPLIER PRIMITIVE INTERFACES
    private static void supplierExamples() {
        // BooleanSupplier
        System.out.print("Enter a boolean (true/false) to return: ");
        boolean boolInput = scanner.nextBoolean();
        BooleanSupplier result = () -> boolInput;
        System.out.println("Returned: " + result.getAsBoolean());

        // IntSupplier
        System.out.print("Enter an integer for IntSupplier to return: ");
        int intVal = scanner.nextInt();
        IntSupplier random = () -> intVal;
        System.out.println("Returned: " + random.getAsInt());

        // LongSupplier
        System.out.print("Enter a long for LongSupplier to return: ");
        long longVal = scanner.nextLong();
        LongSupplier supplier = () -> longVal;
        System.out.println("Returned: " + supplier.getAsLong());

        // DoubleSupplier
        System.out.print("Enter a double for DoubleSupplier to return: ");
        double doubleVal = scanner.nextDouble();
        DoubleSupplier pi = () -> doubleVal;
        System.out.println("Returned: " + pi.getAsDouble());
    }

    // 14, 15, 16: ObjConsumer Interfaces
    private static void objConsumerExamples() {
        // ObjIntConsumer
        System.out.print("Enter name: ");
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        ObjIntConsumer<String> print = (n, a) -> System.out.println(n + " : " + a);
        print.accept(name, age);

        // ObjLongConsumer
        System.out.print("\nEnter employee name: ");
        scanner.nextLine(); // consume newline
        String empName = scanner.nextLine();
        System.out.print("Enter salary: ");
        long salary = scanner.nextLong();
        ObjLongConsumer<String> obj1 = (n, s) -> System.out.println(n + " earns " + s);
        obj1.accept(empName, salary);

        // ObjDoubleConsumer
        System.out.print("\nEnter student name: ");
        scanner.nextLine(); // consume newline
        String studentName = scanner.nextLine();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();
        ObjDoubleConsumer<String> obj2 = (n, m) -> System.out.println(n + " : " + m);
        obj2.accept(studentName, marks);
    }

    // 17, 18, 19: ToIntBiFunction, ToLongBiFunction, ToDoubleBiFunction
    private static void toBiFunctionExamples() {
        // ToIntBiFunction
        System.out.print("Enter first string: ");
        scanner.nextLine(); // consume newline
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        ToIntBiFunction<String, String> totalLength = (a, b) -> a.length() + b.length();
        System.out.println("Total length: " + totalLength.applyAsInt(str1, str2));

        // ToLongBiFunction
        System.out.print("\nEnter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        ToLongBiFunction<Integer, Integer> multiply = (a, b) -> (long) a * b;
        System.out.println("Multiplication result: " + multiply.applyAsLong(num1, num2));

        // ToDoubleBiFunction
        System.out.print("\nEnter first number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num4 = scanner.nextInt();
        ToDoubleBiFunction<Integer, Integer> average = (a, b) -> (a + b) / 2.0;
        System.out.println("Average: " + average.applyAsDouble(num3, num4));
    }

    // 20, 21, 22: Unary Operators
    private static void unaryOperatorExamples() {
        // IntUnaryOperator
        System.out.print("Enter an integer to square: ");
        int intVal = scanner.nextInt();
        IntUnaryOperator square = x -> x * x;
        System.out.println("Square: " + square.applyAsInt(intVal));

        // LongUnaryOperator
        System.out.print("\nEnter a long to cube: ");
        long longVal = scanner.nextLong();
        LongUnaryOperator cube = x -> x * x * x;
        System.out.println("Cube: " + cube.applyAsLong(longVal));

        // DoubleUnaryOperator
        System.out.print("\nEnter a double to halve: ");
        double doubleVal = scanner.nextDouble();
        DoubleUnaryOperator half = x -> x / 2;
        System.out.println("Half: " + half.applyAsDouble(doubleVal));
    }

    // 23, 24, 25: Binary Operators
    private static void binaryOperatorExamples() {
        // IntBinaryOperator
        System.out.print("Enter first integer to add: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer to add: ");
        int num2 = scanner.nextInt();
        IntBinaryOperator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.applyAsInt(num1, num2));

        // LongBinaryOperator
        System.out.print("\nEnter first long to find max: ");
        long long1 = scanner.nextLong();
        System.out.print("Enter second long to find max: ");
        long long2 = scanner.nextLong();
        LongBinaryOperator max = (a, b) -> Math.max(a, b);
        System.out.println("Maximum: " + max.applyAsLong(long1, long2));

        // DoubleBinaryOperator
        System.out.print("\nEnter first double to multiply: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter second double to multiply: ");
        double d2 = scanner.nextDouble();
        DoubleBinaryOperator multiply = (a, b) -> a * b;
        System.out.println("Product: " + multiply.applyAsDouble(d1, d2));
    }
}

