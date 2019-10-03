public class DeMo{
	//程序的执行入口main
	public static void main(String[]args){
		String str = "123";//加了双引号，不是一个整数 “123”是字符串
		int stri = Integer.parseInt(str);//Integer类parseInt方法，把字符串转换为整数。
		int i = 1;
		System.out.println(stri+2);
	}
}