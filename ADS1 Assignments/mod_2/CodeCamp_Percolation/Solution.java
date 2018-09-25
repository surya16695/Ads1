import java.util.Scanner;
import java.util.Arrays;

class Percolation {
    int[][] per;
   public Percolation(int n){
    per = new int[n][n];
        // create n-by-n grid, with all sites blocked
   }
    public void open(int row, int col){
    // open site (row, col) if it is not open already
        per[row][col] = 2;        
    }
    public boolean isOpen(int row, int col) {
    // is site (row, col) open?
        return false;
        
    }
    public boolean isFull(int row, int col) {
    // is site (row, col) full?
        return false;
        
    }
    public int numberOfOpenSites() {
    // number of open sites
        return 1;
        
    }
    public boolean percolates() {
    // does the system percolate?
        return false;
        
    }
}


// You can implement the above API to solve the problem
class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = Integer.parseInt(s.nextLine());
        Percolation perc = new Percolation(h);
        while (s.hasNext()) {
            String line = s.nextLine();
            String[] tokens = line.split(" ");
            perc.open(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            for (int i = 0; i < h; i++) {
            System.out.println(Arrays.toString(perc.per[i]));
                
            }
        }
    }
}