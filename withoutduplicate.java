private  String duplicates(String string) {
	StringBuffer str=new StringBuffer(string);
	for(int i=0;i<str.length();i++){
		for(int j=i+1;j<str.length();j++){
			if(str.charAt(i)==str.charAt(j)){
				str.deleteCharAt(j);
			}
		}
	}
	String s=new String(str);
	return s;
	}
