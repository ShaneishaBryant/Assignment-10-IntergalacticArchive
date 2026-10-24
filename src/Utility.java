public class Utility {

    //utility to calculate the stability index of an artifact
    public static double stabilityIndexCalculations(double energyLevel){
        double absoluteDifference = Math.abs(energyLevel - Artifact.UNIVERSAL_CATALOGING_CONSTANT);
        return Math.sqrt(absoluteDifference);
    }

    //Put it in utility to keep Main clean, easier code reusability and updates
    //The Archive Report - Display
    public static void displayArchiveReport(String rawLog){
        System.out.println("==========================================");
        System.out.println("          ARCHIVE SYSTEM REPORT           ");
        System.out.println("==========================================");

        //print total number of artifacts registered
        System.out.println("Total Artifacts Registered: " + Artifact.getTotalArtifactsCreated());

        //format the universal cataloging constant to 3 decimal places
        String formattedConstant = String.format("%.3f", Artifact.UNIVERSAL_CATALOGING_CONSTANT);
        System.out.println("Universal Cataloging Constant: " + formattedConstant);

        //process "raw log" string and convert into double to display current system energy
        double systemEnergy = Double.parseDouble(rawLog);
        System.out.println("Current System Energy: " + systemEnergy);
    }

}
