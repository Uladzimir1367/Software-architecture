package homework.task001.RewFabric.Seminar.Rewards.Gem;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
