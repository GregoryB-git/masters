package q0;

import A0.c;
import B0.g.a;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import d0.J;
import d0.q;
import g0.G;
import g0.M;
import g0.a;
import i0.k.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k0.d1;
import k0.y0;
import l0.y1;
import y0.m;
import y0.n;

public class f
{
  public final h a;
  public final i0.g b;
  public final i0.g c;
  public final v d;
  public final Uri[] e;
  public final q[] f;
  public final r0.k g;
  public final J h;
  public final List i;
  public final e j;
  public final y1 k;
  public final long l;
  public boolean m;
  public byte[] n;
  public IOException o;
  public Uri p;
  public boolean q;
  public A0.y r;
  public long s;
  public boolean t;
  public long u;
  
  public f(h paramh, r0.k paramk, Uri[] paramArrayOfUri, q[] paramArrayOfq, g paramg, i0.y paramy, v paramv, long paramLong, List paramList, y1 paramy1, B0.f paramf)
  {
    a = paramh;
    g = paramk;
    e = paramArrayOfUri;
    f = paramArrayOfq;
    d = paramv;
    l = paramLong;
    i = paramList;
    k = paramy1;
    u = -9223372036854775807L;
    j = new e(4);
    n = M.f;
    s = -9223372036854775807L;
    paramh = paramg.a(1);
    b = paramh;
    if (paramy != null) {
      paramh.c(paramy);
    }
    c = paramg.a(3);
    h = new J(paramArrayOfq);
    paramh = new ArrayList();
    for (int i1 = 0; i1 < paramArrayOfUri.length; i1++) {
      if ((f & 0x4000) == 0) {
        paramh.add(Integer.valueOf(i1));
      }
    }
    r = new d(h, a3.f.n(paramh));
  }
  
  public static Uri e(r0.f paramf, r0.f.e parame)
  {
    if (parame != null)
    {
      parame = u;
      if (parame != null) {
        return G.f(a, parame);
      }
    }
    return null;
  }
  
  public static e h(r0.f paramf, long paramLong, int paramInt)
  {
    int i1 = (int)(paramLong - k);
    int i2 = r.size();
    Object localObject = null;
    if (i1 == i2)
    {
      if (paramInt == -1) {
        paramInt = 0;
      }
      if (paramInt < s.size()) {
        localObject = new e((r0.f.e)s.get(paramInt), paramLong, paramInt);
      }
      return (e)localObject;
    }
    localObject = (r0.f.d)r.get(i1);
    if (paramInt == -1) {
      return new e((r0.f.e)localObject, paramLong, -1);
    }
    if (paramInt < A.size()) {
      return new e((r0.f.e)A.get(paramInt), paramLong, paramInt);
    }
    paramInt = i1 + 1;
    if (paramInt < r.size()) {
      return new e((r0.f.e)r.get(paramInt), paramLong + 1L, -1);
    }
    if (!s.isEmpty()) {
      return new e((r0.f.e)s.get(0), paramLong + 1L, 0);
    }
    return null;
  }
  
  public static List j(r0.f paramf, long paramLong, int paramInt)
  {
    int i1 = (int)(paramLong - k);
    if ((i1 >= 0) && (r.size() >= i1))
    {
      ArrayList localArrayList = new ArrayList();
      int i2 = r.size();
      int i3 = 0;
      int i4 = paramInt;
      if (i1 < i2)
      {
        i4 = i1;
        if (paramInt != -1)
        {
          localObject = (r0.f.d)r.get(i1);
          if (paramInt == 0)
          {
            localArrayList.add(localObject);
          }
          else if (paramInt < A.size())
          {
            localObject = A;
            localArrayList.addAll(((List)localObject).subList(paramInt, ((List)localObject).size()));
          }
          i4 = i1 + 1;
        }
        Object localObject = r;
        localArrayList.addAll(((List)localObject).subList(i4, ((List)localObject).size()));
        i4 = 0;
      }
      if (n != -9223372036854775807L)
      {
        if (i4 == -1) {
          paramInt = i3;
        } else {
          paramInt = i4;
        }
        if (paramInt < s.size())
        {
          paramf = s;
          localArrayList.addAll(paramf.subList(paramInt, paramf.size()));
        }
      }
      return Collections.unmodifiableList(localArrayList);
    }
    return X2.v.Y();
  }
  
  public n[] a(j paramj, long paramLong)
  {
    if (paramj == null) {}
    for (int i1 = -1;; i1 = h.b(d)) {
      break;
    }
    int i2 = r.length();
    n[] arrayOfn = new n[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = r.c(i3);
      Object localObject = e[i4];
      if (!g.d((Uri)localObject))
      {
        arrayOfn[i3] = n.a;
      }
      else
      {
        r0.f localf = g.k((Uri)localObject, false);
        a.e(localf);
        long l1 = h - g.m();
        boolean bool;
        if (i4 != i1) {
          bool = true;
        } else {
          bool = false;
        }
        localObject = g(paramj, bool, localf, l1, paramLong);
        long l2 = ((Long)first).longValue();
        i4 = ((Integer)second).intValue();
        arrayOfn[i3] = new c(a, l1, j(localf, l2, i4));
      }
    }
    return arrayOfn;
  }
  
  public final void b()
  {
    int i1 = r.l();
    g.g(e[i1]);
  }
  
  public long c(long paramLong, d1 paramd1)
  {
    int i1 = r.o();
    Object localObject = e;
    if ((i1 < localObject.length) && (i1 != -1)) {
      localObject = g.k(localObject[r.l()], true);
    } else {
      localObject = null;
    }
    long l1 = paramLong;
    if (localObject != null)
    {
      l1 = paramLong;
      if (!r.isEmpty()) {
        if (!c)
        {
          l1 = paramLong;
        }
        else
        {
          long l2 = h - g.m();
          long l3 = paramLong - l2;
          i1 = M.f(r, Long.valueOf(l3), true, true);
          l1 = r.get(i1)).s;
          if (i1 != r.size() - 1) {
            paramLong = r.get(i1 + 1)).s;
          } else {
            paramLong = l1;
          }
          l1 = paramd1.a(l3, l1, paramLong) + l2;
        }
      }
    }
    return l1;
  }
  
  public int d(j paramj)
  {
    int i1 = o;
    int i2 = 1;
    if (i1 == -1) {
      return 1;
    }
    Object localObject = e[h.b(d)];
    r0.f localf = (r0.f)a.e(g.k((Uri)localObject, false));
    i1 = (int)(j - k);
    if (i1 < 0) {
      return 1;
    }
    if (i1 < r.size()) {
      localObject = r.get(i1)).A;
    } else {
      localObject = s;
    }
    if (o >= ((List)localObject).size()) {
      return 2;
    }
    localObject = (r0.f.b)((List)localObject).get(o);
    if (A) {
      return 0;
    }
    if (!M.c(Uri.parse(G.e(a, o)), b.a)) {
      i2 = 2;
    }
    return i2;
  }
  
  public void f(y0 paramy0, long paramLong, List paramList, boolean paramBoolean, b paramb)
  {
    j localj;
    if (paramList.isEmpty()) {
      localj = null;
    } else {
      localj = (j)X2.B.d(paramList);
    }
    int i1;
    if (localj == null) {
      i1 = -1;
    } else {
      i1 = h.b(d);
    }
    long l1 = a;
    long l2 = paramLong - l1;
    long l3 = u(l1);
    long l4 = l2;
    long l5 = l3;
    if (localj != null)
    {
      l4 = l2;
      l5 = l3;
      if (!q)
      {
        long l6 = localj.d();
        l2 = Math.max(0L, l2 - l6);
        l4 = l2;
        l5 = l3;
        if (l3 != -9223372036854775807L)
        {
          l5 = Math.max(0L, l3 - l6);
          l4 = l2;
        }
      }
    }
    paramy0 = a(localj, paramLong);
    r.v(l1, l4, l5, paramList, paramy0);
    int i2 = r.l();
    boolean bool;
    if (i1 != i2) {
      bool = true;
    } else {
      bool = false;
    }
    paramy0 = e[i2];
    if (!g.d(paramy0))
    {
      c = paramy0;
      t &= paramy0.equals(p);
      p = paramy0;
      return;
    }
    paramList = g.k(paramy0, true);
    a.e(paramList);
    q = c;
    y(paramList);
    l5 = h - g.m();
    Object localObject1 = g(localj, bool, paramList, l5, paramLong);
    l4 = ((Long)first).longValue();
    int i3 = ((Integer)second).intValue();
    if ((l4 < k) && (localj != null) && (bool))
    {
      paramy0 = e[i1];
      paramList = g.k(paramy0, true);
      a.e(paramList);
      l5 = h - g.m();
      localObject1 = g(localj, false, paramList, l5, paramLong);
      paramLong = ((Long)first).longValue();
      i3 = ((Integer)second).intValue();
      i2 = i1;
    }
    else
    {
      paramLong = l4;
    }
    if ((i2 != i1) && (i1 != -1))
    {
      localObject1 = e[i1];
      g.g((Uri)localObject1);
    }
    if (paramLong < k)
    {
      o = new x0.b();
      return;
    }
    Object localObject2 = h(paramList, paramLong, i3);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      if (!o)
      {
        c = paramy0;
        t &= paramy0.equals(p);
        p = paramy0;
        return;
      }
      if ((!paramBoolean) && (!r.isEmpty())) {
        localObject1 = new e((r0.f.e)X2.B.d(r), k + r.size() - 1L, -1);
      }
    }
    else
    {
      break label640;
    }
    b = true;
    return;
    label640:
    t = false;
    p = null;
    u = SystemClock.elapsedRealtime();
    localObject2 = e(paramList, a.p);
    Object localObject3 = n((Uri)localObject2, i2, true, null);
    a = ((y0.e)localObject3);
    if (localObject3 != null) {
      return;
    }
    localObject3 = e(paramList, a);
    y0.e locale = n((Uri)localObject3, i2, false, null);
    a = locale;
    if (locale != null) {
      return;
    }
    paramBoolean = j.w(localj, paramy0, paramList, (e)localObject1, l5);
    if ((paramBoolean) && (d)) {
      return;
    }
    a = j.j(a, b, f[i2], l5, paramList, (e)localObject1, paramy0, i, r.n(), r.s(), m, d, l, localj, j.a((Uri)localObject3), j.a((Uri)localObject2), paramBoolean, k, null);
  }
  
  public final Pair g(j paramj, boolean paramBoolean, r0.f paramf, long paramLong1, long paramLong2)
  {
    int i1 = -1;
    if ((paramj != null) && (!paramBoolean))
    {
      if (paramj.h())
      {
        if (o == -1) {
          paramLong1 = paramj.g();
        } else {
          paramLong1 = j;
        }
        i2 = o;
        if (i2 != -1) {
          i1 = i2 + 1;
        }
        paramj = new Pair(Long.valueOf(paramLong1), Integer.valueOf(i1));
      }
      else
      {
        paramj = new Pair(Long.valueOf(j), Integer.valueOf(o));
      }
      return paramj;
    }
    long l1 = u;
    long l2 = paramLong2;
    if (paramj != null) {
      if (q) {
        l2 = paramLong2;
      } else {
        l2 = g;
      }
    }
    if ((!o) && (l2 >= l1 + paramLong1)) {
      return new Pair(Long.valueOf(k + r.size()), Integer.valueOf(-1));
    }
    l2 -= paramLong1;
    Object localObject = r;
    paramBoolean = g.a();
    int i2 = 0;
    if ((paramBoolean) && (paramj != null)) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    int i3 = M.f((List)localObject, Long.valueOf(l2), true, paramBoolean);
    paramLong2 = i3 + k;
    int i4 = i1;
    paramLong1 = paramLong2;
    if (i3 >= 0)
    {
      paramj = (r0.f.d)r.get(i3);
      if (l2 < s + q) {
        paramj = A;
      } else {
        paramj = s;
      }
      for (;;)
      {
        i4 = i1;
        paramLong1 = paramLong2;
        if (i2 >= paramj.size()) {
          break;
        }
        localObject = (r0.f.b)paramj.get(i2);
        if (l2 < s + q)
        {
          i4 = i1;
          paramLong1 = paramLong2;
          if (!z) {
            break;
          }
          if (paramj == s) {
            paramLong1 = 1L;
          } else {
            paramLong1 = 0L;
          }
          paramLong1 = paramLong2 + paramLong1;
          i4 = i2;
          break;
        }
        i2++;
      }
    }
    return new Pair(Long.valueOf(paramLong1), Integer.valueOf(i4));
  }
  
  public int i(long paramLong, List paramList)
  {
    if ((o == null) && (r.length() >= 2)) {
      return r.k(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public J k()
  {
    return h;
  }
  
  public A0.y l()
  {
    return r;
  }
  
  public boolean m()
  {
    return q;
  }
  
  public final y0.e n(Uri paramUri, int paramInt, boolean paramBoolean, g.a parama)
  {
    if (paramUri == null) {
      return null;
    }
    parama = j.c(paramUri);
    if (parama != null)
    {
      j.b(paramUri, parama);
      return null;
    }
    paramUri = new k.b().i(paramUri).b(1).a();
    return new a(c, paramUri, f[paramInt], r.n(), r.s(), n);
  }
  
  public boolean o(y0.e parame, long paramLong)
  {
    A0.y localy = r;
    return localy.p(localy.e(h.b(d)), paramLong);
  }
  
  public void p()
  {
    Object localObject = o;
    if (localObject == null)
    {
      localObject = p;
      if ((localObject != null) && (t)) {
        g.h((Uri)localObject);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public boolean q(Uri paramUri)
  {
    return M.s(e, paramUri);
  }
  
  public void r(y0.e parame)
  {
    if ((parame instanceof a))
    {
      parame = (a)parame;
      n = parame.h();
      j.b(b.a, (byte[])a.e(parame.j()));
    }
  }
  
  public boolean s(Uri paramUri, long paramLong)
  {
    boolean bool1 = false;
    for (int i1 = 0;; i1++)
    {
      Uri[] arrayOfUri = e;
      if (i1 >= arrayOfUri.length) {
        break;
      }
      if (arrayOfUri[i1].equals(paramUri)) {
        break label44;
      }
    }
    i1 = -1;
    label44:
    if (i1 == -1) {
      return true;
    }
    i1 = r.e(i1);
    if (i1 == -1) {
      return true;
    }
    t |= paramUri.equals(p);
    boolean bool2;
    if (paramLong != -9223372036854775807L)
    {
      bool2 = bool1;
      if (r.p(i1, paramLong))
      {
        bool2 = bool1;
        if (!g.c(paramUri, paramLong)) {}
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public void t()
  {
    b();
    o = null;
  }
  
  public final long u(long paramLong)
  {
    long l1 = s;
    long l2 = -9223372036854775807L;
    if (l1 != -9223372036854775807L) {
      l2 = l1 - paramLong;
    }
    return l2;
  }
  
  public void v(boolean paramBoolean)
  {
    m = paramBoolean;
  }
  
  public void w(A0.y paramy)
  {
    b();
    r = paramy;
  }
  
  public boolean x(long paramLong, y0.e parame, List paramList)
  {
    if (o != null) {
      return false;
    }
    return r.q(paramLong, parame, paramList);
  }
  
  public final void y(r0.f paramf)
  {
    long l1;
    if (o) {
      l1 = -9223372036854775807L;
    } else {
      l1 = paramf.e() - g.m();
    }
    s = l1;
  }
  
  public static final class a
    extends y0.k
  {
    public byte[] l;
    
    public a(i0.g paramg, i0.k paramk, q paramq, int paramInt, Object paramObject, byte[] paramArrayOfByte)
    {
      super(paramk, 3, paramq, paramInt, paramObject, paramArrayOfByte);
    }
    
    public void g(byte[] paramArrayOfByte, int paramInt)
    {
      l = Arrays.copyOf(paramArrayOfByte, paramInt);
    }
    
    public byte[] j()
    {
      return l;
    }
  }
  
  public static final class b
  {
    public y0.e a;
    public boolean b;
    public Uri c;
    
    public b()
    {
      a();
    }
    
    public void a()
    {
      a = null;
      b = false;
      c = null;
    }
  }
  
  public static final class c
    extends y0.b
  {
    public final List e;
    public final long f;
    public final String g;
    
    public c(String paramString, long paramLong, List paramList)
    {
      super(paramList.size() - 1);
      g = paramString;
      f = paramLong;
      e = paramList;
    }
    
    public long a()
    {
      c();
      r0.f.e locale = (r0.f.e)e.get((int)d());
      return f + s + q;
    }
    
    public long b()
    {
      c();
      return f + e.get((int)d())).s;
    }
  }
  
  public static final class d
    extends c
  {
    public int h = a(paramJ.a(paramArrayOfInt[0]));
    
    public d(J paramJ, int[] paramArrayOfInt)
    {
      super(paramArrayOfInt);
    }
    
    public int n()
    {
      return 0;
    }
    
    public int o()
    {
      return h;
    }
    
    public Object s()
    {
      return null;
    }
    
    public void v(long paramLong1, long paramLong2, long paramLong3, List paramList, n[] paramArrayOfn)
    {
      paramLong1 = SystemClock.elapsedRealtime();
      if (!i(h, paramLong1)) {
        return;
      }
      for (int i = b - 1; i >= 0; i--) {
        if (!i(i, paramLong1))
        {
          h = i;
          return;
        }
      }
      throw new IllegalStateException();
    }
  }
  
  public static final class e
  {
    public final r0.f.e a;
    public final long b;
    public final int c;
    public final boolean d;
    
    public e(r0.f.e parame, long paramLong, int paramInt)
    {
      a = parame;
      b = paramLong;
      c = paramInt;
      boolean bool;
      if (((parame instanceof r0.f.b)) && (A)) {
        bool = true;
      } else {
        bool = false;
      }
      d = bool;
    }
  }
}

/* Location:
 * Qualified Name:     q0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */