package homework.task001.RewFabric.Seminar.Rewards.Sapphire;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
