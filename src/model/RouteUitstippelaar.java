package model;

import java.util.ArrayList;
import java.util.List;

public class RouteUitstippelaar {
    private List<Checkpoint> checkpointLijst = new ArrayList<Checkpoint>();

    public void voegToe(Checkpoint checkpoint) {
        checkpointLijst.add(checkpoint);
    }

    public Checkpoint get(int index) {
        return checkpointLijst.get(index);
    }
}
