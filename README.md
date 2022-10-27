# OOP-in-Java
Some Java Practice Questions for Beginners, have fun!

I would write down my study note when I finish each problem. And I encourage you do it too. 

You could use   `Fork` button in your left window view to create a fork and polish these coding by yourself.

Reference from CS501(Introduction to Java), it's a mild way to practice our coding skills, please don't copy it directly!

## Q1: Billings 
create an easy cashier Class for a photo book store.

### Solution
Please read the file [Billing.java](https://github.com/Rosecanoe/OOP-in-Java/blob/main/Billing.java)

### Description
> Create a class named Billing that includes three overloaded computeBill() methods for a photo book store. When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due. When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. Multiply the two values, add 8% tax, and return the total due. When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due. Write a main() method that tests all three overloaded methods. Save the application as Billing.java. 

### Study note
Pay attention to the double multiple.

### reference
How to solve the double&float multiple problem? Use BigDecimal.

[1][float乘法_Java中的浮点型(Double&Float)计算问题](https://blog.csdn.net/weixin_39625008/article/details/114089720)


## Q2: FormLetterWriter
Say hello to new guest.

### Solution

### Description
> Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation(). The first method takes one String parameter that represents a customer’s last name, and it displays the salutation “Dear Mr. or Ms.” followed by the last name. The second method accepts two String parameters that represent a first and last name, and it displays the greeting “Dear” followed by the first name, a space, and the last name. After each salutation, display the rest of a short business letter: “Thank you for your recent order.” Write a main() method that tests each overloaded method. Save the file as FormLetterWriter.java. 

### Study note
It's really fun to do print in such a way. But I really understand how overload works by doing this action.
And I could also create a digital card for my parents and tell them that I reallly learn computer science (maybe?).
