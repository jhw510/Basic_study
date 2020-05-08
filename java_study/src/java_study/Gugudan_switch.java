package java_study;

import java.util.Scanner;
public class Gugudan_switch {
public static void main(String[] args) {
	
	System.out.println("출력하고 싶은 구구단 단수를 입력하시오 ");
	Scanner scanner = new Scanner(System.in);
	int gugudan=scanner.nextInt();
	
	for(int i=1;i<10;i++) {
	switch(gugudan) {
	
	case 2: gugudan=(2*i); break;
	case 3: gugudan=(3*i);break;
	case 4:gugudan=(4*i); break;
	case 5: gugudan=(5*i);break;
	case 6: gugudan=(6*i);break;
	case 7:gugudan=(7*i); break;
	case 8: gugudan=(8*i);break;
	case 9: gugudan=(9*i);break;
	}	 
	}
System.out.println("-----------구구단 출력----------"+gugudan );
}
}
