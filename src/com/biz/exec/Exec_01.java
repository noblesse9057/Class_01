package com.biz.exec;

import com.biz.model.Student;

public class Exec_01 {

	public static void main(String[] args) {

		/*
		 *  java ������ ���α׷� ���� ��������� �����͵��� 
		 *   �޼��忡 �����Ͽ� ó���� �Ҷ� �ʿ��� �����Ͱ�����ŭ
		 *   �Ű������� �����ϰ� ������ �µ��� ��ġ������ ���ؼ�
		 *   �ż��忡�� �������־�� �Ѵ�.
		 *   
		 *   �׷���,�����Ͱ� ������ ȥ���� �ͼ� ������ �����Ͱ�
		 *   ���޵Ǵ� ��찡 ���� �߻��Ѵ�.
		 *   
		 *   ���� �Ű����� ������ ��Ȯ�� Ȯ���ϱⰡ �����
		 *   
		 */
		
		view(1,"ȫ�浿",3,"�İ���");
		view(1,"�̸���",2,"�����а�");
		view(1,"������",4,"���а�");
		
		view(4,"ȸ���а�",4,"�Ӳ���");
		
	}
	// �� �л��� ������ �ֿܼ� ǥ���ϴ� method
	public static void view(int intNum, String strName,int intGrade, String strDetp) {
		System.out.println("�й�:" + intNum);
		System.out.println("�̸�:" + strName);
		System.out.println("�г�:" + intGrade);
		System.out.println("�а�:" + strDetp);
	}

		
	
}
