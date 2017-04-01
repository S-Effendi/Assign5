/**
 * Created by S.Effendi on 2017/03/31.
 */
public class OnlineGame implements Game{
    private OfflineGame offline;
    private String gameName;

    public OnlineGame(String gameName){
        this.gameName = gameName;
    }

    @Override
    public String loadGame(){
        if(offline == null){
            offline = new OfflineGame(gameName);
        }
        offline.loadGame();
        return gameName;
    }
}
