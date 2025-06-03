package y4;

import m4.c;

public enum a$c
  implements c
{
  public final int o;
  
  static
  {
    c localc1 = new c("UNKNOWN", 0, 0);
    p = localc1;
    c localc2 = new c("DATA_MESSAGE", 1, 1);
    q = localc2;
    c localc3 = new c("TOPIC", 2, 2);
    r = localc3;
    c localc4 = new c("DISPLAY_NOTIFICATION", 3, 3);
    s = localc4;
    t = new c[] { localc1, localc2, localc3, localc4 };
  }
  
  public a$c(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int g()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     y4.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */