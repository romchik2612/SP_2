import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FReader {
    private Scanner scanner;

    public FReader(String file) throws FileNotFoundException {
        scanner = new Scanner(new FileReader(file));
    }

    public List<Transition> readAutomat(){
        int count = scanner.nextInt();
        List<Transition> res = new ArrayList<>();
        for(int i = 0;i<count;i++){
            res.add(new Transition(scanner.nextInt(), scanner.nextInt(), scanner.next().charAt(0)));
        }
        return res;
    }

    public String getWord(){
        return scanner.next();
    }
}
