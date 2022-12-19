/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // TODO code application logic here
        int [] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
	int [] brr = {31,29,31,30,31,30,31,31,30,31,30,31};
	System.out.print("Enter Starting Day : ");
	String s = input.next();
	System.out.print("Is it leap year ? ");
	String s2 = input.next();
	System.out.print("Enter date and month (dd.mm) : ");
	String s3 = input.next();
	int x = Integer.parseInt(""+s3.charAt(0)+s3.charAt(1)+"");
	int y = Integer.parseInt(""+s3.charAt(3)+s3.charAt(4)+"");
	int tot = 0;
	//debug(x+" "+y);
	for (int i = 0; i < y-1; i++) {
		if(s2.equals("yes"))
		tot+=brr[i];
		if(s2.equals("no"))
		tot+=arr[i];
//                
//                System.out.println(tot);
	} 
         
        tot+=x; int pos = 0;
	String [] aa = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
	for (int i = 0; i < aa.length; i++) {
		if(aa[i].equals(s)) {
			pos = i;
			break;
		}
	} 
       
        int c =1 ;
	for (int i = pos; i < aa.length; i++) {
		if(c==tot) {
			System.out.println("The day is : "+aa[i]);
			break;
		}
                c++;
		if(i==(aa.length-1))i=-1;
	}
    }
    
}
