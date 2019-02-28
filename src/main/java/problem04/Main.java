package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	//게임 변수들
	public static int min = 1;
	public static int max = 9;
	public static int count = 0;
	public static int randomNumberXX = new Random().nextInt(max) + min;
	
	
	public static void main(String[] args) {
		String[][] quiz = new String[9][2];
		int[][] answer = new int[9][2];
		for(int i=1; i<10; i++) {
			int randomNumber1 = new Random().nextInt(max) + min;
			int randomNumber2 = new Random().nextInt(max) + min;
			quiz[i-1][0] = i + "x" + randomNumber1 + ",  ";
			quiz[i-1][1] = + i + "x" + randomNumber2;
			answer[i-1][0] = (i*randomNumber1);
			answer[i-1][1] = (i*randomNumber2);
			System.out.println(quiz[i-1][0] + quiz[i-1][1]);
		}
		int correct = 0;
		long totalStart = System.currentTimeMillis();
		for(int i=1; i<19; i++) {
			// 키보드 입력을 받기 위해 Scanner 생성
			Scanner scanner = new Scanner(System.in);
			int randomDan = new Random().nextInt(9) + 1;
			int randomNum = new Random().nextInt(1) + 0;
			System.out.println(i + ". " + quiz[randomDan][randomNum] +"?" );
			long start = System.currentTimeMillis();
			int userAnswer = scanner.nextInt();
			long end = System.currentTimeMillis();
			
			if(answer[randomDan][randomNum] == userAnswer) {
				System.out.println("정답 입니다." + "풀이 시간은 " + (end - start)/1000.0 + "초  입니다");
				correct++;
			} else {
				System.out.println("오답 입니다." + "풀이 시간은 " + (end - start)/1000.0 + "초  입니다");
			}
			System.out.println();
		}
		long totalEnd = System.currentTimeMillis();
		
		System.out.println("18번의 문제중 " + correct + "번 맞추셨습니다. 총 풀이 시간은 " + 
							(totalEnd - totalStart)/1000.0 +"초 입니다." );
		
	}
}