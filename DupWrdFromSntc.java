//How to find the duplicate words in a sentence?
public class DupWrdFromSntc
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str="I am preparing myself hr for MNC’s companies and Product based hr companies.";
		str=str.trim();
		int len=str.length();
		System.out.println(len);
		String[] words=str.split(" ");
		int len1=words.length;
		System.out.println(len1);
		for(int i=0;i<len1;i++){
		    int count=1;
		    for(int j=i+1;j<len1;j++){
		        if(words[j].contains(".")){
		            words[j]=words[j].substring(0,words[j].length()-1);
		        }
		    if(words[i].equalsIgnoreCase(words[j]) && !words[j].equals("DUP")){
		        words[j]="DUP";
		        count++;
		    }
		}
		if(count>1){
		        System.out.println("Duplicate Word is:"+words[i]+" and repeated "+count+" times in above provided sentence.");
		    }
		}
	}
}