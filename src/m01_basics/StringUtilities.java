package m01_basics;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        //this.sBuilder.append(c);       // tu jest błąd do debugowania
        sBuilder.append(c);              // naprawiony błąd
        charsAdded++;
    }

    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix " + upper;
    }

    public String addSuffix(String str){
        return str + "__Suffix";
    }
}
