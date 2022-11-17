package lesson_02.lvl2.word;


import java.io.Serializable;


public class Clearfix implements Serializable {
    private static final long serialVersionUID = 2L;
    private String clearfix;

    public Clearfix(String clearfix) {
        this.clearfix = clearfix;
    }

    public Clearfix() {
    }

    public String getClearfix() {
        return clearfix;
    }

    public void setClearfix(String clearfix) {
        this.clearfix = clearfix;
    }

    @Override
    public String toString() {
        return "Clearfix{" +
                "\n\t\tclearfix='" + clearfix + '\'' +
                '}';
    }
}
