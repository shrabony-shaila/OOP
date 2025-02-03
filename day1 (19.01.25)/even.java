public class even{
    public static void main(String[] args) {
        int sum1=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]+" ");
                sum1=sum1+arr[i];
            }
        }
        System.out.println("sum="+sum1);
    }
}
