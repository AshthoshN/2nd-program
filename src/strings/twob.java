package strings;

// Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
// for appending the string ‘AIET’ for 10000 times and justify which one is better

public class twob {

    public static void main(String[] args) {

        StringBuffer sbuffer = new StringBuffer();
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuffer.append("AIET");
        }

        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end1 - start1) + " ms");

        StringBuilder sbuilder = new StringBuilder();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuilder.append("AIET");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");
    }
}