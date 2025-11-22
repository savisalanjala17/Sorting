import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int [n];
	
		
	
		for(int i=0 ; i<n ; i++){
		    
		    a[i] = sc.nextInt();
		    
		    
		}

		for(int i=0 ; i<n-1 ; i++){
		    int minindex=i;
		    
		    for(int j=i+1; j<n; j++){
		        if(a[j]<a[minindex]){
		            
		            minindex=j;
		        }
		    }
		    
		            int temp=a[i];
		            a[i]=a[minindex];
		            a[minindex]=temp;
		        

		}
		
		
		
		for(int i=0 ; i<n ; i++){
		    
		    System.out.print(a[i]+" ");
		    
		    
		}
		
		

	}
}

		   
