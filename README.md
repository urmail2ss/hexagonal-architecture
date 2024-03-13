# Hexagonal Architecture - Reference

Hexagonal Architecture, also known as Ports and Adapters or Onion Architecture, is a design pattern that promotes a clear separation of concerns in software development. The main idea is to divide the application into different layers, each with its specific responsibilities. The core of the pattern is to isolate the application's business logic from external concerns, such as databases, user interfaces, and external services.

In a Hexagonal Architecture, the core business logic is placed at the center, surrounded by layers of adapters. These adapters act as a bridge between the core and the external world. The hexagon shape represents the core, while the adapters are placed on the periphery. The pattern helps in achieving a flexible and maintainable design that is easy to test and extend.

Here's a basic example of implementing Hexagonal Architecture in Java:

## Core (Business Logic):
Create classes and interfaces representing the core business logic. These should be free of any dependencies on external frameworks or technologies.
ProductService
Product

## Ports:
Define interfaces (ports) that the core will use to interact with the external world. These interfaces act as contracts, defining the methods that must be implemented by the adapters.

ProductRepository

## Adapters:
Implement the port interfaces to connect the core to the external services. Adapters can include database implementations, web service clients, or any other external components.

