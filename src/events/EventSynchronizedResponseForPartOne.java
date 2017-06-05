/*******************************************************
 * Cours :        LOG735-E17 Groupe 01
 * Projet :       Laboratoire #2
 * Etudiants :    Olivier Labonté LABO29059208
 *                Axel Pajot PAJA07089006
 *******************************************************/

package events;

public class EventSynchronizedResponseForPartOne extends EventBase implements IEventSynchronizedResponse {
    private static final long serialVersionUID = -3350876929169791823L;

    public EventSynchronizedResponseForPartOne(String message) {
        super(message);
    }
}
