package day4;

import java.awt.List;
import java.util.ArrayList;

public class ThreadTest {

	public static void main(String[] args) {
		// �����߳��� ����˳��ִ��
		// ���е��߳��� ����ִ��˳�򲻿�Ԥ֪
		ThreadSimple thread = new ThreadSimple("�߳�1");
		thread.start();
		ThreadSimple thread2 = new ThreadSimple("�߳�2");
		thread2.start();
		ThreadSimple thread3 = new ThreadSimple("�߳�3");
		thread3.start();

		ArrayList<String> dataList = new ArrayList<String>();
		ArrayList<Object> dataList2 = new ArrayList<Object>();
	}
}
