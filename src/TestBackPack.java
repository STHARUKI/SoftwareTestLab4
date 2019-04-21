import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBackPack {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BackPack bp = new BackPack();
		int m = 10;
		int n = 3;
		int w[] = new int[]{3, 4, 5};
		int p[] = new int[]{4, 5, 6};
		int c[][] = new int[][]{
			{0,0,4,4,4,4,4,4,4,4},
			{0,0,4,5,5,5,9,9,9,9},
			{0,0,4,5,6,6,9,10,11,11},
		};
		int a[][] = bp.BackPack_Solution(m, n, w, p);
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				org.junit.Assert.assertEquals(c[i][j], a[i+1][j+1]);
			}
		}
	}

}
