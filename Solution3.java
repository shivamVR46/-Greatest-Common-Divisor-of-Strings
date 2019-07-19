import java.util.ArrayList;

class Solution3 {
	
	public static void main(String args[]) {
	
		String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
		String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
		String result = gcdOfStrings(str1,str2);
		System.out.println(result);
	}
	 public static String gcdOfStrings(String str1, String str2) {
		 
//					 String ans = "";
					 ArrayList<Character> x1 = new ArrayList();
					 int l1 = str1.length();
					 int l2 = str2.length();
					 
					 
					 
					 for(int i2=0;i2<Math.max(str1.length(),str2.length());i2++) {
						 if(l1>l2) {
							 x1.add(str1.charAt(i2));
						 }
						 else if(l2>l1) {
							 x1.add(str2.charAt(i2));
						 }
						 
					 }
					 
					 
					 // System.out.println(x1.toString());
					 int length = Math.min(str1.length(),str2.length());
//					 System.out.println(length);
					 String ans = "";
					 char x = 0 ;
				
					 for(int i=0;i<length;i++) {
						if(str1.charAt(i)==str2.charAt(i)) {
							x1.remove(0);
//							System.out.println("Number : " + i);
//							System.out.println(x1.toString());
						}
						else {
							for(int i1=0;i1<x1.size();i1++) {
								 ans = ans + x1.get(i1);
							 }
							
							return ans;
						}
						
					 }
//					 System.out.println(x1.toString());
					 for(int i1=0;i1<x1.size();i1++) {
						 ans = ans + x1.get(i1);
					 }
					 
			    
					return ans;
				        
			
	 }
}