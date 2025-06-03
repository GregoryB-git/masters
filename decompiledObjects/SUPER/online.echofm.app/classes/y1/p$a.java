package y1;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class p$a
{
  public final void a(Application paramApplication, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramApplication, "application");
    s.c.f(paramApplication, paramString);
  }
  
  public final void b() {}
  
  public final void c()
  {
    d.g(null);
  }
  
  public final String d(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    return s.c.i(paramContext);
  }
  
  public final p.b e()
  {
    return s.c.j();
  }
  
  public final String f()
  {
    return d.c();
  }
  
  public final void g(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    s.c.m(paramContext, paramString);
  }
  
  public final p h(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    return new p(paramContext, null, null, null);
  }
  
  public final void i()
  {
    s.c.s();
  }
  
  public final void j(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    L.n(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10);
  }
  
  public final void k(String paramString)
  {
    d.g(paramString);
  }
}

/* Location:
 * Qualified Name:     y1.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */