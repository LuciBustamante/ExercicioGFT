package FolhaPgto;

public class Main {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Ana", 40, 2000);
        Supervisor s1 = new Supervisor("Pedro", 50, 2100);
        Vendedor v1 = new Vendedor("Paula", 28, 1500);

        g1.bonificacao();
        s1.bonificacao();
        v1.bonificacao();

        System.out.printf("Gerente: %s | Idade: %d | Salario Bruto: R$ %.2f | Salario Liquido: R$ %.2f\n", g1.getNome(), g1.getIdade(), g1.getSalario(), g1.bonificacao());
        System.out.printf("Supervisor: %s | Idade: %d | Salario Bruto: R$ %.2f | Salario Liquido: R$ %.2f\n", s1.getNome(), s1.getIdade(), s1.getSalario(), s1.bonificacao());
        System.out.printf("Vendedor: %s | Idade: %d | Salario Bruto: R$ %.2f | Salario Liquido: R$ %.2f\n", v1.getNome(), v1.getIdade(), v1.getSalario(), v1.bonificacao());

    }
}
