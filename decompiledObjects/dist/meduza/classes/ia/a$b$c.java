package ia;

import ma.a0.a;

public enum a$b$c
  implements a0.a
{
  public final int a;
  
  static
  {
    c localc1 = new c("ORDER_UNSPECIFIED", 0, 0);
    b = localc1;
    c localc2 = new c("ASCENDING", 1, 1);
    c = localc2;
    c localc3 = new c("DESCENDING", 2, 2);
    d = localc3;
    c localc4 = new c("UNRECOGNIZED", 3, -1);
    e = localc4;
    f = new c[] { localc1, localc2, localc3, localc4 };
  }
  
  public a$b$c(int paramInt)
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
 * Qualified Name:     ia.a.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */