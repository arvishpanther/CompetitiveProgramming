
public class NumDigitAdd {
    static int remainder,add;
    static int funRecursive(int s) {
        remainder = s % 10;
        add = add * 10+remainder;
        s=(s/10);
        if (s>0){
            funRecursive(s);
        }
        return add;
    }
    public static void main(String[] args) {

		int[] a={5,6,7};        //  567
		int[] b={1,4,1};        // +141
                                //=>708 (jise print krna h ulta krke>>
                                    //"807"
        int sum1=0;
        byte n=100;
        for (byte i = 0; i < 3; i++) {
            sum1+=a[i]*n+b[i]*n;//600+100+8=108
            n=(byte)(n/10);
        }
        System.out.println("____________________printing after reversing the addtion of two array indexes________________");
        System.out.println(funRecursive(sum1));
    }
}