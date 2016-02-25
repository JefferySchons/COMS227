package lab2;
/**
 * 
 * @author jcschons
 * @version 1
 * @ January 30, 2014
 */
/**
 * model of the atom used
 */
public class Atom
{ 
	/**
	 * declare variables
	 * @param givenProtons
	 * @param givenNeutrons
	 * @param givenElectrons
	 */
	private int Protons;
	private int Neutrons;
	private int Electrons;

// insert code to assign given state to instance variables 	
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
	{
		Protons = givenProtons;
		Neutrons = givenNeutrons;
		Electrons = givenElectrons;
	}
	// calculates the atomic mass from the sum of the protons and neutrons
	public int getAtomicMass()
	{
		/**
		 * calculates the atomic mass from the sum of the protons and neutrons
		 * @return Atomicmass
		 * the Atomic Mass of the Atom
		 */
		int Atomicmass = Protons+Neutrons;
		return Atomicmass;
	}
	// returns atomic charge (protons - electrons)
	public int getAtomicCharge()
	{
		/**
		 * calculates the charge from the protons minus the electrons
		 * @return Charge
		 * Charge of the atom
		 */
		int Charge = Protons - Electrons;
		return Charge;	
	}
	//decays the atom by 2 neutrons and protons
	public void decay()
	{
	/**
	 * decreaces the number of protons by 2
	 * decreases the number of neutrons by 2
	 */
	Protons = Protons - 2;
	Neutrons = Neutrons -2;
	}
}
//int getAtomicMass() - returns total number of protons plus neutrons
	//int getAtomicCharge() - returns the difference between the number of protons and electrons
	//void decay() - decreases the number of protons by 2 and the number of neutrons by 2 
