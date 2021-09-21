//Malcolm Armstrong 
//Sept. 20, 2021
//Assignment 1A

class AssignmentA1 {
    public static void main (String[] args) {
        //Quadratic Formula
        //Initializing Variables--------------------------------------------------------------------------------------------
        final int a = 1;
        final int b = 5;
        final int c = 6;
        double qx1;
        double qx2;
        
        //Finding the 2 solutions------------------------------------------------------------------------------------------------
        qx1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        qx2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        
        //Output answer----------------------------------------------------------------------------------------------------------
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are "+qx1+" and "+qx2+".");
        System.out.println();
        
        
        //Slope
        //Initializing Variables-------------------------------------------------------------------------------------------------
        final int sx1=0;
        final int sy1=0;
        final int sx2=2;
        final int sy2=3;
        double m;
        
        //Finding Slope----------------------------------------------------------------------------------------------------------
        m = ((double)sy2-(double)sy1)/((double)sx2-(double)sx1);
        
        //Output Answer----------------------------------------------------------------------------------------------------------
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points ("+sx1+", "+sy1+") and ("+sx2+", "+sy2+") has a slope of "+m);
        System.out.println();
        
        
        //Midpoint
        //Initializing Variables-------------------------------------------------------------------------------------------------
        final int mx1=0;
        final int mx2=2;
        final int my1=0;
        final int my2=3;
        double M1;
        double M2;
        
        //Calculating Midpoint---------------------------------------------------------------------------------------------------
        M1 = ((double)mx1+(double)mx2)/2;
        M2 = ((double)my1+(double)my2)/2;
        
        //Outputting Answer------------------------------------------------------------------------------------------------------
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+mx1+", "+my1+") and ("+mx2+", "+my2+") is ("+M1+", "+M2+")");
        System.out.println();
        
        
        //Sum of an Arithmetic Series
        //Initializing Variables-------------------------------------------------------------------------------------------------
        final double n=1;
        final double a1=1;
        final int k=5;
        double ak;
        double asum;
        
        //Calculating final term-------------------------------------------------------------------------------------------------
        ak = a1+((k-1)*n);
        
        //Calculating sum--------------------------------------------------------------------------------------------------------
        asum = ((double)k/2)*(a1 + ak);
        
        //Output Answer----------------------------------------------------------------------------------------------------------
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first "+k+" terms of an arithmetic series that starts with "+a1);
        System.out.println("and increases by "+n+" is "+asum);
        System.out.println();
        
        
        //Sum of a Geometric Series
        //Initializing Variables----------------------------------------------------------------------------------------------
        final double r=2;
        final double g1=3;
        final int gn=3;
        double gsum;
        
        //Calculating the sum----------------------------------------------------------------------------------------------------
        gsum = g1*((1-Math.pow((double)r,gn))/(1-(double)r));
        
        //Printing the Answer
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first "+gn+" terms of a finite geometric series that starts with "+g1);
        System.out.println("and increases by a rate of "+r+" is "+gsum);
        System.out.println();
        
    }
}