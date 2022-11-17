package lesson_02.lvl2.word;

import java.io.Serializable;


public class Definition implements Serializable {
    private static final long serialVersionUID = 3L;
    private String defTag;
    private String defDetail;

    public Definition() {
    }

    public Definition(String defTag, String defDetail) {
        this.defTag = defTag;
        this.defDetail = defDetail;
    }

    public String getDefTag() {
        return defTag;
    }

    public void setDefTag(String defTag) {
        this.defTag = defTag;
    }

    public String getDefDetail() {
        return defDetail;
    }

    public void setDefDetail(String defDetail) {
        this.defDetail = defDetail;
    }

    @Override
    public String toString() {
        return "Definition{" +
                "\n\t\tdefTag='" + defTag + '\'' +
                ", \n\t\tdefDetail='" + defDetail + '\'' +
                '}';
    }
}
