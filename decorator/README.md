# Decorator Pattern
# Introduction
Decorator pattern is used to extend functionality of an object rather than the entire class. By doing so we are satisfing two OO principles:

- [Open-Closed principle](https://en.wikipedia.org/wiki/Open/closed_principle) - Classes should be open for extension, but closed for modification.
- [Single responsibility principle](https://en.wikipedia.org/wiki/Single_responsibility_principle) - States that every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class. 

<blockquote>
Attach additional responsibilities to an object dynamically. Decorators provide a
flexible alternative to subclassing for extending functionality.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
</blockquote>

# The Problem
Suppose we are designing classes for a coffee shop company.  
Given that we have different kind of coffees with different kind of flavors which all have different cost, we need to make a class for every combination in the future. This casues <b>class explosion.</b> 

![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/decorator/src/main/resources/img/decorator-problem.PNG)
Source: [Head First Design Patterns: A Brain-Friendly Guide](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124)

# The Solution
From the definition above, we see that the best way to solve this problem is to find a way to start with a beverage (ex. Espresso) and extend (decorate) that beverage with Addons (condiments) at runtime. 

![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/decorator/src/main/resources/img/decorator-solution.PNG)

From the implementation on the source code, if create an CaramelDecorator and pass an Espresso object to it, we are instantiating an Espresso with Caramel. When we call the getCost() method of that object we get cost of espresso + cost of caramel. <i>An analogy to this may be recursion. Where espresso is the base case, and when we call the getCost() of a decorator that calls the getCost() of subject(espresso in this case) and  adds it's cost to that result.</i>

# When to use this pattern?
- to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
- for responsibilities that can be withdrawn.
- when extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. 

# Known uses
An use case for decorator pattern is in <b>java.io.</b>

![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/decorator/src/main/resources/img/decorator-jdk.PNG)

Let's say we have some gzipped file that we want to read quickly. 

- First open an InputStream: 
    ```FileInputStream fis = new FileInputStream("/objects.gz");```
- We want speed, so let's buffer it in memory: 
    ``` BufferedInputStream bis = new BufferedInputStream(fis); ```
- The file is gzipped, so we need to ungzip it:
    ``` GzipInputStream gis = new GzipInputStream(bis); ```
- Now we can finally use it:
    ``` SomeObject someObject = (SomeObject) ois.readObject(); ```
    
 (This example is from [this](https://stackoverflow.com/a/6366543) StackOverflow answer)

