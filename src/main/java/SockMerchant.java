import java.util.ArrayList;
import java.util.Arrays;

public class SockMerchant {
    public static int sockMerchant(int socksNumber, int[] colours){
        int pairs = 0;
        boolean noSocks = 1 > socksNumber;
        boolean tooManySocks = socksNumber > 100;

        if( !noSocks && !tooManySocks ) {
            sortColours(colours);
            ArrayList coloursString = convertColoursIntoString(colours);
            pairs = getPairsNumber(pairs, coloursString);
        }
        return pairs;
    }

    private static int getPairsNumber(int pairs, ArrayList coloursString) {
        int index;
        int lastIndex = 0;
        while (lastIndex < coloursString.size()) {
            index = coloursString.lastIndexOf(coloursString.get(lastIndex));
            int numPairs = ((index - lastIndex) + 1) / 2;
            pairs += numPairs;
            lastIndex = index + 1;
        }
        return pairs;
    }

    private static ArrayList convertColoursIntoString(int[] colours) {
        ArrayList coloursString = new ArrayList();
        for (int i = 0; i < colours.length; i++) {
            coloursString.add(Integer.toString(colours[i]));
        }
        return coloursString;
    }

    private static void sortColours(int[] colours) {
        Arrays.sort(colours);
    }
}