package lesson_02.lvl2.word;


import java.io.Serializable;

public class Similar implements Serializable {
    private static final long serialVersionUID = 7L;
    private String sTag;
    private String wSimilar;

    public Similar() {
    }

    public Similar(String sTag, String wSimilar) {
        this.sTag = sTag;
        this.wSimilar = wSimilar;
    }

    public String getsTag() {
        return sTag;
    }

    public void setsTag(String sTag) {
        this.sTag = sTag;
    }

    public String getwSimilar() {
        return wSimilar;
    }

    public void setwSimilar(String wSimilar) {
        this.wSimilar = wSimilar;
    }

    @Override
    public String toString() {
        return "Similar{" +
                "\n\t\tsTag='" + sTag + '\'' +
                ", \n\t\twSimilar='" + wSimilar + '\'' +
                '}';
    }
}

