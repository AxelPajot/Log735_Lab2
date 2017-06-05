/******************************************************
	Cours :           LOG730
	Session :         �t� 2010
	Groupe :          01
	Projet :          Laboratoire #2
	Date cr�ation :   2010-05-21
******************************************************
�v�nement lanc� par les boutons "Envoi Synchronis�"
des Applications.

******************************************************/ 
package events;

public class EventThatShouldBeSynchronized extends EventForAll implements IEventSynchronized {

	private static final long serialVersionUID = 6603201529319860113L;
	private final long timestamp = System.currentTimeMillis();

	public long getTimestamp() {
		return timestamp;
	}

	public EventThatShouldBeSynchronized(String m){
		super(m);
	}
}
