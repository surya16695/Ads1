class Student {
	String name;
	String doB;
	int s1marks;
	int s2marks;
	int s3marks;
	String reserve;
	int totalmarks;
	Student() {

	}
	Student (String naMe, String doB, int s1Marks, int s2Marks,
	 int s3Marks, int totalMarks, String reServe) {
		this.name = naMe;
		this.doB = doB;
		this.s1marks = s1Marks;
		this.s2marks = s2Marks;
		this.s3marks = s3Marks;
		this.totalmarks = totalMarks;
		this.reserve = reServe;
	}
	String getName() {
		return this.name;
	}
	String getDob() {
		return this.doB;
	}
	int getS1marks() {
		return this.s1marks;
	}
	int getS2marks() {
		return this.s2marks;
	}
	int getS3marks() {
		return this.s3marks;
	}
	String getReserve() {
		return this.reserve;
	}
	int getmarks() {
		return this.totalmarks;
	}
	public int comparedTo(Student that) {
		if (this.getmarks() < that.getmarks()) {
			return 1;
		} else if (this.getmarks() > that.getmarks()) {
			return -1;
		}
		else if (this.getS3marks() < that.getS3marks()) {
			return 1;
		} else if (this.getS3marks() > that.getS3marks()) {
			return -1;
		}
		else if (this.getS2marks() < that.getS2marks()) {
			return 1;
		} else if (this.getS2marks() > that.getS2marks()) {
			return -1;
		} else if(this.doB.compareTo(that.doB) > 0) {
			return 1;
		}else if(this.doB.compareTo(that.doB) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
	public String toString() {
		String s = "";
		s += this.name+","+this.totalmarks+","+this.reserve;
		return s;
	}
}


class Merge {
	Student student;
	Merge() {
		student = new Student();

	}
    /**
     * Time complexity is O(1)
     */
    public void sort(Student[] a) {
        Student[] aux = a.clone();
        sort(aux, a, 0, a.length-1);
        assert isSorted(a);
    }
    /**
     * Time complexity is O(1).
     */
    public boolean isSorted(Student[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    /**
     * Time complexity is O(N)
     */
    public boolean isSorted(Student[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }
    /**
     * Time complexity is O(1)
     */
    private void sort(Student[] array, Student[] newarray, int lo, int hi) {
            // if (hi <= lo + CUTOFF) {
            //     insertionSort(newarray, lo, hi);
            //     System.out.println("Insertion sort method invoked...");
            //     return;
            // }
            int mid = lo + (hi - lo) / 2;
            sort(newarray, array, lo, mid);
            sort(newarray, array, mid+1, hi);

            // if (!less(array[mid+1], array[mid])) {
            //    for (int i = lo; i <= hi; i++) {
            //     newarray[i] = array[i];
            //     }
            //     System.out.println("Array is already sorted. So, skipped the call to merge...");
            //    return;
            // }
            merge(array, newarray, lo, mid, hi);
    }
    /**
     * Time complexity is O(1)
     */
    public void exch(Student[] a, int i, int j) {
        Student swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * Time complexity is O(1)
     */
    public boolean less(Student a, Student b) {
        return a.comparedTo(b) < 0;
    }
    /**
     * Time complexity is O(N).
     */
    public void merge(Student[] array, Student[] newarray, int lo, int mid, int hi) {
        // assert isSorted(array, lo, mid);
        // assert isSorted(array, mid+1, hi);

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                newarray[k] = array[j++];
            }

            else if (j > hi) {
                newarray[k] = array[i++];
            }

            else if (less(array[j], array[i])) {
                newarray[k] = array[j++];
            }
            else {
                newarray[k] = array[i++];
            }
        }
        // assert isSorted(newarray, lo, hi);
    }
}