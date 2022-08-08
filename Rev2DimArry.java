//Reverse all the names that available in 2 Dimensional array
public class Rev2DimArry
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String[][] ab={{"Ram","Krishna","Pawan"},{"Star","Mega","Rebel"},{"Sai","Kalyan","Nag"}};
		String str="";
		char[] ch;
		for(int i=0;i<ab.length;i++){
		    for(int j=0;j<ab[i].length;j++){
		        String rev="";
		        str=ab[i][j];
		        ch=str.toCharArray();
		        for(int k=ch.length-1;k>=0;k--){
		            rev+=ch[k];
		        }
		        System.out.print(rev+" ");
		    }
		    System.out.println("");
		}
	}
}
