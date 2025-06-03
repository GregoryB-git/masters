package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;

final class nj
  implements fy, mo, nx, uo<ml>, us
{
  private static final bw a = bw.a("icy", "application/x-icy", Long.MAX_VALUE);
  private int A;
  private boolean B;
  private boolean C;
  private boolean D;
  private int E;
  private long F;
  private long G;
  private long H;
  private long I;
  private boolean J;
  private int K;
  private boolean L;
  private boolean M;
  private final Uri b;
  private final tt c;
  private final fj<?> d;
  private final un e;
  private final mu f;
  private final nn g;
  private final tk h;
  private final String i;
  private final long j;
  private final um k;
  private final nk l;
  private final vv m;
  private final Runnable n;
  private final Runnable o;
  private final Handler p;
  private mr q;
  private ge r;
  private kl s;
  private nv[] t;
  private mh[] u;
  private no[] v;
  private boolean w;
  private boolean x;
  private nm y;
  private boolean z;
  
  public nj(Uri paramUri, tt paramtt, fw[] paramArrayOffw, fj<?> paramfj, un paramun, mu parammu, nn paramnn, tk paramtk, String paramString, int paramInt)
  {
    b = paramUri;
    c = paramtt;
    d = paramfj;
    e = paramun;
    f = parammu;
    g = paramnn;
    h = paramtk;
    i = paramString;
    j = paramInt;
    k = new um("Loader:ProgressiveMediaPeriod");
    l = new nk(paramArrayOffw);
    m = new vv();
    n = new ni(this);
    o = new nl(this);
    p = new Handler();
    v = new no[0];
    t = new nv[0];
    u = new mh[0];
    I = -9223372036854775807L;
    G = -1L;
    F = -9223372036854775807L;
    A = 1;
    parammu.a();
  }
  
  private final gi a(no paramno)
  {
    int i1 = t.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (paramno.equals(v[i2])) {
        return t[i2];
      }
    }
    nv localnv = new nv(h);
    localnv.a(this);
    no[] arrayOfno = v;
    i2 = i1 + 1;
    arrayOfno = (no[])Arrays.copyOf(arrayOfno, i2);
    arrayOfno[i1] = paramno;
    v = ((no[])wl.a(arrayOfno));
    paramno = (nv[])Arrays.copyOf(t, i2);
    paramno[i1] = localnv;
    t = ((nv[])wl.a(paramno));
    paramno = (mh[])Arrays.copyOf(u, i2);
    paramno[i1] = new mh(t[i1], d);
    u = ((mh[])wl.a(paramno));
    return localnv;
  }
  
  private final void a(ml paramml)
  {
    if (G == -1L) {
      G = ml.d(paramml);
    }
  }
  
  private final void c(int paramInt)
  {
    Object localObject = o();
    boolean[] arrayOfBoolean = e;
    if (arrayOfBoolean[paramInt] == 0)
    {
      localObject = b.a(paramInt).a(0);
      f.a(vs.g(i), (bw)localObject, 0, null, H);
      arrayOfBoolean[paramInt] = true;
    }
  }
  
  private final void d(int paramInt)
  {
    Object localObject = oc;
    if ((J) && (localObject[paramInt] != 0) && (!t[paramInt].d()))
    {
      I = 0L;
      J = false;
      C = true;
      H = 0L;
      K = 0;
      localObject = t;
      int i1 = localObject.length;
      for (paramInt = 0; paramInt < i1; paramInt++) {
        localObject[paramInt].a(false);
      }
      ((mr)rp.a(q)).a(this);
    }
  }
  
  private final void m()
    throws IOException
  {
    k.a(e.a(A));
  }
  
  private final boolean n()
  {
    return (C) || (s());
  }
  
  private final nm o()
  {
    return (nm)rp.a(y);
  }
  
  private final void p()
  {
    ml localml = new ml(this, b, c, l, this, m);
    if (x)
    {
      ge localge = oa;
      rp.c(s());
      l1 = F;
      if ((l1 != -9223372036854775807L) && (I > l1))
      {
        L = true;
        I = -9223372036854775807L;
        return;
      }
      ml.a(localml, aI).a.c, I);
      I = -9223372036854775807L;
    }
    K = q();
    long l1 = k.a(localml, this, e.a(A));
    f.a(ml.a(localml), 1, -1, null, 0, null, ml.c(localml), F, l1);
  }
  
  private final int q()
  {
    nv[] arrayOfnv = t;
    int i1 = arrayOfnv.length;
    int i2 = 0;
    int i3 = 0;
    while (i2 < i1)
    {
      i3 += arrayOfnv[i2].c();
      i2++;
    }
    return i3;
  }
  
  private final long r()
  {
    nv[] arrayOfnv = t;
    int i1 = arrayOfnv.length;
    long l1 = Long.MIN_VALUE;
    for (int i2 = 0; i2 < i1; i2++) {
      l1 = Math.max(l1, arrayOfnv[i2].i());
    }
    return l1;
  }
  
  private final boolean s()
  {
    return I != -9223372036854775807L;
  }
  
  public final int a(int paramInt, long paramLong)
  {
    boolean bool = n();
    int i1 = 0;
    if (bool) {
      return 0;
    }
    c(paramInt);
    nv localnv = t[paramInt];
    int i2;
    if ((L) && (paramLong > localnv.i()))
    {
      i2 = localnv.o();
    }
    else
    {
      i2 = localnv.b(paramLong, true, true);
      if (i2 == -1) {
        i2 = i1;
      }
    }
    if (i2 == 0) {
      d(paramInt);
    }
    return i2;
  }
  
  public final int a(int paramInt, by paramby, ez paramez, boolean paramBoolean)
  {
    if (n()) {
      return -3;
    }
    c(paramInt);
    int i1 = u[paramInt].a(paramby, paramez, paramBoolean, L, H);
    if (i1 == -3) {
      d(paramInt);
    }
    return i1;
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    Object localObject = oa;
    if (!((ge)localObject).a()) {
      return 0L;
    }
    localObject = ((ge)localObject).a(paramLong);
    return wl.a(paramLong, paramcn, a.b, b.b);
  }
  
  public final long a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    Object localObject = o();
    of localof = b;
    localObject = d;
    int i1 = E;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i4 < paramArrayOfsy.length; i4++)
    {
      nw localnw = paramArrayOfnw[i4];
      if ((localnw != null) && ((paramArrayOfsy[i4] == null) || (paramArrayOfBoolean1[i4] == 0)))
      {
        i5 = np.a((np)localnw);
        rp.c(localObject[i5]);
        E -= 1;
        localObject[i5] = 0;
        paramArrayOfnw[i4] = null;
      }
    }
    if (B ? i1 == 0 : paramLong != 0L) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    i1 = 0;
    for (int i5 = i4; i1 < paramArrayOfsy.length; i5 = i4)
    {
      i4 = i5;
      if (paramArrayOfnw[i1] == null)
      {
        paramArrayOfBoolean1 = paramArrayOfsy[i1];
        i4 = i5;
        if (paramArrayOfBoolean1 != null)
        {
          boolean bool;
          if (paramArrayOfBoolean1.g() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          if (paramArrayOfBoolean1.b(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          rp.c(bool);
          int i6 = localof.a(paramArrayOfBoolean1.f());
          rp.c(localObject[i6] ^ 0x1);
          E += 1;
          localObject[i6] = 1;
          paramArrayOfnw[i1] = new np(this, i6);
          paramArrayOfBoolean2[i1] = true;
          i4 = i5;
          if (i5 == 0)
          {
            paramArrayOfBoolean1 = t[i6];
            paramArrayOfBoolean1.l();
            if ((paramArrayOfBoolean1.b(paramLong, true, true) == -1) && (paramArrayOfBoolean1.f() != 0)) {
              i4 = 1;
            } else {
              i4 = 0;
            }
          }
        }
      }
      i1++;
    }
    long l1;
    if (E == 0)
    {
      J = false;
      C = false;
      if (k.b())
      {
        paramArrayOfsy = t;
        i1 = paramArrayOfsy.length;
        for (i4 = i3; i4 < i1; i4++) {
          paramArrayOfsy[i4].n();
        }
        k.c();
        l1 = paramLong;
      }
      else
      {
        paramArrayOfsy = t;
        i1 = paramArrayOfsy.length;
        for (i4 = 0;; i4++)
        {
          l1 = paramLong;
          if (i4 >= i1) {
            break;
          }
          paramArrayOfsy[i4].a(false);
        }
      }
    }
    else
    {
      l1 = paramLong;
      if (i5 != 0)
      {
        paramLong = b(paramLong);
        for (i4 = i2;; i4++)
        {
          l1 = paramLong;
          if (i4 >= paramArrayOfnw.length) {
            break;
          }
          if (paramArrayOfnw[i4] != null) {
            paramArrayOfBoolean2[i4] = true;
          }
        }
      }
    }
    B = true;
    return l1;
  }
  
  public final gi a(int paramInt1, int paramInt2)
  {
    return a(new no(paramInt1, false));
  }
  
  public final void a()
  {
    w = true;
    p.post(n);
  }
  
  public final void a(long paramLong) {}
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    if (s()) {
      return;
    }
    boolean[] arrayOfBoolean = od;
    int i1 = t.length;
    for (int i2 = 0; i2 < i1; i2++) {
      t[i2].a(paramLong, paramBoolean, arrayOfBoolean[i2]);
    }
  }
  
  public final void a(ge paramge)
  {
    if (s != null) {
      paramge = new gg(-9223372036854775807L);
    }
    r = paramge;
    p.post(n);
  }
  
  public final void a(mr parammr, long paramLong)
  {
    q = parammr;
    m.a();
    p();
  }
  
  public final boolean a(int paramInt)
  {
    return (!n()) && (u[paramInt].a(L));
  }
  
  public final void a_()
    throws IOException
  {
    m();
    if ((L) && (!x)) {
      throw new ce("Loading finished before preparation is complete.");
    }
  }
  
  public final long b(long paramLong)
  {
    Object localObject1 = o();
    Object localObject2 = a;
    localObject1 = c;
    if (!((ge)localObject2).a()) {
      paramLong = 0L;
    }
    C = false;
    H = paramLong;
    if (s())
    {
      I = paramLong;
      return paramLong;
    }
    int i2;
    int i3;
    if (A != 7)
    {
      int i1 = t.length;
      for (i2 = 0;; i2++)
      {
        i3 = 1;
        int i4 = 1;
        if (i2 >= i1) {
          break;
        }
        localObject2 = t[i2];
        ((nv)localObject2).l();
        if (((nv)localObject2).b(paramLong, true, false) != -1) {
          i3 = i4;
        } else {
          i3 = 0;
        }
        if ((i3 == 0) && ((localObject1[i2] != 0) || (!z)))
        {
          i3 = 0;
          break;
        }
      }
      if (i3 != 0) {
        return paramLong;
      }
    }
    J = false;
    I = paramLong;
    L = false;
    if (k.b())
    {
      k.c();
    }
    else
    {
      localObject2 = t;
      i3 = localObject2.length;
      for (i2 = 0; i2 < i3; i2++) {
        localObject2[i2].a(false);
      }
    }
    return paramLong;
  }
  
  public final of b()
  {
    return ob;
  }
  
  public final void b(int paramInt)
    throws IOException
  {
    u[paramInt].b();
    m();
  }
  
  public final long c()
  {
    if (!D)
    {
      f.c();
      D = true;
    }
    if ((C) && ((L) || (q() > K)))
    {
      C = false;
      return H;
    }
    return -9223372036854775807L;
  }
  
  public final boolean c(long paramLong)
  {
    if ((!L) && (!J) && ((!x) || (E != 0)))
    {
      boolean bool = m.a();
      if (!k.b())
      {
        p();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public final long d()
  {
    boolean[] arrayOfBoolean = oc;
    if (L) {
      return Long.MIN_VALUE;
    }
    if (s()) {
      return I;
    }
    if (z)
    {
      int i1 = t.length;
      int i2 = 0;
      for (l1 = Long.MAX_VALUE;; l1 = l2)
      {
        l2 = l1;
        if (i2 >= i1) {
          break;
        }
        l2 = l1;
        if (arrayOfBoolean[i2] != 0)
        {
          l2 = l1;
          if (!t[i2].j()) {
            l2 = Math.min(l1, t[i2].i());
          }
        }
        i2++;
      }
    }
    long l2 = Long.MAX_VALUE;
    long l1 = l2;
    if (l2 == Long.MAX_VALUE) {
      l1 = r();
    }
    if (l1 == Long.MIN_VALUE) {
      return H;
    }
    return l1;
  }
  
  public final long e()
  {
    if (E == 0) {
      return Long.MIN_VALUE;
    }
    return d();
  }
  
  public final void f()
  {
    if (x)
    {
      Object localObject = t;
      int i1 = localObject.length;
      int i2 = 0;
      for (int i3 = 0; i3 < i1; i3++) {
        localObject[i3].n();
      }
      localObject = u;
      i1 = localObject.length;
      for (i3 = i2; i3 < i1; i3++) {
        localObject[i3].a();
      }
    }
    k.a(this);
    p.removeCallbacksAndMessages(null);
    q = null;
    M = true;
    f.b();
  }
  
  public final void g()
  {
    Object localObject = t;
    int i1 = localObject.length;
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++) {
      localObject[i3].a(false);
    }
    localObject = u;
    i1 = localObject.length;
    for (i3 = i2; i3 < i1; i3++) {
      localObject[i3].a();
    }
    l.a();
  }
  
  public final gi h()
  {
    return a(new no(0, true));
  }
  
  public final void i()
  {
    p.post(n);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.nj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */