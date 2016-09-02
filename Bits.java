private  void bits(int input1) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(0);
		int num=0;
		int count=0;
		for(int i=0;i<input1;i++){
			al.add((int) Math.pow(2, i));
			s.add((int) Math.pow(2, i));
			num+=(int) Math.pow(2, i);
		}
		for(int i=0;i<al.size();i++){
			for(int j=i+1;j<al.size();j++){
				int a=al.get(i)+al.get(j);
				if(a==num)
					count=1;
				s.add(a);
				al.add(a);
				if(count==1)
					break;
		}
			if(count==1)
				break;
		}
		java.util.Iterator<Integer> i=s.iterator();
		while(i.hasNext()){
			String a=Integer.toString(i.next(),2);
			for(int j=a.length();j<input1;j++){
				a='0'+a;
			}
			System.out.println(a);
		}
			}
