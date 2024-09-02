package stelle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import stelle.task.ToDo;

/**
 * Represents a class used for testing ToDo.java.
 * @author Lee Ze Hao (A0276123J)
 */

public class ToDoTest {
    /**
     * Tests toString() method and checks for correct string returned.
     */
    @Test
    public void toString_constructorParams_correctName() {
        ToDo toDo = new ToDo("A todo");
        assertEquals("[T][ ] A todo", toDo.toString());
    }

    /**
     * Tests mark() and unmark() methods and checks for correct string returned + correct isDone value.
     */
    @Test
    public void markUnmark_noParams_correctStatus() {
        ToDo toDo = new ToDo("A todo");
        toDo.mark();
        assertEquals("[T][X] A todo", toDo.toString());
        assertEquals(true, toDo.getIsDone());
        toDo.unmark();
        assertEquals("[T][ ] A todo", toDo.toString());
        assertEquals(false, toDo.getIsDone());
    }
}
