package x1;

public final class X$a
{
  public boolean a;
  public String b;
  public Boolean c;
  public long d;
  
  public X$a(boolean paramBoolean, String paramString)
  {
    a = paramBoolean;
    b = paramString;
  }
  
  public final boolean a()
  {
    return a;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final long c()
  {
    return d;
  }
  
  public final Boolean d()
  {
    return c;
  }
  
  public final boolean e()
  {
    Boolean localBoolean = c;
    boolean bool;
    if (localBoolean == null) {
      bool = a;
    } else {
      bool = localBoolean.booleanValue();
    }
    return bool;
  }
  
  public final void f(long paramLong)
  {
    d = paramLong;
  }
  
  public final void g(Boolean paramBoolean)
  {
    c = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     x1.X.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */