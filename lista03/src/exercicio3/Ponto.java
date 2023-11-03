package exercicio3;

class Ponto {
    private float x;
    private float y;

    public Ponto() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}