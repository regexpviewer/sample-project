import org.intellij.lang.annotations.Language;

public class JavaRegExp {

    @Language("RegExp")
    public static final String REGEXP = "\\.*";

    private final static String noper = "Yay";
    private final static String noperrsssss = "Yay";

    private final static String matchAllRegExp = "Hello(.*)";

    @Language("RegExp")
    private final static String regex = "(?<aw>)<a>(?i)^[\\\\w\\\\.-]+@([\\\\w\\\\-]+|\\\\.)+[A-Z0-9]{2,4}(?x)\\n\" +\n" +
            "\\u0003\\u0002\\u0003" + 
            "      \"\\\\x0g\\\\#\\\\p{Alpha}\\\1(?#comment)\\n\" +\n" +
            "      \".*\\\\Q...\\\\E$# end-of-line comment";
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
