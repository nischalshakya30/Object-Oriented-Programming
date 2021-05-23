# Inheritance 

Inheritance is a mechanism in which one object acquires all the properteis and behaviours of a parent object. The idea behind is to create a new **classes** build upon the 
existing classes so that we can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also. 

## Why Inheritance 
* For Method Oveririding 
* For Code Reusability

## Terms Used In Inheritance 
Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.

Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.

Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

## Syntax 
```java 
class SubClass-name extends Superclass-name {
// define require methods and fields 
}
```

The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.

## Types of Inheritance 
* Single 
* Multilevel 
* Hierarchical 
* Multiple (not supported in java)
* Hybrid 
