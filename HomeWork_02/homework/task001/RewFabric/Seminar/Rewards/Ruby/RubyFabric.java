package homework.task001.RewFabric.Seminar.Rewards.Ruby;

import homework.task001.RewFabric.Seminar.IGameItem;
import homework.task001.RewFabric.Seminar.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
