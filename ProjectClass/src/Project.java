public class Project {
    private String name;
    private String description;
    private double initialCost;


    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;

    }
    public Project(String name, double initialCost, String description){
        this.name = name;
        this.initialCost = initialCost;
        this.description = description;
    }
    public void elevatorPitch(){
        System.out.println(name+" ("+initialCost+"): "+description);
    }
    // setting name
    public void setName(String name){
        this.description = description;
    }
    // setting description
    public void setDescription(String description){
        this.description = description;
    }
    // setting initialCost
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
    //getting name
    public String getName(){
        return name;
    }
    //getting description
    public String getDescription(){
        return description;
    }
    //getting initialCost
    public double getInitialCost(){
        return initialCost;
    }
}
