package mountBlue;

public class sortedSquares {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
//        Output: [0,1,9,16,100]

        int n=arr.length;
        int res[]=new int[n];
        int l=0,r=n-1;
        int index=n-1;

        while(l<r){
            if(arr[l]*arr[l]>arr[r]*arr[r]){
                res[index]=arr[l]*arr[l];
                l++;
            }else{
                res[index]=arr[r]*arr[r];
                r--;
            }
            index--;
        }
//        while (l <= r) {
//            if (arr[l] * arr[l] > arr[r] * arr[r]) {
//                res[index] = arr[l] * arr[l];
//                l++;
//            } else {
//                res[index] = arr[r] * arr[r];
//                r--;
//            }
//            index--;
//        }


//        System.out.println(arr);
        for(int e:res){
            System.out.print(e+" ");
        }
    }
}



