package androidx.media3.exoplayer.dash;

import A0.B;
import B0.m.a;
import B0.m.b;
import B0.m.c;
import X2.w;
import android.os.SystemClock;
import android.util.Pair;
import d0.q;
import d0.z;
import g0.G;
import g0.M;
import i0.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k0.d1;
import k0.y0;
import l0.y1;
import y0.d;
import y0.e;
import y0.f.a;
import y0.l;
import y0.n;

public class c
  implements a
{
  public final B0.o a;
  public final n0.b b;
  public final int[] c;
  public final int d;
  public final i0.g e;
  public final long f;
  public final int g;
  public final d.c h;
  public final b[] i;
  public A0.y j;
  public o0.c k;
  public int l;
  public IOException m;
  public boolean n;
  public long o;
  
  public c(f.a parama, B0.o paramo, o0.c paramc, n0.b paramb, int paramInt1, int[] paramArrayOfInt, A0.y paramy, int paramInt2, i0.g paramg, long paramLong, int paramInt3, boolean paramBoolean, List paramList, d.c paramc1, y1 paramy1, B0.f paramf)
  {
    a = paramo;
    k = paramc;
    b = paramb;
    c = paramArrayOfInt;
    j = paramy;
    d = paramInt2;
    e = paramg;
    l = paramInt1;
    f = paramLong;
    g = paramInt3;
    h = paramc1;
    o = -9223372036854775807L;
    paramLong = paramc.g(paramInt1);
    paramc = n();
    i = new b[paramy.length()];
    for (paramInt1 = 0; paramInt1 < i.length; paramInt1++)
    {
      paramg = (o0.j)paramc.get(paramy.c(paramInt1));
      paramo = paramb.j(c);
      paramArrayOfInt = i;
      if (paramo == null) {
        for (;;)
        {
          paramo = (o0.b)c.get(0);
        }
      }
      paramArrayOfInt[paramInt1] = new b(paramLong, paramg, paramo, parama.c(paramInt2, b, paramBoolean, paramList, paramc1, paramy1), 0L, paramg.l());
    }
  }
  
  public void a()
  {
    IOException localIOException = m;
    if (localIOException == null)
    {
      a.a();
      return;
    }
    throw localIOException;
  }
  
  public boolean b(long paramLong, e parame, List paramList)
  {
    if (m != null) {
      return false;
    }
    return j.q(paramLong, parame, paramList);
  }
  
  public void c(o0.c paramc, int paramInt)
  {
    try
    {
      k = paramc;
      l = paramInt;
      long l1 = paramc.g(paramInt);
      ArrayList localArrayList = n();
      for (paramInt = 0; paramInt < i.length; paramInt++)
      {
        o0.j localj = (o0.j)localArrayList.get(j.c(paramInt));
        paramc = i;
        paramc[paramInt] = paramc[paramInt].b(l1, localj);
      }
      return;
    }
    catch (x0.b paramc)
    {
      m = paramc;
    }
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    for (b localb : i) {
      if (d != null)
      {
        long l1 = localb.h();
        if (l1 != 0L)
        {
          long l2 = localb.j(paramLong);
          long l3 = localb.k(l2);
          if ((l3 < paramLong) && ((l1 == -1L) || (l2 < localb.f() + l1 - 1L))) {
            l1 = localb.k(l2 + 1L);
          } else {
            l1 = l3;
          }
          return paramd1.a(paramLong, l3, l1);
        }
      }
    }
    return paramLong;
  }
  
  public boolean e(e parame, boolean paramBoolean, m.c paramc, B0.m paramm)
  {
    boolean bool = false;
    if (!paramBoolean) {
      return false;
    }
    Object localObject1 = h;
    if ((localObject1 != null) && (((d.c)localObject1).j(parame))) {
      return true;
    }
    if ((!k.d) && ((parame instanceof y0.m)))
    {
      localObject1 = c;
      if (((localObject1 instanceof t)) && (r == 404))
      {
        localObject1 = i[j.a(d)];
        long l1 = ((b)localObject1).h();
        if ((l1 != -1L) && (l1 != 0L))
        {
          long l2 = ((b)localObject1).f();
          if (((y0.m)parame).g() > l2 + l1 - 1L)
          {
            n = true;
            return true;
          }
        }
      }
    }
    int i1 = j.a(d);
    localObject1 = i[i1];
    Object localObject2 = b.j(b.c);
    if ((localObject2 != null) && (!c.equals(localObject2))) {
      return true;
    }
    localObject2 = j(j, b.c);
    if ((!((m.a)localObject2).a(2)) && (!((m.a)localObject2).a(1))) {
      return false;
    }
    paramc = paramm.b((m.a)localObject2, paramc);
    paramBoolean = bool;
    if (paramc != null) {
      if (!((m.a)localObject2).a(a))
      {
        paramBoolean = bool;
      }
      else
      {
        i1 = a;
        if (i1 == 2)
        {
          paramm = j;
          paramBoolean = paramm.p(paramm.a(d), b);
        }
        else
        {
          paramBoolean = bool;
          if (i1 == 1)
          {
            b.e(c, b);
            paramBoolean = true;
          }
        }
      }
    }
    return paramBoolean;
  }
  
  public int f(long paramLong, List paramList)
  {
    if ((m == null) && (j.length() >= 2)) {
      return j.k(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public void g(e parame)
  {
    if ((parame instanceof l))
    {
      localObject = (l)parame;
      int i1 = j.a(d);
      b localb = i[i1];
      if (d == null)
      {
        localObject = ((y0.f)g0.a.h(a)).d();
        if (localObject != null) {
          i[i1] = localb.c(new n0.i((F0.h)localObject, b.d));
        }
      }
    }
    Object localObject = h;
    if (localObject != null) {
      ((d.c)localObject).i(parame);
    }
  }
  
  public void h(y0 paramy0, long paramLong, List paramList, y0.g paramg)
  {
    if (m != null) {
      return;
    }
    long l1 = a;
    long l2 = paramLong - l1;
    long l3 = M.J0(k.a);
    long l4 = M.J0(k.d(l).b);
    paramy0 = h;
    if ((paramy0 != null) && (paramy0.h(l3 + l4 + paramLong))) {
      return;
    }
    l4 = M.J0(M.d0(f));
    l3 = m(l4);
    y0.m localm;
    if (paramList.isEmpty()) {
      localm = null;
    } else {
      localm = (y0.m)paramList.get(paramList.size() - 1);
    }
    int i1 = j.length();
    paramy0 = new n[i1];
    Object localObject;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localb = i[i2];
      if (d == null)
      {
        paramy0[i2] = n.a;
      }
      else
      {
        l5 = localb.e(l4);
        long l6 = localb.g(l4);
        int i4 = i2;
        localObject = paramy0;
        l7 = o(localb, localm, paramLong, l5, l6);
        if (l7 < l5) {
          localObject[i4] = n.a;
        } else {
          localObject[i4] = new c(r(i4), l7, l6, l3);
        }
      }
    }
    long l7 = k(l4, l1);
    j.v(l1, l2, l7, paramList, paramy0);
    i2 = j.o();
    o = SystemClock.elapsedRealtime();
    b localb = r(i2);
    paramy0 = a;
    if (paramy0 != null)
    {
      localObject = b;
      if (paramy0.f() == null) {
        paramy0 = ((o0.j)localObject).n();
      } else {
        paramy0 = null;
      }
      if (d == null) {
        localObject = ((o0.j)localObject).m();
      } else {
        localObject = null;
      }
      if ((paramy0 != null) || (localObject != null))
      {
        a = p(localb, e, j.m(), j.n(), j.s(), paramy0, (o0.i)localObject, null);
        return;
      }
    }
    l1 = b.a(localb);
    paramy0 = k;
    if ((d) && (l == paramy0.e() - 1)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    l2 = -9223372036854775807L;
    int i5;
    if ((i2 != 0) && (l1 == -9223372036854775807L)) {
      i5 = 0;
    } else {
      i5 = 1;
    }
    if (localb.h() == 0L)
    {
      b = i5;
      return;
    }
    l7 = localb.e(l4);
    l4 = localb.g(l4);
    int i6 = i5;
    if (i2 != 0)
    {
      l5 = localb.i(l4);
      if (l5 + (l5 - localb.k(l4)) >= l1) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      i6 = i5 & i2;
    }
    long l5 = o(localb, localm, paramLong, l7, l4);
    if (l5 < l7)
    {
      m = new x0.b();
      return;
    }
    boolean bool = l5 < l4;
    if ((bool) || ((!n) || (bool)))
    {
      if ((i6 != 0) && (localb.k(l5) >= l1))
      {
        b = true;
        return;
      }
      int i3 = (int)Math.min(g, l4 - l5 + 1L);
      i1 = i3;
      if (l1 != -9223372036854775807L) {
        for (;;)
        {
          i1 = i3;
          if (i3 <= 1) {
            break;
          }
          i1 = i3;
          if (localb.k(i3 + l5 - 1L) < l1) {
            break;
          }
          i3--;
        }
      }
      l4 = l2;
      if (paramList.isEmpty()) {
        l4 = paramLong;
      }
      a = q(localb, e, d, j.m(), j.n(), j.s(), l5, i1, l4, l3, null);
      return;
    }
    b = i6;
  }
  
  public void i(A0.y paramy)
  {
    j = paramy;
  }
  
  public final m.a j(A0.y paramy, List paramList)
  {
    long l1 = SystemClock.elapsedRealtime();
    int i1 = paramy.length();
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = i3;
      if (paramy.i(i2, l1)) {
        i4 = i3 + 1;
      }
      i2++;
    }
    int i4 = n0.b.f(paramList);
    return new m.a(i4, i4 - b.g(paramList), i1, i3);
  }
  
  public final long k(long paramLong1, long paramLong2)
  {
    if ((k.d) && (i[0].h() != 0L))
    {
      long l1 = i[0].g(paramLong1);
      l1 = i[0].i(l1);
      return Math.max(0L, Math.min(m(paramLong1), l1) - paramLong2);
    }
    return -9223372036854775807L;
  }
  
  public final Pair l(long paramLong, o0.i parami, b paramb)
  {
    paramLong += 1L;
    if (paramLong >= paramb.h()) {
      return null;
    }
    o0.i locali = paramb.l(paramLong);
    String str = G.a(parami.b(c.a), locali.b(c.a));
    parami = new StringBuilder();
    parami.append(a);
    parami.append("-");
    paramb = parami.toString();
    parami = paramb;
    if (b != -1L)
    {
      parami = new StringBuilder();
      parami.append(paramb);
      parami.append(a + b);
      parami = parami.toString();
    }
    return new Pair(str, parami);
  }
  
  public final long m(long paramLong)
  {
    o0.c localc = k;
    long l1 = a;
    long l2 = -9223372036854775807L;
    if (l1 == -9223372036854775807L) {
      paramLong = l2;
    } else {
      paramLong -= M.J0(l1 + dl).b);
    }
    return paramLong;
  }
  
  public final ArrayList n()
  {
    List localList = k.d(l).c;
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = c;
    int i1 = arrayOfInt.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localArrayList.addAll(getc);
    }
    return localArrayList;
  }
  
  public final long o(b paramb, y0.m paramm, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramm != null) {
      paramLong1 = paramm.g();
    } else {
      paramLong1 = M.q(paramb.j(paramLong1), paramLong2, paramLong3);
    }
    return paramLong1;
  }
  
  public e p(b paramb, i0.g paramg, q paramq, int paramInt, Object paramObject, o0.i parami1, o0.i parami2, B0.g.a parama)
  {
    parama = b;
    if (parami1 != null)
    {
      parami2 = parami1.a(parami2, c.a);
      if (parami2 != null) {
        parami1 = parami2;
      }
    }
    else
    {
      parami1 = (o0.i)g0.a.e(parami2);
    }
    return new l(paramg, n0.h.a(parama, c.a, parami1, 0, w.j()), paramq, paramInt, paramObject, a);
  }
  
  public e q(b paramb, i0.g paramg, int paramInt1, q paramq, int paramInt2, Object paramObject, long paramLong1, int paramInt3, long paramLong2, long paramLong3, B0.g.a parama)
  {
    o0.j localj = b;
    long l1 = paramb.k(paramLong1);
    parama = paramb.l(paramLong1);
    Object localObject = a;
    int i1 = 8;
    if (localObject == null)
    {
      paramLong2 = paramb.i(paramLong1);
      if (paramb.m(paramLong1, paramLong3)) {
        i1 = 0;
      }
      return new y0.o(paramg, n0.h.a(localj, c.a, parama, i1, w.j()), paramq, paramInt2, paramObject, l1, paramLong2, paramLong1, paramInt1, paramq);
    }
    int i2 = 1;
    paramInt1 = 1;
    while (i2 < paramInt3)
    {
      localObject = parama.a(paramb.l(i2 + paramLong1), c.a);
      if (localObject == null) {
        break;
      }
      paramInt1++;
      i2++;
      parama = (B0.g.a)localObject;
    }
    long l2 = paramInt1 + paramLong1 - 1L;
    long l3 = paramb.i(l2);
    long l4 = b.a(paramb);
    if ((l4 == -9223372036854775807L) || (l4 > l3)) {
      l4 = -9223372036854775807L;
    }
    if (paramb.m(l2, paramLong3)) {
      i1 = 0;
    }
    parama = n0.h.a(localj, c.a, parama, i1, w.j());
    l2 = -d;
    paramLong3 = l2;
    if (z.p(n)) {
      paramLong3 = l2 + l1;
    }
    return new y0.j(paramg, parama, paramq, paramInt2, paramObject, l1, l3, paramLong2, l4, paramLong1, paramInt1, paramLong3, a);
  }
  
  public final b r(int paramInt)
  {
    b localb1 = i[paramInt];
    o0.b localb = b.j(b.c);
    b localb2 = localb1;
    if (localb != null)
    {
      localb2 = localb1;
      if (!localb.equals(c))
      {
        localb2 = localb1.d(localb);
        i[paramInt] = localb2;
      }
    }
    return localb2;
  }
  
  public void release()
  {
    b[] arrayOfb = i;
    int i1 = arrayOfb.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      y0.f localf = a;
      if (localf != null) {
        localf.release();
      }
    }
  }
  
  public static final class a
    implements a.a
  {
    public final i0.g.a a;
    public final int b;
    public final f.a c;
    
    public a(i0.g.a parama)
    {
      this(parama, 1);
    }
    
    public a(i0.g.a parama, int paramInt)
    {
      this(d.x, parama, paramInt);
    }
    
    public a(f.a parama, i0.g.a parama1, int paramInt)
    {
      c = parama;
      a = parama1;
      b = paramInt;
    }
    
    public q b(q paramq)
    {
      return c.b(paramq);
    }
    
    public a c(B0.o paramo, o0.c paramc, n0.b paramb, int paramInt1, int[] paramArrayOfInt, A0.y paramy, int paramInt2, long paramLong, boolean paramBoolean, List paramList, d.c paramc1, i0.y paramy1, y1 paramy11, B0.f paramf)
    {
      i0.g localg = a.a();
      if (paramy1 != null) {
        localg.c(paramy1);
      }
      return new c(c, paramo, paramc, paramb, paramInt1, paramArrayOfInt, paramy, paramInt2, localg, paramLong, b, paramBoolean, paramList, paramc1, paramy11, paramf);
    }
    
    public a d(boolean paramBoolean)
    {
      c.a(paramBoolean);
      return this;
    }
  }
  
  public static final class b
  {
    public final y0.f a;
    public final o0.j b;
    public final o0.b c;
    public final n0.g d;
    public final long e;
    public final long f;
    
    public b(long paramLong1, o0.j paramj, o0.b paramb, y0.f paramf, long paramLong2, n0.g paramg)
    {
      e = paramLong1;
      b = paramj;
      c = paramb;
      f = paramLong2;
      a = paramf;
      d = paramg;
    }
    
    public b b(long paramLong, o0.j paramj)
    {
      n0.g localg1 = b.l();
      n0.g localg2 = paramj.l();
      if (localg1 == null) {
        return new b(paramLong, paramj, c, a, f, localg1);
      }
      if (!localg1.g()) {
        return new b(paramLong, paramj, c, a, f, localg2);
      }
      long l1 = localg1.i(paramLong);
      if (l1 == 0L) {
        return new b(paramLong, paramj, c, a, f, localg2);
      }
      g0.a.h(localg2);
      long l2 = localg1.h();
      long l3 = localg1.c(l2);
      l1 += l2;
      long l4 = l1 - 1L;
      long l5 = localg1.c(l4);
      long l6 = localg1.b(l4, paramLong);
      long l7 = localg2.h();
      long l8 = localg2.c(l7);
      l4 = f;
      boolean bool = l5 + l6 < l8;
      if (!bool) {}
      for (;;)
      {
        for (l1 = l4 + (l1 - l7);; l1 = l4 - (localg2.a(l3, paramLong) - l2))
        {
          break label284;
          if (bool) {
            break label306;
          }
          if (l8 >= l3) {
            break;
          }
        }
        l1 = localg1.a(l8, paramLong);
      }
      label284:
      return new b(paramLong, paramj, c, a, l1, localg2);
      label306:
      throw new x0.b();
    }
    
    public b c(n0.g paramg)
    {
      return new b(e, b, c, a, f, paramg);
    }
    
    public b d(o0.b paramb)
    {
      return new b(e, b, paramb, a, f, d);
    }
    
    public long e(long paramLong)
    {
      return ((n0.g)g0.a.h(d)).d(e, paramLong) + f;
    }
    
    public long f()
    {
      return ((n0.g)g0.a.h(d)).h() + f;
    }
    
    public long g(long paramLong)
    {
      return e(paramLong) + ((n0.g)g0.a.h(d)).j(e, paramLong) - 1L;
    }
    
    public long h()
    {
      return ((n0.g)g0.a.h(d)).i(e);
    }
    
    public long i(long paramLong)
    {
      return k(paramLong) + ((n0.g)g0.a.h(d)).b(paramLong - f, e);
    }
    
    public long j(long paramLong)
    {
      return ((n0.g)g0.a.h(d)).a(paramLong, e) + f;
    }
    
    public long k(long paramLong)
    {
      return ((n0.g)g0.a.h(d)).c(paramLong - f);
    }
    
    public o0.i l(long paramLong)
    {
      return ((n0.g)g0.a.h(d)).f(paramLong - f);
    }
    
    public boolean m(long paramLong1, long paramLong2)
    {
      boolean bool1 = ((n0.g)g0.a.h(d)).g();
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      bool1 = bool2;
      if (paramLong2 != -9223372036854775807L) {
        if (i(paramLong1) <= paramLong2) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
  }
  
  public static final class c
    extends y0.b
  {
    public final c.b e;
    public final long f;
    
    public c(c.b paramb, long paramLong1, long paramLong2, long paramLong3)
    {
      super(paramLong2);
      e = paramb;
      f = paramLong3;
    }
    
    public long a()
    {
      c();
      return e.i(d());
    }
    
    public long b()
    {
      c();
      return e.k(d());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */