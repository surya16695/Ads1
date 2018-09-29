import java.util.*;
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
        Stack surya = new Stack();
        String[] s = new String[list1.size()];
        String[] m = new String[list2.size()];
        Stack teja = new Stack();
        for (int i = 0; i < list1.size(); i++) {

            s[i] = (list1.delete());
        }
        for (int i = s.length - 1; i > -1; i--) {

            surya.push(s[i]);
         } 
        for (int i = 0; i < list2.size(); i++) {

            m[i] = (list2.delete());
        }
        for (int i = m.length - 1; i > -1; i--) {

            teja.push(m[i]);

        }
        System.out.println(teja.pop());
        if (surya.size() < teja.size()) {
            
            for (int i = 0; i < teja.size(); i++) {
                LinkedList fun = new LinkedList();
                int sum = 0;
                System.out.println(teja.pop());
                System.out.println("***************");
                System.out.println(surya.pop());
                sum += Integer.parseInt(teja.pop()) + Integer.parseInt(surya.pop()) + (sum % 10);
                int k = sum / 10;
                fun.insert(k + "");  
                return fun;
            }
        }else {
            LinkedList fun = new LinkedList();
            for (int i = 0; i < surya.size(); i++) {
                int sum = 0;
                sum += Integer.parseInt(teja.pop()) + Integer.parseInt(surya.pop()) + (sum % 10);
                int k = sum / 10;
                fun.insert(k + "");  
                return fun;

            }

        }
        // String lol = sum + "";
        // fun.insert(lol);
        return null;

    }
}