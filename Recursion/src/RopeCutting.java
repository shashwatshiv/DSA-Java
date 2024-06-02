public class RopeCutting {
    public static void main(String[] args) {
int ans = rope(14,9,2,5);
        System.out.println(ans);
    }
static int rope (int n, int a, int b, int c){
        if (n == 0) return 0 ;
        if (n < 0) return -1;
        int res = Math.max(rope(n-a,a,b,c),Math.max(rope(n-b,a,b,c),rope(n-c,a,b,c)));
        if(res == -1) return -1;
        return res +1;
}
}
