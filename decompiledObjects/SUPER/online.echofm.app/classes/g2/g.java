package g2;

public abstract class g
{
  public static g a()
  {
    return new b(a.q, -1L);
  }
  
  public static g d()
  {
    return new b(a.r, -1L);
  }
  
  public static g e(long paramLong)
  {
    return new b(a.o, paramLong);
  }
  
  public static g f()
  {
    return new b(a.p, -1L);
  }
  
  public abstract long b();
  
  public abstract a c();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("OK", 0);
      o = locala1;
      a locala2 = new a("TRANSIENT_ERROR", 1);
      p = locala2;
      a locala3 = new a("FATAL_ERROR", 2);
      q = locala3;
      a locala4 = new a("INVALID_PAYLOAD", 3);
      r = locala4;
      s = new a[] { locala1, locala2, locala3, locala4 };
    }
  }
}

/* Location:
 * Qualified Name:     g2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */