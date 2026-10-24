public class Artifact {
    private String name;
    //wrapper Integer class
    private Integer id;

    //tracks total number of artifacts across entire application
    public static int totalArtifactsCreated = 0;


    public Artifact(String name, Integer id){
        this.name = name;
        this.id = id;
        totalArtifactsCreated++;
    }

    //constructor for artifacts without an id
    public Artifact(String name){
        this.name = name;
        this.id = null;
        totalArtifactsCreated++;
    }

    public String getName(){return name;}
    public void setName(){this.name = name;}

    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}

    //returns total number of artifacts
    public static int getTotalArtifactsCreated(){ return totalArtifactsCreated;}

    //checks if artifact has an id - returns  true if present & false if no ID
    public boolean hasID(){
        return this.id != null;
    }


}
