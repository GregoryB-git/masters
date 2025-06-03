package ba;

import b9.c;

public enum a$b
  implements c
{
  public final int a;
  
  static
  {
    b localb1 = new b("UNKNOWN", 0, 0);
    b localb2 = new b("DATA_MESSAGE", 1, 1);
    b = localb2;
    b localb3 = new b("TOPIC", 2, 2);
    b localb4 = new b("DISPLAY_NOTIFICATION", 3, 3);
    c = localb4;
    d = new b[] { localb1, localb2, localb3, localb4 };
  }
  
  public a$b(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ba.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */