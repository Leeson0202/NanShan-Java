package lesson_02.lvl2.word;


import java.io.Serializable;


public class Phrase implements Serializable {
    private static final long serialVersionUID = 5L;
    private String wPhrase;
    private String clearfix;

    public Phrase() {
    }

    public Phrase(String wPhrase, String clearfix) {
        this.wPhrase = wPhrase;
        this.clearfix = clearfix;
    }

    public String getwPhrase() {
        return wPhrase;
    }

    public void setwPhrase(String wPhrase) {
        this.wPhrase = wPhrase;
    }

    public String getClearfix() {
        return clearfix;
    }

    public void setClearfix(String clearfix) {
        this.clearfix = clearfix;
    }

    @Override
    public String toString() {
        return "Phrase{" +
                "\n\t\twPhrase='" + wPhrase + '\'' +
                ", \n\t\tclearfix='" + clearfix + '\'' +
                '}';
    }
}
