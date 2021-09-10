
public class RollDice {
	public static void main(String[] args) {
	  final int SIZE = 6;
	
	  int[] frea = new int[SIZE]; //frea[0], frea[1],frea[2],frea[3],frea[4],frea[5]
	  for (int i = 0; i < 100; i++) {
		++frea[(int)(Math.random()*SIZE)];
	}
	  for (int i = 0; i < SIZE; i++) {
		System.out.println((i+1) + "번이 나온 횟수" + frea[i]);
	}
	  
  }
}
