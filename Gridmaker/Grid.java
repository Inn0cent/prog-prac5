
/**
 * Write a description of class Grid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Grid
{
    
    private ArrayList<ArrayList<String>> newGrid;
    private ArrayList<String> temp;
    
    public Grid()
    {
        newGrid = new ArrayList<ArrayList<String>>();
        temp = new ArrayList<String>();
    }
    
    public void addStringToInner(String newString, int outerIndex){
        if (outerIndex == newGrid.size()){
            temp.add(newString);
            newGrid.add(new ArrayList<String>(temp));
        }else if (outerIndex >= 0){
            newGrid.get(outerIndex).add(newString);
        }else{
            System.out.println("Outside of grid"); 
        }
        temp.clear();
    }
    
    public void addListToGrid(ArrayList<String> newList){
        newGrid.add(new ArrayList<String>(newList));
    }
    
    public void addListToGrid(String newString){
        temp.add(newString);
        newGrid.add(new ArrayList<String>(temp));
        temp.clear();
    }
    
    public void addArrayToGrid(String[] newArray){
        for (String i : newArray){
            temp.add(i);
        }
        newGrid.add(new ArrayList<String>(temp));
        temp.clear();
    }
    
    public void editItem(String newString, int outerIndex, int innerIndex){
        newGrid.get(outerIndex).set(innerIndex, newString);
    }
    
    public String getItem(int outerIndex, int innerIndex){
        return newGrid.get(outerIndex).get(innerIndex);
    }
    
    public void printGrid(){
        for (ArrayList<String> i : newGrid){
            for (String j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();        
    }
}
