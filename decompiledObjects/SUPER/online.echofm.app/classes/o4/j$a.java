package o4;

public enum j$a
{
  public final int o;
  
  static
  {
    a locala1 = new a("NONE", 0, 0);
    p = locala1;
    a locala2 = new a("SDK", 1, 1);
    q = locala2;
    a locala3 = new a("GLOBAL", 2, 2);
    r = locala3;
    a locala4 = new a("COMBINED", 3, 3);
    s = locala4;
    t = new a[] { locala1, locala2, locala3, locala4 };
  }
  
  public j$a(int paramInt1)
  {
    o = paramInt1;
  }
  
  public int c()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     o4.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */