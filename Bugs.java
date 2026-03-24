public class BuggyCode {

    // Bug 1: duhet të jetë static për të thirrur nga main
    public int mblidh(int a, int b) {
        return a + b;
    }

    // Bug 2: loop shkon një herë shumë (duhet i < numrat.length)
    public static int gjejShumen(int[] numrat) {
        int shuma = 0;
        for (int i = 0; i <= numrat.length; i++) {
            shuma += numrat[i];
        }
        return shuma;
    }

    // Bug 3: krahasim i String me == (duhet .equals())
    public static boolean kontrolloFjalen(String fjala) {
        if (fjala == "hello") {
            return true;
        }
        return false;
    }

    // Bug 4: nuk kthehet asgjë në njërën degë (missing return)
    public static String klasifiko(int nota) {
        if (nota >= 5) {
            return "Kaloi";
        }
        // mungon: return "Nuk kaloi";
    }

    public static void main(String[] args) {
        BuggyCode obj = new BuggyCode();

        // Thirrja e metodës jo-static nga kontekst static
        System.out.println("Shuma: " + mblidh(3, 4));

        int[] numrat = {10, 20, 30, 40};
        System.out.println("Shuma totale: " + gjejShumen(numrat));

        System.out.println("Kontrollo: " + kontrolloFjalen("hello"));

        System.out.println("Nota: " + klasifiko(4));
    }
}
