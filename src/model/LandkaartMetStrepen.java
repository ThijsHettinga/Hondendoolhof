package model;

public class LandkaartMetStrepen {
    private Beweging beweging;

    public void setBeweging(Beweging beweging) {
        this.beweging = beweging;
    }

    public Beweging getBeweging() {
        return beweging;
    }

    public Checkpoint bewaarBewegingInCheckpoint() {
        return new Checkpoint(beweging);
    }

    public void haalBewegingUitCheckpoint(Checkpoint checkpoint) {
        beweging = checkpoint.getBeweging();
    }
}
