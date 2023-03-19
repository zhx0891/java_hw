package HW9;

public class JavaDevoperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return  new JavaDeveloper();
    }
}
