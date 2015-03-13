abstract class TakistusKomponent{
	abstract double kysiTakistus();
	/**
	*	Leiatakse etteantud pingele vastav vool
	*	@param pinge - rakendatav pinge vooltides
	*/
	
	public double vool(double pinge){
		return pinge/kysiTakistus();
	}
}