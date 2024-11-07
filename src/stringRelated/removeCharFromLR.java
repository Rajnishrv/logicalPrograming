package stringRelated;

public class removeCharFromLR {
public static void main(String[] args) {
	String s = "jspiders";
	System.out.println(s);
	int L = 0, r = s.length()-1;
	for(int i = 0; i<s.length(); i++) {
		String temp = "";
		if(i%2==0) {
			r--;
		}else {
			L++;
		}
		for(int j=L; j<=r; j++) {
			temp = temp+s.charAt(j);
		}
		System.out.println(temp);
	}
}
}
