package ba.unsa.etf.rpr;

public class Mobitel {
    private String ekran, kamera, procesor, ram, brend;

    public Mobitel(String ekran, String kamera, String procesor, String ram, String brend) {
        this.ekran = ekran;
        this.kamera = kamera;
        this.procesor = procesor;
        this.ram = ram;
        this.brend = brend;
    }

    public String getEkran() {
        return ekran;
    }

    public void setEkran(String ekran) {
        this.ekran = ekran;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }
}
