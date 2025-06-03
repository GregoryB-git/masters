package ka;

import ma.a0.a;

public enum z$e$b
  implements a0.a
{
  public final int a;
  
  static
  {
    b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
    b = localb1;
    b localb2 = new b("LESS_THAN", 1, 1);
    c = localb2;
    b localb3 = new b("LESS_THAN_OR_EQUAL", 2, 2);
    d = localb3;
    b localb4 = new b("GREATER_THAN", 3, 3);
    e = localb4;
    b localb5 = new b("GREATER_THAN_OR_EQUAL", 4, 4);
    f = localb5;
    b localb6 = new b("EQUAL", 5, 5);
    o = localb6;
    b localb7 = new b("NOT_EQUAL", 6, 6);
    p = localb7;
    b localb8 = new b("ARRAY_CONTAINS", 7, 7);
    q = localb8;
    b localb9 = new b("IN", 8, 8);
    r = localb9;
    b localb10 = new b("ARRAY_CONTAINS_ANY", 9, 9);
    s = localb10;
    b localb11 = new b("NOT_IN", 10, 10);
    t = localb11;
    b localb12 = new b("UNRECOGNIZED", 11, -1);
    u = localb12;
    v = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10, localb11, localb12 };
  }
  
  public z$e$b(int paramInt)
  {
    a = paramInt;
  }
  
  public static b f(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 10: 
      return t;
    case 9: 
      return s;
    case 8: 
      return r;
    case 7: 
      return q;
    case 6: 
      return p;
    case 5: 
      return o;
    case 4: 
      return f;
    case 3: 
      return e;
    case 2: 
      return d;
    case 1: 
      return c;
    }
    return b;
  }
  
  public final int a()
  {
    if (this != u) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ka.z.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */