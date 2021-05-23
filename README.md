## Polymorphism 
If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

In Java, we use method overloading and method overriding to achieve polymorphism.

Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc.

## Method Overloading 
If class has multiple methods, having the same name but different parameters, it is known as Method Overloading. 
If we have to perform only one operation, having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

So, we perform method overloading to figure out the program quickly. The main advantage here is to increase the readability of the program. 

### 2 Ways to overload method 
* Changing the number of argument 
* Changing the data type

#### Changing the number of argument 
```java 
class Adder{  
  static int add(int a,int b){return a+b;}  
  static int add(int a,int b,int c){return a+b+c;}  
} 

class TestOverloading1{  
  public static void main(String[] args){   
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(11,11,11));  
  }
}  
```

#### Changing the data type of arguments 
```java 
class Adder{  
  static int add(int a, int b){return a+b;}  
  static double add(double a, double b){return a+b;}  
}  

class TestOverloading2{  
  public static void main(String[] args){  
    System.out.println(Adder.add(11,11));  
    System.out.println(Adder.add(12.3,12.6));  
  }
}  

```

## Method overriding 
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

### Usage of Java Method Overriding 
* Provide the specific implementation of the method which is already provided by its super class. 
* Acheive Runtime Polymorphism.


### Rules for Java Method Overriding 
* Must have same name as in the parent class
* Must have same parameter as in the parent class 
* Must be an IS-A relationship 

```java
//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is running");}  
}  
//Creating a child class  
class Bike2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method  
  }  
}  
```

