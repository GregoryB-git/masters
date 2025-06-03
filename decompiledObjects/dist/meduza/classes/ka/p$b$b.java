package ka;

import ma.a0.a;

public enum p$b$b
  implements a0.a
{
  public final int a;
  
  static
  {
    b localb1 = new b("SERVER_VALUE_UNSPECIFIED", 0, 0);
    b = localb1;
    b localb2 = new b("REQUEST_TIME", 1, 1);
    c = localb2;
    b localb3 = new b("UNRECOGNIZED", 2, -1);
    d = localb3;
    e = new b[] { localb1, localb2, localb3 };
  }
  
  public p$b$b(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    if (this != d) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ka.p.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */