package ka;

import ma.a0.a;

public enum z$j$b
  implements a0.a
{
  public final int a;
  
  static
  {
    b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
    b = localb1;
    b localb2 = new b("IS_NAN", 1, 2);
    c = localb2;
    b localb3 = new b("IS_NULL", 2, 3);
    d = localb3;
    b localb4 = new b("IS_NOT_NAN", 3, 4);
    e = localb4;
    b localb5 = new b("IS_NOT_NULL", 4, 5);
    f = localb5;
    b localb6 = new b("UNRECOGNIZED", 5, -1);
    o = localb6;
    p = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
  }
  
  public z$j$b(int paramInt)
  {
    a = paramInt;
  }
  
  public static b f(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
              return null;
            }
            return f;
          }
          return e;
        }
        return d;
      }
      return c;
    }
    return b;
  }
  
  public final int a()
  {
    if (this != o) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ka.z.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */