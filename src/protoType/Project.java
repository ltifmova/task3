package protoType;

public class Project implements VersionContCommand{
    private final long id;
    private final String name;
    private final String sourcecode;

    public Project(long id, String name, String sourcecode) {
        this.id = id;
        this.name = name;
        this.sourcecode = sourcecode;
    }
    @Override
    public Object copy() {
        return new Project(id,name,sourcecode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourcecode='" + sourcecode + '\'' +
                '}';
    }
}
