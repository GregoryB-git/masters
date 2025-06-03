package ma;

public enum a1
  implements a0.a
{
  public final int a;
  
  static
  {
    a1 locala11 = new a1("NULL_VALUE", 0, 0);
    b = locala11;
    a1 locala12 = new a1("UNRECOGNIZED", 1, -1);
    c = locala12;
    d = new a1[] { locala11, locala12 };
  }
  
  public a1(int paramInt)
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
 * Qualified Name:     ma.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */