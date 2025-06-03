package R2;

import A2.n;
import E2.e;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import java.util.Random;

public final class p2
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  
  public p2(l2 paraml2, String paramString, long paramLong)
  {
    n.e(paramString);
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    n.a(bool);
    paraml2 = new StringBuilder();
    paraml2.append(paramString);
    paraml2.append(":start");
    a = paraml2.toString();
    paraml2 = new StringBuilder();
    paraml2.append(paramString);
    paraml2.append(":count");
    b = paraml2.toString();
    paraml2 = new StringBuilder();
    paraml2.append(paramString);
    paraml2.append(":value");
    c = paraml2.toString();
    d = paramLong;
  }
  
  public final Pair a()
  {
    e.n();
    e.n();
    long l1 = c();
    if (l1 == 0L)
    {
      d();
      l1 = 0L;
    }
    else
    {
      l1 = Math.abs(l1 - e.b().a());
    }
    long l2 = d;
    if (l1 < l2) {
      return null;
    }
    if (l1 > l2 << 1)
    {
      d();
      return null;
    }
    String str = e.F().getString(c, null);
    l1 = e.F().getLong(b, 0L);
    d();
    if ((str != null) && (l1 > 0L)) {
      return new Pair(str, Long.valueOf(l1));
    }
    return l2.z;
  }
  
  public final void b(String paramString, long paramLong)
  {
    e.n();
    if (c() == 0L) {
      d();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    long l = e.F().getLong(b, 0L);
    if (l <= 0L)
    {
      paramString = e.F().edit();
      paramString.putString(c, str);
      paramString.putLong(b, 1L);
      paramString.apply();
      return;
    }
    paramLong = e.k().U0().nextLong();
    l += 1L;
    int i;
    if ((paramLong & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / l) {
      i = 1;
    } else {
      i = 0;
    }
    paramString = e.F().edit();
    if (i != 0) {
      paramString.putString(c, str);
    }
    paramString.putLong(b, l);
    paramString.apply();
  }
  
  public final long c()
  {
    return e.F().getLong(a, 0L);
  }
  
  public final void d()
  {
    e.n();
    long l = e.b().a();
    SharedPreferences.Editor localEditor = e.F().edit();
    localEditor.remove(b);
    localEditor.remove(c);
    localEditor.putLong(a, l);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     R2.p2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */