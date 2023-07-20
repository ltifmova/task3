package protoType;

public class VersionContRunner {
    public static void main(String[] args) {
        var project =new Project(1,"First","code");
        var projectFactory =new ProjectFac(project);
        var projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);
    }
}
