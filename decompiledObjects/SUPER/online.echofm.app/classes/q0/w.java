package q0;

import F0.L;
import F0.M.b;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import android.text.TextUtils;
import c1.t.a;
import c1.v;
import d0.A;
import d0.q.b;
import g0.E;
import g0.a;
import g0.z;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.h;

public final class w
  implements r
{
  public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
  public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
  public final String a;
  public final E b;
  public final z c;
  public final t.a d;
  public final boolean e;
  public t f;
  public byte[] g;
  public int h;
  
  public w(String paramString, E paramE, t.a parama, boolean paramBoolean)
  {
    a = paramString;
    b = paramE;
    c = new z();
    g = new byte['Ѐ'];
    d = parama;
    e = paramBoolean;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    throw new IllegalStateException();
  }
  
  public void b(t paramt)
  {
    Object localObject;
    if (e) {
      localObject = new v(paramt, d);
    } else {
      localObject = paramt;
    }
    f = ((t)localObject);
    paramt.e(new M.b(-9223372036854775807L));
  }
  
  public final T c(long paramLong)
  {
    T localT = f.a(0, 3);
    localT.d(new q.b().o0("text/vtt").e0(a).s0(paramLong).K());
    f.j();
    return localT;
  }
  
  public boolean e(s params)
  {
    params.l(g, 0, 6, false);
    c.R(g, 6);
    if (h.b(c)) {
      return true;
    }
    params.l(g, 6, 3, false);
    c.R(g, 9);
    return h.b(c);
  }
  
  public final void f()
  {
    Object localObject1 = new z(g);
    h.e((z)localObject1);
    Object localObject2 = ((z)localObject1).r();
    long l1 = 0L;
    long l2 = l1;
    while (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      if (((String)localObject2).startsWith("X-TIMESTAMP-MAP"))
      {
        Matcher localMatcher1 = i.matcher((CharSequence)localObject2);
        if (localMatcher1.find())
        {
          Matcher localMatcher2 = j.matcher((CharSequence)localObject2);
          if (localMatcher2.find())
          {
            l2 = h.d((String)a.e(localMatcher1.group(1)));
            l1 = E.h(Long.parseLong((String)a.e(localMatcher2.group(1))));
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
            ((StringBuilder)localObject1).append((String)localObject2);
            throw A.a(((StringBuilder)localObject1).toString(), null);
          }
        }
        else
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
          ((StringBuilder)localObject1).append((String)localObject2);
          throw A.a(((StringBuilder)localObject1).toString(), null);
        }
      }
      localObject2 = ((z)localObject1).r();
    }
    localObject2 = h.a((z)localObject1);
    if (localObject2 == null)
    {
      c(0L);
      return;
    }
    long l3 = h.d((String)a.e(((Matcher)localObject2).group(1)));
    l2 = b.b(E.l(l1 + l3 - l2));
    localObject2 = c(l2 - l3);
    c.R(g, h);
    ((T)localObject2).e(c, h);
    ((T)localObject2).b(l2, 1, h, 0, null);
  }
  
  public int i(s params, L paramL)
  {
    a.e(f);
    int k = (int)params.a();
    int m = h;
    paramL = g;
    if (m == paramL.length)
    {
      if (k != -1) {
        m = k;
      } else {
        m = paramL.length;
      }
      g = Arrays.copyOf(paramL, m * 3 / 2);
    }
    paramL = g;
    m = h;
    m = params.read(paramL, m, paramL.length - m);
    if (m != -1)
    {
      m = h + m;
      h = m;
      if ((k == -1) || (m != k)) {
        return 0;
      }
    }
    f();
    return -1;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     q0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */