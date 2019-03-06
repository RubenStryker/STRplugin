package stryker.start.codeplugin;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class diamantes implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Create a new ItemStack (type: diamond)
            ItemStack diamond = new ItemStack(Material.DIAMOND);

            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(diamond);
        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }

}