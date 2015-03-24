public class Proov2{
	public static void main(String[] arg){
		TakistusKomponent t = new Takisti(300);
		Vooluallikas telefonilaadija = new Laadija(5,0.5);
		telefonilaadija.yhendaTarbija(t);
		System.out.println(telefonilaadija.kysiVool());
	}
}