package PRO.ETS.DocumentacionJavadoc;

/**
 * Clase que crea un objeto con los atributos para que sea un círculo
 */
public class Circulo {
    private float x, y;
    private float radio;

    /**
     * Constructor de la clase
     * 
     * @param cX inicializa el valor del atributo "x"
     * @param cY inicializa el valor del atributo "y"
     * @param r  inicializa el valor del atributo "radio"
     */
    public Circulo(float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Getter del valor del atributo "x"
     * 
     * @return valor de "x"
     */
    public float getX() {
        return x;
    }

    /**
     * Setter del valor del atributo "x"
     * 
     * @param x nuevo valor de "x"
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Getter del valor del atributo "y"
     * 
     * @return valor de "y"
     */
    public float getY() {
        return y;
    }

    /**
     * Setter del valor del atributo "y"
     * 
     * @param y nuevo valor de "y"
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Getter del valor del atributo "radio" que es el radio del círculo
     * 
     * @return
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Setter del valor del atributo "radio"
     * 
     * @param radio nuevo valor del radio
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo
     * 
     * @return área del círculo
     */
    public float area() {
        return (float) Math.PI * radio * radio;
    }

    public void imprimir() {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}