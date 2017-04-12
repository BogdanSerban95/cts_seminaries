package design_patterns.comportamentale.template;

/**
 * Created by Serban on 05.04.2017.
 */
public abstract class AGameTemplate {
    abstract void loadCourt();

    abstract void loadPlayers();

    abstract void loadBanners();

    void commonMethod() {
        System.out.println("Common method for all games.");
    }

    void loadGame() {

        this.loadCourt();
        this.loadPlayers();
        this.loadBanners();
        this.commonMethod();
    }
}
