package plugin.plugin.challenges;

public class Challenges {

    private boolean EnderDragonGoal;

    private boolean WitherGoal;

    public Challenges(boolean EnderDragonGoal, boolean WitherGoal) {
        this.EnderDragonGoal = EnderDragonGoal;
        this.WitherGoal = WitherGoal;
    }

    public boolean isEnderDragonGoal() {
        return EnderDragonGoal;
    }

    public void setEnderDragonGoal(boolean enderDragonGoal) {
        EnderDragonGoal = enderDragonGoal;
    }

    public boolean isWitherGoal() {
        return WitherGoal;
    }

    public void setWitherGoal(boolean witherGoal) {
        WitherGoal = witherGoal;
    }

}
