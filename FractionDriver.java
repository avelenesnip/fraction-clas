class FractionDriver{
    
    public static void main (String[] args){
        
        Fraction myFraction = new Fraction();
        Fraction yourFraction = new Fraction(1,0);
        
        Fraction f1 = new Fraction (myFraction);
        Fractio f2 = new Fraction (f1);
        
        
        System.out.print (f2);
        
        
        System.out.println(f1.multiply (f1,f2));

    }
    
}