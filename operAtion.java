public class operAtion{
	//�����ִ�����main
	public static void main(String[]args){
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);//����������ͬ���洢��Ԫ�͵�ַ��ͬ�����Խ��Ϊ�١�
		System.out.println(s1.equals(s2));//�Ƚ������������͵����ݣ������� == ��equsls������д������
	}
}