public class Seat{
	//�����ִ�����main
	public static void main(String[]args){
		int i=10;
		int i2=9;
		i = i & i2;
		int o=13;
		int o2=8;
		o = o | o2;
		int p=12;
		int p2=7;
		p = p ^ p2;//��������������������ͬ��Ϊ1����ͬ��Ϊ0 12=1100  7=0111 ���=1011=11
		System.out.println(i);
		System.out.println(o);
		System.out.println(p);

	}
}