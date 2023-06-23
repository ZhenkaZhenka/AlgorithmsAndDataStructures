import java.util.Random;

public class ProgramHW3 {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        Random r = new Random();
        int counter = 25;

        while(counter > 0){
            tree.add(r.nextInt(0,50));
            counter--;
        }
    }
}
