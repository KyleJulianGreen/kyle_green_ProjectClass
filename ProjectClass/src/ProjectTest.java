public class ProjectTest {
    public static void main(String[] args){
        Project project = new Project();
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", "Project 3's Description");
        Project project4 = new Project("Fourth Project", 4300, "This Project is gonna cost you" );

        Portfolio portfolio = new Portfolio();

        project.setName("My first project ever!");
        project.setDescription("This is a description");
        project.setInitialCost(400);

        System.out.println(project3.getName());
        System.out.println(project3.getDescription());


        project.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
        project4.elevatorPitch();

        portfolio.addProject(project);
        portfolio.addProject(project2);
        portfolio.addProject(project3);
        portfolio.addProject(project4);

        System.out.println(portfolio.getPortfolioCost());


        portfolio.showPortfolio();

    }
}
