package memento;

public class Main {
    public static void main(String[] args) {
        var planner = new Planner();
        planner.setCurrentToDo("Fix bug in login system");
        planner.setCurrentToDo("Optimize database queries");
        planner.setCurrentToDo("Update documentation");

        System.out.println(planner.getCurrentToDo());
    }
}
