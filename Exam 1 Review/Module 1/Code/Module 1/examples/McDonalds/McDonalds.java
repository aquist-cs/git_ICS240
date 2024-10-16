public class McDonalds {
    private boolean hasGoldenArches; 
    private int storeNumber;
    private double annualEarnings; 
    private String managerName;
    private static int numStores = 0;

    public McDonalds(double earnings) {
        hasGoldenArches = true; 
        numStores = numStores + 1;
        storeNumber = 1; 
        annualEarnings = earnings;
        managerName = new String("Jess");
    }

    public McDonalds(boolean golden, double earnings, String name) {
        hasGoldenArches = golden; 
        storeNumber = ++numStores; 
        annualEarnings = earnings;
        managerName = name;  
    }

    public String toString() {
        String output = ""; 
        output += "The manager of store number " + storeNumber; 
        output += " is " + managerName; 
        return output; 
    }

    public boolean equals(McDonalds other) {
        return this.storeNumber == other.storeNumber; 
    }
}