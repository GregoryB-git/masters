package ka;

import ma.a0.a;

public enum z$c$b
  implements a0.a
{
  public final int a;
  
  static
  {
    b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
    b = localb1;
    b localb2 = new b("AND", 1, 1);
    c = localb2;
    b localb3 = new b("OR", 2, 2);
    d = localb3;
    b localb4 = new b("UNRECOGNIZED", 3, -1);
    e = localb4;
    f = new b[] { localb1, localb2, localb3, localb4 };
  }
  
  public z$c$b(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    if (this != e) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ka.z.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */