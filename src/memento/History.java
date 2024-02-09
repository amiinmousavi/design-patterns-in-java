package memento;

import java.util.Stack;

public class History {
    private Stack<PlannerState> states = new Stack<>();

    public void push(PlannerState state) {
        states.add(state);
    }

    public PlannerState pop() {
        return states.pop();
    }
}
