package design_patterns.comportamentale.template;

/**
 * Created by Serban on 05.04.2017.
 */
public class BasketballGame extends AGameTemplate {
    @Override
    void loadCourt() {
        System.out.println("Basketball court was loaded.");
    }

    @Override
    void loadPlayers() {
        System.out.println("Basketball players were loaded.");
    }

    @Override
    void loadBanners() {
        System.out.println("Basketball banners were loaded.");
    }
}
