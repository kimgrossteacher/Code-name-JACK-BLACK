public class StorageBigChest extends StorageChest {

int extraSpace;

public StorageBigChest(String color, String material, int itemCount, int extraSpace) {
    super(color, material, itemCount);
    this.extraSpace = extraSpace;
}
}