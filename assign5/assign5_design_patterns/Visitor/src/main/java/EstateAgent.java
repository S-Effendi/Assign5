/**
 * Created by S.Effendi on 2017/04/01.
 */
public class EstateAgent implements Agency {

    Agency[] estates;

    public EstateAgent(){
        estates = new Agency[] {new FarmHouse(), new PentHouse(), new ResidentialHouse()};
    }

    @Override
    public void assess(AgentClient aClient){
        for (int i = 0; i < estates.length; i++){
            estates[i].assess(aClient);
        }
        aClient.view(this);
    }
}
