public class SEat{
	//程序的执行入口main
	public static void main(String[]args){
		int a = 200;
		int b = 400;
		System.out.println("a:"+a+"----b:"+b);
		//需求是 a和b的值  a=20   b=10；
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("a:"+a+"----b:"+b);

	}
}