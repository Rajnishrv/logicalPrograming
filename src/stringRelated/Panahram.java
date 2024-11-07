package stringRelated;

public class Panahram {
public static void main(String[] args) {
	String s = "rusxjfgnhgikjA4RUJTX7\54\75guili;8udylidkf'tQAWZEXRJK,.L";
	int [] arr =new int[128];
	s=s.toUpperCase();
	for(int i = 0; i<s.length(); i++) {
		arr[s.charAt(i)]++;
	}
	boolean flag = true;
	for(int i = 65;i<=95; i++) {
		if(arr[i]==0) {
			flag = false;
			break;
		}
	}
	System.out.println(flag?"panagram": "not a panagram");
}
}
