package homework.task001.RewFabric.Seminar.Rewards.Platinum;

import homework.task001.RewFabric.Seminar.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}
