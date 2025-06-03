package ka;

import ma.a0.a;

public enum z$d
  implements a0.a
{
  public final int a;
  
  static
  {
    d locald1 = new d("DIRECTION_UNSPECIFIED", 0, 0);
    b = locald1;
    d locald2 = new d("ASCENDING", 1, 1);
    c = locald2;
    d locald3 = new d("DESCENDING", 2, 2);
    d = locald3;
    d locald4 = new d("UNRECOGNIZED", 3, -1);
    e = locald4;
    f = new d[] { locald1, locald2, locald3, locald4 };
  }
  
  public z$d(int paramInt)
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
 * Qualified Name:     ka.z.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */