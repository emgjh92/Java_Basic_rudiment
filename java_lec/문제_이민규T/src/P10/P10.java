package P10;

public class P10 {
	/*
	10.

	for 문을 이용해서 

	1부터 1000까지의 합을 구하는 코드를 작성하되

	3의 배수만 더하는 코드를 작성하자
	*/
	public static void main(String[] args) {
		
		
		int sum=0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0) {sum=sum+i;}
		}
		System.out.println("합계 : "+sum);
	}
}
