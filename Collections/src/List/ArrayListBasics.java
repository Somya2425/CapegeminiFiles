package List;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(100);
        list.size();
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(30));

        list.remove(2);
        list.add(1,100);
        list.set(2,50);

        list.add(3);
        for(int x : list){
            System.out.println(x);
        }
        lis
    }
}
