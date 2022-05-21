import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class keys
{

    public static void main(String args[]) throws ParseException {
        
        HashMap<String, String> codenames = new HashMap<String, String>();
        
        codenames.put("1", "Dog");
        codenames.put("7", "Cat");
        codenames.put("3", "Owl");
        codenames.put("6", "Lion");
        codenames.put("5", "Tiger");
        
        System.out.println("HashMap before sorting, random order ");
        Set<Entry<String, String>> entries = codenames.entrySet();
       
        for(Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        TreeMap<String, String> sorted = new TreeMap<>(codenames);
        Set<Entry<String, String>> mappings = sorted.entrySet();
        
        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Entry<String, String> mapping : mappings){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
        
        Comparator<Entry<String, String>> valueComparator 
               = new Comparator<Entry<String,String>>() {
            
            @Override
            public int compare(Entry<String, String> e1, Entry<String, String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
        };
        List<Entry<String, String>> listOfEntries 
                  = new ArrayList<Entry<String, String>>(entries);
        
        Collections.sort(listOfEntries, valueComparator);
        
        LinkedHashMap<String, String> sortedByValue 
                    = new LinkedHashMap<String, String>(listOfEntries.size());
        
        for(Entry<String, String> entry : listOfEntries){
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("HashMap after sorting entries by values ");
        Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
        
        for(Entry<String, String> mapping : entrySetSortedByValue){
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }
    }
}

