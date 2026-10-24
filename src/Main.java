public class Main {
    public static void main(String[] args) {

        //display the Universal Cataloging Constant
        System.out.println("Universal Cataloging Constant: " + Artifact.UNIVERSAL_CATALOGING_CONSTANT);
        System.out.println();

        //check if tracking works
        Artifact artifact1 = new Artifact("Goblet of Fire", 7658);
        Artifact artifact2 = new Artifact("Elder Wand", 9800);

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
