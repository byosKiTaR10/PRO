package PRO.ETS.DiseñoModular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class prisma2 {
    public static void main(String[] args) {
        Prisma prisma1 = new Prisma(4, 6);
        Prisma prisma2 = new Prisma(1, 5);
        Prisma prisma3 = new Prisma(10, 12);
        ArrayList<Float> prismas = new ArrayList<>();
        prismas.add(prisma1.areaTotal());
        prismas.add(prisma2.areaTotal());
        prismas.add(prisma3.areaTotal());
        Collections.sort(prismas, Comparator.reverseOrder());
        System.out.println(prismas.toString());
    }
}
