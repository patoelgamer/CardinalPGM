package in.twizmwaz.cardinal.module.modules.regions.type;

import in.twizmwaz.cardinal.module.modules.regions.RegionModule;
import in.twizmwaz.cardinal.module.modules.regions.parsers.EmptyParser;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;

public class EmptyRegion extends RegionModule {

    public EmptyRegion(String name) {
        super(name);
    }

    public EmptyRegion(EmptyParser parser) {
        this(parser.getName());
    }

    @Override
    public boolean contains(BlockRegion region) {
        return false;
    }

    @Override
    public boolean contains(PointRegion region) {
        return false;
    }

    @Override
    public PointRegion getRandomPoint() {
        return null;
    }

    @Override
    public BlockRegion getCenterBlock() {
        return null;
    }

    @Override
    public List<Block> getBlocks() {
        return new ArrayList<Block>();
    }


}