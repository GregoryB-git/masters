package R4;

import j4.d;
import j4.e;

public final class c
  implements k4.a
{
  public static final k4.a a = new c();
  
  public void a(k4.b paramb)
  {
    paramb.a(q.class, d.a);
    paramb.a(t.class, e.a);
    paramb.a(f.class, c.a);
    paramb.a(b.class, b.a);
    paramb.a(a.class, a.a);
  }
  
  public static final class a
    implements d
  {
    public static final a a = new a();
    public static final j4.c b = j4.c.d("packageName");
    public static final j4.c c = j4.c.d("versionName");
    public static final j4.c d = j4.c.d("appBuildVersion");
    public static final j4.c e = j4.c.d("deviceManufacturer");
    
    public void b(a parama, e parame)
    {
      parame.g(b, parama.c());
      parame.g(c, parama.d());
      parame.g(d, parama.a());
      parame.g(e, parama.b());
    }
  }
  
  public static final class b
    implements d
  {
    public static final b a = new b();
    public static final j4.c b = j4.c.d("appId");
    public static final j4.c c = j4.c.d("deviceModel");
    public static final j4.c d = j4.c.d("sessionSdkVersion");
    public static final j4.c e = j4.c.d("osVersion");
    public static final j4.c f = j4.c.d("logEnvironment");
    public static final j4.c g = j4.c.d("androidAppInfo");
    
    public void b(b paramb, e parame)
    {
      parame.g(b, paramb.b());
      parame.g(c, paramb.c());
      parame.g(d, paramb.f());
      parame.g(e, paramb.e());
      parame.g(f, paramb.d());
      parame.g(g, paramb.a());
    }
  }
  
  public static final class c
    implements d
  {
    public static final c a = new c();
    public static final j4.c b = j4.c.d("performance");
    public static final j4.c c = j4.c.d("crashlytics");
    public static final j4.c d = j4.c.d("sessionSamplingRate");
    
    public void b(f paramf, e parame)
    {
      parame.g(b, paramf.b());
      parame.g(c, paramf.a());
      parame.a(d, paramf.c());
    }
  }
  
  public static final class d
    implements d
  {
    public static final d a = new d();
    public static final j4.c b = j4.c.d("eventType");
    public static final j4.c c = j4.c.d("sessionData");
    public static final j4.c d = j4.c.d("applicationInfo");
    
    public void b(q paramq, e parame)
    {
      parame.g(b, paramq.b());
      parame.g(c, paramq.c());
      parame.g(d, paramq.a());
    }
  }
  
  public static final class e
    implements d
  {
    public static final e a = new e();
    public static final j4.c b = j4.c.d("sessionId");
    public static final j4.c c = j4.c.d("firstSessionId");
    public static final j4.c d = j4.c.d("sessionIndex");
    public static final j4.c e = j4.c.d("eventTimestampUs");
    public static final j4.c f = j4.c.d("dataCollectionStatus");
    public static final j4.c g = j4.c.d("firebaseInstallationId");
    
    public void b(t paramt, e parame)
    {
      parame.g(b, paramt.e());
      parame.g(c, paramt.d());
      parame.c(d, paramt.f());
      parame.b(e, paramt.b());
      parame.g(f, paramt.a());
      parame.g(g, paramt.c());
    }
  }
}

/* Location:
 * Qualified Name:     R4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */