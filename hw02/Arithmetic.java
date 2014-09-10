//An Phung
//hw02

//  define a class
public class Arithmetic{

//  add a main method
    public static void main(String[] args) {
    
//  input variables

    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass 
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //Cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
    /*Things needed to be calculated:
        Total cost of each kind of item; sales tax for that total cost
        Total cost of purchases (before tax)
        Total actually paid for this transaction, including tax 
    Need to declare variables for each of these values */
    
    
    //Declare variables
    double totalsockCost$; //total cost of socks without tax
    double taxsockCost$; //total tax for socks purchased
    double totalsockCosttax$; //total cost of socks with tax
    
    double totalglaCost$; //total cost of glasses without tax
    double taxglaCost$; //total tax for glasses purchased
    double totalglaCosttax$; //total cost of glasses with tax
    
    double totalenvCost$; //total cost of envelopes without tax
    double taxenvCost$; //total tax for envelopes purchased
    double totalenvCosttax$; //total cost of envelopes with tax
    
    double totalPur$; //total cost of entire purchase without tax
    double taxPur$; //total tax for entire purchase
    double totalPurtax$; //total cost of entire purchase with tax
    
    //Start Calculations
    
    
    //Calculations for socks
    totalsockCost$= nSocks * sockCost$; //total cost of socks without tax
    taxsockCost$= totalsockCost$ * taxPercent; //total tax for socks purchased
    totalsockCosttax$= totalsockCost$ + taxsockCost$; //total cost of socks with tax
    totalsockCosttax$= (int)(totalsockCosttax$*100)/(100.0); //makes the answer an integer and into dollar format
    
    //Calculations for glasses
    totalglaCost$= nGlasses * glassCost$; //total cost of glasses without tax
    taxglaCost$= totalglaCost$ * taxPercent; //total tax for glasses purchased
    totalglaCosttax$= totalglaCost$ + taxglaCost$; //total cost of glasses purchase with tax
    totalglaCosttax$= (int)(totalglaCosttax$*100)/(100.0); //makes the answer an integer and into dollar format
    
    //Calculations for envelopes
    totalenvCost$= nEnvelopes * envelopeCost$; //total cost of envelopes without tax
    taxenvCost$= totalenvCost$ * taxPercent; //total tax for envelopes purchased
    totalenvCosttax$= totalenvCost$ + taxenvCost$; //total cost of envelopes with tax
    totalenvCosttax$= (int)(totalenvCosttax$*100)/(100.0); //makes the answer an integer and into dollar format
    
    //Calculations for entire purchase
    totalPur$= totalsockCost$ + totalglaCost$ + totalenvCost$; //total cost of purchase without tax
    taxPur$= totalPur$ * taxPercent; //total tax for entire purchase
    totalPurtax$= totalPur$ + taxPur$; //total cost of purchase with tax
    totalPurtax$= (int)(totalPurtax$*100)/(100.0); //makes the answer an integer and into dollar format
    
    //Print output
    
    //Print out anything that has to do with socks
    System.out.println("I am buying " +nSocks+ "pairs of socks."); //prints out how many socks I'm buying
    System.out.println("Each pair of socks costs " +sockCost$+ "."); //prints out how much each pair of socks cost
    System.out.println("The total amount for socks before tax is $" +totalsockCost$+ "."); //prints out the cost of socks before tax
    System.out.println("The total sales tax for socks is $" +taxsockCost$+ "."); //prints out how much tax for the socks
    System.out.println("The total cost of the socks with tax is $" +totalsockCosttax$+ "."); //prints out the total cost for socks with tax
    
    //Print out anything that has to do with glasses
    System.out.println("I am buying " +nGlasses+ "drinking glasses."); //prints out how many glasses I'm buying
    System.out.println("Each drinking glass costs " +glassCost$+ "."); //prints out how much each glass costs
    System.out.println("The total amount for drinking glasses before tax is $" +totalglaCost$); //prints out the cost of glasses before tax
    System.out.println("The total sales tax for drinking glasses is $" +taxglaCost$+ "."); //prints out how much tax for the glasses
    System.out.println("The total cost of the drinking glasses with tax is $" +totalglaCosttax$+ "."); //prints out the total cost for socks with tax
    
    //Print out anything that has to do with envelopes
    System.out.println("I am buying " +nEnvelopes+ "boxes of envelopes."); //prints out how many envelopes I'm buying
    System.out.println("Each box of envelopes costs " +envelopeCost$+ "."); //prints out the cost of each envelope
    System.out.println("The total amount for boxes of envelopes before tax is $" +totalenvCost$+ "."); //prints out the cost of the envelopes before tax
    System.out.println("The total sales tax for the boxes of envelopes is $" +taxenvCost$+ ".");
    System.out.println("The total cost of the boxes of envelopes with tax is $" +totalenvCosttax$+ "."); //prints out the total cost for envelopes with tax
    
    //Print out the total cost of the purchase
    System.out.println("The total of the purchase before tax is $" +totalPur$+ "."); //prints out the cost of total purchase before tax
    System.out.println("The total sales tax for the purchase is $" +taxPur$+ "."); //prints out the amount of sales tax for purchase
    System.out.println("The total of the purchase with tax is $" +totalPurtax$+ "."); //prints out the total cost of purchase with tax
    
    } //end of main method
} //end of class
    
    
    
    
    
    
    
    
    
    
    
    
    