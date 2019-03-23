package LinearDataStructures;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import LinearDataStructures.*;

public class GoingToTheMarket {
	public class product implements Node{
		public String name = "";
		public double price = 0.0;
		public product next;

		public product(String name_, double price) {
			this.name = name_;
			this.price = price;

		}
		public void setNext(Node node) {
			this.next = (product)node;

		}

		@Override
		public Node getNext() {

			return this.next;
		}

		@Override
		public Node clone() {

			return new product(name,price);
		}

		@Override
		public boolean isEqual(Node node) {
			product temp = (product)node;
			return this.name.equals(temp.name) ? true:false;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}

	}
	public GoingToTheMarket() {

	}
	public String solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List produtcs = new List();
		
		return null;

	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		GoingToTheMarket problem = new GoingToTheMarket();
		try {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				bw.write(problem.solution());

			}
			bw.flush();
		}
		catch(Exception ex) {}

	}
}
