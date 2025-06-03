package i2;

import m4.c;

public enum c$b
  implements c
{
  public final int o;
  
  static
  {
    b localb1 = new b("REASON_UNKNOWN", 0, 0);
    p = localb1;
    b localb2 = new b("MESSAGE_TOO_OLD", 1, 1);
    q = localb2;
    b localb3 = new b("CACHE_FULL", 2, 2);
    r = localb3;
    b localb4 = new b("PAYLOAD_TOO_BIG", 3, 3);
    s = localb4;
    b localb5 = new b("MAX_RETRIES_REACHED", 4, 4);
    t = localb5;
    b localb6 = new b("INVALID_PAYLOD", 5, 5);
    u = localb6;
    b localb7 = new b("SERVER_ERROR", 6, 6);
    v = localb7;
    w = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7 };
  }
  
  public c$b(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int g()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     i2.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */