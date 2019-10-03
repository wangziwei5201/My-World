public class seat{
	//程序的执行入口main
	public static void main(String[]args){
		int i=12;
		i = i << 5;//左位移运算，每向左移动一位，数就会加一倍。5为移动位数 结果：384
		i = i >> 1;//右位移运算，每向右移动一位，数就会减小一倍，1为移动位数，结果：192
		i = i >>>1;//无符号右移运算，不管最高位是1还是0 一律补0，正数无所谓，负数变化大
		System.out.println(i);

	}
}