// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
public class Main {
    public static void main(String[] args){
                int wysokosc = 5;

                for (int i = 0; i < wysokosc; i++) {
                    for (int j = 0; j < wysokosc - 1 ; j++) {
                        System.out.print(" ");
                    }
                 
                    for( int k = 0; k < + i ;  k++){
                         System.out.print("*");
                    }
                    System.out.println();
                }
            }
}