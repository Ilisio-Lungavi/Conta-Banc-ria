public class Conta {
    double Saldo;
    String Nome;

    public Conta(double Saldo, String Nome) {
        this.Saldo = Saldo;
        this.Nome = Nome;
    }

    public String Depositar (double b){
        Saldo += b;
        return ("Operação Concluída!\n");
    }

    public String Sacar (double a){
        if(a > Saldo){
            return ("Operação Interrompida: Saldo Insuficiente!\n");
        }else if(a <= Saldo){
            Saldo -= a;
            return ("Operação Concluída!\n");
        }
        return "";
    }

    public String Transferir (double a, Conta b){
        if(a > Saldo){
            return ("Operação Interrompida: Saldo Insuficiente!\n");
        }else if(a <= Saldo){
            Saldo -= a;
            b.Depositar(a);
            return ("Transferência Concluída!\n");
        }
        return "";
    }

    public String Consultar (Conta a){
        return ("Saldo Atual: " + Saldo + "kz\n");
    }
}
