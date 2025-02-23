public class Main {

  public static void main(String[] args) {
System.out.println(sequentialWordsNumbers("Это просто текст, для примера работы программы"));
    System.out.println(sequentialWordsNumbers1("Это просто текст, для примера работы программы"));
    System.out.println(splitTextIntoWords("Это просто текст, для примера работы3 программы."));
  }

  public static String sequentialWordsNumbers(String string) {
    if (string == null || string.isEmpty()) {
      return "";
    }
    StringBuilder builder = new StringBuilder();
    String[] words = string.split(" ");
    for (int i = 0; i < words.length; i++) {
      builder.append("(").append(i + 1).append(") ").append(words[i]).append(" ");
    }
    return builder.toString();
  }

  public static String sequentialWordsNumbers1(String string) {
    if (string == null || string.isEmpty()) {
      return "";
    }
    int counter = 1;
    StringBuilder builder = new StringBuilder();
    builder.append("(").append(counter).append(") ");
    int index = 0;
    while (true) {
      int spaceIndex = string.indexOf(' ', index);
      if (spaceIndex == -1) {
        builder.append(string.substring(index));
        break;
      } else {
        builder.append(string, index, spaceIndex);
        counter++;
        builder.append(" (").append(counter).append(") ");
        index = spaceIndex + 1;
      }
    }

    return builder.toString();
  }


  public static String splitTextIntoWords(String text) {
    if (text == null || text.isEmpty()) {
      return "";
    }
    text = text.replaceAll("-", " ");
    text = text.replaceAll("[\\d\\p{Punct}]", "");
    text = text.replaceAll("\\s+", " ");
    StringBuilder builder = new StringBuilder();
    String[] words = text.split(" ");
    for (int i = 0; i < words.length; i++) {
      builder.append(words[i]);
      if(i< words.length-1){
        builder.append(System.lineSeparator());
      }
    }
    return builder.toString();

  }
}
