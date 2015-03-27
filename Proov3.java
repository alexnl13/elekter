public class Proov3{
	public static void main(String[] arg){
		JadaYhendus j = new JadaYhendus();
		j.lisa(new Takisti220());
		j.lisa(new Takisti220());
		System.out.print(j.kysiTakistus());
		JadaYhendus j2 = new JadaYhendus();
		j2.lisa(new Takisti(1000));
		j2.lisa(new Takisti(1000));
		System.out.print(j2.kysiTakistus());
		JadaYhendus j3 = new JadaYhendus();
		j3.lisa(j);
		j3.lisa(j2);
	}
}