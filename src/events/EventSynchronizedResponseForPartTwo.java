/*******************************************************
 * Cours :        LOG735-E17 Groupe 01
 * Projet :       Laboratoire #2
 * Etudiants :    Olivier Labonté LABO29059208
 *                Axel Pajot PAJA07089006
 *******************************************************/

package events;

public class EventSynchronizedResponseForPartTwo extends EventBase implements IEventSynchronizedResponse {
    private static final long serialVersionUID = 2562323962251529988L;

    public EventSynchronizedResponseForPartTwo(String message) {
        super(message);
    }
}
