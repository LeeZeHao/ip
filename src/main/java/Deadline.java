/** This class represents a Deadline. It is child of the Task class.
 * @author Lee Ze Hao (A0276123J)
 */

public class Deadline extends Task {
    private String by;

    /** Constructor for a Deadline object. Sets name upon creation.
     * @param name Name of Deadline object.
     * @param by Date the deadline must be accomplished by.
     */
    public Deadline(String name, String by) {
        super(name, TASK_TYPE.DEADLINE);
        this.by = by;
    }

    /**
     * Returns a string containing the time the deadline must be completed by.
     * @return String A string containing the time the deadline must be completed by.
     */
    public String getByTime() {
        return this.by;
    }

    /** Returns string representation of the Deadline.
     * @return String containing indication of Deadline class, and string representation of parent Task class.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }
}
