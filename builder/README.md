# Builder Pattern
# Introduction

Builder is a creational design pattern that allows constructing complex objects step by step.

<blockquote>
Separate the construction of a complex object from its representation so that the
same construction process can create different representations.

Source: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
</blockquote>

# The Problem
Imagine we have a complex object with a lot of fields. Let's say we have a Person with 8 fields. While creating a Person object we can use constructor to populate these fields. This counstructor would end up by 8 parameters which is a bad practice, plus number of parameters will keep on growing while adding new options in the future. This is called telescoping constructor anti pattern. 

# When to use this pattern?
  - When you have a "telescoping" constructor (with more than 7 parameters)
  - When you need to construct object step by step
# Known uses
  - java.lang.StringBuilder
  - java.lang.StringBuffer

