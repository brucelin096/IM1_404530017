
/*
 * [A]95
 * [TA's Advise]
 * 1.�A����L�}�o�⦸�F��, �o���O�@�ө��������, �ݤ@�U���ѳ�, �o������5��.
 * 2.�b���g�{�����ɭԷ|�ɶq�קK�N�P�˥\�઺function�g�����, �@�Ӯe���X��, �G�Ӻ��@����.
 * 3.�U���i�H�bjavadoc���g�@�ǵ���.
 * */

import java.lang.String;
//import Scanner�o�S�ϥΨ�L?
import java.util.Scanner;

public class EasterTester {
	public static void main(String[] args) {
		//���i�H�g���o��.
		//System.out.println(Easter.calculateEaster2(2001));

		System.out.println("In " + 2001 + ",Easter Sunday is : month is = " + Easter.calculateEaster(2001)
				+ " day is = " + Easter.calculateEaster2(2001));
		System.out.println("In " + 2012 + ",Easter Sunday is : month is = " + Easter.calculateEaster(2012)
				+ " day is = " + Easter.calculateEaster2(2012));

	}
}
