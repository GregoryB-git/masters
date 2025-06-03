package e5;

import android.text.TextUtils;
import c4.e;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import c4.v;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q5.f;
import v3.a1;
import v3.i0.a;
import v5.c0;
import v5.u;

public final class p
  implements c4.h
{
  public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
  public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
  public final String a;
  public final c0 b;
  public final u c;
  public j d;
  public byte[] e;
  public int f;
  
  public p(String paramString, c0 paramc0)
  {
    a = paramString;
    b = paramc0;
    c = new u();
    e = new byte['Ѐ'];
  }
  
  public final v a(long paramLong)
  {
    v localv = d.r(0, 3);
    i0.a locala = new i0.a();
    k = "text/vtt";
    c = a;
    o = paramLong;
    localv.d(locala.a());
    d.m();
    return localv;
  }
  
  public final void b(j paramj)
  {
    d = paramj;
    paramj.t(new t.b(-9223372036854775807L));
  }
  
  public final int d(i parami, s params)
  {
    d.getClass();
    int i = (int)parami.getLength();
    int j = f;
    params = e;
    if (j == params.length)
    {
      if (i != -1) {
        j = i;
      } else {
        j = params.length;
      }
      e = Arrays.copyOf(params, j * 3 / 2);
    }
    params = e;
    j = f;
    j = parami.read(params, j, params.length - j);
    if (j != -1)
    {
      j = f + j;
      f = j;
      if ((i == -1) || (j != i)) {
        return 0;
      }
    }
    u localu = new u(e);
    q5.h.d(localu);
    parami = localu.g();
    long l1 = 0L;
    long l2 = l1;
    Object localObject;
    for (;;)
    {
      boolean bool = TextUtils.isEmpty(parami);
      params = null;
      if (bool) {
        break;
      }
      if (parami.startsWith("X-TIMESTAMP-MAP"))
      {
        localObject = g.matcher(parami);
        if (((Matcher)localObject).find())
        {
          params = h.matcher(parami);
          if (params.find())
          {
            parami = ((Matcher)localObject).group(1);
            parami.getClass();
            l2 = q5.h.c(parami);
            parami = params.group(1);
            parami.getClass();
            l1 = Long.parseLong(parami) * 1000000L / 90000L;
          }
          else
          {
            params = new StringBuilder();
            params.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
            params.append(parami);
            throw a1.a(params.toString(), null);
          }
        }
        else
        {
          params = new StringBuilder();
          params.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
          params.append(parami);
          throw a1.a(params.toString(), null);
        }
      }
      parami = localu.g();
    }
    do
    {
      localObject = localu.g();
      parami = params;
      if (localObject == null) {
        break;
      }
      if (q5.h.a.matcher((CharSequence)localObject).matches()) {
        for (;;)
        {
          parami = localu.g();
          if ((parami == null) || (parami.isEmpty())) {
            break;
          }
        }
      }
      parami = f.a.matcher((CharSequence)localObject);
    } while (!parami.matches());
    if (parami == null)
    {
      a(0L);
    }
    else
    {
      parami = parami.group(1);
      parami.getClass();
      long l3 = q5.h.c(parami);
      l2 = b.b((l1 + l3 - l2) * 90000L / 1000000L % 8589934592L);
      parami = a(l2 - l3);
      c.E(e, f);
      params = c;
      parami.b(f, params);
      parami.c(l2, 1, f, 0, null);
    }
    return -1;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    throw new IllegalStateException();
  }
  
  public final boolean i(i parami)
  {
    byte[] arrayOfByte = e;
    parami = (e)parami;
    parami.c(arrayOfByte, 0, 6, false);
    c.E(e, 6);
    if (q5.h.a(c)) {
      return true;
    }
    parami.c(e, 6, 3, false);
    c.E(e, 9);
    return q5.h.a(c);
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     e5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */