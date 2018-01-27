# Factory Method Pattern
# Introduction

Factory Method is a creational pattern in which subclasses are responsible to create an object. 

It is related to the idea on which libraries work: a library uses abstract classes for defining and maintaining relations between objects. The library knows when an object needs to be created, but not what kind of concrete object it should create, this being specific to the application using the library.

<blockquote>
Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)

</blockquote>

# The Problem
Consider a framework for desktop applications that are meant to work with documents. This framework contains definitions for operations such as opening, creating and saving the document. The basic classes, Application and Document are abstract ones. This means that clients need to subclass them in order to define their own applications. 

To create a drawing application for example, we define the classes DrawingApplication and DrawingDocument. Application has the task of managing the documents and taking action at the user's request. The problem here is that when a Document need to be instantiated (by Application), the Application doesn't know what kind of Document to create, it just knows when to create that document. This problem is solved by Factory Method Pattern. 
# The Solution
Factory Method Pattern solves this problem by encapsulating the knowledge of which <b>Document subclass</b> to create and moves this knowledge out of the framework. 


![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/factory-method/src/main/resources/images/factory-method.PNG)
<i>Fig.1.1 General structure of Factory Method</i>


Now lets get to the example which is implemented on the code. Consider you are developing a game where the player has  to face many obstacles. We need to create different types of obstacles based on player's level, by using different logic (factory). It may be Simple, Random etc.  Using factory method in this case, gives us the ability to change the creational logic of the obstacles thus making the game harder on each level by just passing different parameters to the factory.


# When to use this pattern?
The factory method is one of the most used and pattern. When you design an application, be careful to decide if you really need a factory to create objects. It may be just an unnecessary complexity in your application.

Use this pattern when: 
- The main reason why this pattern is used is that it introduces a separation between the application and a family of classes
- You have some object creational logic that you use in many cases
- You want to localize the logic to instantiate a complex object

# Known uses
- java.util.Calendar
- java.text.NumberFormat
- java.util.ResourceBundle#getBundle
