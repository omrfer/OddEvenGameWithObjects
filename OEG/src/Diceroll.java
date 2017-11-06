
	import java.util.Random;

	public class Diceroll {
		
		
		public int GetANumber() {

			Random rnumber = new Random();

			int cpunum = rnumber.nextInt(6)+1;
			return cpunum;
			}
		}
	
