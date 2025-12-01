# Entity-Mapper-DTO Demo Project

This project demonstrates the implementation of entities, mappers, and DTOs (Data Transfer Objects) in a Java application. The project includes:

- **Entities**: Business objects representing data models (User, Product, Order)
- **DTOs**: Data Transfer Objects for transferring data between layers
- **Mappers**: Classes that convert between entities and DTOs

The project also includes the original TwoSum implementations as examples of algorithmic code.

## Structure
- `src/main/java/com/example/entity/` - Contains entity classes
- `src/main/java/com/example/dto/` - Contains DTO classes  
- `src/main/java/com/example/mapper/` - Contains mapper classes
- `src/main/java/com/example/DemoApplication.java` - Demo application showing usage

## Running the Demo
To run the entity-mapper-dto demo:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.DemoApplication"
```

Or compile and run manually:
```bash
javac -d target/classes src/main/java/com/example/entity/*.java src/main/java/com/example/dto/*.java src/main/java/com/example/mapper/*.java src/main/java/com/example/DemoApplication.java
java -cp target/classes com.example.DemoApplication
```