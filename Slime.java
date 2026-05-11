public class Slime extends Musuh {

    public Slime() {
        this.namaMusuh = "Slime Berlendir";
        this.healthPoint = 50;
    }

    @Override
    public void terimaDamage(int damage) {
        super.terimaDamage(damage);
        System.out.println("Efek pasif: " + this.namaMusuh +
                " membelah diri menjadi dua karena diserang!");
    }
    public class Slime extends Musuh implements BisaLoot {

    public Slime() {
        super("Slime Berlendir", 50);
    }

    @Override
    public void terimaDamage(int damage) {
        super.terimaDamage(damage);

        if (this.healthPoint > 0) {
            System.out.println("Efek pasif: " + this.namaMusuh +
                    " membelah diri menjadi dua karena diserang!");
        }
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + ": Blub blub...");
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh +
                " menjatuhkan item: Gel Slime!");
    }
}
}