# Constructors in Java 

There are 3 types of constructors in Java:
 1. Default constructor
 2. No-arg constructor
 3. Parameterized constructor

 
### Default constructor
 If we do not create any constructor in class then java calls a default constructor. This constructor doesnot have any parameter.The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
 
 Syntax of default constructor:
<class_name>(){}  

### No-arg constructor
Constructor with no arguments is known as no-arg constructor. The pattern is same as default constructor, however body can have any code unlike default constructor where the body of the constructor is empty.

Example 
class Demo
{

     public Demo()
     {
         System.out.println("This is a no argument constructor");
     }
     public static void main(String args[]) {
    	 new Demo();
     }
}

Output:
This is a no argument constructor

### Parameterized constructor
A constructor which has a specific number of parameters is called a parameterized constructor.The parameterized constructor is used to provide values to distinct objects.

Example
class Example2
{

      private int var;
      //default constructor
      public Example2()
      {
             this.var = 10;
      }
      //parameterized constructor
      public Example2(int num)
      {
             this.var = num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Example2 obj = new Example2();
              Example2 obj2 = new Example2(100);
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());
      }
}

Output:

var is: 10

var is: 100


### Date: Dec 9  2021 - Dec 16  2021
