public class Main {
    public static void main(String[] args) {
        Conta contaUser = new Conta();
        BancoMySQL bancoM = new BancoMySQL();

        if(contaUser.incluir(bancoM)){
            System.out.println("\nConta Ultimate \nUtiliza o SGBD MySQL - Multi usuário e banco de dados com múltiplas transações.\n");
        }else{
            System.out.println("Indisponivel");
        }

        BancoFirebird bf = new BancoFirebird();
        AdapterBanco perfil1 = new AdapterBanco(bf);

        if(contaUser.incluir(perfil1)){
            System.out.println("\nConta Básica \nUtiliza O SGBD Firebird - Multi usuário mas com banco de dados de transações únicas.\n");
        }else{
            System.out.println("Indisponivel");
        }

        BancoParadox bp = new BancoParadox();
        AdapterBanco perfil2 = new AdapterBanco(bp);

        if(contaUser.incluir(perfil2)){
            System.out.println("\nConta Gratuita \nUtiliza o SGBD Paradox - Single usuário e banco de dados de transações únicas.\n");
        }else{
            System.out.println("Indisponivel");
        }
    }
}