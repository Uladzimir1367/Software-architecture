package homework.task001.RewFabric.Seminar.Rewards.Silver;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
