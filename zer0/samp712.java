public class samp712{
    public static void main(String[] args){
        pro pro = new pro();
        pro.print();
    }
}

class pro{
    public void print(){
        for(int i = 1; i < 100; i++){
            if((i%3) == 0 && (i%5) != 0 && (i%9) !=0){
                System.out.print(i+" " );
            }
        }
    }
}
