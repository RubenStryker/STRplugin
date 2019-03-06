package stryker.start.codeplugin;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class activador implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        event.setJoinMessage("Welcome, " + event.getPlayer().getName() + "!");
       
    }
}
