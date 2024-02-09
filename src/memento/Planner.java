package memento;

public class Planner {
    private String currentToDo;

    public PlannerState createState() {
        return new PlannerState(currentToDo);
    }

    public void undo(PlannerState state) {
        currentToDo = state.getCurrentTodo();
    }


    public String getCurrentToDo() {
        return currentToDo;
    }

    public void setCurrentToDo(String currentToDo) {
        this.currentToDo = currentToDo;
    }
}
