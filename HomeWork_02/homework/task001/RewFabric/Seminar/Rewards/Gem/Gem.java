package homework.task001.RewFabric.Seminar.Rewards.Gem;

import homework.task001.RewFabric.Seminar.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
