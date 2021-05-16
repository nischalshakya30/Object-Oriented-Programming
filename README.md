## Class and Object  

### Object 
Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can 
be physical or logical. An Object can be defined as an instance of a class. An object contains an address and takes up some 
space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing 
is the type of message accepted and the type of response returned by the objects.

Example: A dog is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, 
barking, eating, etc.

The object has three characterstics:-
* State : represents the value (data) of an object
* Behaviour : represents behaviour (functionality) of an object such as deposit, withdraw etc.
* Identity : An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

### Class 
Collection of objects is called class. It is a logical entity. A class can also be defined as a blueprint from which you can create an individual object. 
Class doesn't consume any space.


### Creating the class 
```java 
public class Dog {

  String color;  // State 
  String name; // State 
  
  public void wagTail() { // Behaviour
    System.out.println("Dog is wagging tail"):
  } 
  
}
```

### Creating the object 
```java 
Dog dog = new Dog(); // Here, dog is an instance of Dog class
```
