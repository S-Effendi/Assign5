/**
 * Created by S.Effendi on 2017/04/01.
 */
public class ResidentialHouse implements Agency {
    @Override
    public void assess(AgentClient aClient){
        aClient.view(this);
    }
}
