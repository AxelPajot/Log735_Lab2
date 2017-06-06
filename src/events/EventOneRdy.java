/******************************************************* 
 * Cours :        LOG735-E17 Groupe 01 
 * Projet :       Laboratoire #2 
 * Etudiants :    Olivier Labonté LABO29059208 
 *                Axel Pajot PAJA07089006 
 *******************************************************/ 

package events;

public class EventOneRdy extends EventBase implements IEventOneRdy , IEventRdy{

	private static final long serialVersionUID = 678853826767178L;

	public EventOneRdy(String m){
		super(m);
	}
}