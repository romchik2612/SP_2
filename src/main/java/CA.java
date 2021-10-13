import java.util.ArrayList;
import java.util.List;

public class CA {

    public boolean compareAlphavits(List<Character> res1, List<Character> res2){
        if(res1.size() != res2.size()) return false;
        for(var str : res1){
            if(!res2.contains(res1)) return false;
        }
        return true;
    }

    public boolean compareReactions(String res1, String res2){
        return res1.contains(res2) || res2.contains(res1);
    }

    public boolean compareAut(List<Transition> a1, List<Transition> a2, String wordIn){
        List<Character> res1 = new ArrayList<>();
        List<Character> res2 = new ArrayList<>();
        String react1 = "";
        String react2 = "";
        int state = 0;
        for(var i:wordIn.toCharArray()){
            for(var a: a1){
                if(state==a.getFrom()&&i==a.getLetter()){ // letterIn
                    state = a.getTo();
                    react1+=a.getLetter(); // letterOut
                    if(!res1.contains(a.getLetter())) res1.add(a.getLetter()); // letterOut
                }
            }
        }
        for(var i:wordIn.toCharArray()){
            for(var a: a2){
                if(state==a.getFrom()&&i==a.getLetter()){ // letterIn
                    state = a.getTo();
                    react2+=a.getLetter(); // letterOut
                    if(!res2.contains(a.getLetter())) res2.add(a.getLetter()); // letterOut
                }
            }
        }
        return compareAlphavits(res1,res2) && compareReactions(react1,react2);
    }
}
