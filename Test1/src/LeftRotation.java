import java.util.Scanner;

public class LeftRotation {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arreglo;
		int d;
		
        System.out.print("Introduzca arreglo: ");
        arreglo = sc.nextLine();
        String[] parts = arreglo.split(",");
        String[] p1=(parts[0].split("\\["));
        parts[0]=p1[1];
        String[] pf=(parts[parts.length-1].split("\\]"));
        parts[parts.length-1]=pf[0];
        
        
        System.out.print("Introduzca nro de rotaciones: ");
        d =sc.nextInt();
        int n=(d%parts.length);
        
        for(int i = n; i < parts.length; i++){
        	System.out.print(parts[i]);
        	System.out.print(" ");
        	}
        for(int i = 0; i < n; i++){
        	System.out.print(parts[i]);
        	System.out.print(" ");
        	}
        
		}

}
