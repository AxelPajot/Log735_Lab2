/******************************************************* 
 * Cours :        LOG735-E17 Groupe 01 
 * Projet :       Laboratoire #2 
 * Etudiants :    Olivier Labonté LABO29059208 
 *                Axel Pajot PAJA07089006 
 *******************************************************/ 

package events;

public class EventThreeRdy extends EventBase implements IEventThreeRdy, IEventRdy{

	private static final long serialVersionUID = 6784739856767178L;

	public EventThreeRdy(String m){
		super(m);
	}
}