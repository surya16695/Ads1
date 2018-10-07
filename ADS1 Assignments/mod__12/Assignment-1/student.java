/**STUDENT.**/
class student implements Comparable<student> {
    /**
     * variable.
     */
    private String name;
    /**
     * variable.
     */
    private String dob;
    /**
     * variable.
     */
    private int sub1;
    /**
     * variable.
     */
    private int sub2;
    /**
     * variable.
     */
    private int sub3;
    /**
     * variable.
     */
    private int total;
    /**
     * variable.
     */
    private String reservation;
    /**
     * Constructs the object.
     *
     * @param      name   The name
     * @param      dob    The dob
     * @param      sub1   The sub 1
     * @param      sub2   The sub 2
     * @param      sub3   The sub 3
     * @param      total  The total
     * @param      res    The resource
     */
    student(String name,String dob,int sub1,int sub2,int sub3,int total,String res) {
        this.name = name;
        this.dob = dob;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.total = total;
        this.reservation = res;
    }
    /**
     * time complexity is 1
     */
    public String getname() {
        return this.name;
    }
    /**
     * time complexity is 1
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * time complexity is 1
     */
    public int get1() {
        return this.sub1;
    }
    /**
     * time complexity is 1
     */
    public int get2() {
        return this.sub2;
    }
    /**
     * time complexity is 1
     */
    public int get3() {
        return this.sub3;
    }
    /**
     * time complexity is 1
     */

    public int gettotal() {
        return this.total;
    }
    /**
     * time complexity is 1
     */
    public String getreserve() {
        return this.reservation;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s = "";
        s += this.name+" "+this.total+" "+this.reservation;
        return s;
    }
    /**
     * { function_description }
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(student that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        }
         else if (this.gettotal() < that.gettotal()) {
            return -1;
         }
         else if (this.get3() > that.get3()) {
            return 1;
         } else if (this.get3() < that.get3()) {
            return -1;
         } else if (this.get2() > that.get2()) {
            return 1;
         } else if (this.get2() < that.get2()) {
            return - 1;
         } else if (this.getdob().compareTo(that.getdob()) > 0) {
            return 1;
         } else if (this.getdob().compareTo(that.getdob()) < 0) {
            return -1;
         }
            else {
        return 0;
        }
    }
}
