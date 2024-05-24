public class webDevFactory extends EmployeeAbstractFactory{
    
    @Override
    public Employee creatEmployee() {
        return new webDeveloper();
    }
    
}
