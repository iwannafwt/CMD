package cmdargs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ΙΩΑΝΝΑ
 */
public class Compare {

    public void compare(List<String> var, List<Pair> stadarList) {
        List<String> list = new ArrayList<>();
        List<Pair> stadar = new ArrayList<>();

        list = var;
        stadar = stadarList;
        String bufferSign;
        String searchSign;

        if (var.isEmpty()) {
            System.out.println("null parametr.");
        } else {
            for (Pair<String, String> firstParamStadar : stadar) {
                bufferSign = firstParamStadar.getSign();
                for (String firstParamList : list) {
                    searchSign = firstParamList;
                    int i = bufferSign.indexOf(searchSign);
                    //System.out.println(i);

                    if (i != -1) {
                        for (Pair<String, String> secondParamStadar : stadar) {
                            bufferSign = secondParamStadar.getPrice();
                            //System.out.println(bufferSign);
                        }
                            System.out.println("dwsate swstes paramtrous");
                    }else{
                        System.out.println("den iparxei auti i parametros pou zitises");
                    }
                }
            }
        }
    }
}
