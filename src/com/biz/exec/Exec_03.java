package com.biz.exec;

public class Exec_03 {

	public static void main(String[] args) {
		
		int[] intNum = new int[10]; //�й�
		String[] strName = new String[10]; // �̸�
		
		
		int[] intKor = new int [10]; // ����
		int[] intEng = new int [10]; // ���� 
		int[] intMath = new int [10]; // ����

		intNum[0] = 1;
		strName[0] = "ȫ�浿";
		
		intKor[0] = 90;
		intEng[0] = 70;
		intMath[0] = 70;
		
		intNum[1] = 2;
		strName[1] = "�̸���";
		
		intKor[1] = 80;
		intEng[1] = 80;
		intMath[1] = 90;
		
		intNum[2] = 3;
		strName[2] = "������";
		
		intKor[2] = 77;
		intEng[2] = 88;
		intMath[2] = 98;
		
		intNum[3] = 4;
		strName[3] = "�Ӳ���";
		
		intKor[3] = 99;
		intEng[3] = 97;
		intMath[3] = 90;
		
		System.out.println("=============================================================");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-------------------------------------------------------------");
		for(int i =0; i < 4; i++) {
			int intSum = intKor[i];
			intSum +=intEng[i];
			intSum += intMath[i];
			
			intSum = intKor[i] + intEng[i] + intMath[i];
			
			float fAvg = intSum /3.0f;
			
			System.out.print(intNum[i]+"\t");
			System.out.print(strName[i]+"\t");
			
			System.out.print(intKor[i]+"\t");
			System.out.print(intEng[i]+"\t");
			System.out.print(intMath[i]+"\t");
			
			System.out.print(intSum + "\t");
			System.out.print(fAvg + "\t");
			System.out.println();
		}
		System.out.println("=============================================================");
}

}