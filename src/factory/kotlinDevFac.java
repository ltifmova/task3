package factory;

public class kotlinDevFac implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new kotlindev();
    }
}
