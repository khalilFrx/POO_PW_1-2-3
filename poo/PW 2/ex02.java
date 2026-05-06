class TextAnalyzer {

    String text;

    // constructor
    TextAnalyzer(String t){
        text = t;
    }

    // عدد الحروف
    int countCharacters(){
        return text.length();
    }

    // عدد الكلمات
    int countWords(){
        String[] words = text.split(" ");
        return words.length;
    }

    // تحويل لكابيتال
    String toUpperCaseText(){
        return text.toUpperCase();
    }

    // تحويل لصغير
    String toLowerCaseText(){
        return text.toLowerCase();
    }

    // البحث عن كلمة
    boolean containsWord(String word){
        return text.contains(word);
    }
}


public class TestTextAnalyzer {

    public static void main(String[] args) {

        TextAnalyzer t1 = new TextAnalyzer("java is easy");

        System.out.println("Characters: " + t1.countCharacters());
        System.out.println("Words: " + t1.countWords());

        System.out.println("Upper: " + t1.toUpperCaseText());
        System.out.println("Lower: " + t1.toLowerCaseText());

        System.out.println("Contains 'java': " + t1.containsWord("java"));
    }
}