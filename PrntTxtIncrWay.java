//Print the Text in incremental way
public class PrntTxtIncrWay
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str="I am preparing myself for MNC’s and Product based companies.";
		str=str.trim();
		int len=str.length();
		System.out.println(len);
		char[] ch=str.toCharArray();
		int k=0,count=0;
		for(int i=0;i<len;i=count){
		    for(int j=0;j<=k;j++){
		        if(ch[count]!=' '){
		        System.out.print(ch[count]);
		        count++;
		        }else{
		            count++;
		            System.out.print(ch[count]);
		            count++;
		        }
		        if(count==len){
		            break;
		        }
		    }
		    System.out.println("");
		    k++;
		    if(count==len){
		            break;
		        }
		}
	}
}
