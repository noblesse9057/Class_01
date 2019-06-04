package com.biz.model;

import java.util.Random;

import com.biz.model.Student;

public class StudentArray {

	/* Student Ŭ������ ��ü���� �����ϰ�
	 * ������ �л� ���������͸� ����
	 * return�ϴ� �迭�� ����
	 */
	public Student[] makeScore(int stdLen) {

		// ������ �迭�� �迭�� �ʱ�ȭ�ϸ� ���������� 0���� ����
		int[] intA = new int[10];
					
					// ���ڿ��� �迭�� �迭�� �ʱ�ȭ�ϸ� ���������� ""���� ����
			String[] strA = new String[10];
		
		// Student Ŭ���� ��ü �迭 10���� �����϶�
		// ���� ���ุ �Ǿ��ְ� ����� �غ� ���� ��������
		Student[] stdScore= new Student[stdLen];
		
		// ������ ��Ÿ �ٸ�Ŭ�������� �̿���
		// ��ü �迭�� ���(�б�, ����)���� �� �迭��Ҹ�
		// ���������� �ʱ�ȭ�ϴ� �ڵ带 �����ؾ� �Ѵ�.
		stdScore[0] = new Student();
		
		// ������ ������ ��������� �����߻��⸦ ����Ѵ�.
		Random rnd = new Random();
		// for �ݺ����� ����ؼ� ���� �ڵ带 10�� �����ߴ�.
		for(int i = 0; i < stdScore.length; i++) {
			stdScore[i] = new Student();
			stdScore[i].intNum = i + 1;
			
			stdScore[i].intKor = rnd.nextInt(50) + 51;
			stdScore[i].intEng = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
		}
		return stdScore;
	}// makeScore ������ �κ�
	
	public void viewScore(Student[] stdScore) {
		System.out.println("=============================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("-------------------------------------------------------------");
	 for(int i = 0; i < stdScore.length; i++) {
		int intSum = stdScore[i].intKor;
		intSum +=stdScore[i].intEng;
		intSum +=stdScore[i].intMath;
		
		float fAvg = intSum /3.0f;
		
		System.out.print(stdScore[i].intNum+"\t");
		
		System.out.print(stdScore[i].intKor+"\t");
		System.out.print(stdScore[i].intEng+"\t");
		System.out.print(stdScore[i].intMath+"\t");
		
		System.out.print(intSum + "\t");
		System.out.print(fAvg + "\t");
		System.out.println();
	}
	System.out.println("=============================================================");
}
}
