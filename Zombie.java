public class Zombie extends Musuh {

    public Zombie() {
        super("Zombie kayang", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh + 
                " menggigit dan memakan pemain! Player -20 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh + 
                ": Uwaaaagh...");
    }
    public class Zombie extends Musuh implements BisaLoot {

    public Zombie() {
        super("Zombie Ganas", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namaMusuh +
                " menggigit pemain! Player -20 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuh +
                ": Uwaaagh...");
    }

    @Override
    public void jatuhkanItem() {
        System.out.println(this.namaMusuh +
                " menjatuhkan item: Tulang Rapuh!");
    }
}
}