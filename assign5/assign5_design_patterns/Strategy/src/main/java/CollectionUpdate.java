/**
 * Created by S.Effendi on 2017/04/01.
   Used to identify change regarding collection.
 */
public class CollectionUpdate  {
    private MarbleCollection marbleCollection;

    public CollectionUpdate(MarbleCollection marbleCollection){
           this.marbleCollection = marbleCollection;
    }


    public int checkMarbleCollection(int marblesCollected, int marblesCollectable)
    {
        return marbleCollection.collect(marblesCollected, marblesCollectable);
    }
}
