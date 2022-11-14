package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        MobitelBuilder mobitelBuilder = new MobitelBuilder();
        Mobitel m = mobitelBuilder.setRam("2GB").setProcesor("Exynos").build();
    }
}