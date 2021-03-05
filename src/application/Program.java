package application;

public class Program {

	public static void main(String[] args) {
		//Solu�ao feita por mim para um KATA do site CodeWars
		
		System.out.println("TESTES\n");
		nbYear(1500, 5, 100, 5000);
		nbYear(1500000, 2.5, 10000, 2000000);
		nbYear(1500000, 0.25, 1000, 2000000);
		nbYear(1500000, 0.25, -1000, 2000000);
		nbYear(1500000, 0.25, 1, 2000000);
		nbYear(1500000, 0.0, 10000, 2000000);
	}

	public static int nbYear(int p0, double percent, int aug, int p) {

		int Year = 1;
		double finalPopulation = p0; //Sim, eu tamb�m n�o sei o porqu� s� consegui resolver passando o p0 em uma nova vari�vel
		while (p > finalPopulation) {

			finalPopulation = finalPopulation + (finalPopulation * (percent / 100)) + aug;

			if (finalPopulation >= p) {
				System.out.println("Total Years for this population grow: " + Year);
				return Year;
			} 
			else {
				Year++;
			}
		}
		return Year;
	}
}
