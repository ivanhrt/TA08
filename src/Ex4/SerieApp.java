package Ex4;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie();
		System.out.println(serie1);
		
		Serie serie2 = new Serie("Game of Thrones", "David Benioff");
		System.out.println(serie2);
		
		Serie serie3 = new Serie("The Walking Dead", 11, true, "Terror", "Robert Kirkman");
		System.out.println(serie3);

	}

}
