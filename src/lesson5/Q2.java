package lesson5;

public class Q2 {
	public static void email(String title, String address, String text) {
        System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂���");
        System.out.println("�����F�u" + title + "�v");
        System.out.println("�{���v�u" + text + "�v");
	}
	public static void main(String[] args) {
		email("����ɂ���", "example@example.com", "�͂��߂܂��Ă���ɂ���");
	}
}
