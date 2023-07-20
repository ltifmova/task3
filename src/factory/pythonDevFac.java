package factory;

public class pythonDevFac implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new pythonDev();
    }
}
