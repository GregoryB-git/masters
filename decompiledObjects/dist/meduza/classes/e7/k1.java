package e7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m6.j;

public final class k1
{
  public Long A;
  public Long B;
  public long C;
  public String D;
  public int E;
  public int F;
  public long G;
  public String H;
  public byte[] I;
  public int J;
  public long K;
  public long L;
  public long M;
  public long N;
  public long O;
  public long P;
  public String Q;
  public boolean R;
  public long S;
  public long T;
  public final j2 a;
  public final String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public long g;
  public long h;
  public long i;
  public String j;
  public long k;
  public String l;
  public long m;
  public long n;
  public boolean o;
  public boolean p;
  public String q;
  public Boolean r;
  public long s;
  public ArrayList t;
  public String u;
  public boolean v;
  public long w;
  public long x;
  public int y;
  public boolean z;
  
  public k1(j2 paramj2, String paramString)
  {
    j.i(paramj2);
    j.e(paramString);
    a = paramj2;
    b = paramString;
    paramj2.zzl().l();
  }
  
  public final void A(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(e, paramString) ^ true;
    e = paramString;
  }
  
  public final void B(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (n != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    n = paramLong;
  }
  
  public final void C(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (s != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    s = paramLong;
  }
  
  public final void D(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (m != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    m = paramLong;
  }
  
  public final void E(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (G != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    G = paramLong;
  }
  
  public final void F(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (i != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    i = paramLong;
  }
  
  public final void G(long paramLong)
  {
    boolean bool1 = true;
    if (paramLong >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.b(bool2);
    a.zzl().l();
    boolean bool2 = R;
    if (g == paramLong) {
      bool1 = false;
    }
    R = (bool2 | bool1);
    g = paramLong;
  }
  
  public final void H(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (h != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    h = paramLong;
  }
  
  public final void a(long paramLong)
  {
    a.zzl().l();
    long l1 = g + paramLong;
    long l2 = l1;
    if (l1 > 2147483647L)
    {
      a.zzj().r.c("Bundle index overflow. appId", a1.p(b));
      l2 = paramLong - 1L;
    }
    l1 = G + 1L;
    paramLong = l1;
    if (l1 > 2147483647L)
    {
      a.zzj().r.c("Delivery index overflow. appId", a1.p(b));
      paramLong = 0L;
    }
    R = true;
    g = l2;
    G = paramLong;
  }
  
  public final void b(String paramString)
  {
    a.zzl().l();
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    R |= Objects.equals(q, str) ^ true;
    q = str;
  }
  
  public final void c(List<String> paramList)
  {
    a.zzl().l();
    if (!Objects.equals(t, paramList))
    {
      R = true;
      if (paramList != null) {
        paramList = new ArrayList(paramList);
      } else {
        paramList = null;
      }
      t = paramList;
    }
  }
  
  public final String d()
  {
    a.zzl().l();
    return q;
  }
  
  public final String e()
  {
    a.zzl().l();
    String str = Q;
    z(null);
    return str;
  }
  
  public final String f()
  {
    a.zzl().l();
    return b;
  }
  
  public final String g()
  {
    a.zzl().l();
    return c;
  }
  
  public final String h()
  {
    a.zzl().l();
    return j;
  }
  
  public final String i()
  {
    a.zzl().l();
    return f;
  }
  
  public final String j()
  {
    a.zzl().l();
    return d;
  }
  
  public final String k()
  {
    a.zzl().l();
    return D;
  }
  
  public final boolean l()
  {
    a.zzl().l();
    return v;
  }
  
  public final int m()
  {
    a.zzl().l();
    return J;
  }
  
  public final void n(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (k != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    k = paramLong;
  }
  
  public final void o(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(c, paramString) ^ true;
    c = paramString;
  }
  
  public final void p(boolean paramBoolean)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (o != paramBoolean) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    o = paramBoolean;
  }
  
  public final void q(int paramInt)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (F != paramInt) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    F = paramInt;
  }
  
  public final void r(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (C != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    C = paramLong;
  }
  
  public final void s(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(l, paramString) ^ true;
    l = paramString;
  }
  
  public final void t(int paramInt)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (E != paramInt) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    E = paramInt;
  }
  
  public final void u(long paramLong)
  {
    a.zzl().l();
    boolean bool1 = R;
    boolean bool2;
    if (S != paramLong) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    R = (bool1 | bool2);
    S = paramLong;
  }
  
  public final void v(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(j, paramString) ^ true;
    j = paramString;
  }
  
  public final long w()
  {
    a.zzl().l();
    return k;
  }
  
  public final void x(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(f, paramString) ^ true;
    f = paramString;
  }
  
  public final void y(String paramString)
  {
    a.zzl().l();
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    R |= Objects.equals(d, str) ^ true;
    d = str;
  }
  
  public final void z(String paramString)
  {
    a.zzl().l();
    R |= Objects.equals(Q, paramString) ^ true;
    Q = paramString;
  }
}

/* Location:
 * Qualified Name:     e7.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */