# Task29-Build-a-Generic-Data-Repository
java calculation

## 1. Description
This project demonstrates how to create a reusable Generic Data Repository using Java Generics and Collections.

The repository can store, retrieve, update, and delete different types of objects using a single generic class.

## 2. Objective
- Understand Java Generics.
- Learn type-safe programming.
- Create reusable components.
- Perform CRUD operations.
- Work with Java Collections.

## 3. Technologies Used
- Java
- Generics
- Collections Framework
- LinkedHashMap

## 4. Features

- **Save:** Add objects to the repository.
- **Find:** Retrieve objects using their ID.
- **Update:** Modify existing objects.
- **Delete:** Remove objects using their ID.
- **Display:** View all stored objects.
- **Multiple Data Types:** Store different types of objects using the same generic repository class.

## 5. Project Structure

```text
GenericDataRepository/
│
├── Task29.java
└── README.md
```

## 6. How It Works

### GenericRepository<T>
A generic class that can work with different object types.

### CRUD Methods
1. `save()` – Stores an object.
2. `findById()` – Finds an object by ID.
3. `update()` – Updates an existing object.
4. `delete()` – Deletes an object.
5. `displayAll()` – Displays all objects.

### Employee Class
Stores employee details such as name and age.

### Main Class
Tests the repository with Employee and String objects.

## 7. Sample Output

```text
Object saved successfully!
Object saved successfully!

All Employees:
{1=Employee{Name='Rahul', Age=22}, 2=Employee{Name='Priya', Age=21}}

Find Employee:
Employee{Name='Rahul', Age=22}

Update Employee:
Object updated successfully!

Delete Employee:
Object deleted successfully!

Student Repository:
{101=Lakshmi, 102=Anjali}
```

## 8. How to Run

1. Install Java JDK.
2. Create a file named `Task29.java`.
3. Copy the Java program into the file.
4. Open the terminal in the project folder.
5. Compile the program:

```bash
javac Task29.java
```

6. Run the program:

```bash
Task29 Main
```

## 9. Key Concepts Learned

- Java Generics
- Generic Type Parameters
- Type Safety
- Collections Framework
- LinkedHashMap
- CRUD Operations
- Code Reusability
