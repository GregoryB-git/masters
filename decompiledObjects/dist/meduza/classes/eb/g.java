package eb;

import e9.a;
import x6.b;

public final class g
{
  static
  {
    new a();
  }
  
  public final class a
    extends e<Object, Object>
  {
    public final void a(String paramString, Throwable paramThrowable) {}
    
    public final void b() {}
    
    public final void c(int paramInt) {}
    
    public final void d(Object paramObject) {}
    
    public final void e(e.a<Object> parama, s0 params0) {}
  }
  
  public static final class b
    extends a
  {
    public final a b;
    public final f c;
    
    public b(a parama, f paramf)
    {
      b = parama;
      b.y(paramf, "interceptor");
      c = paramf;
    }
    
    public final String b()
    {
      return b.b();
    }
    
    public final <ReqT, RespT> e<ReqT, RespT> v(t0<ReqT, RespT> paramt0, c paramc)
    {
      return c.a();
    }
  }
}

/* Location:
 * Qualified Name:     eb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */