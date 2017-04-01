/**
 * Created by S.Effendi on 2017/03/31.
 */
public class OfflineGame implements Game{

    private String gameName;

    public OfflineGame(String gameName){
        this.gameName = gameName;
        retreivingData(gameName);
    }

    @Override
    public String loadGame() {
        return "Welcome to " + gameName;
    }

    private void retreivingData(String gameName) {
        System.out.println("Uploading your files... It takes time to be a great " + gameName);
    }
}
