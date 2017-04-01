/**
 * Created by S.Effendi on 2017/04/01.
 */
public class EstateAgentClient implements AgentClient {
    @Override
    public void view(FarmHouse farmHouse){
        System.out.println("Viewing FarmHouse...");
    }

    @Override
    public void view(ResidentialHouse residentialHouse) {
        System.out.println("Viewing Residential House...");
    }

    @Override
    public void view(PentHouse pentHouse){
        System.out.println("Viewing PentHouse Apartment...");
        }

    @Override
    public void view(EstateAgent estateAgent){
        System.out.println("Arrange meeting with agent regarding selected estates...");
        }
    }
