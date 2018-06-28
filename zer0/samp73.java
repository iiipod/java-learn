public class samp73{
    public void print(){
        for(int i = 0;i <= 5;i++){
            for(int j = 5 - i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        samp73 pro = new samp73();
        pro.print();
    }
}
