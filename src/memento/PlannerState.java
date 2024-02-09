package memento;

public class PlannerState {
    private final String currentTodo;

    public PlannerState(String currentTodo) {
        this.currentTodo = currentTodo;
    }

    public String getCurrentTodo() {
        return currentTodo;
    }
}
