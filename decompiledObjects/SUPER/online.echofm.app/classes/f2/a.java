package f2;

import i2.f;
import j4.c.b;

public final class a
  implements k4.a
{
  public static final k4.a a = new a();
  
  public void a(k4.b paramb)
  {
    paramb.a(m.class, e.a);
    paramb.a(i2.a.class, a.a);
    paramb.a(f.class, g.a);
    paramb.a(i2.d.class, d.a);
    paramb.a(i2.c.class, c.a);
    paramb.a(i2.b.class, b.a);
    paramb.a(i2.e.class, f.a);
  }
  
  public static final class a
    implements j4.d
  {
    public static final a a = new a();
    public static final j4.c b = j4.c.a("window").b(m4.a.b().c(1).a()).a();
    public static final j4.c c = j4.c.a("logSourceMetrics").b(m4.a.b().c(2).a()).a();
    public static final j4.c d = j4.c.a("globalMetrics").b(m4.a.b().c(3).a()).a();
    public static final j4.c e = j4.c.a("appNamespace").b(m4.a.b().c(4).a()).a();
    
    public void b(i2.a parama, j4.e parame)
    {
      parame.g(b, parama.d());
      parame.g(c, parama.c());
      parame.g(d, parama.b());
      parame.g(e, parama.a());
    }
  }
  
  public static final class b
    implements j4.d
  {
    public static final b a = new b();
    public static final j4.c b = j4.c.a("storageMetrics").b(m4.a.b().c(1).a()).a();
    
    public void b(i2.b paramb, j4.e parame)
    {
      parame.g(b, paramb.a());
    }
  }
  
  public static final class c
    implements j4.d
  {
    public static final c a = new c();
    public static final j4.c b = j4.c.a("eventsDroppedCount").b(m4.a.b().c(1).a()).a();
    public static final j4.c c = j4.c.a("reason").b(m4.a.b().c(3).a()).a();
    
    public void b(i2.c paramc, j4.e parame)
    {
      parame.b(b, paramc.a());
      parame.g(c, paramc.b());
    }
  }
  
  public static final class d
    implements j4.d
  {
    public static final d a = new d();
    public static final j4.c b = j4.c.a("logSource").b(m4.a.b().c(1).a()).a();
    public static final j4.c c = j4.c.a("logEventDropped").b(m4.a.b().c(2).a()).a();
    
    public void b(i2.d paramd, j4.e parame)
    {
      parame.g(b, paramd.b());
      parame.g(c, paramd.a());
    }
  }
  
  public static final class e
    implements j4.d
  {
    public static final e a = new e();
    public static final j4.c b = j4.c.d("clientMetrics");
    
    public void b(m paramm, j4.e parame)
    {
      throw null;
    }
  }
  
  public static final class f
    implements j4.d
  {
    public static final f a = new f();
    public static final j4.c b = j4.c.a("currentCacheSizeBytes").b(m4.a.b().c(1).a()).a();
    public static final j4.c c = j4.c.a("maxCacheSizeBytes").b(m4.a.b().c(2).a()).a();
    
    public void b(i2.e parame, j4.e parame1)
    {
      parame1.b(b, parame.a());
      parame1.b(c, parame.b());
    }
  }
  
  public static final class g
    implements j4.d
  {
    public static final g a = new g();
    public static final j4.c b = j4.c.a("startMs").b(m4.a.b().c(1).a()).a();
    public static final j4.c c = j4.c.a("endMs").b(m4.a.b().c(2).a()).a();
    
    public void b(f paramf, j4.e parame)
    {
      parame.b(b, paramf.b());
      parame.b(c, paramf.a());
    }
  }
}

/* Location:
 * Qualified Name:     f2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */