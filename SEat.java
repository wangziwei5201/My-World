public class SEat{
	//�����ִ�����main
	public static void main(String[]args){
		int a = 200;
		int b = 400;
		System.out.println("a:"+a+"----b:"+b);
		//������ a��b��ֵ  a=20   b=10��
		a=a^b;
		b=a^b;
		a=a^b;

		System.out.println("a:"+a+"----b:"+b);

	}
}