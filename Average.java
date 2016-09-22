private static void average(int[] a) {
	// TODO Auto-generated method stub
	int av1=0;
	int av2=0;
	for(int i=0;i<a.length/2+1;i++){
		av1=av1+a[i];
		}
	for(int j=a.length/2;j<a.length;j++){
		av2=av2+a[j];
	}
	int z=av2/(a.length-a.length/2);
	if(av1/((a.length/2)+1)==av2/(a.length-a.length/2)){
		System.out.println("IT is possible");
	}
	else{
		System.out.println("Not possible");
	}
}
