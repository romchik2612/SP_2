import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FReader fReader = new FReader("src/main/resources/test.txt");
        FindState state = new FindState();
        state.find(fReader.readAutomat());
        for(var i: state.getState1()){
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i: state.getState2()){
            System.out.print(i + " ");
        }
    }
}
