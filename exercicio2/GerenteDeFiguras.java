package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    // Adiciona uma figura na lista
    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    // Imprime os nomes de todas as figuras cadastradas
    public void imprimeFiguras() {
        System.out.println("Figuras cadastradas:");
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

    // Retorna a figura com a maior área
    public FiguraGeometrica getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) {
            return null;
        }

        FiguraGeometrica maior = figuras.get(0);
        for (FiguraGeometrica f : figuras) {
            if (f.calculaArea() > maior.calculaArea()) {
                maior = f;
            }
        }
        return maior;
    }

    // Calcula a área total de todas as figuras
    public double getAreaTotal() {
        double total = 0;
        for (FiguraGeometrica f : figuras) {
            total += f.calculaArea();
        }
        return total;
    }
}

	
	
	
