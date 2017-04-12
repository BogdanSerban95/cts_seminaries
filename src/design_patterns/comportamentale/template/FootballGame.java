package design_patterns.comportamentale.template;

/**
 * Created by Serban on 05.04.2017.
 */
public class FootballGame extends AGameTemplate {
    @Override
    void loadCourt() {
        System.out.println("Football court was loaded.");
    }

    @Override
    void loadPlayers() {
        System.out.println("Football players were loaded.");
    }

    @Override
    void loadBanners() {
        System.out.println("Football banners were loaded.");
    }
}
