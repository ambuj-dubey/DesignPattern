public class webDeveloper implements Employee {

    @Override
    public int salary() {
        return 1500;
    }

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "WEB DEVELOPER";
    }
    
}
