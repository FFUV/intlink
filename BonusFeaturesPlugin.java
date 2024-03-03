import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BonusFeaturesPlugin extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Register the command executor
        this.getCommand("bonus").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("bonus")) {
            // Add some bonus features here
            sender.sendMessage("Bonus features activated!");
            return true;
        }
        return false;
    }
}
