package BASIC;

public class AramstronString {
	    public boolean isAnagram(String s, String t) {

	        String str1= s;
	        String str2 = t;
	        int flag =0;
	        char ch1[]= str1.toCharArray();
	        char ch2[]=str2.toCharArray();
	        if(str1.length()==str2.length()){
	            for(int i=0 ;i<ch1.length;i++){

	                for(int j =0;j<ch2.length;j++){
	                    if(ch1[i]==ch2[j]){
	                        ch2[j]='@';
	                        break;
	                    }

	                }
	            }
	            for(int i=0 ;i<ch2.length;i++){
	                flag=0;
	                 if(ch2[i]=='@'){
	                     flag =1;
	                     
	                 }
	                 else{
	                    flag = 0;
	                    break;
	                 }
	            }

	        }else{
	            flag =0;
	        }
	        if(flag==0){
	            return false ;
	        }
	        else 
	        return true;
	        
	    }
	    public static void main(String[] args) {
	    	String st="abbcab";
	    	String st2="abcbab";
	    	AramstronString obj= new AramstronString();
	    	System.out.println(obj.isAnagram(st, st2));
	    }
	    
	    
	   
	}

