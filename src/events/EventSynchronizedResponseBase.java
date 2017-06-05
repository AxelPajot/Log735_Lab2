/*******************************************************
 * Cours :        LOG735-E17 Groupe 01
 * Projet :       Laboratoire #2
 * Etudiants :    Olivier Labonté LABO29059208
 *                Axel Pajot PAJA07089006
 *******************************************************/

package events;

public class EventSynchronizedResponseBase extends EventBase implements IEventSynchronizedResponse {
    private static final long serialVersionUID = 7671553772008657630L;
    private final IEventSynchronized originalEvent;

    public IEventSynchronized getOriginalSynchronizedEvent() {
        return originalEvent;
    }

    public EventSynchronizedResponseBase(String message, IEventSynchronized originalEvent) {
        super(message);
        this.originalEvent = originalEvent;
    }
}
