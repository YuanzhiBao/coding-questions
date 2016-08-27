import java.util.List;
import java.util.PriorityQueue;

public class queue01 {
	public void tryit(int[] y) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int c: y) {
			q.offer(c);
			for (int b: q) {
				System.out.println(b);
			}
			System.out.println("***********");
		}
	}
}
