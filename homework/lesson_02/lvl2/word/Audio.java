package lesson_02.lvl2.word;


import java.io.Serializable;


public class Audio implements Serializable {
    private static final long serialVersionUID = 4L;
    private String audioTag;
    private String audioDetail;
    private String audioUrl;

    public Audio() {
    }

    public Audio(String audioTag, String audioDetail, String audioUrl) {
        this.audioTag = audioTag;
        this.audioDetail = audioDetail;
        this.audioUrl = audioUrl;
    }

    public String getAudioTag() {
        return audioTag;
    }

    public void setAudioTag(String audioTag) {
        this.audioTag = audioTag;
    }

    public String getAudioDetail() {
        return audioDetail;
    }

    public void setAudioDetail(String audioDetail) {
        this.audioDetail = audioDetail;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "\n\t\taudioTag='" + audioTag + '\'' +
                ", \n\t\taudioDetail='" + audioDetail + '\'' +
                ", \n\t\taudioUrl='" + audioUrl + '\'' +
                '}';
    }
}
