package v4;

public abstract class f
{
  public static a a()
  {
    return new b.b().d(0L);
  }
  
  public abstract b b();
  
  public abstract String c();
  
  public abstract long d();
  
  public static abstract class a
  {
    public abstract f a();
    
    public abstract a b(f.b paramb);
    
    public abstract a c(String paramString);
    
    public abstract a d(long paramLong);
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("OK", 0);
      o = localb1;
      b localb2 = new b("BAD_CONFIG", 1);
      p = localb2;
      b localb3 = new b("AUTH_ERROR", 2);
      q = localb3;
      r = new b[] { localb1, localb2, localb3 };
    }
  }
}

/* Location:
 * Qualified Name:     v4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */