package homework.task001.RewFabric.Seminar.Rewards.Gold;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
