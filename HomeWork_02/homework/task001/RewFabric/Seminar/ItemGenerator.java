package homework.task001.RewFabric.Seminar;

public abstract class ItemGenerator {
    public void openReward()
    {
        IGameItem gameItem = createItem();
        gameItem.open();

    }
    public abstract IGameItem createItem();
}
