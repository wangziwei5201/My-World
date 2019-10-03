public class operAtion{
	//程序的执行入口main
	public static void main(String[]args){
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);//内容数据相同，存储单元和地址不同，所以结果为假。
		System.out.println(s1.equals(s2));//比较引用数据类型的内容，不能用 == 用equsls方法，写法如上
	}
}