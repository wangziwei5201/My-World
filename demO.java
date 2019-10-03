public class demO{
	//程序的执行入口main
	public static void main(String[]args){
		short s = 10;
		int i = 3;
		char o ='a';
		System.out.println(s + i + o);//所有的byte类型，short类型和char类型将被提升到int类型,称之为表达式的自动提升
	}
}