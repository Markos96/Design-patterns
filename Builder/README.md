# Builder Pattern

---

### Description

In this project, we have implemented the **Builder** design pattern in the `Product` class. The Builder pattern is used to build complex objects step by step, allowing flexible construction and variations in object creation.

----

### Product Structure

```json
{
  "code": "1",
  "name": "Test",
  "description": "Test Description",
  "price": "100.00",
  "category": "KITCHEN"
}
```


To implement the Builder pattern in the `Product` class, we have created an inner class called `ProductBuilder`. This class is used to build instances of `Product` in a simpler and more flexible way.

### Example

```java
Product product = new ProductBuilder()
    .setName("Test")
    .setPrice(29.99)
    .setCategory(Category.KITCHEN)
    .build();
```




