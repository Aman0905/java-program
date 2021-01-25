public class Matrix_Add_Mult{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3]; 
int m[][]=new int[3][3]; //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices   
 System.out.println("Addition");
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
System.out.println("Multiplication");
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
m[i][j]=a[i][j]*b[i][j];     
System.out.print(m[i][j]+" ");    
}    
System.out.println();//new line    
}    


}
}  