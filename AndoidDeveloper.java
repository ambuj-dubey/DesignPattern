public class AndoidDeveloper implements Employee {
    
    @Override
    public int salary() {
        return 1999;
    }

    @Override
    public String name() {
        System.out.println("I am Android Developer");
        return "ANDROID DEVELOPER";
    }
    
}
