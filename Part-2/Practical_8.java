public class Practical_8 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,9,9,9,9,9,9};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==9)
            {
                count++;
            }
        }
        System.out.print(count);
    }

}
