private static void average1(int a,int b) {
	// TODO Auto-generated method stub
	int[] arr=new int[Integer.toString(a).length()];
	int i=0;
	while(a>0){
		arr[i]=a%10;
		a=a/10;
		i++;
	}
	Arrays.sort(arr);
	i=0;
	for(int j=0;j<arr.length-b;j++){
		i=i*10+arr[j];
		}
}
