package memento;

public class Main {
    public static void main(String[] args) {
        var planner = new Planner();
        var history = new History();

        planner.setCurrentToDo("Fix bug in login system");
        history.push(planner.createState());

        planner.setCurrentToDo("Optimize database queries");
        history.push(planner.createState());

        planner.setCurrentToDo("Update documentation");
        planner.undo(history.pop());
        planner.undo(history.pop());

        System.out.println(planner.getCurrentToDo());
    }
}
