package y4;

import m4.c;

public enum a$b
  implements c
{
  public final int o;
  
  static
  {
    b localb1 = new b("UNKNOWN_EVENT", 0, 0);
    p = localb1;
    b localb2 = new b("MESSAGE_DELIVERED", 1, 1);
    q = localb2;
    b localb3 = new b("MESSAGE_OPEN", 2, 2);
    r = localb3;
    s = new b[] { localb1, localb2, localb3 };
  }
  
  public a$b(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int g()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     y4.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */