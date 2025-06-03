package g5;

public enum a
{
  public static final a[] t;
  public final int o;
  
  static
  {
    a locala1 = new a("L", 0, 1);
    p = locala1;
    a locala2 = new a("M", 1, 0);
    q = locala2;
    a locala3 = new a("Q", 2, 3);
    r = locala3;
    a locala4 = new a("H", 3, 2);
    s = locala4;
    u = new a[] { locala1, locala2, locala3, locala4 };
    t = new a[] { locala2, locala1, locala4, locala3 };
  }
  
  public a(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int c()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     g5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */