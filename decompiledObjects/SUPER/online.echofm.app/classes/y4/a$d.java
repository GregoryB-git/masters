package y4;

import m4.c;

public enum a$d
  implements c
{
  public final int o;
  
  static
  {
    d locald1 = new d("UNKNOWN_OS", 0, 0);
    p = locald1;
    d locald2 = new d("ANDROID", 1, 1);
    q = locald2;
    d locald3 = new d("IOS", 2, 2);
    r = locald3;
    d locald4 = new d("WEB", 3, 3);
    s = locald4;
    t = new d[] { locald1, locald2, locald3, locald4 };
  }
  
  public a$d(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int g()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     y4.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */