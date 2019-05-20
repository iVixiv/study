package day4;

import java.awt.List;
import java.util.ArrayList;

public class ThreadTest {

	public static void main(String[] args) {
		// 单个线程内 代码顺序执行
		// 并行的线程里 代码执行顺序不可预知
		ThreadSimple thread = new ThreadSimple("线程1");
		thread.start();
		ThreadSimple thread2 = new ThreadSimple("线程2");
		thread2.start();
		ThreadSimple thread3 = new ThreadSimple("线程3");
		thread3.start();

		ArrayList<String> dataList = new ArrayList<String>();
		ArrayList<Object> dataList2 = new ArrayList<Object>();
	}
}
