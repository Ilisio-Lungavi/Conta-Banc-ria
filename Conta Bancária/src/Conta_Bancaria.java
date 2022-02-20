import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int op, opc;
        double vd, vs, vt;
        Conta Conta1 = new Conta(5000, "Kevin");
        Conta Conta2 = new Conta(5000, "Lourenço");

        do {

            System.out.println("1-Nome: " + Conta1.Nome + " - Saldo: " + Conta1.Saldo + "kz\n2-Nome: " + Conta2.Nome + " - Saldo: " + Conta2.Saldo + "kz\n3-Sair\n\nQual conta deseja acessar?");
            op = reader.nextInt();

            switch (op) {
                case 1 -> {
                    do {
                        System.out.println("1-Depositar\n2-Sacar\n3-Transferir\n4-Consultar\n5-Terminar Sessão\n\nSelecione a operação desejada:");
                        opc = reader.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                vd = reader.nextDouble();
                                System.out.println(Conta1.Depositar(vd));
                                break;

                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                vs = reader.nextDouble();
                                System.out.println(Conta1.Sacar(vs));
                                break;

                            case 3:
                                System.out.println("Digite o valor a ser transferido: ");
                                vt = reader.nextDouble();
                                System.out.println(Conta1.Transferir(vt, Conta2));
                                break;

                            case 4:
                                System.out.println(Conta1.Consultar(Conta1));
                                break;

                            case 5:
                                break;

                            default:
                                break;
                        }
                    }while (opc != 5);
                }
                case 2 -> {
                    do {
                        System.out.println("1-Depositar\n2-Sacar\n3-Transferir\n4-Consultar\n5-Terminar Sessão\n\nSelecione a operação desejada:");
                        opc = reader.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Digite o valor a ser depositado: ");
                                vd = reader.nextDouble();
                                System.out.println(Conta2.Depositar(vd));
                                break;

                            case 2:
                                System.out.println("Digite o valor a ser sacado: ");
                                vs = reader.nextDouble();
                                System.out.println(Conta2.Sacar(vs));
                                break;

                            case 3:
                                System.out.println("Digite o valor a ser transferido: ");
                                vt = reader.nextDouble();
                                System.out.println(Conta2.Transferir(vt, Conta1));
                                break;

                            case 4:
                                System.out.println(Conta2.Consultar(Conta2));
                                break;

                            case 5:
                                break;

                            default:
                                break;
                        }
                    }while (opc != 5);
                }
                default -> {
                    break;
                }
            }
        }while (op <= 2);
    }
}
