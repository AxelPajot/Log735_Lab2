package events;

public class EventOneRdy extends EventBase implements IEventOneRdy , IEventRdy{

	private static final long serialVersionUID = 678853826767178L;

	public EventOneRdy(String m){
		super(m);
	}
}