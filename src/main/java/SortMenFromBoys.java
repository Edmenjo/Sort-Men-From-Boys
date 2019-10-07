import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortMenFromBoys {

    private ArrayList<Integer> list = new ArrayList();
    private ArrayList<Integer> evenOnes = new ArrayList();
    private ArrayList<Integer> oddOnes = new ArrayList();

    private int smallest = 0;//ascending order
    private int greatest = 0;//descending order
    private boolean evenChange = false;
    private boolean oddChange = false;
    private int counter = 0;

    public SortMenFromBoys(ArrayList<Integer> list) {
        this.list = list;
    }

    public SortMenFromBoys() {
    }

    public ArrayList sort(ArrayList<Integer> numbers ) {

        for (Integer i: numbers) {
            if(i % 2 == 0){
                evenOnes.add(i);
            } else{
                oddOnes.add(i);
            }
        }
        sortEven(evenOnes);
        sortOdd(oddOnes);







        return list;

    }
    public void sortEven(ArrayList<Integer> list){
        int [] even = new int[list.size()];
        for(int i = 0; i<even.length; i++){
            even[i] = list.get(i);
        }
        Arrays.sort(even);
        for(int i = 0; i <even.length;i++){
            this.list.add(even[i]);
        }
    }

    public void sortOdd(ArrayList<Integer> list){
        Integer [] odd = new Integer[list.size()];
        for(int i = 0; i<odd.length; i++){
            odd[i] = list.get(i);
        }
        Arrays.sort(odd, Collections.reverseOrder());
        for(int i = 0; i <odd.length;i++){
            this.list.add(odd[i]);
        }
    }
}
