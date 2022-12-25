# AndroidSolidPrinciples

This repository contains my explanation of [SOLID](https://en.wikipedia.org/wiki/SOLID) principles with examples specifically for Android.

> You can find examples for each letter in the package with that letter's name, as well as by following the link in the headings in Readme.md

### [S](https://github.com/EvgenyPlaksin/AndroidSolidPrinciples/tree/master/app/src/main/java/com/lnight/androidsolidprinciples/s) - Single responsibility 
Each class/function must have only one reason to change. 

### [O](https://github.com/EvgenyPlaksin/AndroidSolidPrinciples/tree/master/app/src/main/java/com/lnight/androidsolidprinciples/o) - Open close
Each class (entity) must be open to extension and closed to modification. For example, if we have a class with some function and we want to change the behavior in that function, we don't need to change the behavior in the main class function. It's easier to make it and the function open and extend it by changing the behavior of that function. This way we can create many different subclasses of the same class with different behaviors.

### [L](https://github.com/EvgenyPlaksin/AndroidSolidPrinciples/tree/master/app/src/main/java/com/lnight/androidsolidprinciples/l) - Liskov substitution
Each subclass must be able to replace the parent class. Suppose we have a class Authorization, and it has a subclass ClientAuthorization. And we must be able to replace the parent class with this one. That is, if function/constructor contains parameter ```auth: Authorization``` we should be able to put there ClientAuthorization without any error and still have the same functionality (of course it will differ in details, but the main point must remain the same).

### [I](https://github.com/EvgenyPlaksin/AndroidSolidPrinciples/tree/master/app/src/main/java/com/lnight/androidsolidprinciples/i) - Interface segregation
Classes that implement an interface must not implement methods they don't need. For example, we have an interface with 2 methods, and the class that extends it needs only one (but some other class that also extends it needs both), then we cannot override this method and leave it empty. Just add the default behavior in the interface itself is enough: 
```kotlin
fun doSomething() {
 // default behavior or just empty brackets
 }
 ```
 ### [D](https://github.com/EvgenyPlaksin/AndroidSolidPrinciples/tree/master/app/src/main/java/com/lnight/androidsolidprinciples/d) - Dependency inversion
 We have to depend on abstractions, not concretions. For example, we need to integrate authorization into the application. We want to use firebase, and we implement the FirebaseAuth class directly into the repository, for example. That way, if we want to change the authorization library, we have to completely rewrite the logic in the repository and all the other places where FirebaseAuth was used. But if we made an interface that has the auntificate() method, for example, and used it, when we change the library we would just have to change the implementation of that interface in only one place, and it would not affect the rest of the application code in any way.
 
### Conclusion 
The SOLID principles are actually a necessary thing, and it's very important to understand them. In this repository I have tried to explain it as simply as possible.
I hope this was helpful, if so leave a star and share the repository with your friends!
