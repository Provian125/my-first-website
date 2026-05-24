public class checks{
    public static boolean eq(int a[],int b[]){
    if (a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
    int x[]={1,2,6};
    int y[]={1,2,5};
    System.out.println(eq(x,y));
   }
}