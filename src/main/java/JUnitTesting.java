package main.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JUnitTesting {
    TaskStore store = new TaskStore();
    TaskList list = new TaskList(store);

    @Test
    public void addTaskToList() {
        String activity = "read book";
        ToDo newTask = new ToDo(activity, TaskSymbol.TODO);
        list.addToList(newTask);
        assertEquals(1,list.getList().size(), "Number of Lists after adding a task");
    }

    @Test
    public void removeTaskFromList() {
        String activity1 = "read book";
        String activity2 = "go Home";
        // Add 2 tasks
        list.addToList(new ToDo(activity1, TaskSymbol.TODO));
        list.addToList(new ToDo(activity2, TaskSymbol.TODO));
        // Remove 1 task
        list.removeTask(1);
        assertEquals(1, list.getList().size(), "Number of Tasks after adding 2 tasks and removing 1 task");
    }

}