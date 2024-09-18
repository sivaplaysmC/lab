public class StrBuf {
  public static void main(String[] args) {
    StringBuffer sbuf = new StringBuffer("Rajalakshmi");
    sbuf.append(" College, Kanchipuram");
    sbuf.insert(1, "Engineering");
    int idx = sbuf.indexOf("Kanchipuram");
    sbuf.replace(idx, idx + 11, "Chennai");
    sbuf.delete(idx, idx + 7);

    System.out.println(sbuf.reverse().toString());

  }
}
