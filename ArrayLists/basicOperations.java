import java.util.*;

public class basicOperations {

    public static void main (String [] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get element
        int element = list.get(2);
        System.out.println(element);

        // remove element
        list.remove(2);
        System.out.println(list);

        // set element value
        list.set(2, 3);
        System.out.println(list);

        // find element in ArrayList
        System.out.println(list.contains(11));

        // print size of ArrayList
        System.out.println(list.size());

        // print the ArrayList
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(4);
        list.add(5);

        // print reverse of ArrayList
        for(int i = list.size() - 1; i>= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // find maximum in ArrayList
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            // another way of finding max
            max = Math.max(max, list.get(i));
        }
        System.out.println("the maximum value in ArrayList is : " + max);
    }

}

 