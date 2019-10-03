public class opeRation{
	//程序的执行入口main
	public static void main(String[]args){
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);//内容数据相同，存储单元和地址不同，所以结果为假。
	}
}