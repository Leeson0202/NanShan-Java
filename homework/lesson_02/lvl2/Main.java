package lesson_02.lvl2;

import lesson_02.lvl2.word.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        """[
//             {
//               "spell": "apple",
//               "tag": "高中/CET4/CET6",
//               "href": "http://dict.cn/apple",
//               "audio": [
//                 {
//                   "tag": "英音：",
//                   "tagDetail": "/'æp(ə)l/",
//                   "url": "https://api.frdic.com/api/v2/speech/speakweb?langid=en&voicename=en_uk_male&txt=QYNYXBwbGU%3d"
//                 },
//                 {
//                   "tag": "美音：",
//                   "tagDetail": "/'æpl/",
//                   "url": "https://api.frdic.com/api/v2/speech/speakweb?langid=en&voicename=en_us_female&txt=QYNYXBwbGU%3d"
//                 }
//               ],
//               "clearfix": [
//                 {
//                   "clearfix": "n.苹果"
//                 }
//               ],
//               "deformation": [],
//               "phrase": [
//                 {
//                   "key": "apple of one's eyes",
//                   "value": "最珍贵的东西,最喜欢的人 person or thing is loved more than any other"
//                 }
//               ],
//               "sentences": [
//                 {
//                   "key": "My uncle has an apple orchard.",
//                   "value": "我叔叔拥有一个苹果园。"
//                 },
//                 {
//                   "key": "The apple trees are blossoming.",
//                   "value": "苹果树正在开花。"
//                 },
//                 {
//                   "key": "He regard his new bike as the apple of his eye.",
//                   "value": "他把他的新自行车视为珍宝。"
//                 },
//                 {
//                   "key": "He's a rotten apple.",
//                   "value": "他是一个讨厌的家伙。"
//                 }
//               ],
//               "similars": [
//                 {
//                   "tag": "【近义词】",
//                   "tagList": "ball+malus pumila"
//                 }
//               ],
//               "wId": "PDBOAFPFY3UYDK0CAFHXYDLKRLMR6Z5NGSCRRCW"
//             }
//           ]"""
        // 单词对象
        Word word = new Word("PDBOAFPFY3UYDK0CAFHXYDLKRLMR6Z5NGSCRRCW", "apple", "高中/CET4/CET6", "http://dict.cn/apple", (short) 1);

        // 发音
        List<Audio> audios = new LinkedList<Audio>() {{
            add(new Audio("英音：", "/'æp(ə)l/", "https://api.frdic.com/api/v2/speech/speakweb?langid=en&voicename=en_uk_male&txt=QYNYXBwbGU%3d"));
            add(new Audio("美音：", "/'æpl/", "https://api.frdic.com/api/v2/speech/speakweb?langid=en&voicename=en_us_female&txt=QYNYXBwbGU%3d"));
        }};
        // 词性和翻译
        List<Clearfix> clearfixs = new LinkedList<Clearfix>() {{
            add(new Clearfix("n.苹果"));
        }};
        //
        List<Definition> definitions = new LinkedList<Definition>() {{}};
        // 短语
        List<Phrase> phrases = new LinkedList<Phrase>() {{
            add(new Phrase("apple of one's eyes", "最珍贵的东西,最喜欢的人 person or thing is loved more than any other"));
        }};
        // 例句
        List<Sentence> sentences = new LinkedList<Sentence>() {{
            add(new Sentence("My uncle has an apple orchard.", "我叔叔拥有一个苹果园。"));
            add(new Sentence("The apple trees are blossoming.", "苹果树正在开花。"));
            add(new Sentence("He regard his new bike as the apple of his eye.", "他把他的新自行车视为珍宝。"));
        }};
        // 相似词
        List<Similar> similars = new LinkedList<Similar>() {{
            add(new Similar("【近义词】", "ball+malus pumila"));
        }};
        word.setAudioList(audios);
        word.setClearfixList(clearfixs);
        word.setDefinitionList(definitions);
        word.setPhraseList(phrases);
        word.setSentenceList(sentences);
        word.setSimilarList(similars);
        System.out.println(word);
    }
}
