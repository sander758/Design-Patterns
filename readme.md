# Design patterns

This code is from the youtube tutorial series 'Design Patterns Video Tutorial' from Derek Banas.  
Link: https://www.youtube.com/playlist?list=PLF206E906175C7E07

Another great resource for learning design patterns is the book 'Head First Design Patterns' from Kathy Sierra.
Here is the completed code from that book:  
https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/strategy

## Patterns

### 1. Strategy
**When:** When you want to define a class that will have one behaviour that is similar to other behaviors in a list.  
Link: https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3

### 2. Observer
**When:** When you need many other objects to receive an update when another object changes.  
Link: https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4

### 3. Factory
**When:** When a method returns one of several possible classes that share a common superclass.  
- When you don't know ahead of time what class object you need.
- When all of the potential classes are in the same subclass hierarchy.
- To centralize class selection code.
- When you don't want the user to have to know every subclass.

Link: https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=5

### 4. Abstract Factory
**What:** It is like a factory, but everything is encapsulated.  
- Allows you to create families of related objects without specifying a concrete class.
- Use when you have many objects that can be added, or changed dynamically during runtime.
- You can model anything you can imagine and have those objects interact through common interfaces.

The bad: Things can get complicated.  
Link: https://www.youtube.com/watch?v=xbjAsdAK4xQ&list=PLF206E906175C7E07&index=6

### 25. MVC
**What:** Completely separates the calculations and interface from each other.  
Model: Data and Methods used to work with it.  
View: The interface (GUI).  
Controller: Coordinates interactions between the View and Model.  
Link: https://www.youtube.com/watch?v=dTVVa2gfht8&list=PLF206E906175C7E07&index=28