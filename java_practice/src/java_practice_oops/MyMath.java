package java_practice_oops;

class MyAdd{
	int add(int a,int b){
		return a+b;
		
	}
}
class MySub extends MyAdd{
	int sub(int a,int b){
		return a-b;
		
	}
}
class MyDivide extends MySub{
	int divide(int a,int b){
		return a/b;
		
	}
}
class MyMulti extends MyDivide{
	int multi(int a,int b){
		return a*b;
		
	}
}

public class MyMath extends MyMulti{
	

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println(mm.add(3, 5));
		System.out.println(mm.sub(5, 2));
		System.out.println(mm.divide(10, 5));
		System.out.println(mm.multi(2, 3));

	}

}
