package cmdargs;

import java.util.List;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class Compare {

    public boolean compare(List<Pair<String,String>> var, List<String> stadarList) {
        List<Pair<String,String>> inputList ;
        List<String> stadar ; 
        
        inputList = var;
        stadar = stadarList;
        
        if(inputList == null){ 
            return false;
        }
        
        for (Pair<String,String> inputParamList : inputList) {
            boolean i = stadar.contains(inputParamList.getSign());
            if (!i) {
                return false;
            }
        }    
        return true; 
    }
}
