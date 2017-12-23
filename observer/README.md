# Observer Pattern
# Introduction
OOP is about objects and their interaction. To have a good design means to decouple as much as possible and to reduce the dependencies. When 2 objects are <b>loose coupled</b> they can interact, but they have very little knowledge of each other. 
Whenever we have a subject that needs to be observered by many observers we can use Observer Design Pattern.
<blockquote>
Define a one-to-many dependency between objects so that when one object
changes state, all its dependents are notified and updated automatically.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
</blockquote>

# The Problem
![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/observer/src/main/resources/images/observer-problem.PNG)

Imagine we have a weather station object which collects information about weather. Weather information should be displayed on different devices. These devices, in order to display current weather information need to ask the weather station for every short interval (ex. 1 sec) and when there are too many devices this becomes a problem.

# The Solution
From the above problem, we see that we have to find a way to notify different devices whenever there is a change of weather.
![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/observer/src/main/resources/images/observer-solution.PNG)

So in our scenario WeatherStation will notify all the different displays to update their state with the new weather information.

<b>Publishers + Subscribers = Observer Pattern</b>

Another good example of implementing this pattern is on an E-Commerce application, where the client can subscribe to get notified when an out of stock product becomes available.

# When to use this pattern?
- When a change to one object requires changing others, and you don't know
  how many objects need to be changed.
- When an object should be able to notify other objects without making assumptions
  about who these objects are. In other words, you don't want these
  objects tightly coupled.
- When an abstractio n has two aspects, on e dependent o n the other. Encapsulating
  these aspects in separate objects lets you vary and reuse them independently.
# Known uses
- <b>Social media</b> -  If one follows a post , he gets added to the observers and any further comments on the same post , send a notification to all the other observers.
- <b>JDK</b>
       
        java.util.Observer/java.util.Observable
        javax.servlet.http.HttpSessionBindingListener
        javax.servlet.http.HttpSessionAttributeListener
        