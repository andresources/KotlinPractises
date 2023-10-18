package com.kotlinpractises.delegation
/*
Delegate Design Pattern :
 *Passing responsibilities to another class or method.
 Ex:In Hotel, Customer  -> Waiter -> Chief
 *There are 2 types of delegates : 1. Property Delegation 2. Class Delegation
 *to enhance the functionality of your classes without the need for inheritance(reusability)
 *to delegate the implementation of an interface or a property to another object, rather than implementing it directly in your class.

 1. Property Delegates:
 *to delegate the getter and setter functions of a property to another object
 *to reuse and share behavior across multiple properties.

 2. Class Delegates:
 *to delegate the implementation of an interface to another object.
 *It's a great alternative to inheritance when you want to reuse code

Kotlin Built-in Delegates
-------------------------
Kotlin provides several built-in delegates:
#Lazy: Initializes a property lazily, only when it's first accessed.
#Observable: Notifies you when a property's value changes.
#Vetoable: Allows you to veto a property change if it doesn't meet certain conditions.
#ReadOnlyProperty and ReadWriteProperty: Base interfaces to create custom property delegates.


 */