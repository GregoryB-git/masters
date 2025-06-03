package l8;

import p8.e;

public final class f
{
  public static final a c = new a();
  public final e a;
  public d b;
  
  public f(e parame)
  {
    a = parame;
    b = c;
  }
  
  public f(e parame, String paramString)
  {
    this(parame);
    a(paramString);
  }
  
  public final void a(String paramString)
  {
    b.a();
    b = c;
    if (paramString == null) {
      return;
    }
    b = new j(a.b(paramString, "userlog"));
  }
  
  public static final class a
    implements d
  {
    public final void a() {}
    
    public final String b()
    {
      return null;
    }
    
    public final void c(String paramString, long paramLong) {}
  }
}

/* Location:
 * Qualified Name:     l8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */