package exercicio2;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        // Criando figuras
        Triangulo t1 = new Triangulo(2.0, 3.0);
        Triangulo t2 = new Triangulo(4.0, 5.0);

        Losango l1 = new Losango(3.0, 4.0);
        Losango l2 = new Losango(5.0, 6.0);
        Losango l3 = new Losango(7.0, 8.0);

        // Adicionando ao gerente
        gerente.adicionaFigura(t1);
        gerente.adicionaFigura(t2);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);
        gerente.adicionaFigura(l3);

        // a) Imprime todas as figuras
        System.out.println("Figuras cadastradas:");
        gerente.imprimeFiguras();

        // b) Figura com maior área
        FiguraGeometrica maior = gerente.getMaiorAreaDeFigura();
        System.out.println("\nFigura com maior área: " + maior.getNomeFigura() + 
                           " (Área: " + maior.calculaArea() + ")");

        // c) Área total
        System.out.println("\nÁrea total das figuras: " + gerente.getAreaTotal());
    }
}
