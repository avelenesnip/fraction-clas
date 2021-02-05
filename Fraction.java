class Fraction{
    
    private int num; //numerator 
    private int den; //denominator
    
    public Fraction() {
        
        this.num = 1;
        this.den = 1;
        
        
    }
    
    public Fraction (String f){
        int slashIndex = f.indexOf("/");
        
        String n = f.substring (0, slashIndex);
        String d = f.substring (slashIndex+1);
        
        this.num = Integer.parseInt (n);
        int tempD = Integer.parseInt (d); //add error check
        
        if (tempD == 0){
            System.out.println ("error den is 0");
        }else{
            this.den = tempD;
        }
        
    }
    
    
    public Fraction (Fraction f){
    
       this.num = f.num;
       this.den = f.den;
    
    }
    
    
    public int getNum(){
       return this.num;
    }
    
    public int getDen(){
       return this.den;
    }
    
    public String toString(){
        return this.num + "/" + this.den;
    }
    
    public void setNum(){
       this.num = num;
    }
    
    public void setDen(){
       if(this.den != 0)
       this.den = den;
       else
       System.out.println("error den is 0");
    }
    
    
    private void GCF(){
        
        int n = num;
        int d = den;
        
        //if (d>=n)

        //if (d<=n)
            
        }
        
        
    public static Fraction multiply (Fraction a, Fraction b){
            
        int newNum = a.num()*b.num();
        int newDen = a.den * b.den;
        Fraction f = new Fraction (newNum,newDen);
        f.reduce();
        return f;
    }
        
        
}
       
}
    
    
    