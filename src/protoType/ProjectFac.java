package protoType;

public class ProjectFac {
    private final Project project;
    public ProjectFac(Project project){
        this.project=project;
    }
    public Project cloneProject(){
        return (Project) project.copy();
    }
}
