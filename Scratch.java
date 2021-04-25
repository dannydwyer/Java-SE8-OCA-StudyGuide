public class Scratch{

  public static void main(String[] args) {
    String[] strings = {"stringvalue"};
    Object[] objects = strings;
    String[] string2 = (String[]) objects;
    string2[0] = new StringBuilder().toString();
    objects[0] = new StringBuilder().toString()+-;
  }
}
