public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1-100 kadar asal sayıları bulma");

        boolean isAsal;
        for(int i = 2; i<100; i++){
            isAsal=true;
            for(int j=2; j < i/2+1; j++){
                if(i%j==0){
                    isAsal=false;
                    break;
                }
            }
                if(isAsal){
                System.out.print(i + " ");
            }
        }
    }
}