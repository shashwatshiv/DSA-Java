import java.util.List;

public class NullPointer {
    public static void main(String[] args) {
        List <String> Burgers= null;

            try {
                for(String Burger: Burgers){
                    System.out.println(Burger);}
            } catch (Exception error){
                System.out.println(error);
            }

    }
}
