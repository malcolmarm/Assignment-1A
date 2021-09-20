//Malcolm Armstrong
//Sept. 20, 2021
//Assignment 1A

class QF {
    public static void main (String[] args) {
        //Quadratic Formula Variables--------------------------------------------------------------------------------------------
        final int a = 1;
        final int b = 8;
        final int c = 8;
        double x1;
        double x2;
        
        //Finding the 2 solutions------------------------------------------------------------------------------------------------
        x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        
        //Output answer----------------------------------------------------------------------------------------------------------
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are "+x1+" and "+x2+".");
        
       }
}