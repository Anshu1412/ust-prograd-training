
/*In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:

>>> Dictionary d = new Dictionary();

>>> d.newEntry("Apple", "A fruit that grows on trees");

>>> System.out.println(d.look("Apple"));
A fruit that grows on trees

>>> System.out.println(d.look("Banana"));
Cant find entry for Banana */

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
    ArrayList<String> key=new ArrayList<String>();
    ArrayList<String> value=new ArrayList<String>();
    public Dictionary(){
    }

    public void newEntry(String key, String value){
        this.key.add(key);
        this.value.add(value);
    }

    public String look(String key){
        for(int i=0;i<value.size();i++){
            if(this.key.get(i)==key){
                return this.value.get(i);
            }
        }
        return "Cant find entry for " + key;
    }
}