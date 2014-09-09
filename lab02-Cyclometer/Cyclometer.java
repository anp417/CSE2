//An Phung
//9-5-2014
//lab02
/* This program will print out the data for my bicycle's 
   cyclometer for each trip that I make with my bicycle*/
/*Print the number of minutes for each trip
  Print the number of counts for each trip
  Print the distance of each trip in miles
  Print the distance for the two trips combined*/

// define a class
public class Cyclometer{

    //main method required for every Java program
    public static void main(String[] args) {
    
    //our input data
    int secsTrip1=480; //the time it took for trip 1 in secs
    int secsTrip2=3220; //the time it took for trip 2 in secs
    int countsTrip1=1561; //the counts for trip 1
    int countsTrip2=9037; //the counts for trip 2
    
    // "int" puts in a variable that is an INTEGER
    
    //our intermediate variables and output data
    double wheelDiameter=27.0, //Diameter of the bicycle wheel
    PI=3.14159, //the numerical value of pi
    feetPerMile=5280, //the amount of feet per mile
    inchesPerFoot=12, //the amount of inches per foot
    secondsPerMinute=60; //the amount of secs per minute
    double distanceTrip1, distanceTrip2, totalDistance; 
    /*make the variable names for the distances for each trip and the
    total distance */
    
    // "double" puts in a variable that has a DECIMAL
    
    System.out.println("Trip 1 took"+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
         countsTrip1+" counts.");
    System.out.println("trip 2 took"+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
         countsTrip2+" counts.");
         
    //anything within double quotes MUST be on one line
    
    //run the calculations; store the values
    /*The first code printed out the amount of minutes it took
      for the first trip and the counts
      The second code printed out the amount of minutes it 
      took for the second trip and the counts*/
      
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the dismeter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance
    //in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //Gives distance of Trip two in miles
    totalDistance=distanceTrip1+distanceTrip2;
    //Gives the total distance of Trip 1 and Trip 2 in miles
    
    //Print out the output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was"+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    
    
    } //end of main method
} //end of class
