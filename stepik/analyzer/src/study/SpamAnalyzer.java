package study;

class SpamAnalyzer extends KeywordsAnalyzer{
    private  String[] keywords;

    public SpamAnalyzer(String[] keywordsSpam) {
        keywords = keywordsSpam;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
