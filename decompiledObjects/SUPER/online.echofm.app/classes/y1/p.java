package y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;
import x1.a;

public final class p
{
  public static final a b = new a(null);
  public static final String c = p.class.getCanonicalName();
  public final s a;
  
  public p(Context paramContext, String paramString, a parama)
  {
    a = new s(paramContext, paramString, parama);
  }
  
  public final void a()
  {
    a.j();
  }
  
  public final String b()
  {
    return a.k();
  }
  
  public final void c(String paramString)
  {
    a.l(paramString);
  }
  
  public final void d(String paramString, double paramDouble)
  {
    a.m(paramString, paramDouble);
  }
  
  public final void e(String paramString, double paramDouble, Bundle paramBundle)
  {
    a.n(paramString, paramDouble, paramBundle);
  }
  
  public final void f(String paramString, Bundle paramBundle)
  {
    a.o(paramString, paramBundle);
  }
  
  public final void g(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    a.t(paramBigDecimal, paramCurrency, paramBundle);
  }
  
  public final void h(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "payload");
    a.w(paramBundle, null);
  }
  
  public final void i(Bundle paramBundle, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "payload");
    a.w(paramBundle, paramString);
  }
  
  public static final class a
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
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     y1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */