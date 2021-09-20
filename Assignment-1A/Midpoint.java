//Malcolm Armstrong 
//Sept. 20, 2021
//Assignment 1A

class Midpoint {
    public static void main (String[] args) {
        //Initializing Variables-------------------------------------------------------------------------------------------------
        final int x1=0;
        final int x2=2;
        final int y1=0;
        final int y2=3;
        double M1;
        double M2;
        
        //Calculating Midpoint---------------------------------------------------------------------------------------------------
        M1 = ((double)x1+(double)x2)/2;
        M2 = ((double)y1+(double)y2)/2;
        
        //Outputting Answer------------------------------------------------------------------------------------------------------
        System.out.println("The midpoint between ("+x1+", "+y1+") and ("+x2+", "+y2+") is ("+M1+", "+M2+")");
    }
}