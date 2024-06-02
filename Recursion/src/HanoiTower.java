public class HanoiTower {
    public static void main(String[] args) {
tower(3,'s','h','d');
    }
    public  static void tower(int n,char a,char b,char c){
        if (n==1){
            System.out.println("move disk from "+a+" to "+c);
            return;
}
        tower(n-1,a,c,b);
        System.out.println("move disk from "+a+" to "+c);
        tower(n-1,b,a,c);

    }
}
