package homework.task001.RewFabric.Seminar.Rewards.Bronze;

import homework.task001.RewFabric.Seminar.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}
