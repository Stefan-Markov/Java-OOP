package barracksWars.units;

public class Horseman extends  AbstractUnit {

    private  static  final int HORSEMAN_HEALTH = 25;
    private  static  final int HORSEMAN_DAMAGE = 10;


    public Horseman() {
        super(HORSEMAN_HEALTH, HORSEMAN_DAMAGE);
    }
}
