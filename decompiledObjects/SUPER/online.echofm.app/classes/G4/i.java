package G4;

import H4.e;
import L4.k;
import M4.l;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class i
{
  public static final F4.a f = ;
  public final j a;
  public final l b;
  public final Map c = new ConcurrentHashMap();
  public boolean d = false;
  public boolean e = false;
  
  public i(String paramString1, String paramString2, k paramk, l paraml)
  {
    b = paraml;
    paramString2 = j.h(paramk).C(paramString1).q(paramString2);
    a = paramString2;
    paramString2.t();
    if (!C4.a.g().L())
    {
      f.g("HttpMetric feature is disabled. URL %s", new Object[] { paramString1 });
      e = true;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (!d)
    {
      if ((!c.containsKey(paramString1)) && (c.size() >= 5)) {
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[] { Integer.valueOf(5) }));
      }
      e.d(paramString1, paramString2);
      return;
    }
    throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
  }
  
  public void b(String paramString1, String paramString2)
  {
    int i = 1;
    String str1 = paramString1;
    String str2 = paramString2;
    try
    {
      paramString1 = paramString1.trim();
      str1 = paramString1;
      str2 = paramString2;
      paramString2 = paramString2.trim();
      str1 = paramString1;
      str2 = paramString2;
      a(paramString1, paramString2);
      str1 = paramString1;
      str2 = paramString2;
      f.b("Setting attribute '%s' to %s on network request '%s'", new Object[] { paramString1, paramString2, a.k() });
    }
    catch (Exception paramString1)
    {
      f.d("Cannot set attribute '%s' with value '%s' (%s)", new Object[] { str1, str2, paramString1.getMessage() });
      i = 0;
      paramString2 = str2;
      paramString1 = str1;
    }
    if (i != 0) {
      c.put(paramString1, paramString2);
    }
  }
  
  public void c(int paramInt)
  {
    a.r(paramInt);
  }
  
  public void d(long paramLong)
  {
    a.v(paramLong);
  }
  
  public void e(String paramString)
  {
    a.x(paramString);
  }
  
  public void f(long paramLong)
  {
    a.y(paramLong);
  }
  
  public void g()
  {
    b.g();
    a.w(b.e());
  }
  
  public void h()
  {
    if (e) {
      return;
    }
    a.A(b.c()).p(c).g();
    d = true;
  }
}

/* Location:
 * Qualified Name:     G4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */