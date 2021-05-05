package m03_challenges1;

public class Utilities {

    // There may be intentional bugs in methods below

    // Returns a char array containing every n-th char
    // When sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){
        if (sourceArray == null || sourceArray.length < n){
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length; i += n){
            result[index++] = sourceArray[i];
        }

        return result;
    }

    // Removes pairs of the same character that are next to each other
    // by removing one occurrence of the character
    // example: "ABBCDEEF" => "ABCDEF"
    public String removePairs(String source){
        if (source.length() < 2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for (int i = 0; i < string.length; i++){
            if (string[i] != string[i++]){
                sb.append(string[i]);
            }
        }
        return sb.toString();
    }

    // Perform a conversion based on an internal business rule
    public int convert(int a, int b){
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source){
        if (source.length() % 2 == 0){
            return source;
        }

        return null;
    }
}
