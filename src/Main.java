public class Main {
    public static void main(String[] args) {

        System.out.println();

        //check if tracking works
        Artifact artifact1 = new Artifact("Goblet of Fire", 7658);
        Artifact artifact2 = new Artifact("Elder Wand", 9800);
        Artifact artifact3 = new Artifact("Spell Book Vol. 1", 3405);
        Artifact artifact4 = new Artifact("Sell Book Vol 2", 4574);

        String rawLogEntry = "206.89";

        //display archive report
        Utility.displayArchiveReport(rawLogEntry);

        //Test the stability index with the parsed energy value
        double parsedEnergy = Double.parseDouble(rawLogEntry);
        double stability = Utility.stabilityIndexCalculations(parsedEnergy);
        System.out.println("Stability Index for log energy: " + stability);



        //TESTING PROGRAM
        //display the Universal Cataloging Constant
        //System.out.println("Universal Cataloging Constant: " + Artifact.UNIVERSAL_CATALOGING_CONSTANT);

        System.out.println("Total number of Artifacts: " + Artifact.getTotalArtifactsCreated());
        System.out.println();

        //test utility calculator
        double energyLevel1 = 8.9234;
        double energyLevel2 = 3.3434;

        double stability1 = Utility.stabilityIndexCalculations(energyLevel1);
        double stability2 = Utility.stabilityIndexCalculations(energyLevel2);

        System.out.println("Stability Index: " + stability1);
        System.out.println("Stability Index: " + stability2);



    }
}
