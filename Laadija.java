public class Laadija implements Vooluallikas{
	private double v2ljupinge, maxvool;
	TakistusKomponent tarbija = null;
	public Laadija(double v2ljupinge, double maxvool){
		this.maxvool = maxvool;
		this.v2ljupinge = v2ljupinge;
	}
	
	public void yhendaTarbija(TakistusKomponent t){
		tarbija = t;
	}
	
	public double kysiVool(){
		if(tarbija == null){return 0;}
		double vool = tarbija.vool(v2ljupinge);
		if(vool<=maxvool){return vool;}
		return 0;
	}
}