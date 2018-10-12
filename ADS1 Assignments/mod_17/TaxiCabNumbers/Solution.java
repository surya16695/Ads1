import java.util.Scanner;
class CubeSum implements Comparable<CubeSum> {
     long sum;
     int i;
   int j;

    public CubeSum(int i, int j) {
        this.sum = i*i*i + j*j*j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return sum + "= "+i+" + "+j;
    }

}
class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n = 1000;

        // initialize priority queue
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
        }

        int mth = 1;
        int nth =0;

        CubeSum previous = new CubeSum(0,0); 

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            CubeSum current = pq.delMin();
            if(current.sum == previous.sum){
                      mth++;
                      if(mth == M){
                        nth++;
                      }
                      if(nth == N){
                        System.out.println(current.sum);
                        break;
                      }
             }
             else{
                mth=1;
             }
             previous = current;

            if (current.j < n)
                pq.insert(new CubeSum(current.i, current.j + 1));
        }
    }
    
}