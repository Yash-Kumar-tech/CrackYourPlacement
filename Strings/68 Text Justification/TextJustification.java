class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0 ;
        while(i < words.length) {
            List<String> currLine = getWords(i, words, maxWidth) ;
            i += currLine.size();
            ans.add(writeLine(currLine, i, words, maxWidth));
        }
        return ans ;
    }

    private List<String> getWords(int i, String[] words, int maxWidth) {
        List<String> currLine = new ArrayList<>();
        int currLen = 0 ;
        while(i < words.length && currLen + words[i].length() <= maxWidth) {
            currLine.add(words[i]) ;
            currLen += words[i].length() + 1;
            i++ ;
        }
        return currLine ;
    }

    private String writeLine(List<String> line, int i, String[] words, int maxWidth) {
        int baseLen = -1 ;
        for(String word: line) {
            baseLen += word.length() + 1 ;
        }

        int extSpace = maxWidth - baseLen ;

        if(line.size() == 1 || i == words.length) {
            return String.join(" ", line) + " ".repeat(extSpace);
        }

        int numWords = line.size() - 1 ;
        int spacePerWord = extSpace / numWords ;
        int reqSpace = extSpace % numWords;

        for(int j = 0; j < reqSpace; j++) {
            line.set(j, line.get(j) + " ");
        }

        for(int j = 0; j < numWords; j++) {
            line.set(j, line.get(j) + " ".repeat(spacePerWord));
        }
        return String.join(" ", line);
    }
}