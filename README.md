# Codeguide
## Single Responsibility Principle (SRP)
A good project should be divided in to a little part and it's should have independence to work on their own. So
When you create a method or a class you should create them for one purpose to avoid an error and make your code easy to use <br>
For example
```java
  public class Student {
    public String reportgrade()...
    public void save()....
  }
```
if you create like this it's make you hard and complicated to edit a code it's probalbly impact to other method <br>
So You should write like this
```java
  public class Student {
      public String reportgrade()...
  }
  
  public class Saveinformation {
    public void save()....
  }
```
It's will make your program work independence on their own class when you edit it's won't impact to other process.<br>
Reference: http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html<br>
	   https://www.ikq.me/2016/02/solid-principles-part-1-srp/
## Interface Segregation Principle (ISP)
Class shouldn't implement an interface, if it doesn't use. In the interface should have method that everyclass can use. It's similar to SRP that you should create an interface for one purpose. You should divided an interface to a littlepart or create method inside in their own class.<br>
For example in a project have Coin class and BankNote class
```java
  public interface Valuable {
    public double getValue();
    public String getCurrency();
    public long getSerialNumber();
    //Serialnumber is for banknote coin didn't have serialnumber
  }
 ```
You should remove getSerialNumber() and put it into BankNote class like this
```java
  public class BankNote implements Valuable {
    private long serialnumber;
    .
    .
    public long getSerialNumber() {
		return this.serialNumber;
	  }
  }
```
It's will make method in your interface can use in everyclass.<br>
Reference: http://javarevisited.blogspot.com/2012/03/10-object-oriented-design-principles.html<br>
	   https://www.ikq.me/2016/02/solid-principles-part-4-isp/
