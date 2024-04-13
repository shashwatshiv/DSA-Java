public class countDigit {
public static void main(String[] args){
    int n = 345456;
    System.out.println("no.of digits are"+ count(n));
}
static int count(int n){
    if(n/10==0){
        return 1;
    }
    return 1+count(n/10);
}
}
