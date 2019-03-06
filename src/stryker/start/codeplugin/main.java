package stryker.start.codeplugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import stryker.start.codeplugin.activador;
import stryker.start.codeplugin.ladrillos;

public class main extends JavaPlugin{
	
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	this.getCommand("ladrillos").setExecutor(new ladrillos());
    	this.getCommand("diamond").setExecutor(new diamantes());
    	
    	evento exampleEvent = new evento("SrStryker"); // Inicializa el evento, guardado como exampleEvent
    	Bukkit.getPluginManager().callEvent(exampleEvent); // Esto activa el evento y permite que cualquier oyente escuche el evento
    	Bukkit.getPlayer("SrStryker").sendMessage(exampleEvent.getPlayerName()); // Usar los datos del evento
    	
    	getServer().getPluginManager().registerEvents(new activador(), this);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
	
}