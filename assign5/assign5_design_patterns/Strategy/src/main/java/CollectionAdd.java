/**
 * Created by S.Effendi on 2017/04/01.
 */
public class CollectionAdd implements MarbleCollection{
    @Override
    public int collect(int marblesCollected, int marblesCollectable)
    {
        return marblesCollected + marblesCollectable;
    }
}
