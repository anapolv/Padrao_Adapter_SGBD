public class Conta {
    String ultimate;

    public Conta(String ultimate){
        this.ultimate = ultimate;
    }

    public Conta() {
    }

    public String getUltimate(){
        return this.ultimate;
    }

    public boolean incluir(BancoMySQL banco){
        return(this.getUltimate()==banco.getUltimate());
    }
}
