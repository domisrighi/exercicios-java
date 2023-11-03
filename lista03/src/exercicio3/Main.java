package exercicio3;

public class Main {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(1.0f, 2.0f);

        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo(3.0f, 4.0f);
        Retangulo retangulo3 = new Retangulo(ponto);
        Retangulo retangulo4 = new Retangulo(5.0f, 6.0f, ponto);

        System.out.println("Área do retângulo 1: " + retangulo1.calcularArea());
        System.out.println("Área do retângulo 2: " + retangulo2.calcularArea());
        System.out.println("Área do retângulo 3: " + retangulo3.calcularArea());
        System.out.println("Área do retângulo 4: " + retangulo4.calcularArea());

        if (retangulo1.temInterseccao(retangulo2)) {
            System.out.println("Retângulo 1 e Retângulo 2 têm interseção.");
        } else {
            System.out.println("Retângulo 1 e Retângulo 2 não têm interseção.");
        }

        if (retangulo1.temInterseccao(retangulo3)) {
            System.out.println("Retângulo 1 e Retângulo 3 têm interseção.");
        } else {
            System.out.println("Retângulo 1 e Retângulo 3 não têm interseção.");
        }
    }
}