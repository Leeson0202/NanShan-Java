package lesson_02.lvl2.word;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Word implements Serializable {
    private static final long serialVersionUID = 1L;
    private String wId;
    private String spell;
    private String tag;
    private String href;
    private short difficult;
    private List<Clearfix> clearfixList;
    private List<Audio> audioList;
    private List<Definition> definitionList;
    private List<Phrase> phraseList;
    private List<Sentence> sentenceList;
    private List<Similar> similarList;

    public Word() {
    }

    public Word(String wId, String spell, String tag, String href, short difficult) {
        this.wId = wId;
        this.spell = spell;
        this.tag = tag;
        this.href = href;
        this.difficult = difficult;
    }

    public Word(String wId, String spell, String tag, String href, short difficult, List<Clearfix> clearfixList, List<Audio> audioList, List<Definition> definitionList, List<Phrase> phraseList, List<Sentence> sentenceList, List<Similar> similarList) {
        this.wId = wId;
        this.spell = spell;
        this.tag = tag;
        this.href = href;
        this.difficult = difficult;
        this.clearfixList = clearfixList;
        this.audioList = audioList;
        this.definitionList = definitionList;
        this.phraseList = phraseList;
        this.sentenceList = sentenceList;
        this.similarList = similarList;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public short getDifficult() {
        return difficult;
    }

    public void setDifficult(short difficult) {
        this.difficult = difficult;
    }

    public List<Clearfix> getClearfixList() {
        return clearfixList;
    }

    public void setClearfixList(List<Clearfix> clearfixList) {
        this.clearfixList = clearfixList;
    }

    public List<Audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(List<Audio> audioList) {
        this.audioList = audioList;
    }

    public List<Definition> getDefinitionList() {
        return definitionList;
    }

    public void setDefinitionList(List<Definition> definitionList) {
        this.definitionList = definitionList;
    }

    public List<Phrase> getPhraseList() {
        return phraseList;
    }

    public void setPhraseList(List<Phrase> phraseList) {
        this.phraseList = phraseList;
    }

    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public List<Similar> getSimilarList() {
        return similarList;
    }

    public void setSimilarList(List<Similar> similarList) {
        this.similarList = similarList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return difficult == word.difficult && Objects.equals(wId, word.wId) && Objects.equals(spell, word.spell) && Objects.equals(tag, word.tag) && Objects.equals(href, word.href) && Objects.equals(clearfixList, word.clearfixList) && Objects.equals(audioList, word.audioList) && Objects.equals(definitionList, word.definitionList) && Objects.equals(phraseList, word.phraseList) && Objects.equals(sentenceList, word.sentenceList) && Objects.equals(similarList, word.similarList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wId, spell, tag, href, difficult, clearfixList, audioList, definitionList, phraseList, sentenceList, similarList);
    }

    @Override
    public String toString() {
        return "Word{" +
                "wId='" + wId + '\'' +
                ", \n\tspell='" + spell + '\'' +
                ", \n\ttag='" + tag + '\'' +
                ", \n\thref='" + href + '\'' +
                ", \n\tdifficult=" + difficult +
                ", \n\tclearfixList=" + clearfixList +
                ", \n\taudioList=" + audioList +
                ", \n\tdefinitionList=" + definitionList +
                ", \n\tphraseList=" + phraseList +
                ", \n\tsentenceList=" + sentenceList +
                ", \n\tsimilarList=" + similarList +
                "\n\t}";
    }
}
