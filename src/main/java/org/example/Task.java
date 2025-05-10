package org.example;

import java.time.LocalDate;

public class Task {
    private int taskId;
    private String taskName;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(int taskId, String taskName, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public int getTaskId() { return taskId; }

    public String getTaskName() { return taskName; }

    public LocalDate getDueDate() { return dueDate; }

    public boolean isCompleted() { return isCompleted; }

    public void markComplete() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "Task ID: " + taskId +
                ", Name: " + taskName +
                ", Due: " + dueDate +
                ", Completed: " + (isCompleted ? "Yes" : "No");
    }
}