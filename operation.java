public class operation{
	//程序的执行入口main
	public static void main(String[]args){
		int i = 1;
		//++i;//可以把它（自增）认为是i = 1+1;的简写，自减同上 1--  --1.
		System.out.println(i++);//先打印再执行自增
		System.out.println(++i);//先执行自增再打印出结果
	}
}