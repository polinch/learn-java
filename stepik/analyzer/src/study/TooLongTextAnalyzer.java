package study;

class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    public TooLongTextAnalyzer(int maxL) {
        maxLength = maxL;
    }

    public Label processText(String text) {
        int textLength = text.length();
        if (textLength <= maxLength){
            return Label.OK;
        }
        else {
            return Label.TOO_LONG;
        }
    }
}
