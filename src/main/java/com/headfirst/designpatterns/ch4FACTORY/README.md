# Factory Pattern
- When you see "new", think "concrete"
- Tying our code to a concrete class can make it more fragile and less flexible
- Initializing using an interface of a concrete class promotes flexibility and abstraction in our code.
    - Loose coupling
    - Scalable
    - Maintainable
    - DI
```java
Duck duck = new MallardDuck();
```
- `Duck` is an interface, `MallardDuck` is an concrete class
- When we have a whole set of related concrete classes, we might have to write `if-else`
- Identify the aspects that vary and separate then from what stays the same
## Encapsulating Object creation
- We pull the object creation code out
- we place that code in an object that is only going to worry about how to create objects.
- We call it **Factory**
- Factories handle the details of object creation
### Simple Factory
- Simple factory isn't a real pattern, it's more of a programming idiom
- 