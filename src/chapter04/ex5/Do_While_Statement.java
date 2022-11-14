package chapter04.ex5;

public class Do_While_Statement {

	public static void main(String[] args) {
		// do ~ while 문 :
		//
		
		/* while 문
		    초기식;
		    while (조건){
		    	실행블락;
		    	증감식;
		    }
		 
		 */
		
		/*  do while 문
		  초기식;
		  do {
		  	실행블락;
		  	증감식;
		  } while (조건);    //do while 블럭은 실행블락을 무조건 1번 실행 시킴.
		 */
		
		//1. while 문
		System.out.println(" === while 문 ===");
		int a = 0 ;
		while (a < 0) {			//조건이 false 이므로 실행 블락이 실행 안됨.
			System.out.println(a + " ");
		}
		
		//2. do while 문
		System.out.println(" ==do while 문== ");
		a = 0;
		do {
			System.out.println(a + " ");   //조건과 상관없이 실행문을 반드시 1번은 실행됨.
		}while(a < 0);
		
		
		//3. 반복 횟수가 10번인 경우 while 문과 do while 문 비교
		//
		System.out.println(" == while 문을 사용해서 10번 출력 ==");
		a = 0;
		while ( a < 10 ) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		System.out.println(" == do while 문을 사용해서 10번 출력 ==");
		a=0;
		do {
			System.out.print(a + " ");
			a++;
			
		}while(a < 10);
		
		
	}

}
