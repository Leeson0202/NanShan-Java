package lesson_02.lvl2.word;



import java.io.Serializable;


public class Sentence implements Serializable {
    private static final long serialVersionUID = 6L;
    private String wSentence;
    private String clearfix;

    public Sentence() {
    }

    public Sentence(String wSentence, String clearfix) {
        this.wSentence = wSentence;
        this.clearfix = clearfix;
    }

    public String getwSentence() {
        return wSentence;
    }

    public void setwSentence(String wSentence) {
        this.wSentence = wSentence;
    }

    public String getClearfix() {
        return clearfix;
    }

    public void setClearfix(String clearfix) {
        this.clearfix = clearfix;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "\n\t\twSentence='" + wSentence + '\'' +
                ", \n\t\tclearfix='" + clearfix + '\'' +
                '}';
    }
}

