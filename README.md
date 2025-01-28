# DAY 1 JAVA Assignment - Employee Management

A simple Java-based application to manage employee information, organized into multiple Gradle modules for modular functionality.

## Project Structure

- **core**: Contains the `Employee` class with attributes like `id`, `name`, `age`, and `department`.
- **data**: Implements `EmployeeRepository` for managing employee data using an in-memory list.
- **logging**: Configures SLF4J with Logback to log application events (e.g., additions, updates, retrievals).
- **app**: Contains the `Main` class to integrate all modules and run the application.

## Technologies Used

- Java
- Gradle (multi-module structure)
- SLF4J (Logging)
- Logback (Logging configuration)
