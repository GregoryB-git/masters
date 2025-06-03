package i2;

public abstract interface b
  extends a
{
  public abstract a a();
  
  public abstract b e();
  
  public static final class a
  {
    public static final a b = new a("NONE");
    public static final a c = new a("FULL");
    public final String a;
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
  
  public static final class b
  {
    public static final b b = new b("FLAT");
    public static final b c = new b("HALF_OPENED");
    public final String a;
    
    public b(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     i2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */