import java.util.Scanner;
class AddLargeNumbers {
    // Stack s = new Stack();

    public static LinkedList numberToDigits(String number) {
        LinkedList obj = new LinkedList();
        String[] lol = number.split("");
        for (int i = 0; i < lol.length; i++) {
            obj.insert(lol[i]);
        }
        // System.out.println(obj.size());
        return obj;
    }

    public static String digitsToNumber(LinkedList list) {
        String su = "";
        for (int j = list.size(); j > 0; --j) {

            su += list.delete();

        }
        return su;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList fun = new LinkedList();
        int sum = 0;
        Stack surya = new Stack();
        String[] s = new String[list1.size()];
        String[] m = new String[list2.size()];
        Stack teja = new Stack();
        for (int i = 0; i < list1.size(); i++) {
            s[i] = (list1.delete());
        }
        for (int i = s.length - 1; i > 0; i--) {
             surya.push(s[i]);
         } 
        for (int i = 0; i < list1.size(); i++) {
            m[i] = (list2.delete());
        }
        for (int i = m.length - 1; i > 0; i--) {
            teja.push(s[i]);
        }
        if (list1.size() < list2.size()) {
            
            for (int i = 0; i < list2.size(); i++) {
                sum += Integer.parseInt(teja.pop()) + Integer.parseInt(surya.pop());
            }
        }else {
            for (int i = 0; i < list1.size(); i++) {
                sum += Integer.parseInt(teja.pop()) + Integer.parseInt(surya.pop());
            }

        }
        String lol = sum + "";
        fun.insert(lol);
        return fun;

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                // System.out.println("************************");
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                // System.out.println("************************");
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
