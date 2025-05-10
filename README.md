# TaskManager

A simple Java CLI-based Task Management application developed as part of Week 2 of internship training. The project demonstrates the use of Java Collections, exception handling (including custom exceptions), and Git/GitHub for version control.

---

## 🧰 Technologies Used

- Java 19  
- Maven  
- IntelliJ IDEA  
- Git & GitHub  
- Java Collections (ArrayList)  
- Exception Handling (try-catch-finally, throw, throws, custom exceptions)

---

## 📌 Features

- Add a task with name and due date
- Mark a task as completed by task ID
- View all tasks in a formatted list
- Throw a custom exception if the due date is in the past

---

## ⚙️ How to Run

1. Clone the repo:
   ```bash
   git clone git@github.com:td2317/TaskManager.git
2.	Open the project in IntelliJ
3.	Run TaskManager.java
4.	Follow on-screen CLI prompts

# Sample Output

===== Task Manager CLI =====

Choose an option:
1. Add Task
2. Mark Task as Completed
3. List All Tasks
4. Exit
Your choice: 1
Enter task name: Complete assignment
Enter due date (YYYY-MM-DD): 2025-05-10
Task added successfully.
----------

Your choice: 3
Task ID: 1, Name: Complete assignment, Due: 2025-05-10, Completed: No
----------

Your choice: 2
Enter task ID to mark complete: 1
Task marked as completed.
----------

Your choice: 3
Task ID: 1, Name: Complete assignment, Due: 2025-05-10, Completed: Yes

# Custom Exception Demo

If the user enters a past due date:

Enter due date (YYYY-MM-DD): 2023-01-01
Error: Due date cannot be in the past.

# GitHub Repository

https://github.com/td2317/TaskManager

