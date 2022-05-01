package example;

public class InsertionSorter implements Sorter{

    private int[] elements;
    private String plan="";

    public void load(int[] elements){
        this.elements = elements;
    }

    public void sort(){
        for(int i = 1; i < elements.length; i++){
            int key = elements[i];
            int j = i - 1;
            while(j>=0 && key<elements[j]){
                plan+=""+elements[j]+"<->"+key+"\n";
                elements[j+1] = elements[j];
                j--;
            }
            elements[j+1] = key;
            
        }
    }

    public String getPlan(){
        return plan;
    }
    
}
