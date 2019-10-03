public class logic{
	public static void main(String[]args){
		//与运算：& 按顺序逐一进行运算得出结果  && 节约运算资源，遇到flase即停止运算。
		System.out.println((false) && (true)); // false && true

		//或运算  |  ||
		System.out.println(false | true);//只要结果存在true，即为true

		//非 ，取反
		System.out.println(!false);

		//异或运算：  ^
		System.out.println(true ^ false);//一真一假才是true，相同即为false
		System.out.println(true ^ true);// false
	}
}