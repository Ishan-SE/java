public class CommandLineArguments {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int diff = a - b;
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
    }
}

### In terminal/ cmd :
cd (directory)

javac  CommandLineArguments

java CommandLineArguments 8 5


### Output:
Sum is 13

Difference is 3