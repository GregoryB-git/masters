package D3;

import java.util.ArrayList;
import java.util.List;
import w3.a.a;

public class d
{
  public final r4.a a;
  public volatile F3.a b;
  public volatile G3.b c;
  public final List d;
  
  public d(r4.a parama)
  {
    this(parama, new G3.c(), new F3.f());
  }
  
  public d(r4.a parama, G3.b paramb, F3.a parama1)
  {
    a = parama;
    c = paramb;
    d = new ArrayList();
    b = parama1;
    f();
  }
  
  public static a.a j(w3.a parama, e parame)
  {
    a.a locala = parama.g("clx", parame);
    Object localObject = locala;
    if (locala == null)
    {
      E3.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
      parama = parama.g("crash", parame);
      localObject = parama;
      if (parama != null)
      {
        E3.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        localObject = parama;
      }
    }
    return (a.a)localObject;
  }
  
  public F3.a d()
  {
    return new b(this);
  }
  
  public G3.b e()
  {
    return new a(this);
  }
  
  public final void f()
  {
    a.a(new c(this));
  }
}

/* Location:
 * Qualified Name:     D3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */