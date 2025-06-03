package q3;

import k3.t;

public abstract class q
{
  public static int a()
  {
    Integer localInteger = t.a();
    if (localInteger != null) {
      return localInteger.intValue();
    }
    return -1;
  }
  
  public static boolean b()
  {
    return "The Android Project".equals(System.getProperty("java.vendor"));
  }
}

/* Location:
 * Qualified Name:     q3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */