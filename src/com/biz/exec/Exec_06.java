package com.biz.exec;

import java.util.Random;

public class Exec_06 {

	public static void main(String[] args) {

		int[] intNum = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(10) + 1;
		}

		for (int i = 0; i < intNum.length; i++) {
			System.out.print(intNum[i] + "\t");
		}	
		System.out.println();
		
		for(int i= 0; i <intNum.length; i++)
			if (intNum[i] == 7) {
				System.out.println((i + 1) + "��° ����");
			}
		// intNum�� ����� �����߿� 5��������
		// ������� �ִ��� ã�ƺ�����.
		int index ;
		for(index= 0; index <intNum.length; index++) {
			if (intNum[index] == 7) {
				System.out.println("7dms" +(index + 1) + "��° ����");
				break;
			}
		
		}if(index >= intNum.length) {
		System.out.println("7�� �����ϴ�");
	}
}
}