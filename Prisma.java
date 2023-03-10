package PRO.ETS.DiseñoModular;

public class Prisma {
    /**
     * Clase que se inicializa con la base del triángulo y la altura del prisma y se
     * calcula el área total del mismo
     * 
     * @author Óscar
     */
    private int baseTriangulo;
    private int alturaPrisma;

    Prisma() {
        /* Constructor vacío para poder inicializar la clase sin parámetros */
    }

    /**
     * Constructor que inicializa con valores los atributos
     * 
     * @param baseTriangulo base del triángulo
     * @param alturaPrisma  altura del prisma
     */
    Prisma(int baseTriangulo, int alturaPrisma) {

        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Getter del atributo baseTriangulo
     * 
     * @return base del triángulo
     */
    public int getBaseTriangulo() {

        return baseTriangulo;
    }

    /**
     * Setter de la base del triángulo
     * 
     * @param nueva valor para el atributo que es la base del triángulo
     */
    public void setBaseTriangulo(int baseTriangulo) {

        this.baseTriangulo = baseTriangulo;
    }

    /**
     * Getter del atributo que es la altura del prisma
     * 
     * @return altura del prisma
     */
    public int getAlturaPrisma() {

        return alturaPrisma;
    }

    /**
     * Setter de la altura del prisma
     * 
     * @param nuevo valor para la altura del prisma
     */
    public void setAlturaPrisma(int alturaPrisma) {

        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Calcula la altura del triángulo de la base usando el atributo de la base del
     * triángulo
     * 
     * @return la altura del triángulo
     */
    public float alturaTriangulo() {

        float alturaTriangulo = baseTriangulo * baseTriangulo
                - (baseTriangulo / 2) * (baseTriangulo / 2);
        alturaTriangulo = (float) Math.sqrt(alturaTriangulo);
        return alturaTriangulo;
    }

    /**
     * Calcula el área de la base del prisma que es el triángulo
     * 
     * @return área de la base
     */
    public float areaBase() {

        float areaBase = (baseTriangulo * alturaTriangulo()) / 2;
        return areaBase;
    }

    /**
     * Calcula el perímetro del triángulo de la base
     * 
     * @return perímetro del triángulo de la base
     */
    public float perimetro() {

        float perimetro = 3 * baseTriangulo;
        return perimetro;
    }

    /**
     * Calcula el área del lateral del prisma
     * 
     * @return área lateral del prisma
     */
    public float areaLateral() {

        float areaLateral = perimetro() * alturaPrisma;
        return areaLateral;
    }

    /**
     * Calcula el área total del prisma
     * 
     * @return área total del prisma
     */
    public float areaTotal() {

        float areaTotal = 2 * areaBase() + areaLateral();
        return areaTotal;
    }
}
