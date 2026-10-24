public class Main {
    public static void main(String[] args) {

        //display the Universal Cataloging Constant
        System.out.println("Universal Cataloging Constant: " + Artifact.UNIVERSAL_CATALOGING_CONSTANT);
        System.out.println();

        //check if tracking works
        Artifact artifact1 = new Artifact("Goblet of Fire", 7658);
        Artifact artifact2 = new Artifact("Elder Wand", 9800);

        System.out.println("Total number of Artifacts: " + Artifact.getTotalArtifactsCreated());

    }
}
