public class Proov5{
	public static void main(String[] arg){
		JadaYhendus j = new JadaYhendus();
		j.lisa(new Takisti(50));
		j.lisa(new Takisti(50));
		j.lisa(new Takisti(50));
		j.lisa(new Takisti(50));
		
		RoopYhendus r = new RoopYhendus();
		r.lisa(j);
		r.lisa(new Takisti(20));

		JadaYhendus j2 = new JadaYhendus();
		j2.lisa(new Takisti(5));
		j2.lisa(r);
		
		System.out.println(j2.vool(230));		
	}
}