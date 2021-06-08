package leecode;

public class EntityParser {

    public static void main(String[] args) {
        System.out.println(entityParser("&amp; is an HTML entity but &ambassador; is not."));
    }

    static String[] strings = {"&quot;", "&apos;", "&amp;", "&gt;", "&lt;", "&frasl;"};
    static char[] chars = {'"', '\'', '&', '>', '<', '/'};

    public static String entityParser(String text) {
        return    text.replace("&quot;", "\"").replace("&apos;", "'")
               .replace("&gt;", ">").replace("&lt;", "<").replace("&frasl;", "/") .replace("&amp;", "&");
    }
}