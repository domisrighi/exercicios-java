package exercicio3;

class Retangulo {
    private float altura;
    private float largura;
    private Ponto origem;

    public Retangulo() {
        this.altura = 0.0f;
        this.largura = 0.0f;
        this.origem = new Ponto();
    }

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
        this.origem = new Ponto();
    }

    public Retangulo(Ponto origem) {
        this.altura = 0.0f;
        this.largura = 0.0f;
        this.origem = origem;
    }

    public Retangulo(float altura, float largura, Ponto origem) {
        this.altura = altura;
        this.largura = largura;
        this.origem = origem;
    }

    public float calcularArea() {
        return altura * largura;
    }

    public boolean temInterseccao(Retangulo r) {
        // verifica a interseção entre este retângulo e o retângulo r
        float x1 = this.origem.getX();
        float y1 = this.origem.getY();
        float x2 = r.origem.getX();
        float y2 = r.origem.getY();
        float width1 = this.largura;
        float height1 = this.altura;
        float width2 = r.largura;
        float height2 = r.altura;

        if (x1 < x2 + width2 &&
            x1 + width1 > x2 &&
            y1 < y2 + height2 &&
            y1 + height1 > y2) {
            return true; // há interseção
        } else {
            return false; // não há interseção
        }
    }
}