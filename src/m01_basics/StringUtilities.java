package m01_basics;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        this.sBuilder.append(c);       // tu jest błąd do debugowania
        charsAdded++;
    }
}
