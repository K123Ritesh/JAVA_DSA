package Dynamic_Programming;

public class FibonacciNumber {
    int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    int memo[];
    int fib_DP_Memoization(int n){
        if(memo[n]==-1)
        return fib(n-1)+fib(n-2);
    }
    int tab[];
    int fib_DP_Tabulation(int n){
        tab=new int [n+1];
        tab[0]=0;
        tab[1]=1;
        for(int i=2;i<n;i++){
            tab[i]=tab[i-1]+tab[i-2];
        }
        return tab[n];
    }
}
