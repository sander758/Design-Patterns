# Design patterns

This code is from the youtube tutorial series 'Design Patterns Video Tutorial' from Derek Banas.  
Link: https://www.youtube.com/playlist?list=PLF206E906175C7E07

Another great resource for learning design patterns is the book 'Head First Design Patterns' from Kathy Sierra.
Here is the completed code from that book:  
https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/strategy

## Patterns

### 1. Strategy
**Category:** Behavioral  
**When:** When you want to define a class that will have one behaviour that is similar to other behaviors in a list.  
Link: https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07

### 2. Observer
**Category:** Behavioral  
**When:** When you need many other objects to receive an update when another object changes.  
Link: https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07

### 3. Factory
**Category:** Creational  
**When:** When a method returns one of several possible classes that share a common superclass.  
- When you don't know ahead of time what class object you need.
- When all of the potential classes are in the same subclass hierarchy.
- To centralize class selection code.
- When you don't want the user to have to know every subclass.

Link: https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07

### 4. Abstract Factory
**Category:** Creational  
**What:** It is like a factory, but everything is encapsulated.  
- Allows you to create families of related objects without specifying a concrete class.
- Use when you have many objects that can be added, or changed dynamically during runtime.
- You can model anything you can imagine and have those objects interact through common interfaces.

The bad: Things can get complicated.  
Link: https://www.youtube.com/watch?v=xbjAsdAK4xQ&list=PLF206E906175C7E07

### 5. Singleton
**Category:** Creational  
**What:** It is used when you want to eliminate the option of instantiating more than one object.  
Link: https://www.youtube.com/watch?v=NZaXM67fxbs&list=PLF206E906175C7E07

### 6. Builder
**Category:** Creational  
**What:** Pattern used to create objects made from a bunch of other objects.
- When you want to build an object made up from other objects.
- When you want the creation of these parts to be independent of the main object.
- Hide the creation of the parts from the client so both aren't dependent.
- The builder knows the specifics and nobody else does.  

Link: https://www.youtube.com/watch?v=AFbZhRL0Uz8&list=PLF206E906175C7E07

### 7. Prototype
**Category:** Creational  
**What:** Creating new objects (instances) by cloning (copying) other objects.  
Link: https://www.youtube.com/watch?v=AFbZhRL0Uz8&list=PLF206E906175C7E07

### 8. Decorator
**Category:** Structural  
**What:** Allows you to modify an object dynamically.  
Link: https://www.youtube.com/watch?v=j40kRwSm4VE&list=PLF206E906175C7E07

### 9. Command
**Category:** Behavioral  
**What:** The command pattern is a behavioural design pattern in which an object is used to represent and encapsulate all the information needed to call a method at a later time.  
Link: https://www.youtube.com/watch?v=7Pj5kAhVBlg&list=PLF206E906175C7E07

### 10. Adapter
**Category:** Structural  
**What:** Allows 2 incompatible interfaces to work together.  
Link: https://www.youtube.com/watch?v=qG286LQM6BU&list=PLF206E906175C7E07

### 11. Facade
**Category:** Structural  
**What:** When you create a simplified interface that performs many other actions behind the scenes.  
Link: https://www.youtube.com/watch?v=B1Y8fcYrz5o&list=PLF206E906175C7E07

### 12. Bridge

### 13. Template Method

### 14. Iterator

### 15. Composite

### 16. Flyweight

### 17. State

### 18. Proxy

### 19. Chain of Responsibility
**Category:** Behavioral  
**What:** This pattern sends data to an object and if that object can't use it, it sends it to any number of other objects that may be able to use it.  
Link: https://www.youtube.com/watch?v=jDX6x8qmjbA&list=PLF206E906175C7E07

### 20. Interpreter

### 21. Mediator

### 22. Memento

### 23. Visitor

### 24. MVC
**What:** Completely separates the calculations and interface from each other.  
Model: Data and Methods used to work with it.  
View: The interface (GUI).  
Controller: Coordinates interactions between the View and Model.  
Link: https://www.youtube.com/watch?v=dTVVa2gfht8&list=PLF206E906175C7E07