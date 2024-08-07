public class pascal {
    public static void main(String[] args) {
        for(int r=1; r<=5; r++){
    
            for(int c=1; c<=5-r; c++){
                
                
                System.out.print(" ");
                
                
            }
            
            int a=1;
            for(int c=1; c<=r; c++){

                System.out.print(a);
                a++;
              
                
            }
             a--;

            for(int c=2; c<=r; c++){
                a--;
                System.out.print(a);
            }
            System.out.println();
        }
     

        
             



            System.out.println("");

        }
    }
    

