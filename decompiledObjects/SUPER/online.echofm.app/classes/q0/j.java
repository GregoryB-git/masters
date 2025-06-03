package q0;

import B0.g.a;
import W2.c;
import android.net.Uri;
import d0.q;
import d0.x;
import g0.E;
import g0.G;
import g0.z;
import i0.g;
import i0.k.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.y1;
import r0.f;
import r0.f.b;
import y0.e;

public final class j
  extends y0.m
{
  public static final AtomicInteger N = new AtomicInteger();
  public final boolean A;
  public final boolean B;
  public final y1 C;
  public final long D;
  public k E;
  public s F;
  public int G;
  public boolean H;
  public volatile boolean I;
  public boolean J;
  public X2.v K;
  public boolean L;
  public boolean M;
  public final int k;
  public final int l;
  public final Uri m;
  public final boolean n;
  public final int o;
  public final g p;
  public final i0.k q;
  public final k r;
  public final boolean s;
  public final boolean t;
  public final E u;
  public final h v;
  public final List w;
  public final d0.m x;
  public final T0.h y;
  public final z z;
  
  public j(h paramh, g paramg1, i0.k paramk1, q paramq, boolean paramBoolean1, g paramg2, i0.k paramk2, boolean paramBoolean2, Uri paramUri, List paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, boolean paramBoolean3, int paramInt3, boolean paramBoolean4, boolean paramBoolean5, E paramE, long paramLong4, d0.m paramm, k paramk, T0.h paramh1, z paramz, boolean paramBoolean6, y1 paramy1)
  {
    super(paramg1, paramk1, paramq, paramInt1, paramObject, paramLong1, paramLong2, paramLong3);
    A = paramBoolean1;
    o = paramInt2;
    M = paramBoolean3;
    l = paramInt3;
    q = paramk2;
    p = paramg2;
    if (paramk2 != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    H = paramBoolean1;
    B = paramBoolean2;
    m = paramUri;
    s = paramBoolean5;
    u = paramE;
    D = paramLong4;
    t = paramBoolean4;
    v = paramh;
    w = paramList;
    x = paramm;
    r = paramk;
    y = paramh1;
    z = paramz;
    n = paramBoolean6;
    C = paramy1;
    K = X2.v.Y();
    k = N.getAndIncrement();
  }
  
  public static g i(g paramg, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      g0.a.e(paramArrayOfByte2);
      return new a(paramg, paramArrayOfByte1, paramArrayOfByte2);
    }
    return paramg;
  }
  
  public static j j(h paramh, g paramg, q paramq, long paramLong1, f paramf, f.e parame, Uri paramUri, List paramList, int paramInt, Object paramObject, boolean paramBoolean1, v paramv, long paramLong2, j paramj, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, boolean paramBoolean2, y1 paramy1, g.a parama)
  {
    r0.f.e locale = a;
    parama = new k.b().i(G.f(a, o)).h(w).g(x);
    int i;
    if (d) {
      i = 8;
    } else {
      i = 0;
    }
    i0.k localk = parama.b(i).a();
    boolean bool1;
    if (paramArrayOfByte1 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (bool1) {
      parama = l((String)g0.a.e(v));
    } else {
      parama = null;
    }
    g localg = i(paramg, paramArrayOfByte1, parama);
    parama = p;
    boolean bool2;
    if (parama != null)
    {
      if (paramArrayOfByte2 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool2) {
        paramArrayOfByte1 = l((String)g0.a.e(v));
      } else {
        paramArrayOfByte1 = null;
      }
      Uri localUri = G.f(a, o);
      parama = new k.b().i(localUri).h(w).g(x).a();
      paramArrayOfByte1 = i(paramg, paramArrayOfByte2, paramArrayOfByte1);
      paramArrayOfByte2 = parama;
    }
    else
    {
      paramArrayOfByte2 = null;
      paramArrayOfByte1 = null;
      bool2 = false;
    }
    long l1 = paramLong1 + s;
    paramLong1 = q;
    int j = j + r;
    if (paramj != null)
    {
      paramg = q;
      if ((paramArrayOfByte2 != paramg) && ((paramArrayOfByte2 == null) || (paramg == null) || (!a.equals(a)) || (g != q.g))) {
        i = 0;
      } else {
        i = 1;
      }
      int i1;
      if ((paramUri.equals(m)) && (J)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      parama = y;
      paramf = z;
      if ((i != 0) && (i1 != 0) && (!L) && (l == j)) {
        paramg = E;
      } else {
        paramg = null;
      }
      paramj = paramg;
      paramg = parama;
    }
    else
    {
      paramg = new T0.h();
      paramf = new z(10);
      paramj = null;
    }
    return new j(paramh, localg, localk, paramq, bool1, paramArrayOfByte1, paramArrayOfByte2, bool2, paramUri, paramList, paramInt, paramObject, l1, l1 + paramLong1, b, c, d ^ true, j, y, paramBoolean1, paramv.a(j), paramLong2, t, paramj, paramg, paramf, paramBoolean2, paramy1);
  }
  
  public static byte[] l(String paramString)
  {
    Object localObject = paramString;
    if (c.e(paramString).startsWith("0x")) {
      localObject = paramString.substring(2);
    }
    paramString = new BigInteger((String)localObject, 16).toByteArray();
    localObject = new byte[16];
    int i;
    if (paramString.length > 16) {
      i = paramString.length - 16;
    } else {
      i = 0;
    }
    System.arraycopy(paramString, i, localObject, 16 - paramString.length + i, paramString.length - i);
    return (byte[])localObject;
  }
  
  public static boolean p(f.e parame, f paramf)
  {
    r0.f.e locale = a;
    if ((locale instanceof f.b))
    {
      boolean bool;
      if ((!z) && ((c != 0) || (!c))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    return c;
  }
  
  public static boolean w(j paramj, Uri paramUri, f paramf, f.e parame, long paramLong)
  {
    boolean bool = false;
    if (paramj == null) {
      return false;
    }
    if ((paramUri.equals(m)) && (J)) {
      return false;
    }
    long l1 = a.s;
    if ((!p(parame, paramf)) || (paramLong + l1 < h)) {
      bool = true;
    }
    return bool;
  }
  
  public void b()
  {
    g0.a.e(F);
    if (E == null)
    {
      k localk = r;
      if ((localk != null) && (localk.e()))
      {
        E = r;
        H = false;
      }
    }
    s();
    if (!I)
    {
      if (!t) {
        r();
      }
      J = (I ^ true);
    }
  }
  
  public void c()
  {
    I = true;
  }
  
  public boolean h()
  {
    return J;
  }
  
  /* Error */
  public final void k(g paramg, i0.k paramk, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 6
    //   6: iload_3
    //   7: ifeq +19 -> 26
    //   10: aload_0
    //   11: getfield 308	q0/j:G	I
    //   14: ifeq +6 -> 20
    //   17: iconst_1
    //   18: istore 6
    //   20: aload_2
    //   21: astore 7
    //   23: goto +18 -> 41
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 308	q0/j:G	I
    //   31: i2l
    //   32: invokevirtual 311	i0/k:e	(J)Li0/k;
    //   35: astore 7
    //   37: iload 5
    //   39: istore 6
    //   41: aload_0
    //   42: aload_1
    //   43: aload 7
    //   45: iload 4
    //   47: invokevirtual 314	q0/j:u	(Li0/g;Li0/k;Z)LF0/j;
    //   50: astore 7
    //   52: iload 6
    //   54: ifeq +21 -> 75
    //   57: aload 7
    //   59: aload_0
    //   60: getfield 308	q0/j:G	I
    //   63: invokeinterface 318 2 0
    //   68: goto +7 -> 75
    //   71: astore_2
    //   72: goto +136 -> 208
    //   75: aload_0
    //   76: getfield 301	q0/j:I	Z
    //   79: ifne +32 -> 111
    //   82: aload_0
    //   83: getfield 222	q0/j:E	Lq0/k;
    //   86: aload 7
    //   88: invokeinterface 321 2 0
    //   93: istore_3
    //   94: iload_3
    //   95: ifeq +16 -> 111
    //   98: goto -23 -> 75
    //   101: astore 8
    //   103: goto +85 -> 188
    //   106: astore 8
    //   108: goto +31 -> 139
    //   111: aload 7
    //   113: invokeinterface 324 1 0
    //   118: lstore 9
    //   120: aload_2
    //   121: getfield 216	i0/k:g	J
    //   124: lstore 11
    //   126: aload_0
    //   127: lload 9
    //   129: lload 11
    //   131: lsub
    //   132: l2i
    //   133: putfield 308	q0/j:G	I
    //   136: goto +44 -> 180
    //   139: aload_0
    //   140: getfield 327	y0/e:d	Ld0/q;
    //   143: getfield 331	d0/q:f	I
    //   146: sipush 16384
    //   149: iand
    //   150: ifeq +35 -> 185
    //   153: aload_0
    //   154: getfield 222	q0/j:E	Lq0/k;
    //   157: invokeinterface 333 1 0
    //   162: aload 7
    //   164: invokeinterface 324 1 0
    //   169: lstore 9
    //   171: aload_2
    //   172: getfield 216	i0/k:g	J
    //   175: lstore 11
    //   177: goto -51 -> 126
    //   180: aload_1
    //   181: invokestatic 338	i0/j:a	(Li0/g;)V
    //   184: return
    //   185: aload 8
    //   187: athrow
    //   188: aload_0
    //   189: aload 7
    //   191: invokeinterface 324 1 0
    //   196: aload_2
    //   197: getfield 216	i0/k:g	J
    //   200: lsub
    //   201: l2i
    //   202: putfield 308	q0/j:G	I
    //   205: aload 8
    //   207: athrow
    //   208: aload_1
    //   209: invokestatic 338	i0/j:a	(Li0/g;)V
    //   212: aload_2
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	j
    //   0	214	1	paramg	g
    //   0	214	2	paramk	i0.k
    //   0	214	3	paramBoolean1	boolean
    //   0	214	4	paramBoolean2	boolean
    //   1	37	5	i	int
    //   4	49	6	j	int
    //   21	169	7	localObject1	Object
    //   101	1	8	localObject2	Object
    //   106	100	8	localEOFException	EOFException
    //   118	52	9	l1	long
    //   124	52	11	l2	long
    // Exception table:
    //   from	to	target	type
    //   41	52	71	finally
    //   57	68	71	finally
    //   111	126	71	finally
    //   126	136	71	finally
    //   162	177	71	finally
    //   188	208	71	finally
    //   75	94	101	finally
    //   139	162	101	finally
    //   185	188	101	finally
    //   75	94	106	java/io/EOFException
  }
  
  public int m(int paramInt)
  {
    g0.a.f(n ^ true);
    if (paramInt >= K.size()) {
      return 0;
    }
    return ((Integer)K.get(paramInt)).intValue();
  }
  
  public void n(s params, X2.v paramv)
  {
    F = params;
    K = paramv;
  }
  
  public void o()
  {
    L = true;
  }
  
  public boolean q()
  {
    return M;
  }
  
  public final void r()
  {
    k(i, b, A, true);
  }
  
  public final void s()
  {
    if (!H) {
      return;
    }
    g0.a.e(p);
    g0.a.e(q);
    k(p, q, B, false);
    G = 0;
    H = false;
  }
  
  public final long t(F0.s params)
  {
    params.h();
    try
    {
      z.P(10);
      params.n(z.e(), 0, 10);
      if (z.J() != 4801587) {
        return -9223372036854775807L;
      }
      z.U(3);
      int i = z.F();
      int j = i + 10;
      Object localObject;
      if (j > z.b())
      {
        localObject = z.e();
        z.P(j);
        System.arraycopy(localObject, 0, z.e(), 0, 10);
      }
      params.n(z.e(), 10, i);
      params = y.e(z.e(), i);
      if (params == null) {
        return -9223372036854775807L;
      }
      j = params.e();
      for (i = 0; i < j; i++)
      {
        localObject = params.d(i);
        if ((localObject instanceof T0.m))
        {
          localObject = (T0.m)localObject;
          if ("com.apple.streaming.transportStreamTimestamp".equals(p))
          {
            System.arraycopy(q, 0, z.e(), 0, 8);
            z.T(0);
            z.S(8);
            return z.z() & 0x1FFFFFFFF;
          }
        }
      }
    }
    catch (EOFException params)
    {
      for (;;) {}
    }
    return -9223372036854775807L;
  }
  
  public final F0.j u(g paramg, i0.k paramk, boolean paramBoolean)
  {
    long l1 = paramg.e(paramk);
    if (paramBoolean) {
      try
      {
        u.j(s, g, D);
      }
      catch (TimeoutException paramg)
      {
        throw new IOException(paramg);
      }
      catch (InterruptedException paramg)
      {
        throw new InterruptedIOException();
      }
    }
    F0.j localj = new F0.j(paramg, g, l1);
    if (E == null)
    {
      l1 = t(localj);
      localj.h();
      k localk = r;
      if (localk != null) {
        paramg = localk.f();
      } else {
        paramg = v.c(a, d, w, u, paramg.g(), localj, C);
      }
      E = paramg;
      if (paramg.a())
      {
        paramg = F;
        if (l1 != -9223372036854775807L) {
          l1 = u.b(l1);
        }
      }
      for (l1 = g;; l1 = 0L)
      {
        paramg.p0(l1);
        break;
        paramg = F;
      }
      F.b0();
      E.b(F);
    }
    F.m0(x);
    return localj;
  }
  
  public void v()
  {
    M = true;
  }
}

/* Location:
 * Qualified Name:     q0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */