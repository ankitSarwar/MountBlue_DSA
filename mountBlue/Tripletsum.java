package mountBlue;

public class Tripletsum {
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 7};
        int n = arr.length;
        int sum = 12;


        for(int i=0;i<n-2;i++){

            for(int j=i+1;j<n-1;j++){

                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]<sum){
                        System.out.println(arr[i]+" , "+arr[j]+" , "+arr[k]);
                    }
                }
            }
        }
    }
}
