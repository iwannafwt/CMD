package cmdargs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class hand {
    private List<String> keyList = new ArrayList<>(); // -> i lista pou 8a exei ta klidia pou dexete
    private List<Pair<String,String>> inputList = new ArrayList<>(); //einai i lista pou dinei o xristis
    private Compare com = new Compare();
   
    public boolean insArgs(String[] args){       
        
        if(args.length%2 !=0){ //elenxei an o ari8mos ton antikimenon einai zigos
            return false;           
        }
        
        for (int i=0; i<args.length; i = i + 2){  //"pros8eti to ka8e klidi me to value t
            inputList.add(new Pair(args[i],args[i+1]));
        } 
        
        return com.compare(inputList, keyList);
    }

    public void registerKey(String key){ // ean mesa sti lista me ta klidia pou exw 
                                         //den uparxei auto to klidi tote to prosthetei 
        if(!keyList.contains(key)){
            keyList.add(key);         
        }
    }
    
    public List<String> getList(){
        return keyList;
    }
    
    public String getDataWithKey(String key){ //emfanizei ts times p edwse o xristeis
        for(Pair<String,String> vLooUp:inputList){
            if(vLooUp.getSign().equals(key)){
                return vLooUp.getPrice();
            }
        }
        return null;
    }
}
