package e5;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import b5.m;
import d2.h0;
import f5.e.a;
import f5.e.c;
import f5.e.d;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o7.t;
import p2.m0;
import v5.c0;
import v5.d0;
import v5.e0;
import v5.u;
import w3.a0;

public final class g
{
  public final i a;
  public final t5.k b;
  public final t5.k c;
  public final h0 d;
  public final Uri[] e;
  public final v3.i0[] f;
  public final f5.j g;
  public final z4.i0 h;
  public final List<v3.i0> i;
  public final f j;
  public final a0 k;
  public boolean l;
  public byte[] m;
  public z4.b n;
  public Uri o;
  public boolean p;
  public r5.h q;
  public long r;
  public boolean s;
  
  public g(i parami, f5.j paramj, Uri[] paramArrayOfUri, v3.i0[] paramArrayOfi0, h paramh, t5.l0 paraml0, h0 paramh0, List<v3.i0> paramList, a0 parama0)
  {
    a = parami;
    g = paramj;
    e = paramArrayOfUri;
    f = paramArrayOfi0;
    d = paramh0;
    i = paramList;
    k = parama0;
    j = new f();
    m = e0.f;
    r = -9223372036854775807L;
    parami = paramh.a();
    b = parami;
    if (paraml0 != null) {
      parami.f(paraml0);
    }
    c = paramh.a();
    h = new z4.i0("", paramArrayOfi0);
    parami = new ArrayList();
    for (int i1 = 0; i1 < paramArrayOfUri.length; i1++) {
      if ((e & 0x4000) == 0) {
        parami.add(Integer.valueOf(i1));
      }
    }
    q = new d(h, r7.a.F(parami));
  }
  
  public final b5.n[] a(j paramj, long paramLong)
  {
    int i1;
    if (paramj == null) {
      i1 = -1;
    } else {
      i1 = h.a(d);
    }
    int i2 = q.length();
    b5.n[] arrayOfn = new b5.n[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = q.c(i3);
      Object localObject1 = e[i4];
      if (!g.a((Uri)localObject1))
      {
        arrayOfn[i3] = b5.n.a;
      }
      else
      {
        localObject1 = g.m(false, (Uri)localObject1);
        localObject1.getClass();
        long l1 = h - g.e();
        boolean bool;
        if (i4 != i1) {
          bool = true;
        } else {
          bool = false;
        }
        Object localObject2 = d(paramj, bool, (f5.e)localObject1, l1, paramLong);
        long l2 = ((Long)first).longValue();
        int i5 = ((Integer)second).intValue();
        int i6 = (int)(l2 - k);
        if ((i6 >= 0) && (r.size() >= i6))
        {
          localObject2 = new ArrayList();
          i4 = i5;
          if (i6 < r.size())
          {
            i4 = i6;
            if (i5 != -1)
            {
              localObject3 = (e.c)r.get(i6);
              if (i5 == 0)
              {
                ((ArrayList)localObject2).add(localObject3);
              }
              else if (i5 < u.size())
              {
                localObject3 = u;
                ((ArrayList)localObject2).addAll(((List)localObject3).subList(i5, ((List)localObject3).size()));
              }
              i4 = i6 + 1;
            }
            Object localObject3 = r;
            ((ArrayList)localObject2).addAll(((List)localObject3).subList(i4, ((List)localObject3).size()));
            i4 = 0;
          }
          if (n != -9223372036854775807L)
          {
            i6 = i4;
            if (i4 == -1) {
              i6 = 0;
            }
            if (i6 < s.size())
            {
              localObject1 = s;
              ((ArrayList)localObject2).addAll(((List)localObject1).subList(i6, ((List)localObject1).size()));
            }
          }
          localObject1 = Collections.unmodifiableList((List)localObject2);
        }
        else
        {
          localObject1 = t.b;
          localObject1 = o7.l0.e;
        }
        arrayOfn[i3] = new c(l1, (List)localObject1);
      }
    }
    return arrayOfn;
  }
  
  public final int b(j paramj)
  {
    int i1 = o;
    int i2 = 1;
    if (i1 == -1) {
      return 1;
    }
    Object localObject = e[h.a(d)];
    f5.e locale = g.m(false, (Uri)localObject);
    locale.getClass();
    i1 = (int)(j - k);
    if (i1 < 0) {
      return 1;
    }
    if (i1 < r.size()) {
      localObject = r.get(i1)).u;
    } else {
      localObject = s;
    }
    if (o >= ((List)localObject).size()) {
      return 2;
    }
    localObject = (e.a)((List)localObject).get(o);
    if (u) {
      return 0;
    }
    if (!e0.a(Uri.parse(d0.c(a, a)), b.a)) {
      i2 = 2;
    }
    return i2;
  }
  
  public final void c(long paramLong1, long paramLong2, List<j> paramList, boolean paramBoolean, b paramb)
  {
    Object localObject1;
    if (paramList.isEmpty()) {
      localObject1 = null;
    } else {
      localObject1 = (j)m0.K(paramList);
    }
    if (localObject1 == null) {
      i1 = -1;
    } else {
      i1 = h.a(d);
    }
    long l1 = paramLong2 - paramLong1;
    long l2 = r;
    long l3 = -9223372036854775807L;
    if (l2 != -9223372036854775807L) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 != 0) {
      paramLong1 = l2 - paramLong1;
    } else {
      paramLong1 = -9223372036854775807L;
    }
    if ((localObject1 != null) && (!p))
    {
      long l4 = h - g;
      long l5 = Math.max(0L, l1 - l4);
      l1 = l5;
      l2 = paramLong1;
      if (paramLong1 != -9223372036854775807L)
      {
        l2 = Math.max(0L, paramLong1 - l4);
        l1 = l5;
      }
    }
    else
    {
      l2 = paramLong1;
    }
    Object localObject2 = a((j)localObject1, paramLong2);
    q.j(l1, l2, paramList, (b5.n[])localObject2);
    int i3 = q.o();
    int i2 = i1;
    if (i2 != i3) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    localObject2 = e[i3];
    if (!g.a((Uri)localObject2))
    {
      c = ((Uri)localObject2);
      s &= ((Uri)localObject2).equals(o);
      o = ((Uri)localObject2);
      return;
    }
    Object localObject3 = g.m(true, (Uri)localObject2);
    localObject3.getClass();
    p = c;
    if (o) {
      paramLong1 = l3;
    } else {
      paramLong1 = h + u - g.e();
    }
    r = paramLong1;
    paramLong1 = h - g.e();
    paramList = d((j)localObject1, bool1, (f5.e)localObject3, paramLong1, paramLong2);
    l2 = ((Long)first).longValue();
    int i1 = ((Integer)second).intValue();
    if ((l2 < k) && (localObject1 != null) && (bool1))
    {
      localObject2 = e[i2];
      localObject3 = g.m(true, (Uri)localObject2);
      localObject3.getClass();
      paramLong1 = h - g.e();
      paramList = d((j)localObject1, false, (f5.e)localObject3, paramLong1, paramLong2);
      paramLong2 = ((Long)first).longValue();
      i1 = ((Integer)second).intValue();
    }
    else
    {
      i2 = i3;
      paramLong2 = l2;
    }
    l2 = k;
    if (paramLong2 < l2)
    {
      n = new z4.b();
      return;
    }
    i3 = (int)(paramLong2 - l2);
    if (i3 == r.size())
    {
      if (i1 == -1) {
        i1 = 0;
      }
      if (i1 >= s.size()) {
        break label809;
      }
      paramList = new e((e.d)s.get(i1), paramLong2, i1);
    }
    else
    {
      paramList = (e.c)r.get(i3);
      if (i1 == -1) {
        paramList = new e(paramList, paramLong2, -1);
      } else if (i1 < u.size()) {
        paramList = new e((e.d)u.get(i1), paramLong2, i1);
      }
    }
    break label812;
    i1 = i3 + 1;
    if (i1 < r.size()) {
      paramList = new e((e.d)r.get(i1), paramLong2 + 1L, -1);
    } else if (!s.isEmpty()) {
      paramList = new e((e.d)s.get(0), paramLong2 + 1L, 0);
    } else {
      label809:
      paramList = null;
    }
    label812:
    Object localObject4;
    if (paramList == null)
    {
      if (!o)
      {
        c = ((Uri)localObject2);
        s &= ((Uri)localObject2).equals(o);
        o = ((Uri)localObject2);
        return;
      }
      if ((!paramBoolean) && (!r.isEmpty())) {
        localObject4 = new e((e.d)m0.K(r), k + r.size() - 1L, -1);
      } else {
        b = true;
      }
    }
    else
    {
      localObject4 = paramList;
    }
    s = false;
    o = null;
    paramList = a.b;
    if (paramList != null)
    {
      paramList = o;
      if (paramList != null)
      {
        paramList = d0.d(a, paramList);
        break label990;
      }
    }
    paramList = null;
    label990:
    Object localObject5 = e(paramList, i2);
    a = ((b5.e)localObject5);
    if (localObject5 != null) {
      return;
    }
    localObject5 = a;
    if (localObject5 != null)
    {
      localObject5 = o;
      if (localObject5 != null)
      {
        localObject6 = d0.d(a, (String)localObject5);
        break label1058;
      }
    }
    Object localObject6 = null;
    label1058:
    localObject5 = e((Uri)localObject6, i2);
    a = ((b5.e)localObject5);
    if (localObject5 != null) {
      return;
    }
    if (localObject1 == null) {
      localObject5 = j.L;
    } else {
      if ((!((Uri)localObject2).equals(m)) || (!H)) {
        break label1121;
      }
    }
    boolean bool1 = false;
    break label1224;
    label1121:
    localObject5 = a;
    paramLong2 = e;
    if ((localObject5 instanceof e.a))
    {
      if ((!t) && ((c != 0) || (!c))) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
    }
    else {
      paramBoolean = c;
    }
    if ((paramBoolean) && (paramLong2 + paramLong1 >= h)) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    bool1 = paramBoolean;
    label1224:
    Object localObject7 = localObject2;
    if ((bool1) && (d)) {
      return;
    }
    i locali = a;
    localObject5 = b;
    v3.i0 locali0 = f[i2];
    List localList = i;
    i3 = q.q();
    Object localObject8 = q.s();
    boolean bool2 = l;
    h0 localh0 = d;
    localObject2 = j;
    if (localObject6 == null)
    {
      localObject2.getClass();
      localObject2 = null;
    }
    else
    {
      localObject2 = (byte[])a.get(localObject6);
    }
    localObject6 = j;
    if (paramList == null)
    {
      localObject6.getClass();
      localObject6 = null;
    }
    else
    {
      localObject6 = (byte[])a.get(paramList);
    }
    a0 locala0 = k;
    paramList = j.L;
    e.d locald = a;
    Object localObject9 = Collections.emptyMap();
    paramList = d0.d(a, a);
    l2 = q;
    paramLong2 = r;
    if (d) {
      i1 = 8;
    } else {
      i1 = 0;
    }
    if (paramList != null)
    {
      t5.n localn1 = new t5.n(paramList, 0L, 1, null, (Map)localObject9, l2, paramLong2, null, i1, null);
      boolean bool3;
      if (localObject2 != null) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if (bool3)
      {
        paramList = p;
        paramList.getClass();
        paramList = j.f(paramList);
      }
      else
      {
        paramList = null;
      }
      if (localObject2 != null)
      {
        paramList.getClass();
        localObject2 = new a((t5.k)localObject5, (byte[])localObject2, paramList);
      }
      else
      {
        localObject2 = localObject5;
      }
      paramList = b;
      if (paramList != null)
      {
        if (localObject6 != null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        if (paramBoolean)
        {
          localObject9 = p;
          localObject9.getClass();
          localObject9 = j.f((String)localObject9);
        }
        else
        {
          localObject9 = null;
        }
        t5.n localn2 = new t5.n(d0.d(a, a), q, r);
        paramList = (List<j>)localObject5;
        if (localObject6 != null)
        {
          localObject9.getClass();
          paramList = new a((t5.k)localObject5, (byte[])localObject6, (byte[])localObject9);
        }
        localObject5 = localn2;
        localObject6 = paramList;
      }
      else
      {
        localObject5 = null;
        localObject6 = null;
        paramBoolean = false;
      }
      paramList = (List<j>)localObject1;
      paramLong1 += e;
      l2 = c;
      int i4 = j + d;
      if (paramList != null)
      {
        localObject1 = q;
        if ((localObject5 != localObject1) && ((localObject5 == null) || (localObject1 == null) || (!a.equals(a)) || (f != q.f))) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if ((((Uri)localObject7).equals(m)) && (H)) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        localObject3 = y;
        localObject1 = z;
        if ((i1 != 0) && (i2 != 0) && (!J) && (l == i4)) {
          paramList = C;
        } else {
          paramList = null;
        }
      }
      else
      {
        localObject3 = new u4.g(null);
        localObject1 = new u(10);
        paramList = null;
      }
      paramLong2 = b;
      i1 = c;
      boolean bool4 = d;
      boolean bool5 = s;
      localObject9 = (c0)((SparseArray)b).get(i4);
      localObject4 = localObject9;
      if (localObject9 == null)
      {
        localObject4 = new c0(9223372036854775806L);
        ((SparseArray)b).put(i4, localObject4);
      }
      a = new j(locali, (t5.k)localObject2, localn1, locali0, bool3, (t5.k)localObject6, (t5.n)localObject5, paramBoolean, (Uri)localObject7, localList, i3, localObject8, paramLong1, paramLong1 + l2, paramLong2, i1, bool4 ^ true, i4, bool5, bool2, (c0)localObject4, f, paramList, (u4.g)localObject3, (u)localObject1, bool1, locala0);
      return;
    }
    throw new IllegalStateException("The uri must be set.");
  }
  
  public final Pair<Long, Integer> d(j paramj, boolean paramBoolean, f5.e parame, long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    int i1 = -1;
    if ((paramj != null) && (!paramBoolean))
    {
      if (H)
      {
        if (o == -1) {
          paramLong1 = paramj.c();
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
      if (p) {
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
    boolean bool2 = g.g();
    int i2 = 0;
    paramBoolean = bool1;
    if (bool2) {
      if (paramj == null) {
        paramBoolean = bool1;
      } else {
        paramBoolean = false;
      }
    }
    int i3 = e0.c((List)localObject, Long.valueOf(l2), paramBoolean);
    paramLong2 = i3 + k;
    int i4 = i1;
    paramLong1 = paramLong2;
    if (i3 >= 0)
    {
      paramj = (e.c)r.get(i3);
      if (l2 < e + c) {
        paramj = u;
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
        localObject = (e.a)paramj.get(i2);
        if (l2 < e + c)
        {
          i4 = i1;
          paramLong1 = paramLong2;
          if (!t) {
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
  
  public final a e(Uri paramUri, int paramInt)
  {
    if (paramUri == null) {
      return null;
    }
    byte[] arrayOfByte = (byte[])j.a.remove(paramUri);
    if (arrayOfByte != null)
    {
      paramUri = (byte[])j.a.put(paramUri, arrayOfByte);
      return null;
    }
    paramUri = new t5.n(paramUri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null);
    return new a(c, paramUri, f[paramInt], q.q(), q.s(), m);
  }
  
  public static final class a
    extends b5.k
  {
    public byte[] l;
    
    public a(t5.k paramk, t5.n paramn, v3.i0 parami0, int paramInt, Object paramObject, byte[] paramArrayOfByte)
    {
      super(paramn, parami0, paramInt, paramObject, paramArrayOfByte);
    }
  }
  
  public static final class b
  {
    public b5.e a = null;
    public boolean b = false;
    public Uri c = null;
  }
  
  public static final class c
    extends b5.b
  {
    public final List<e.d> e;
    public final long f;
    
    public c(long paramLong, List paramList)
    {
      super(paramList.size() - 1);
      f = paramLong;
      e = paramList;
    }
    
    public final long a()
    {
      c();
      return f + e.get((int)d)).e;
    }
    
    public final long b()
    {
      c();
      e.d locald = (e.d)e.get((int)d);
      return f + e + c;
    }
  }
  
  public static final class d
    extends r5.b
  {
    public int g;
    
    public d(z4.i0 parami0, int[] paramArrayOfInt)
    {
      super(paramArrayOfInt);
      int i = paramArrayOfInt[0];
      g = d(d[i]);
    }
    
    public final int i()
    {
      return g;
    }
    
    public final void j(long paramLong1, long paramLong2, List paramList, b5.n[] paramArrayOfn)
    {
      paramLong1 = SystemClock.elapsedRealtime();
      if (!l(g, paramLong1)) {
        return;
      }
      int i = b;
      int j;
      do
      {
        j = i - 1;
        if (j < 0) {
          break;
        }
        i = j;
      } while (l(j, paramLong1));
      g = j;
      return;
      throw new IllegalStateException();
    }
    
    public final int q()
    {
      return 0;
    }
    
    public final Object s()
    {
      return null;
    }
  }
  
  public static final class e
  {
    public final e.d a;
    public final long b;
    public final int c;
    public final boolean d;
    
    public e(e.d paramd, long paramLong, int paramInt)
    {
      a = paramd;
      b = paramLong;
      c = paramInt;
      boolean bool;
      if (((paramd instanceof e.a)) && (u)) {
        bool = true;
      } else {
        bool = false;
      }
      d = bool;
    }
  }
}

/* Location:
 * Qualified Name:     e5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */