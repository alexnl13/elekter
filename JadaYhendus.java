import java.util.*;

public class JadaYhendus extends TakistusKomponent{
	List<TakistusKomponent> komponendid = new ArrayList<TakistusKomponent>();
	public void lisa(TakistusKomponent t){
		komponendid.add(t);
	}
	public double kysiTakistus(){
		double summa = 0;
		for(TakistusKomponent t: komponendid){
			summa += t.kysiTakistus();
		}
		return summa;
	}
}