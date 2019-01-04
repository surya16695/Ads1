import java.util.*;

class Sorting {
	Person[] persons;
	int size;

	Sorting() {
		persons = new Person[30];
		size = 0;
	}
	void addPerson(Person p) {
		persons[size++] = p;
	}
    public void resize() {
        persons = Arrays.copyOf(persons, 2 * size);
    }
    public int size() {
        return size;
    }
    public void sort() {
        int n = size;
        for (int i = n / 2; i >= 1; i--) {
            sink(persons, i, n);
        }

        while (n > 1) {
            swap(persons, 1, n--);
            sink(persons, 1, n);
        }
    }


    public void sink(Person[] array, int k, int n) {
        while(2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(persons, j, j + 1)) {
                j++;
            }

            if (!less(persons, k, j)) {
                break;
            }

            swap(persons, k, j);
            k = j;
        }
    }


    public boolean less(Person[] array, int i, int j) {
        return array[i - 1].compareTo(array[j - 1]) >= 0;
    }



    public void swap(Person[] array, int i, int j) {
        Person temp = array[i - 1];
        array[i - 1] = array[j - 1];
        array[j - 1] = temp;
    }

   
    public boolean contains(int[] array, int s) {
        for (int i : array) {
            if (s == i) {
                return true;
            }
        }
        return false;
    }

    Person[] jcArray() {
    	return persons;
    }

 //    void addIng() {
 //    	Person[] p = new Person[30];
 //    	int i = 0;
	// 	for (Person each: persons) {
	// 		if (p[i] == null) {
	//     		p[i] = persons[i];
				
	// 		} else if (p[i].getJid() != each.getJid() && p[i].getRid() ) {
	//     		p[i++] = persons[i];
    			
 //    		}
	// 		i++;
	// 	}
	// }
}