package willy.task;

/**
 * Work that people need to do that will be keep tracked of by the bot.
 * Status of task to be marked done or undone.
 */
public class Task {
    private boolean done;
    private String task;
    private TaskSymbol taskType;

    public Task(String task, TaskSymbol taskType) {
        this.task = task;
        this.taskType = taskType;
        this.done = false;
    }

    public String getTask() {
        return task;
    }

    public TaskSymbol getTaskType() {
        return taskType;
    }

    public void setTaskDone(boolean boo) {
        done = boo;
    }

    public String getStatusIcon() {
        return (done ? "\u2713" : "\u2718");
    }

    @Override
    public String toString() {
        return taskType + "[" + getStatusIcon() + "]" + " " + task;

    }
}
