public class makeOutWord {
  public String makeOutWord(String out, String word) {
    String result = "";
    result = out.substring(0, 2) + word + out.substring(2, 4);
    return result;
  }
}
