public class day1{
  public static void multigun(int amp) {
    int multi=0;
    for (int i = 1; i <=10 ; i++) {
      multi=amp*i;
      System.out.println(amp+"*"+i+"="+multi);
    }
  }
}