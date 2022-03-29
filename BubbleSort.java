{

    public static void main(String[] args)
    {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
        int[] arr= {7, 3, 0, 23, 46};
        int n= arr.length;
        int temp;
      boolean isSwapped;
        for(int i=0; i<n-1; i++)
        {
            isSwapped= false;
            for(int j=0; j<n-i-1; j++)
            {
                System.out.println("Inner Loop");
                if(arr[j] > arr[j+1])
                {
                    temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    isSwapped= true;
                }
            }
            //condition to check swapping happened or not, if not break the loop
            if(!isSwapped) {
                System.out.println("Outer loop breaks");
                break;
            }
        }
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
