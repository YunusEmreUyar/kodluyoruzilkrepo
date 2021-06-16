import java.utils.Scanner;
import java.lang.Math;

public class FindTriangleStuff {
	public static void main(String[] args){
		double edge1, edge2, edge3, u, area;
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter first edge:");
		edge1 = inp.nextDouble();
		System.out.print("Enter second edge:");
		edge2 = inp.nextDouble();
		System.out.print("Enter the last edge:");
		edge3 = inp.nextDouble();
		u = (edge1+edge2+edge3)/2;
		area = Math.sqrt(u* (u-edge1)*(u-edge2)*(u-edge3));
	}

}