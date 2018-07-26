import java.util.*;

class prob1 {
    public static int sum_of_digits(int m){
        int n, sum=0;
        while(m>0) {
            n = m%10;
            sum = sum +n;
            m=m/10;
        }
        return sum;
    }
    public static String cvt_to_base6(int n){
        int q = n,r;
        String ans="";
        while(q!=0) {
            r=q%6;
            ans = r+ans;
            q=q/6;
        }
        return ans;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String string=sc.next();
        String[] stringArray = string.split(",");

        int[] a=new int[stringArray.length];

        for(int i=0;i<a.length;i++) {
            a[i]=Integer.parseInt(stringArray[i]);
        }

        int [] temp = new int[a.length];
        //scanning all the elements
        for(int i=0;i<a.length;i++) {
            temp[i] = sum_of_digits(Integer.parseInt(cvt_to_base6(a[i])));
        }

        int count = 0;

        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(temp[i]>temp[j]) {
                    if(i<j) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
/*THIS CODE IS CONTRIBUTED BY DEEPJYOTI ROY*/
