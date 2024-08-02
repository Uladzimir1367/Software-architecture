package homework.task001.RewFabric.Seminar.Rewards.Bronze;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
