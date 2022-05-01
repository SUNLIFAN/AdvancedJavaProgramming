package example;

public class QuickSorter implements Sorter{

    private int[] elements;
    private String plan = "";

    public void load(int[] elements){
        this.elements = elements;
    }

    public void sort(){
        quickSort(0, elements.length-1);
    }

    private void quickSort(int l,int r){
    if(l>=r) return;
    int x=elements[l+r>>1];
    int i=l-1,j=r+1;
    while(i<j){
        do i++;while(elements[i]<x);
        do j--;while(elements[j]>x);
        if(i<j){
            swap(i,j);
            plan += "" + elements[i] + "<->" + elements[j] + "\n";
        }
    }
    quickSort(l,j);
    quickSort(j+1,r);
    }

    private void swap(int i,int j){
        int temp = elements[j];
        elements[j] = elements[i];
        elements[i] = temp;
    }

    public String getPlan(){
        return plan;
    }

    
    
}
