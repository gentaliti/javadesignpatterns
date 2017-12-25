# Strategy Pattern
# Introduction
Singleton is a convention for ensuring that one and only object is instantiated for a given class. 
<blockquote>
Ensure a class only has one instance, and provide a global point of access to it.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
</blockquote>

![alt text](https://github.com/gentaliti/javadesignpatterns/blob/master/singleton/src/main/resources/images/singleton-diagram.PNG)


# When to use this pattern?
There are many objects we only need one of: thread pools, caches, objects that handle logging, preferences etc.

# When NOT to use this pattern?
Avoiding globals is the first thing that is learned in <i>Programing 101</i> courses. Now, use singleton even <b>less</b> than globals!

Using singleton in wrong use cases, causes problems with maintainability, testability etc. Some even argue that singleton is actually a code-smell and not a pattern.

# Known uses
- [java.lang.Runtime#getRuntime()](https://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime--)
- [java.lang.System#getSecurityManager()](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--)