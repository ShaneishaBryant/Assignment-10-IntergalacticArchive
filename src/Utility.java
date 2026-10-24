public class Utility {

    //utility to calculate the stability index of an artifact
    public static double stabilityIndexCalculations(double energyLevel){
        double absoluteDifference = Math.abs(energyLevel - Artifact.UNIVERSAL_CATALOGING_CONSTANT);
        return Math.sqrt(absoluteDifference);
    }
}
