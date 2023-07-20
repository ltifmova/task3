package factory;

public class javaDevFac implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new javadev();
    }
}