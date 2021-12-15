
# Abstract class in Java

Abstract class in Java is similar to interface except that it can contain default method implementation. An abstract class can have an abstract method without body and it can have methods with implementation also.

"Abstract" keyword is used to create a abstract class and method. Abstract class in java can’t be instantiated. An abstract class is mostly used to provide a base for subclasses to extend and implement the abstract methods and override or use the implemented methods in abstract class.

### Important Points:

1 Abstract keyword is used to create an abstract class in java.

2 Abstract class in java can’t be instantiated.

3 We can use abstract keyword to create an abstract method, an abstract method doesn’t have body.

4 If a class have abstract methods, then the class should also be abstract using abstract keyword, else it will not compile.

5 It’s not necessary for an abstract class to have abstract method. We can mark a class as abstract even if it doesn’t declare any abstract methods.

6 If abstract class doesn’t have any method implementation, its better to use interface because java doesn’t support multiple class inheritance.

7 The subclass of abstract class in java must implement all the abstract methods unless the subclass is also an abstract class.

8 All the methods in an interface are implicitly abstract unless the interface methods are static or default. Static methods and default methods in interfaces are added in Java 8, for more details read Java 8 interface changes.

9 Java Abstract class can implement interfaces without even providing the implementation of interface methods.

10 Java Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.

11 We can run abstract class in java like any other class if it has main() method.

