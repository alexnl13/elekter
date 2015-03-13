public class Proov3{
	public static void main(String[] arg){
		TakistusKomponent t = new Takisti(300);
		Vooluallikas telefonilaadija = new Laadija(5,1) ;
		telefonilaadija.yhendaTarbija(t);
		System.out.println(telefonilaadija.kysiVool());
	}
}