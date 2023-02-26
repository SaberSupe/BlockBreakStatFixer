package saber.blockbreakstatfixer.events;

import com.gmail.nossr50.mcMMO;
import com.gmail.nossr50.util.blockmeta.ChunkManager;
import org.bukkit.Statistic;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakStatFixEvent implements Listener {

    private final ChunkManager mcmmoStore;

    public BlockBreakStatFixEvent(){
        mcmmoStore = mcMMO.getPlaceStore();
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        if (mcmmoStore.isTrue(e.getBlock())){
            e.getPlayer().decrementStatistic(Statistic.MINE_BLOCK, e.getBlock().getType());
        }
    }
}
