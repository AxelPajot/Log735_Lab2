/******************************************************* 
 * Cours :        LOG735-E17 Groupe 01 
 * Projet :       Laboratoire #2 
 * Etudiants :    Olivier Labonté LABO29059208 
 *                Axel Pajot PAJA07089006 
 *******************************************************/ 

package events;

public class EventTwoRdy extends EventBase implements IEventTwoRdy, IEventRdy{

	private static final long serialVersionUID = 67847398567178L;

	public EventTwoRdy(String m){
		super(m);
	}
}