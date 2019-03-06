package stryker.start.codeplugin;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class evento extends Event {
	
    private final String playerName;

    public evento(String playerName) {
        this.playerName = playerName;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public String getPlayerName() {
        return this.playerName;
    }

}