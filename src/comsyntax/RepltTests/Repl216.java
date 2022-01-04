package comsyntax.RepltTests;

public class Repl216 {
    public static int[] arraySumToZero(int N) {
        int[]arr=new int[N];
        int pos=1;
        int neg=-1;
        if(N%2==1){
            arr[0]=0;
            for(int i=1; i<N; i++){
                if(i%2==1){
                    arr[i]=pos;
                    pos++;
                }else{
                    arr[i]=neg;
                    neg--;
                }
            }
        }else if(N%2==0 && N!=0){
            for(int i=0; i<N; i++){
                if(i%2==1){
                    arr[i]=pos;
                    pos++;
                }else{
                    arr[i]=neg;
                    neg--;
                }
            }
        }
        return arr;
    }
    public static void main(String[]args){
        int[] arrToZero = arraySumToZero(6);
        for(int i=0; i<arrToZero.length; i++){
            System.out.print(arrToZero[i]+" ");
        }
    }
}
