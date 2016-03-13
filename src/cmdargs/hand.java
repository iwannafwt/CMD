package cmdargs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class hand {
    
    public List<String> insArgs(String[] args){
        List<String> list = new ArrayList<>();
        String var;
        int k=0;
        
        for (int i=0; i<args.length; i++){ //einai i lista me tis parametrous pou dinei o xristeis
            
            var=args[k];
            list.add(var);
           
            k++;
       } 
        for (String vLookUp : list){
                System.out.println(vLookUp);
            }
        
        return list;
    }
    
    public List<Pair> staderList(){
        List<Pair> stadar = new ArrayList<>();
     
        stadar.add(new Pair("iwanna","hallo")); // einai i stadar lista me tis 
        stadar.add(new Pair("katerina","rock"));//parametrous pou dexete to programma
        
        System.out.println("Stadar parametr");
        for(Pair<String,String> vLookUp : stadar){
            System.out.println(vLookUp.getSign() + " " + vLookUp.getPrice());
        }
        
        return stadar;
    }
    
}
