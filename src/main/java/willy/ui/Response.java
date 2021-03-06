package willy.ui;

/**
 * Responses that the bot is capable of.
 */
public enum Response {
    INCOMPLETE_INFO {
        @Override
        public String toString() {
            return "Are you missing description/deadline of the task? Check and try again? \n";
        }
    },
    NO_TASK {
        @Override
        public String toString() {
            return "Task not found, please check the list again or add the task first";
        }
    },
    ADD_TASK {
        @Override
        public String toString() {
            return "Ay here is the task you just added:\n";
        }
    },
    NON_MATCHING_TASK {
        @Override
        public String toString() {
            return "There are no matching tasks found in the list. Try something else?";
        }
    },
    MATCHING_TASK {
        @Override
        public String toString() {
            return "Okay, Here's the task you are finding:";
        }
    },
    REMOVE_TASK {
        @Override
        public String toString() {
            return "Okay, Here is the task you just deleted:\n";
        }
    },
    DONE_TASK {
        @Override
        public String toString() {
            return "Nice! I've marked this task as done!";
        }
    },
    UPDATE_TASK {
        @Override
        public String toString() {
            return "Okay, Here's the task you just updated:\n";
        }
    },
    EMPTY_LIST {
        @Override
        public String toString() {
            return "There is no task in your list:>\n";
        }
    },
    NON_EMPTY_LIST {
        @Override
        public String toString() {
            return "Here are the tasks in your list to jolt ur memory:>\n";
        }
    },
    NO_SENSE {
        @Override
        public String toString() {
            return "Sorry I'm not sure what you are saying, try typing 'help' to view the list of commands available?";
        }
    }
}
