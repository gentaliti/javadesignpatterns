# Strategy Pattern
# Introduction
Strategy pattern is about using composition over inheritance to achieve code reusability. 
<blockquote>
Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
</blockquote>

# The Problem
![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/strategy/src/main/resources/images/strategy-problem.PNG)

In this case we see that there are 4 different ducks extending the main Duck class. What if we have some ducks with the same flying methods, like in the picture above?  We need to copy and paste the same code from FlyDuck to CityDuck. This causes <b>code duplication</b> and the problem gets even bigger if we have a lot of ducks with similarities in flying, quacking etc.


# The Solution
From the definition above we see that we have the flying and quacking algorithms, but we need a way to extract those algorithms and inject them on specific ducks.
![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/strategy/src/main/resources/images/strategy-solution.PNG)

So we make strategies (interfaces) for flying. By doing so we are open to adding more types of "flying" functionality in the future.

# When to use this pattern?
- When you want to be able to change the behavior at runtime dynamically. For example: saving files in different formats (.csv, .txt) based on user input.
- To eliminate conditional statements. (see [employee salary](https://www.edureka.co/blog/design-pattern-exposed-strategy-pattern/) example). <b>Code containing many conditional statements often indicates the need to
                                                                                                                                                 apply the Strategy pattern.</b>
- The main value is in being able to switch out different implementations for different situations
# Known uses
Strategy pattern is used in Collection framework in Java. 
