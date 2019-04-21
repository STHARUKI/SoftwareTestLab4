

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestBubbleSort {

	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BubbleSort bs = new BubbleSort();
		int exceptedArr[] = new int[]{1, 2, 2, 5, 6};
		int testArr[] = new int[]{1, 5, 6, 2, 2};

		int exceptedArr2[] = new int[]{0, 1, 3, 5, 9};
		int testArr2[] = new int[]{9, 0, 1, 3, 5};
		
		int exceptedArr3[] = new int[]{2, 4, 5, 7, 8};
		int testArr3[] = new int[]{5, 8, 7, 4, 2};
		
		int exceptedArr4[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9};
		int testArr4[] = new int[]{0, 1, 3, 2, 4, 5, 6, 7, 9};
		
		int exceptedArr5[] = new int[]{1, 2, 3, 4, 5};
		int testArr5[] = new int[]{1, 2, 3, 4, 5};
		

		int exceptedArr6[] = new int[]{1, 2, 3, 4, 5};
		int testArr6[] = new int[]{5, 2, 3, 4, 1};
		
		org.junit.Assert.assertArrayEquals(exceptedArr, bs.BubbleSort(testArr));
		org.junit.Assert.assertArrayEquals(exceptedArr2, bs.BubbleSort(testArr2));
		org.junit.Assert.assertArrayEquals(exceptedArr3, bs.BubbleSort(testArr3));
		org.junit.Assert.assertArrayEquals(exceptedArr4, bs.BubbleSort(testArr4));
		org.junit.Assert.assertArrayEquals(exceptedArr5, bs.BubbleSort(testArr5));
		org.junit.Assert.assertArrayEquals(exceptedArr6, bs.BubbleSort(testArr6));
	}

}
