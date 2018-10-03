import java.util.*;
class Team {
	String name;
	int wins;
	int loses;
	int draws;
	Team() {

	}
	Team(String name, int wins, int loses, int draws) {
		this.name = name;
		this.wins = wins;
		this.loses = loses;
		this.draws = draws;
	}
	String getName() {
		return this.name;
	}
	int getWins() {
		return this.wins;
	}	
	int getLoses() {
		return this.loses;
	}	
	int getDraws() {
		return this.draws;
	}
	int compareTo(Team that) {
		if (this.getWins() > that.getWins()) {
			return 1;
		}	
		if (this.getWins() < that.getWins()) {
			return -1;
		}
		if (this.getLoses() < that.getLoses()) {
			return 1;			
		}
		if (this.getLoses() > that.getLoses()) {
			return -1;			
		}
		if (this.getDraws() > that.getDraws()) {
			return 1;
		}
		if (this.getDraws() < that.getDraws()) {
			return -1;
		}else {
			return 0;
		}
	}
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Magic.
     */
    private static final int TEN = 10;
    /**
     * Magic.
     */
    private static final int THREE = 3;
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Main function to handle test cases and deliver output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Team[] teams = new Team[TEN];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Selection t = new Selection();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}
class Selection {
	Selection() {
	}
	void sort(Team[] array, int size) {
		for (int i = 0; i < size-1; i++) {
			int min = i;
			for (int j = i+1; j < size; j++) {
				if (less(array, i, j)) {
					min = j;
				}
			}
			swap(array, i, min);
		}
	}
	boolean less(Team[] arr, int index1, int index2) {
		return arr[index1].compareTo(arr[index2]) > 0;
	}
	String leaderboard(Team[] array, int size) {
        sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
        	System.out.println(array[i].name);
            s += array[i].name + ",";
        }
        return s.substring(0, s.length() - 1);
	}
	void swap(Team[] array, int ind1, int ind2) {
		Team temp = array[ind2];
		array[ind2] = array[ind1];
		array[ind1] = temp;

	}

}
