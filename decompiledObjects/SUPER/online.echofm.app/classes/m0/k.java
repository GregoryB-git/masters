package m0;

public final class k
{
  public static final k d = new b().d();
  public final boolean a;
  public final boolean b;
  public final boolean c;
  
  public k(b paramb)
  {
    a = b.a(paramb);
    b = b.b(paramb);
    c = b.c(paramb);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k.class == paramObject.getClass()))
    {
      paramObject = (k)paramObject;
      if ((a != a) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (a << true) + (b << true) + c;
  }
  
  public static final class b
  {
    public boolean a;
    public boolean b;
    public boolean c;
    
    public k d()
    {
      if ((!a) && ((b) || (c))) {
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
      }
      return new k(this, null);
    }
    
    public b e(boolean paramBoolean)
    {
      a = paramBoolean;
      return this;
    }
    
    public b f(boolean paramBoolean)
    {
      b = paramBoolean;
      return this;
    }
    
    public b g(boolean paramBoolean)
    {
      c = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     m0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */