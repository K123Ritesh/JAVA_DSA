public class Power_set_using_Bitwise {

     public static void printPowerSet(String s){
          //Time  :- 0(2^n x n)
          int n=s.length();
          int psize=1<<n; //2^n
          for(int i=0;i<psize;i++){
               for(int j=0;j<n;j++){
                    if(( i & (1 << j) )!=0){
                         System.out.print(s.charAt(j));
                    }
               }
               System.out.println();
          }

     }
     public static void main(String[] args) {
          printPowerSet("ABC");
     }
     
}
