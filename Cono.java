package PRO.ETS.DocumentacionJavadoc;

/**
 * Clase que inicializa objetos con los atributos de un cono
 * 
 * @author byosKi Activoo
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;

    /**
     * Constructor de la clase
     * 
     * @param cX    valor de "x" del círculo de la base del cono
     * @param cY    valor de "y" del círculo de la base del cono
     * @param r     valor de radio del círculo de la base del cono
     * @param h     valor de la altura del cono
     * @param color color del cono
     */
    public Cono(float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Getter del valor de la base del cono que es el círculo
     * 
     * @return base del cono
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Setter del círculo de la base del cono
     * 
     * @param base nueva base del cono
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Getter de la altura del cono
     * 
     * @return altura del cono
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Setter de la altura del cono
     * 
     * @param altura nueva altura del cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Getter del color del cono
     * @return color del cono
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter del color del cono
     * @param color nuevo color del cono
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que imprime la altura y el color del cono
     */
    public void imprimir() {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
