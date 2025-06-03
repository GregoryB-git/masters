package y1;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.a;

public final class F
{
  public static final a b = new a(null);
  public final s a;
  
  public F(Context paramContext)
  {
    this(new s(paramContext, null, null));
  }
  
  public F(Context paramContext, String paramString)
  {
    this(new s(paramContext, paramString, null));
  }
  
  public F(String paramString1, String paramString2, a parama)
  {
    this(new s(paramString1, paramString2, parama));
  }
  
  public F(s params)
  {
    a = params;
  }
  
  public final void a()
  {
    a.j();
  }
  
  public final void b(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "parameters");
    int i;
    if ((paramBundle.getInt("previous") & 0x2) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) || (B.p())) {
      a.r("fb_sdk_settings_changed", null, paramBundle);
    }
  }
  
  public final void c(String paramString, double paramDouble, Bundle paramBundle)
  {
    if (B.p()) {
      a.n(paramString, paramDouble, paramBundle);
    }
  }
  
  public final void d(String paramString, Bundle paramBundle)
  {
    if (B.p()) {
      a.o(paramString, paramBundle);
    }
  }
  
  public final void e(String paramString1, String paramString2)
  {
    a.q(paramString1, paramString2);
  }
  
  public final void f(String paramString)
  {
    if (B.p()) {
      a.r(paramString, null, null);
    }
  }
  
  public final void g(String paramString, Bundle paramBundle)
  {
    if (B.p()) {
      a.r(paramString, null, paramBundle);
    }
  }
  
  public final void h(String paramString, Double paramDouble, Bundle paramBundle)
  {
    if (B.p()) {
      a.r(paramString, paramDouble, paramBundle);
    }
  }
  
  public final void i(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (B.p()) {
      a.s(paramString, paramBigDecimal, paramCurrency, paramBundle);
    }
  }
  
  public final void j(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (B.p()) {
      a.v(paramBigDecimal, paramCurrency, paramBundle);
    }
  }
  
  public static final class a
  {
    public final F a(String paramString1, String paramString2, a parama)
    {
      Intrinsics.checkNotNullParameter(paramString1, "activityName");
      return new F(paramString1, paramString2, parama);
    }
    
    public final Executor b()
    {
      return s.c.h();
    }
    
    public final p.b c()
    {
      return s.c.j();
    }
    
    public final String d()
    {
      return s.c.l();
    }
    
    public final void e(Map paramMap)
    {
      Intrinsics.checkNotNullParameter(paramMap, "ud");
      L.l(paramMap);
    }
  }
}

/* Location:
 * Qualified Name:     y1.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */