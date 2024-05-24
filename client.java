public class client {
    public static void main(String[] args) {

        //Android Developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
        System.out.println(e1.salary());

        //Web Developer
        Employee e2 = EmployeeFactory.getEmployee(new webDevFactory());
        e2.name();
        System.out.println(e2.salary());

    }
}
