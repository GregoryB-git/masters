package ka;

import ma.a0.a;

public enum b0$b
  implements a0.a
{
  public final int a;
  
  static
  {
    b localb1 = new b("NO_CHANGE", 0, 0);
    b = localb1;
    b localb2 = new b("ADD", 1, 1);
    c = localb2;
    b localb3 = new b("REMOVE", 2, 2);
    d = localb3;
    b localb4 = new b("CURRENT", 3, 3);
    e = localb4;
    b localb5 = new b("RESET", 4, 4);
    f = localb5;
    b localb6 = new b("UNRECOGNIZED", 5, -1);
    o = localb6;
    p = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
  }
  
  public b0$b(int paramInt)
  {
    a = paramInt;
  }
  
  public static b f(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4) {
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
 * Qualified Name:     ka.b0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */