package events;

public class EventTwoRdy extends EventBase implements IEventTwoRdy, IEventRdy{

	private static final long serialVersionUID = 67847398567178L;

	public EventTwoRdy(String m){
		super(m);
	}
}