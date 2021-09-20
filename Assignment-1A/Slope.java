//Malcolm Armstrong 
//Sept. 20, 2021
//Assignment 1A

class Slope {
    public static void main (String[] args) {
        //Initializing Variables-------------------------------------------------------------------------------------------------
        final int x1=0;
        final int y1=0;
        final int x2=2;
        final int y2=3;
        double m;
        
        //Finding Slope----------------------------------------------------------------------------------------------------------
        m = (y2-y1)/(x2-x1);
        
        //Output Answer----------------------------------------------------------------------------------------------------------
        System.out.println("A line connecting the points ("+x1+", "+y2+") and ("+x2+", "+y2+") has a slope of "+m);
    }
}