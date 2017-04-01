/**
 * Created by S.Effendi on 2017/04/01.
 */
public class FarmHouse implements Agency {
    @Override
    public void assess(AgentClient aClient){
        aClient.view(this);
    }
}
