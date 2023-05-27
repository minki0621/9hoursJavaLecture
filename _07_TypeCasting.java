package chap_01;

public class _07_TypeCasting {

	public static void main(String[] args) {
		//형변환
		//정수형에서 실수형으로, 실수형에서 정수형으로 
		
		//int to float, double
		int score = 85;
		System.out.println(score);
		System.out.println((float)score);
		System.out.println((double)score);
		
		//float, double to int
		float score_f = 90.3F;
		double score_d = 92.8;
		System.out.println((int)score_f);
		System.out.println((int)score_d);
		
		
		//정수 + 실수 연산
		score = 93 + (int)98.3; //실수가 정수형으로 선언된 변수에 들어가게 되면 데이터 손실이 일어나기 때문에,
								//명시적으로 형변환 키워드를 적어줘야 한다.
		System.out.println(score);
				
//		score_d = 93 + 93.8;	//반대로 double형의 변수는 더 넓은 표현 범위를 갖고 있으므로, 데이터 손실 이유가 없어
								//자동 형변환 된다.
//		System.out.println(score_d);
	}

}
