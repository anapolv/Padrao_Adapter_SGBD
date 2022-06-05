public class AdapterBanco extends BancoMySQL {
    BancoFirebird bancoF;

    public AdapterBanco(BancoFirebird banco){
        this.bancoF = banco;
    }

    public AdapterBanco() {
    }

    public AdapterBanco(BancoParadox bp) {
    }

    @Override
    public String getUltimate(){
        String sgbd;

        sgbd = this.ultimate;

        return(sgbd);
    }
    
}
