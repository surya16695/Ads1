import java.util.Scanner;
import java.util.Arrays;

class Percolation {
    int[][] per;
    int opensites;
    int size;
    WeightedQuickUnionUF wqu;

   public Percolation(int size){
    per = new int[size][size];
    opensites = 0;
    wqu = new WeightedQuickUnionUF((size * size) + 2);
        // create size-by-size grid, with all sites blocked
   }
    public void open(int row, int col){
    // open site (row, col) if it is not open already
        // per[row - 1][col - 1] = 2;
        // opensites++;
       row = row - 1;
       col = col-1;
       per[row][col] = 1;
       opensites++;
        if (row == 0) {
            wqu.union(0, component(row, col));
        }
        if (row == size - 1) {
            wqu.union((size * size) + 1, component(row, col));
        }
        if (row + 1 < size && per[row][col] == 1) {
                wqu.union(
                    component(row + 1, col), component(row, col));
            }
        if (row - 1 >= 0 && per[row - 1][col] == 1) {
                wqu.union(
                    component(row - 1, col), component(row, col));
        }
        if (col - 1 >= 0 && per[row][col - 1] == 1) {
                wqu.union(component(row, col - 1), component(row, col));
        }
        if (col + 1 < size && per[row][col + 1] == 1) {
                wqu.union(
                    component(row, col + 1), component(row, col));
        }

    }
   int component(int i,int j){
     return ((i*size)+j);
   }
    public boolean isOpen(int row, int col) {
    // is site (row, col) open?
        return per[row][col] == 1;
        
    }
    public boolean isFull(int row, int col) {
    // is site (row, col) full?
        return per[row][col] == 0;
        
    }
    public int numberOfOpenSites() {
    // number of open sites
        return opensites;
        
    }
    public boolean percolates() {
    // does the system percolate?
       return wqu.connected(0,(size*size)+1);        
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
        }
        System.out.println(perc.percolates());
    }
}