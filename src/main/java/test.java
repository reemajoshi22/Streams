class test 
{ 
    public static int y = 0; 
} 
  
class HasStatic 
{ 
    private static int x = 100; 
      
    public static void main(String[] args) 
    { 
        HasStatic hs1 = new HasStatic(); 
        hs1.x++; 
          
        HasStatic hs2 = new HasStatic(); 
        hs2.x++; 
          
        hs1 = new HasStatic(); 
        hs1.x++; 
          
        HasStatic.x++; 
        System.out.println("Adding to 100, x = " + x); 
          
        test t1 = new test(); 
        t1.y++; 
          
        test t2 = new test(); 
        t2.y++; 
          
        t1 = new test(); 
        t1.y++; 
          
        System.out.print("Adding to 0, "); 
        System.out.println("y = " + t1.y + " " + t2.y + " " + test.y); 
    } 
}