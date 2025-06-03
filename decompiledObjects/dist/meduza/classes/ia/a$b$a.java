package ia;

import ma.a0.a;

public enum a$b$a
  implements a0.a
{
  public final int a;
  
  static
  {
    a locala1 = new a("ARRAY_CONFIG_UNSPECIFIED", 0, 0);
    a locala2 = new a("CONTAINS", 1, 1);
    b = locala2;
    a locala3 = new a("UNRECOGNIZED", 2, -1);
    c = locala3;
    d = new a[] { locala1, locala2, locala3 };
  }
  
  public a$b$a(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    if (this != c) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ia.a.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */