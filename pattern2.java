public class pattern2 {

    public static void main(String[] args) {
        for(int r=1; r<=5; r++){
            char a='A';
            for(int c=1; c<=r; c++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
    
}
