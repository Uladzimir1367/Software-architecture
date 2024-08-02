package homework.task001.RewFabric.Seminar.Rewards.Gold;

import homework.task001.RewFabric.Seminar.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}
