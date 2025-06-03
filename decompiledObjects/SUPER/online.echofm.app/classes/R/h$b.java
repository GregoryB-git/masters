package R;

public enum h$b
{
  public final int o;
  
  static
  {
    b localb1 = new b("BOOLEAN", 0, 1);
    p = localb1;
    b localb2 = new b("FLOAT", 1, 2);
    q = localb2;
    b localb3 = new b("INTEGER", 2, 3);
    r = localb3;
    b localb4 = new b("LONG", 3, 4);
    s = localb4;
    b localb5 = new b("STRING", 4, 5);
    t = localb5;
    b localb6 = new b("STRING_SET", 5, 6);
    u = localb6;
    b localb7 = new b("DOUBLE", 6, 7);
    v = localb7;
    b localb8 = new b("VALUE_NOT_SET", 7, 0);
    w = localb8;
    x = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8 };
  }
  
  public h$b(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static b c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 7: 
      return v;
    case 6: 
      return u;
    case 5: 
      return t;
    case 4: 
      return s;
    case 3: 
      return r;
    case 2: 
      return q;
    case 1: 
      return p;
    }
    return w;
  }
}

/* Location:
 * Qualified Name:     R.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */