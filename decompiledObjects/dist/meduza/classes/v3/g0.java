package v3;

import a4.e.a;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import g.q;
import io.flutter.plugins.firebase.auth.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o7.t.a;
import p4.a.b;
import r5.h;
import r5.o.a;
import r5.p;
import t5.l;
import v5.a0.a;
import v5.c;
import v5.m;
import v5.y;
import z4.e0.a;
import z4.j0;
import z4.r;
import z4.r.a;
import z4.s;
import z4.t.b;

public final class g0
  implements Handler.Callback, r.a, o.a, z0.d, k.a, g1.a
{
  public final s0 A;
  public final z0 B;
  public final m0 C;
  public final long D;
  public n1 E;
  public d1 F;
  public d G;
  public boolean H;
  public boolean I;
  public boolean J;
  public boolean K;
  public boolean L;
  public int M;
  public boolean N;
  public boolean O;
  public boolean P;
  public boolean Q;
  public int R;
  public g S;
  public long T;
  public int U;
  public boolean V;
  public n W;
  public long X;
  public final j1[] a;
  public final Set<j1> b;
  public final k1[] c;
  public final r5.o d;
  public final p e;
  public final n0 f;
  public final t5.e o;
  public final v5.k p;
  public final HandlerThread q;
  public final Looper r;
  public final r1.c s;
  public final r1.b t;
  public final long u;
  public final boolean v;
  public final k w;
  public final ArrayList<c> x;
  public final c y;
  public final e z;
  
  public g0(j1[] paramArrayOfj1, r5.o paramo, p paramp, n0 paramn0, t5.e parame, int paramInt, boolean paramBoolean1, w3.a parama, n1 paramn1, m0 paramm0, long paramLong, boolean paramBoolean2, Looper paramLooper, c paramc, g paramg, w3.a0 parama0)
  {
    z = paramg;
    a = paramArrayOfj1;
    d = paramo;
    e = paramp;
    f = paramn0;
    o = parame;
    M = paramInt;
    N = paramBoolean1;
    E = paramn1;
    C = paramm0;
    D = paramLong;
    I = paramBoolean2;
    y = paramc;
    X = -9223372036854775807L;
    u = paramn0.c();
    v = paramn0.b();
    paramp = d1.h(paramp);
    F = paramp;
    G = new d(paramp);
    c = new k1[paramArrayOfj1.length];
    for (paramInt = 0; paramInt < paramArrayOfj1.length; paramInt++)
    {
      paramArrayOfj1[paramInt].i(paramInt, parama0);
      c[paramInt] = paramArrayOfj1[paramInt].k();
    }
    w = new k(this, paramc);
    x = new ArrayList();
    b = Collections.newSetFromMap(new IdentityHashMap());
    s = new r1.c();
    t = new r1.b();
    a = this;
    b = parame;
    V = true;
    paramArrayOfj1 = paramc.b(paramLooper, null);
    A = new s0(parama, paramArrayOfj1);
    B = new z0(this, parama, paramArrayOfj1, parama0);
    paramArrayOfj1 = new HandlerThread("ExoPlayer:Playback", -16);
    q = paramArrayOfj1;
    paramArrayOfj1.start();
    paramArrayOfj1 = paramArrayOfj1.getLooper();
    r = paramArrayOfj1;
    p = paramc.b(paramArrayOfj1, this);
  }
  
  public static Pair<Object, Long> F(r1 paramr1, g paramg, boolean paramBoolean1, int paramInt, boolean paramBoolean2, r1.c paramc, r1.b paramb)
  {
    r1 localr1 = a;
    if (paramr1.p()) {
      return null;
    }
    if (localr1.p()) {
      localr1 = paramr1;
    }
    try
    {
      Pair localPair1 = localr1.i(paramc, paramb, b, c);
      if (paramr1.equals(localr1)) {
        return localPair1;
      }
      if (paramr1.b(first) != -1)
      {
        Pair localPair2 = localPair1;
        if (gfirst, paramb).f)
        {
          localPair2 = localPair1;
          if (mc, paramc).w == localr1.b(first)) {
            localPair2 = paramr1.i(paramc, paramb, gfirst, paramb).c, c);
          }
        }
        return localPair2;
      }
      if (paramBoolean1)
      {
        paramg = G(paramc, paramb, paramInt, paramBoolean2, first, localr1, paramr1);
        if (paramg != null) {
          return paramr1.i(paramc, paramb, gc, -9223372036854775807L);
        }
      }
    }
    catch (IndexOutOfBoundsException paramr1)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static Object G(r1.c paramc, r1.b paramb, int paramInt, boolean paramBoolean, Object paramObject, r1 paramr11, r1 paramr12)
  {
    int i = paramr11.b(paramObject);
    int j = paramr11.h();
    int k = 0;
    int m = -1;
    while ((k < j) && (m == -1))
    {
      i = paramr11.d(i, paramb, paramc, paramInt, paramBoolean);
      if (i == -1) {
        break;
      }
      m = paramr12.b(paramr11.l(i));
      k++;
    }
    if (m == -1) {
      paramc = null;
    } else {
      paramc = paramr12.l(m);
    }
    return paramc;
  }
  
  public static void N(j1 paramj1, long paramLong)
  {
    paramj1.j();
    if ((paramj1 instanceof h5.n))
    {
      paramj1 = (h5.n)paramj1;
      x6.b.H(s);
      I = paramLong;
    }
  }
  
  public static boolean r(j1 paramj1)
  {
    boolean bool;
    if (paramj1.e() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void A()
  {
    float f1 = w.f().a;
    Object localObject1 = A;
    q0 localq0 = h;
    localObject1 = i;
    int i = 1;
    while ((localq0 != null) && (d))
    {
      Object localObject2 = localq0.g(f1, F.a);
      Object localObject3 = n;
      int j;
      if ((localObject3 != null) && (c.length == c.length))
      {
        for (j = 0; j < c.length; j++) {
          if (!((p)localObject2).a((p)localObject3, j)) {
            break label127;
          }
        }
        j = 1;
      }
      else
      {
        label127:
        j = 0;
      }
      if (j == 0)
      {
        localObject1 = A;
        if (i != 0)
        {
          localq0 = h;
          boolean bool = ((s0)localObject1).l(localq0);
          localObject1 = new boolean[a.length];
          long l = localq0.a((p)localObject2, F.r, bool, (boolean[])localObject1);
          localObject2 = F;
          if ((e != 4) && (l != r)) {
            bool = true;
          } else {
            bool = false;
          }
          localObject2 = F;
          F = p(b, l, c, d, bool, 5);
          if (bool) {
            D(l);
          }
          localObject2 = new boolean[a.length];
          for (i = 0;; i++)
          {
            localObject3 = a;
            if (i >= localObject3.length) {
              break;
            }
            j1 localj1 = localObject3[i];
            bool = r(localj1);
            localObject2[i] = bool;
            localObject3 = c[i];
            if (bool) {
              if (localObject3 != localj1.r()) {
                d(localj1);
              } else if (localObject1[i] != 0) {
                localj1.u(T);
              }
            }
          }
          f((boolean[])localObject2);
        }
        else
        {
          ((s0)localObject1).l(localq0);
          if (d) {
            localq0.a((p)localObject2, Math.max(f.b, T - o), false, new boolean[i.length]);
          }
        }
        l(true);
        if (F.e != 4)
        {
          t();
          e0();
          p.i(2);
        }
        return;
      }
      if (localq0 == localObject1) {
        i = 0;
      }
      localq0 = l;
    }
  }
  
  public final void B(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    p.j(2);
    Object localObject1 = null;
    W = null;
    K = false;
    Object localObject2 = w;
    f = false;
    localObject2 = a;
    if (b)
    {
      ((y)localObject2).a(((y)localObject2).l());
      b = false;
    }
    T = 1000000000000L;
    for (localObject2 : a)
    {
      try
      {
        d((j1)localObject2);
      }
      catch (RuntimeException localRuntimeException1) {}catch (n localn) {}
      m.d("ExoPlayerImplInternal", "Disable failed.", localn);
    }
    if (paramBoolean1) {
      for (??? : a) {
        if (b.remove(???)) {
          try
          {
            ???.reset();
          }
          catch (RuntimeException localRuntimeException2)
          {
            m.d("ExoPlayerImplInternal", "Reset failed.", localRuntimeException2);
          }
        }
      }
    }
    R = 0;
    Object localObject4 = F;
    ??? = b;
    long l1 = r;
    paramBoolean1 = F.b.a();
    ??? = 1;
    Object localObject5;
    Object localObject6;
    if (!paramBoolean1)
    {
      localObject5 = F;
      localObject6 = t;
      localObject4 = b;
      localObject5 = a;
      if ((!((r1)localObject5).p()) && (!ga, (r1.b)localObject6).f)) {
        ??? = 0;
      } else {
        ??? = 1;
      }
      if (??? == 0)
      {
        l2 = F.r;
        break label345;
      }
    }
    long l2 = F.c;
    label345:
    if (paramBoolean2)
    {
      S = null;
      ??? = i(F.a);
      localObject4 = (t.b)first;
      long l3 = ((Long)second).longValue();
      long l4 = -9223372036854775807L;
      ??? = localObject4;
      l1 = l3;
      l2 = l4;
      if (!((s)localObject4).equals(F.b))
      {
        ??? = localObject4;
        l1 = l3;
        ??? = ???;
        l2 = l4;
        break label444;
      }
    }
    ??? = 0;
    label444:
    A.b();
    L = false;
    d1 locald1 = F;
    r1 localr1 = a;
    ??? = e;
    if (paramBoolean4) {
      localObject4 = localObject1;
    } else {
      localObject4 = f;
    }
    if (??? != 0) {
      localObject1 = j0.d;
    } else {
      localObject1 = h;
    }
    if (??? != 0) {
      localObject6 = e;
    } else {
      localObject6 = i;
    }
    if (??? != 0)
    {
      localObject5 = o7.t.b;
      localObject5 = o7.l0.e;
    }
    else
    {
      localObject5 = j;
    }
    F = new d1(localr1, (t.b)???, l2, l1, ???, (n)localObject4, false, (j0)localObject1, (p)localObject6, (List)localObject5, (t.b)???, l, m, n, l1, 0L, l1, false);
    if (paramBoolean3)
    {
      localObject6 = B;
      ??? = f.values().iterator();
      while (((Iterator)???).hasNext())
      {
        localObject1 = (z0.b)((Iterator)???).next();
        try
        {
          a.a(b);
        }
        catch (RuntimeException localRuntimeException3)
        {
          m.d("MediaSourceList", "Failed to release child source.", localRuntimeException3);
        }
        a.m(c);
        a.c(c);
      }
      f.clear();
      g.clear();
      k = false;
    }
  }
  
  public final void C()
  {
    q0 localq0 = A.h;
    boolean bool;
    if ((localq0 != null) && (f.h) && (I)) {
      bool = true;
    } else {
      bool = false;
    }
    J = bool;
  }
  
  public final void D(long paramLong)
  {
    Object localObject = A.h;
    if (localObject == null) {}
    for (long l = 1000000000000L;; l = o)
    {
      paramLong += l;
      break;
    }
    T = paramLong;
    w.a.a(paramLong);
    j1 localj1;
    for (localj1 : a) {
      if (r(localj1)) {
        localj1.u(T);
      }
    }
    for (localObject = A.h; localObject != null; localObject = l) {
      for (localj1 : n.c) {
        if (localj1 != null) {
          localj1.t();
        }
      }
    }
  }
  
  public final void E(r1 paramr11, r1 paramr12)
  {
    if ((paramr11.p()) && (paramr12.p())) {
      return;
    }
    int i = x.size() - 1;
    if (i < 0)
    {
      Collections.sort(x);
      return;
    }
    ((c)x.get(i)).getClass();
    throw null;
  }
  
  public final void H(long paramLong1, long paramLong2)
  {
    p.h(paramLong1 + paramLong2);
  }
  
  public final void I(boolean paramBoolean)
  {
    t.b localb = A.h.f.a;
    long l = K(localb, F.r, true, false);
    if (l != F.r)
    {
      d1 locald1 = F;
      F = p(localb, l, c, d, paramBoolean, 5);
    }
  }
  
  /* Error */
  public final void J(g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 160	v3/g0:G	Lv3/g0$d;
    //   4: astore_2
    //   5: iconst_1
    //   6: istore_3
    //   7: aload_2
    //   8: iconst_1
    //   9: invokevirtual 640	v3/g0$d:a	(I)V
    //   12: aload_0
    //   13: getfield 155	v3/g0:F	Lv3/d1;
    //   16: getfield 353	v3/d1:a	Lv3/r1;
    //   19: aload_1
    //   20: iconst_1
    //   21: aload_0
    //   22: getfield 119	v3/g0:M	I
    //   25: aload_0
    //   26: getfield 121	v3/g0:N	Z
    //   29: aload_0
    //   30: getfield 202	v3/g0:s	Lv3/r1$c;
    //   33: aload_0
    //   34: getfield 207	v3/g0:t	Lv3/r1$b;
    //   37: invokestatic 642	v3/g0:F	(Lv3/r1;Lv3/g0$g;ZIZLv3/r1$c;Lv3/r1$b;)Landroid/util/Pair;
    //   40: astore 4
    //   42: ldc2_w 132
    //   45: lstore 5
    //   47: aload 4
    //   49: ifnonnull +55 -> 104
    //   52: aload_0
    //   53: aload_0
    //   54: getfield 155	v3/g0:F	Lv3/d1;
    //   57: getfield 353	v3/d1:a	Lv3/r1;
    //   60: invokevirtual 496	v3/g0:i	(Lv3/r1;)Landroid/util/Pair;
    //   63: astore 7
    //   65: aload 7
    //   67: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   70: checkcast 498	z4/t$b
    //   73: astore_2
    //   74: aload 7
    //   76: getfield 501	android/util/Pair:second	Ljava/lang/Object;
    //   79: checkcast 503	java/lang/Long
    //   82: invokevirtual 506	java/lang/Long:longValue	()J
    //   85: lstore 8
    //   87: aload_0
    //   88: getfield 155	v3/g0:F	Lv3/d1;
    //   91: getfield 353	v3/d1:a	Lv3/r1;
    //   94: invokevirtual 268	v3/r1:p	()Z
    //   97: iconst_1
    //   98: ixor
    //   99: istore 10
    //   101: goto +171 -> 272
    //   104: aload 4
    //   106: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   109: astore_2
    //   110: aload 4
    //   112: getfield 501	android/util/Pair:second	Ljava/lang/Object;
    //   115: checkcast 503	java/lang/Long
    //   118: invokevirtual 506	java/lang/Long:longValue	()J
    //   121: lstore 5
    //   123: aload_1
    //   124: getfield 272	v3/g0$g:c	J
    //   127: ldc2_w 132
    //   130: lcmp
    //   131: ifne +11 -> 142
    //   134: ldc2_w 132
    //   137: lstore 8
    //   139: goto +7 -> 146
    //   142: lload 5
    //   144: lstore 8
    //   146: aload_0
    //   147: getfield 228	v3/g0:A	Lv3/s0;
    //   150: aload_0
    //   151: getfield 155	v3/g0:F	Lv3/d1;
    //   154: getfield 353	v3/d1:a	Lv3/r1;
    //   157: aload_2
    //   158: lload 5
    //   160: invokevirtual 645	v3/s0:n	(Lv3/r1;Ljava/lang/Object;J)Lz4/t$b;
    //   163: astore_2
    //   164: aload_2
    //   165: invokevirtual 489	z4/s:a	()Z
    //   168: ifeq +72 -> 240
    //   171: aload_0
    //   172: getfield 155	v3/g0:F	Lv3/d1;
    //   175: getfield 353	v3/d1:a	Lv3/r1;
    //   178: aload_2
    //   179: getfield 491	z4/s:a	Ljava/lang/Object;
    //   182: aload_0
    //   183: getfield 207	v3/g0:t	Lv3/r1$b;
    //   186: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   189: pop
    //   190: aload_0
    //   191: getfield 207	v3/g0:t	Lv3/r1$b;
    //   194: aload_2
    //   195: getfield 646	z4/s:b	I
    //   198: invokevirtual 649	v3/r1$b:f	(I)I
    //   201: aload_2
    //   202: getfield 650	z4/s:c	I
    //   205: if_icmpne +18 -> 223
    //   208: aload_0
    //   209: getfield 207	v3/g0:t	Lv3/r1$b;
    //   212: getfield 653	v3/r1$b:o	La5/a;
    //   215: getfield 656	a5/a:c	J
    //   218: lstore 5
    //   220: goto +6 -> 226
    //   223: lconst_0
    //   224: lstore 5
    //   226: lload 8
    //   228: lstore 11
    //   230: iconst_1
    //   231: istore 10
    //   233: lload 5
    //   235: lstore 8
    //   237: goto +39 -> 276
    //   240: aload_1
    //   241: getfield 272	v3/g0$g:c	J
    //   244: ldc2_w 132
    //   247: lcmp
    //   248: ifne +9 -> 257
    //   251: iconst_1
    //   252: istore 10
    //   254: goto +6 -> 260
    //   257: iconst_0
    //   258: istore 10
    //   260: lload 8
    //   262: lstore 11
    //   264: lload 5
    //   266: lstore 8
    //   268: lload 11
    //   270: lstore 5
    //   272: lload 5
    //   274: lstore 11
    //   276: aload_0
    //   277: getfield 155	v3/g0:F	Lv3/d1;
    //   280: getfield 353	v3/d1:a	Lv3/r1;
    //   283: invokevirtual 268	v3/r1:p	()Z
    //   286: ifeq +11 -> 297
    //   289: aload_0
    //   290: aload_1
    //   291: putfield 493	v3/g0:S	Lv3/g0$g;
    //   294: goto +32 -> 326
    //   297: aload 4
    //   299: ifnonnull +30 -> 329
    //   302: aload_0
    //   303: getfield 155	v3/g0:F	Lv3/d1;
    //   306: getfield 377	v3/d1:e	I
    //   309: iconst_1
    //   310: if_icmpeq +8 -> 318
    //   313: aload_0
    //   314: iconst_4
    //   315: invokevirtual 658	v3/g0:X	(I)V
    //   318: aload_0
    //   319: iconst_0
    //   320: iconst_1
    //   321: iconst_0
    //   322: iconst_1
    //   323: invokevirtual 660	v3/g0:B	(ZZZZ)V
    //   326: goto +119 -> 445
    //   329: aload_2
    //   330: aload_0
    //   331: getfield 155	v3/g0:F	Lv3/d1;
    //   334: getfield 380	v3/d1:b	Lz4/t$b;
    //   337: invokevirtual 507	z4/s:equals	(Ljava/lang/Object;)Z
    //   340: ifeq +127 -> 467
    //   343: aload_0
    //   344: getfield 228	v3/g0:A	Lv3/s0;
    //   347: getfield 346	v3/s0:h	Lv3/q0;
    //   350: astore_1
    //   351: aload_1
    //   352: ifnull +37 -> 389
    //   355: aload_1
    //   356: getfield 352	v3/q0:d	Z
    //   359: ifeq +30 -> 389
    //   362: lload 8
    //   364: lconst_0
    //   365: lcmp
    //   366: ifeq +23 -> 389
    //   369: aload_1
    //   370: getfield 663	v3/q0:a	Lz4/r;
    //   373: lload 8
    //   375: aload_0
    //   376: getfield 123	v3/g0:E	Lv3/n1;
    //   379: invokeinterface 668 4 0
    //   384: lstore 5
    //   386: goto +7 -> 393
    //   389: lload 8
    //   391: lstore 5
    //   393: lload 5
    //   395: invokestatic 673	v5/e0:R	(J)J
    //   398: aload_0
    //   399: getfield 155	v3/g0:F	Lv3/d1;
    //   402: getfield 372	v3/d1:r	J
    //   405: invokestatic 673	v5/e0:R	(J)J
    //   408: lcmp
    //   409: ifne +55 -> 464
    //   412: aload_0
    //   413: getfield 155	v3/g0:F	Lv3/d1;
    //   416: astore_1
    //   417: aload_1
    //   418: getfield 377	v3/d1:e	I
    //   421: istore 13
    //   423: iload 13
    //   425: iconst_2
    //   426: if_icmpeq +9 -> 435
    //   429: iload 13
    //   431: iconst_3
    //   432: if_icmpne +32 -> 464
    //   435: aload_1
    //   436: getfield 372	v3/d1:r	J
    //   439: lstore 5
    //   441: lload 5
    //   443: lstore 8
    //   445: aload_0
    //   446: aload_0
    //   447: aload_2
    //   448: lload 8
    //   450: lload 11
    //   452: lload 8
    //   454: iload 10
    //   456: iconst_2
    //   457: invokevirtual 386	v3/g0:p	(Lz4/t$b;JJJZI)Lv3/d1;
    //   460: putfield 155	v3/g0:F	Lv3/d1;
    //   463: return
    //   464: goto +7 -> 471
    //   467: lload 8
    //   469: lstore 5
    //   471: aload_0
    //   472: getfield 155	v3/g0:F	Lv3/d1;
    //   475: getfield 377	v3/d1:e	I
    //   478: iconst_4
    //   479: if_icmpne +9 -> 488
    //   482: iconst_1
    //   483: istore 14
    //   485: goto +6 -> 491
    //   488: iconst_0
    //   489: istore 14
    //   491: aload_0
    //   492: getfield 228	v3/g0:A	Lv3/s0;
    //   495: astore_1
    //   496: aload_1
    //   497: getfield 346	v3/s0:h	Lv3/q0;
    //   500: aload_1
    //   501: getfield 348	v3/s0:i	Lv3/q0;
    //   504: if_acmpeq +9 -> 513
    //   507: iconst_1
    //   508: istore 15
    //   510: goto +6 -> 516
    //   513: iconst_0
    //   514: istore 15
    //   516: aload_0
    //   517: aload_2
    //   518: lload 5
    //   520: iload 15
    //   522: iload 14
    //   524: invokevirtual 637	v3/g0:K	(Lz4/t$b;JZZ)J
    //   527: lstore 5
    //   529: lload 8
    //   531: lload 5
    //   533: lcmp
    //   534: ifeq +6 -> 540
    //   537: goto +5 -> 542
    //   540: iconst_0
    //   541: istore_3
    //   542: iload 10
    //   544: iload_3
    //   545: ior
    //   546: istore 10
    //   548: aload_0
    //   549: getfield 155	v3/g0:F	Lv3/d1;
    //   552: astore_1
    //   553: aload_1
    //   554: getfield 353	v3/d1:a	Lv3/r1;
    //   557: astore 4
    //   559: aload_0
    //   560: aload 4
    //   562: aload_2
    //   563: aload 4
    //   565: aload_1
    //   566: getfield 380	v3/d1:b	Lz4/t$b;
    //   569: lload 11
    //   571: iconst_1
    //   572: invokevirtual 677	v3/g0:f0	(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V
    //   575: lload 5
    //   577: lstore 8
    //   579: goto -134 -> 445
    //   582: astore_1
    //   583: lload 5
    //   585: lstore 8
    //   587: goto +4 -> 591
    //   590: astore_1
    //   591: aload_0
    //   592: aload_0
    //   593: aload_2
    //   594: lload 8
    //   596: lload 11
    //   598: lload 8
    //   600: iload 10
    //   602: iconst_2
    //   603: invokevirtual 386	v3/g0:p	(Lz4/t$b;JJJZI)Lv3/d1;
    //   606: putfield 155	v3/g0:F	Lv3/d1;
    //   609: aload_1
    //   610: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	611	0	this	g0
    //   0	611	1	paramg	g
    //   4	590	2	localObject1	Object
    //   6	540	3	bool1	boolean
    //   40	524	4	localObject2	Object
    //   45	539	5	l1	long
    //   63	12	7	localPair	Pair
    //   85	514	8	l2	long
    //   99	502	10	bool2	boolean
    //   228	369	11	l3	long
    //   421	12	13	i	int
    //   483	40	14	bool3	boolean
    //   508	13	15	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   548	575	582	finally
    //   276	294	590	finally
    //   302	318	590	finally
    //   318	326	590	finally
    //   329	351	590	finally
    //   355	362	590	finally
    //   369	386	590	finally
    //   393	423	590	finally
    //   435	441	590	finally
    //   471	482	590	finally
    //   491	507	590	finally
    //   516	529	590	finally
  }
  
  public final long K(t.b paramb, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    c0();
    K = false;
    if ((paramBoolean2) || (F.e == 3)) {
      X(2);
    }
    q0 localq01 = A.h;
    for (q0 localq02 = localq01; (localq02 != null) && (!paramb.equals(f.a)); localq02 = l) {}
    if ((paramBoolean1) || (localq01 != localq02) || ((localq02 != null) && (o + paramLong < 0L)))
    {
      paramb = a;
      int i = paramb.length;
      for (int j = 0; j < i; j++) {
        d(paramb[j]);
      }
      if (localq02 != null)
      {
        for (;;)
        {
          paramb = A;
          if (h == localq02) {
            break;
          }
          paramb.a();
        }
        paramb.l(localq02);
        o = 1000000000000L;
        f(new boolean[a.length]);
      }
    }
    paramb = A;
    if (localq02 != null)
    {
      paramb.l(localq02);
      long l;
      if (!d)
      {
        f = f.b(paramLong);
        l = paramLong;
      }
      else
      {
        l = paramLong;
        if (e)
        {
          l = a.l(paramLong);
          a.s(l - u, v);
        }
      }
      D(l);
      t();
      paramLong = l;
    }
    else
    {
      paramb.b();
      D(paramLong);
    }
    l(false);
    p.i(2);
    return paramLong;
  }
  
  /* Error */
  public final void L(g1 paramg1)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 698	v3/g1:f	Landroid/os/Looper;
    //   4: aload_0
    //   5: getfield 255	v3/g0:r	Landroid/os/Looper;
    //   8: if_acmpne +69 -> 77
    //   11: aload_1
    //   12: monitorenter
    //   13: aload_1
    //   14: monitorexit
    //   15: aload_1
    //   16: getfield 701	v3/g1:a	Lv3/g1$b;
    //   19: aload_1
    //   20: getfield 703	v3/g1:d	I
    //   23: aload_1
    //   24: getfield 705	v3/g1:e	Ljava/lang/Object;
    //   27: invokeinterface 710 3 0
    //   32: aload_1
    //   33: iconst_1
    //   34: invokevirtual 712	v3/g1:b	(Z)V
    //   37: aload_0
    //   38: getfield 155	v3/g0:F	Lv3/d1;
    //   41: getfield 377	v3/d1:e	I
    //   44: istore_2
    //   45: iload_2
    //   46: iconst_3
    //   47: if_icmpeq +8 -> 55
    //   50: iload_2
    //   51: iconst_2
    //   52: if_icmpne +40 -> 92
    //   55: aload_0
    //   56: getfield 257	v3/g0:p	Lv5/k;
    //   59: iconst_2
    //   60: invokeinterface 436 2 0
    //   65: pop
    //   66: goto +26 -> 92
    //   69: astore_3
    //   70: aload_1
    //   71: iconst_1
    //   72: invokevirtual 712	v3/g1:b	(Z)V
    //   75: aload_3
    //   76: athrow
    //   77: aload_0
    //   78: getfield 257	v3/g0:p	Lv5/k;
    //   81: bipush 15
    //   83: aload_1
    //   84: invokeinterface 715 3 0
    //   89: invokevirtual 719	v5/a0$a:a	()V
    //   92: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	g0
    //   0	93	1	paramg1	g1
    //   44	9	2	i	int
    //   69	7	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	32	69	finally
  }
  
  public final void M(g1 paramg1)
  {
    Looper localLooper = f;
    if (!localLooper.getThread().isAlive())
    {
      m.f("TAG", "Trying to send message on a dead thread.");
      paramg1.b(false);
      return;
    }
    y.b(localLooper, null).e(new x0.f(6, this, paramg1));
  }
  
  public final void O(boolean paramBoolean, AtomicBoolean paramAtomicBoolean)
  {
    if (O != paramBoolean)
    {
      O = paramBoolean;
      if (!paramBoolean) {
        for (j1 localj1 : a) {
          if ((!r(localj1)) && (b.remove(localj1))) {
            localj1.reset();
          }
        }
      }
    }
    if (paramAtomicBoolean != null) {
      try
      {
        paramAtomicBoolean.set(true);
        notifyAll();
      }
      finally {}
    }
  }
  
  public final void P(a parama)
  {
    G.a(1);
    if (c != -1) {
      S = new g(new h1(a, b), c, d);
    }
    z0 localz0 = B;
    List localList = a;
    parama = b;
    localz0.g(0, b.size());
    m(localz0.a(b.size(), localList, parama), false);
  }
  
  public final void Q(boolean paramBoolean)
  {
    if (paramBoolean == Q) {
      return;
    }
    Q = paramBoolean;
    if ((!paramBoolean) && (F.o)) {
      p.i(2);
    }
  }
  
  public final void R(boolean paramBoolean)
  {
    I = paramBoolean;
    C();
    if (J)
    {
      s0 locals0 = A;
      if (i != h)
      {
        I(true);
        l(false);
      }
    }
  }
  
  public final void S(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    G.a(paramBoolean2);
    Object localObject = G;
    a = true;
    f = true;
    g = paramInt2;
    F = F.c(paramInt1, paramBoolean1);
    K = false;
    for (localObject = A.h; localObject != null; localObject = l) {
      for (h localh : n.c) {
        if (localh != null) {
          localh.e();
        }
      }
    }
    if (!Y())
    {
      c0();
      e0();
    }
    else
    {
      paramInt1 = F.e;
      if (paramInt1 == 3) {
        a0();
      } else if (paramInt1 != 2) {
        return;
      }
      p.i(2);
    }
  }
  
  public final void T(e1 parame1)
  {
    p.j(16);
    w.c(parame1);
    parame1 = w.f();
    o(parame1, a, true, true);
  }
  
  public final void U(int paramInt)
  {
    M = paramInt;
    s0 locals0 = A;
    r1 localr1 = F.a;
    f = paramInt;
    if (!locals0.o(localr1)) {
      I(true);
    }
    l(false);
  }
  
  public final void V(boolean paramBoolean)
  {
    N = paramBoolean;
    s0 locals0 = A;
    r1 localr1 = F.a;
    g = paramBoolean;
    if (!locals0.o(localr1)) {
      I(true);
    }
    l(false);
  }
  
  public final void W(z4.e0 parame0)
  {
    G.a(1);
    z0 localz0 = B;
    int i = b.size();
    Object localObject = parame0;
    if (parame0.getLength() != i) {
      localObject = parame0.g().e(0, i);
    }
    j = ((z4.e0)localObject);
    m(localz0.c(), false);
  }
  
  public final void X(int paramInt)
  {
    d1 locald1 = F;
    if (e != paramInt)
    {
      if (paramInt != 2) {
        X = -9223372036854775807L;
      }
      F = locald1.f(paramInt);
    }
  }
  
  public final boolean Y()
  {
    d1 locald1 = F;
    boolean bool;
    if ((l) && (m == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean Z(r1 paramr1, t.b paramb)
  {
    boolean bool1 = paramb.a();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1) {
      if (paramr1.p())
      {
        bool3 = bool2;
      }
      else
      {
        paramr1.m(ga, t).c, s);
        bool3 = bool2;
        if (s.a())
        {
          paramr1 = s;
          bool3 = bool2;
          if (q)
          {
            bool3 = bool2;
            if (f != -9223372036854775807L) {
              bool3 = true;
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public final void a(z4.d0 paramd0)
  {
    paramd0 = (r)paramd0;
    p.k(9, paramd0).a();
  }
  
  public final void a0()
  {
    int i = 0;
    K = false;
    Object localObject = w;
    f = true;
    localObject = a;
    if (!b)
    {
      d = a.d();
      b = true;
    }
    localObject = a;
    int j = localObject.length;
    while (i < j)
    {
      j1 localj1 = localObject[i];
      if (r(localj1)) {
        localj1.start();
      }
      i++;
    }
  }
  
  public final void b(r paramr)
  {
    p.k(8, paramr).a();
  }
  
  public final void b0(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (O)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    B(paramBoolean1, false, true, false);
    G.a(paramBoolean2);
    f.i();
    X(1);
  }
  
  public final void c(a parama, int paramInt)
  {
    G.a(1);
    z0 localz0 = B;
    int i = paramInt;
    if (paramInt == -1) {
      i = b.size();
    }
    m(localz0.a(i, a, b), false);
  }
  
  public final void c0()
  {
    Object localObject = w;
    int i = 0;
    f = false;
    localObject = a;
    if (b)
    {
      ((y)localObject).a(((y)localObject).l());
      b = false;
    }
    j1[] arrayOfj1 = a;
    int j = arrayOfj1.length;
    while (i < j)
    {
      localObject = arrayOfj1[i];
      if ((r((j1)localObject)) && (((j1)localObject).e() == 2)) {
        ((j1)localObject).stop();
      }
      i++;
    }
  }
  
  public final void d(j1 paramj1)
  {
    int i;
    if (paramj1.e() != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    k localk = w;
    if (paramj1 == c)
    {
      d = null;
      c = null;
      e = true;
    }
    if (paramj1.e() == 2) {
      paramj1.stop();
    }
    paramj1.g();
    R -= 1;
  }
  
  public final void d0()
  {
    Object localObject = A.j;
    boolean bool;
    if ((!L) && ((localObject == null) || (!a.isLoading()))) {
      bool = false;
    } else {
      bool = true;
    }
    localObject = F;
    if (bool != g) {
      F = new d1(a, b, c, d, e, f, bool, h, i, j, k, l, m, n, p, q, r, o);
    }
  }
  
  public final void e()
  {
    long l1 = y.a();
    p.j(2);
    boolean bool1 = F.a.p();
    long l2 = -9223372036854775807L;
    Object localObject1;
    long l3;
    Object localObject2;
    label238:
    Object localObject3;
    Object localObject4;
    int j;
    label784:
    label787:
    label1297:
    int k;
    int m;
    if ((!bool1) && (B.k))
    {
      localObject1 = A;
      l3 = T;
      localObject1 = j;
      if (localObject1 != null)
      {
        if (l == null) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        x6.b.H(bool1);
        if (d) {
          a.h(l3 - o);
        }
      }
      localObject1 = A;
      localObject2 = j;
      if (localObject2 != null) {
        if (!f.i)
        {
          if ((d) && ((!e) || (a.g() == Long.MIN_VALUE))) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (j.f.e != -9223372036854775807L) && (k < 100)) {}
        }
        else
        {
          i = 0;
          break label238;
        }
      }
      i = 1;
      Object localObject5;
      if (i != 0)
      {
        localObject1 = A;
        l3 = T;
        localObject2 = F;
        localObject3 = j;
        if (localObject3 == null) {
          localObject1 = ((s0)localObject1).d(a, b, c, r);
        } else {
          localObject1 = ((s0)localObject1).c(a, (q0)localObject3, l3);
        }
        if (localObject1 != null)
        {
          localObject2 = A;
          localObject4 = c;
          r5.o localo = d;
          t5.o localo1 = f.h();
          localObject5 = B;
          p localp = e;
          localObject3 = j;
          if (localObject3 == null) {
            l3 = 1000000000000L;
          } else {
            l3 = o + f.e - b;
          }
          localObject4 = new q0((k1[])localObject4, l3, localo, localo1, (z0)localObject5, (r0)localObject1, localp);
          localObject3 = j;
          if (localObject3 != null)
          {
            if (localObject4 != l)
            {
              ((q0)localObject3).b();
              l = ((q0)localObject4);
              ((q0)localObject3).c();
            }
          }
          else
          {
            h = ((q0)localObject4);
            i = ((q0)localObject4);
          }
          l = null;
          j = ((q0)localObject4);
          k += 1;
          ((s0)localObject2).k();
          a.n(this, b);
          if (A.h == localObject4) {
            D(b);
          }
          l(false);
        }
      }
      if (L)
      {
        L = q();
        d0();
      }
      else
      {
        t();
      }
      localObject1 = A.i;
      if (localObject1 != null)
      {
        if ((l != null) && (!J))
        {
          if (d) {
            for (i = 0;; i++)
            {
              localObject2 = a;
              if (i >= localObject2.length) {
                break label784;
              }
              localObject2 = localObject2[i];
              localObject3 = c[i];
              if (((j1)localObject2).r() != localObject3) {
                break;
              }
              if ((localObject3 != null) && (!((j1)localObject2).h()))
              {
                localObject3 = l;
                if ((f.f) && (d) && (((localObject2 instanceof h5.n)) || ((localObject2 instanceof p4.f)) || (((j1)localObject2).t() >= ((q0)localObject3).e()))) {
                  j = 1;
                } else {
                  j = 0;
                }
                if (j == 0) {
                  break;
                }
              }
            }
          }
          i = 0;
          break label787;
          i = 1;
          if (i == 0) {
            break label1297;
          }
          localObject2 = l;
          if ((!d) && (T < ((q0)localObject2).e())) {
            break label1297;
          }
          localObject2 = n;
          localObject4 = A;
          localObject3 = i;
          if ((localObject3 != null) && (l != null)) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          x6.b.H(bool1);
          i = i.l;
          ((s0)localObject4).k();
          localObject3 = i;
          localObject4 = n;
          localObject5 = F.a;
          f0((r1)localObject5, f.a, (r1)localObject5, f.a, -9223372036854775807L, false);
          if ((d) && (a.o() != -9223372036854775807L))
          {
            l3 = ((q0)localObject3).e();
            localObject1 = a;
            j = localObject1.length;
            i = 0;
          }
        }
        while (i < j)
        {
          localObject2 = localObject1[i];
          if (((j1)localObject2).r() != null) {
            N((j1)localObject2, l3);
          }
          i++;
          continue;
          i = 0;
          while (i < a.length)
          {
            boolean bool2 = ((p)localObject2).b(i);
            bool1 = ((p)localObject4).b(i);
            if ((bool2) && (!a[i].v()))
            {
              if (c[i]).a == -2) {
                j = 1;
              } else {
                j = 0;
              }
              localObject5 = b[i];
              localObject1 = b[i];
              if ((!bool1) || (!((l1)localObject1).equals(localObject5)) || (j != 0)) {
                N(a[i], ((q0)localObject3).e());
              }
            }
            i++;
            continue;
            if ((f.i) || (J)) {
              for (i = 0;; i++)
              {
                localObject2 = a;
                if (i >= localObject2.length) {
                  break;
                }
                localObject3 = localObject2[i];
                localObject2 = c[i];
                if ((localObject2 != null) && (((j1)localObject3).r() == localObject2) && (((j1)localObject3).h()))
                {
                  l3 = f.e;
                  if ((l3 != -9223372036854775807L) && (l3 != Long.MIN_VALUE)) {
                    l3 += o;
                  } else {
                    l3 = -9223372036854775807L;
                  }
                  N((j1)localObject3, l3);
                }
              }
            }
          }
        }
      }
      localObject2 = A;
      localObject1 = i;
      if ((localObject1 != null) && (h != localObject1) && (!g))
      {
        localObject2 = n;
        j = 0;
        for (i = 0;; i++)
        {
          localObject3 = a;
          if (i >= localObject3.length) {
            break;
          }
          localObject4 = localObject3[i];
          if (r((j1)localObject4))
          {
            if (((j1)localObject4).r() != c[i]) {
              k = 1;
            } else {
              k = 0;
            }
            if ((!((p)localObject2).b(i)) || (k != 0)) {
              if (!((j1)localObject4).v())
              {
                localObject5 = c[i];
                if (localObject5 != null) {
                  k = ((r5.k)localObject5).length();
                } else {
                  k = 0;
                }
                localObject3 = new i0[k];
                for (m = 0; m < k; m++) {
                  localObject3[m] = ((r5.k)localObject5).b(m);
                }
                ((j1)localObject4).n((i0[])localObject3, c[i], ((q0)localObject1).e(), o);
              }
              else if (((j1)localObject4).d())
              {
                d((j1)localObject4);
              }
              else
              {
                j = 1;
              }
            }
          }
        }
        if ((j ^ 0x1) != 0) {
          f(new boolean[localObject3.length]);
        }
      }
      for (i = 0;; i = 1)
      {
        if ((Y()) && (!J))
        {
          localObject1 = A.h;
          if (localObject1 != null)
          {
            localObject1 = l;
            if ((localObject1 != null) && (T >= ((q0)localObject1).e()) && (g))
            {
              j = 1;
              break label1659;
            }
          }
        }
        j = 0;
        label1659:
        if (j == 0) {
          break;
        }
        if (i != 0) {
          u();
        }
        localObject1 = A.a();
        localObject1.getClass();
        if (F.b.a.equals(f.a.a))
        {
          localObject2 = F.b;
          if (b == -1)
          {
            localObject3 = f.a;
            if ((b == -1) && (e != e))
            {
              i = 1;
              break label1774;
            }
          }
        }
        i = 0;
        label1774:
        localObject2 = f;
        localObject1 = a;
        l3 = b;
        F = p((t.b)localObject1, l3, c, l3, i ^ 0x1, 0);
        C();
        e0();
      }
    }
    int i = F.e;
    if ((i != 1) && (i != 4))
    {
      localObject2 = A.h;
      if (localObject2 == null)
      {
        H(l1, 10L);
        return;
      }
      p2.m0.i("doSomeWork");
      e0();
      if (d)
      {
        l3 = SystemClock.elapsedRealtime();
        a.s(F.r - u, v);
        i = 1;
        j = i;
        k = 0;
        for (;;)
        {
          localObject1 = a;
          m = i;
          n = j;
          if (k >= localObject1.length) {
            break;
          }
          localObject1 = localObject1[k];
          int i1;
          if (!r((j1)localObject1))
          {
            n = i;
            i1 = j;
          }
          else
          {
            ((j1)localObject1).p(T, l3 * 1000L);
            if ((j != 0) && (((j1)localObject1).d())) {
              j = 1;
            } else {
              j = 0;
            }
            if (c[k] != ((j1)localObject1).r()) {
              m = 1;
            } else {
              m = 0;
            }
            if ((m == 0) && (((j1)localObject1).h())) {
              n = 1;
            } else {
              n = 0;
            }
            if ((m == 0) && (n == 0) && (!((j1)localObject1).b()) && (!((j1)localObject1).d())) {
              m = 0;
            } else {
              m = 1;
            }
            if ((i != 0) && (m != 0)) {
              i = 1;
            } else {
              i = 0;
            }
            n = i;
            i1 = j;
            if (m == 0)
            {
              ((j1)localObject1).s();
              i1 = j;
              n = i;
            }
          }
          k++;
          i = n;
          j = i1;
        }
      }
      a.j();
      m = 1;
      int n = m;
      l3 = f.e;
      if ((n != 0) && (d) && ((l3 == -9223372036854775807L) || (l3 <= F.r))) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i != 0) && (J))
      {
        J = false;
        S(F.m, 5, false, false);
      }
      if ((i != 0) && (f.i))
      {
        X(4);
      }
      else
      {
        localObject1 = F;
        if (e == 2)
        {
          if (R == 0)
          {
            bool1 = s();
          }
          else
          {
            if (m != 0)
            {
              if (g)
              {
                if (Z(a, A.h.f.a)) {
                  l3 = C.b();
                } else {
                  l3 = -9223372036854775807L;
                }
                localObject1 = A.j;
                if ((d) && ((!e) || (a.g() == Long.MIN_VALUE))) {
                  i = 1;
                } else {
                  i = 0;
                }
                if ((i != 0) && (f.i)) {
                  i = 1;
                } else {
                  i = 0;
                }
                if ((f.a.a()) && (!d)) {
                  j = 1;
                } else {
                  j = 0;
                }
                if ((i == 0) && (j == 0))
                {
                  localObject3 = f;
                  long l4 = F.p;
                  localObject1 = A.j;
                  if (localObject1 == null) {
                    l4 = 0L;
                  } else {
                    l4 = Math.max(0L, l4 - (T - o));
                  }
                  if (((n0)localObject3).g(l4, w.f().a, K, l3)) {}
                }
              }
            }
            else
            {
              bool1 = false;
              break label2610;
            }
            bool1 = true;
          }
          label2610:
          if (bool1)
          {
            X(3);
            W = null;
            if (!Y()) {
              break label2778;
            }
            a0();
            break label2778;
          }
        }
        if ((F.e != 3) || (R == 0 ? s() : m != 0)) {
          break label2778;
        }
        K = Y();
        X(2);
        if (K)
        {
          for (localObject1 = A.h; localObject1 != null; localObject1 = l) {
            for (localObject3 : n.c) {
              if (localObject3 != null) {
                ((h)localObject3).u();
              }
            }
          }
          C.c();
        }
      }
      c0();
      label2778:
      if (F.e == 2)
      {
        for (i = 0;; i++)
        {
          localObject1 = a;
          if (i >= localObject1.length) {
            break;
          }
          if ((r(localObject1[i])) && (a[i].r() == c[i])) {
            a[i].s();
          }
        }
        localObject1 = F;
        if ((!g) && (q < 500000L) && (q()))
        {
          i = 1;
          break label2900;
        }
      }
      i = 0;
      label2900:
      if (i == 0) {}
      for (l3 = l2;; l3 = y.d())
      {
        break;
        if (X != -9223372036854775807L) {
          break label2946;
        }
      }
      X = l3;
      label2946:
      if (y.d() - X < 4000L)
      {
        if ((Y()) && (F.e == 3)) {
          i = 1;
        } else {
          i = 0;
        }
        if ((Q) && (P) && (i != 0)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        localObject1 = F;
        if (o != bool1) {
          F = new d1(a, b, c, d, e, f, g, h, i, j, k, l, m, n, p, q, r, bool1);
        }
        P = false;
        if (!bool1)
        {
          j = F.e;
          if (j != 4)
          {
            if ((i == 0) && (j != 2))
            {
              if ((j != 3) || (R == 0)) {
                break label3206;
              }
              l3 = 1000L;
            }
            else
            {
              l3 = 10L;
            }
            H(l1, l3);
          }
        }
        label3206:
        p2.m0.B();
        return;
      }
      throw new IllegalStateException("Playback stuck buffering and not loading");
    }
  }
  
  public final void e0()
  {
    Object localObject1 = A.h;
    if (localObject1 == null) {
      return;
    }
    if (d) {
      l1 = a.o();
    } else {
      l1 = -9223372036854775807L;
    }
    Object localObject2;
    label437:
    long l2;
    if (l1 != -9223372036854775807L)
    {
      D(l1);
      if (l1 != F.r)
      {
        localObject1 = F;
        F = p(b, l1, c, l1, true, 5);
      }
      localObject1 = this;
      localObject2 = localObject1;
    }
    else
    {
      localObject2 = w;
      int i;
      if (localObject1 != A.i) {
        i = 1;
      } else {
        i = 0;
      }
      localObject3 = c;
      if ((localObject3 != null) && (!((j1)localObject3).d()) && ((c.b()) || ((i == 0) && (!c.h())))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        e = true;
        if (f)
        {
          localObject3 = a;
          if (!b)
          {
            d = a.d();
            b = true;
          }
        }
      }
      else
      {
        localObject4 = d;
        localObject4.getClass();
        l1 = ((v5.o)localObject4).l();
        if (e)
        {
          if (l1 < a.l())
          {
            localObject3 = a;
            if (!b) {
              break label437;
            }
            ((y)localObject3).a(((y)localObject3).l());
            b = false;
            break label437;
          }
          e = false;
          if (f)
          {
            localObject3 = a;
            if (!b)
            {
              d = a.d();
              b = true;
            }
          }
        }
        a.a(l1);
        localObject3 = ((v5.o)localObject4).f();
        if (!((e1)localObject3).equals(a.e))
        {
          a.c((e1)localObject3);
          b).p.k(16, localObject3).a();
        }
      }
      l2 = ((k)localObject2).l();
      T = l2;
      long l3 = o;
      l4 = F.r;
      if ((!x.isEmpty()) && (!F.b.a()))
      {
        l1 = l4;
        if (V)
        {
          l1 = l4 - 1L;
          V = false;
        }
        localObject1 = F;
        int j = a.b(b.a);
        i = Math.min(U, x.size());
        localObject1 = null;
        Object localObject5;
        if (i > 0)
        {
          localObject2 = this;
          localObject1 = localObject2;
          localObject5 = localObject1;
          localObject4 = null;
          localObject3 = localObject1;
        }
        else
        {
          localObject2 = this;
          localObject3 = localObject2;
          localObject4 = localObject3;
        }
        Object localObject6;
        for (;;)
        {
          localObject5 = localObject4;
          localObject6 = localObject2;
          localObject4 = localObject1;
          for (localObject2 = localObject5;; localObject2 = localObject5)
          {
            if (localObject1 == null) {
              break label686;
            }
            localObject1.getClass();
            if (j >= 0)
            {
              if (j != 0) {
                break label686;
              }
              localObject1.getClass();
              if (0L <= l1) {
                break label686;
              }
            }
            i--;
            if (i <= 0) {
              break;
            }
            localObject5 = localObject2;
            localObject2 = localObject6;
            localObject1 = (c)x.get(i - 1);
            localObject6 = localObject2;
          }
          localObject1 = localObject4;
          localObject4 = localObject2;
          localObject2 = localObject6;
        }
        label686:
        if (i < x.size()) {
          localObject4 = (c)x.get(i);
        }
        if (localObject4 != null) {
          localObject4.getClass();
        }
        if (localObject4 != null) {
          localObject4.getClass();
        }
        U = i;
      }
      else
      {
        localObject3 = this;
        localObject2 = localObject3;
      }
      F.r = (l2 - l3);
      localObject1 = localObject3;
    }
    Object localObject3 = A.j;
    F.p = ((q0)localObject3).d();
    localObject3 = F;
    long l1 = F.p;
    Object localObject4 = A.j;
    long l4 = 0L;
    if (localObject4 == null) {
      l1 = 0L;
    } else {
      l1 = Math.max(0L, l1 - (T - o));
    }
    q = l1;
    localObject3 = F;
    if ((l) && (e == 3) && (((g0)localObject2).Z(a, b)))
    {
      localObject4 = F;
      if (n.a == 1.0F)
      {
        localObject3 = C;
        l2 = ((g0)localObject2).g(a, b.a, r);
        l1 = F.p;
        localObject4 = A.j;
        if (localObject4 == null) {
          l1 = l4;
        } else {
          l1 = Math.max(0L, l1 - (T - o));
        }
        float f1 = ((m0)localObject3).a(l2, l1);
        if (w.f().a != f1)
        {
          localObject1 = new e1(f1, F.n.b);
          p.j(16);
          w.c((e1)localObject1);
          ((g0)localObject2).o(F.n, w.f().a, false, false);
        }
      }
    }
  }
  
  public final void f(boolean[] paramArrayOfBoolean)
  {
    q0 localq0 = A.i;
    p localp = n;
    for (int i = 0; i < a.length; i++) {
      if ((!localp.b(i)) && (b.remove(a[i]))) {
        a[i].reset();
      }
    }
    for (i = 0; i < a.length; i++) {
      if (localp.b(i))
      {
        int j = paramArrayOfBoolean[i];
        j1 localj1 = a[i];
        if (!r(localj1))
        {
          Object localObject1 = A;
          Object localObject2 = i;
          boolean bool;
          if (localObject2 == h) {
            bool = true;
          } else {
            bool = false;
          }
          Object localObject3 = n;
          localObject1 = b[i];
          h localh = c[i];
          int k;
          if (localh != null) {
            k = localh.length();
          } else {
            k = 0;
          }
          localObject3 = new i0[k];
          for (int m = 0; m < k; m++) {
            localObject3[m] = localh.b(m);
          }
          if ((Y()) && (F.e == 3)) {
            k = 1;
          } else {
            k = 0;
          }
          if ((j == 0) && (k != 0)) {
            j = 1;
          } else {
            j = 0;
          }
          R += 1;
          b.add(localj1);
          localj1.y((l1)localObject1, (i0[])localObject3, c[i], T, j, bool, ((q0)localObject2).e(), o);
          localj1.q(11, new f0(this));
          localObject2 = w;
          localObject2.getClass();
          localObject3 = localj1.w();
          if (localObject3 != null)
          {
            localObject1 = d;
            if (localObject3 != localObject1) {
              if (localObject1 == null)
              {
                d = ((v5.o)localObject3);
                c = localj1;
                ((v5.o)localObject3).c(a.e);
              }
              else
              {
                throw new n(2, 1000, new IllegalStateException("Multiple renderer media clocks enabled."));
              }
            }
          }
          if (k != 0) {
            localj1.start();
          }
        }
      }
    }
    g = true;
  }
  
  public final void f0(r1 paramr11, t.b paramb1, r1 paramr12, t.b paramb2, long paramLong, boolean paramBoolean)
  {
    if (!Z(paramr11, paramb1))
    {
      if (paramb1.a()) {
        paramr11 = e1.d;
      } else {
        paramr11 = F.n;
      }
      if (!w.f().equals(paramr11))
      {
        p.j(16);
        w.c(paramr11);
        o(F.n, a, false, false);
      }
      return;
    }
    paramr11.m(ga, t).c, s);
    C.d(s.s);
    if (paramLong != -9223372036854775807L)
    {
      C.e(g(paramr11, a, paramLong));
    }
    else
    {
      paramb1 = s.a;
      paramr11 = null;
      if (!paramr12.p()) {
        paramr11 = mga, t).c, s).a;
      }
      if ((!v5.e0.a(paramr11, paramb1)) || (paramBoolean)) {
        C.e(-9223372036854775807L);
      }
    }
  }
  
  public final long g(r1 paramr1, Object paramObject, long paramLong)
  {
    paramr1.m(gt).c, s);
    paramr1 = s;
    if ((f != -9223372036854775807L) && (paramr1.a()))
    {
      paramr1 = s;
      if (q) {
        return v5.e0.I(v5.e0.u(o) - s.f) - (paramLong + t.e);
      }
    }
    return -9223372036854775807L;
  }
  
  public final void g0(e parame, long paramLong)
  {
    try
    {
      long l1 = y.d();
      int i = 0;
      for (long l2 = paramLong;; l2 = l1 + paramLong - y.d())
      {
        boolean bool = ((Boolean)parame.get()).booleanValue();
        if ((bool) || (l2 <= 0L)) {
          break;
        }
        try
        {
          y.c();
          wait(l2);
        }
        catch (InterruptedException localInterruptedException)
        {
          i = 1;
        }
      }
      if (i != 0) {
        Thread.currentThread().interrupt();
      }
      return;
    }
    finally {}
  }
  
  public final long h()
  {
    q0 localq0 = A.i;
    if (localq0 == null) {
      return 0L;
    }
    long l1 = o;
    if (!d) {
      return l1;
    }
    int i = 0;
    for (;;)
    {
      j1[] arrayOfj1 = a;
      if (i >= arrayOfj1.length) {
        break;
      }
      long l2 = l1;
      if (r(arrayOfj1[i])) {
        if (a[i].r() != c[i])
        {
          l2 = l1;
        }
        else
        {
          l2 = a[i].t();
          if (l2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
          }
          l2 = Math.max(l2, l1);
        }
      }
      i++;
      l1 = l2;
    }
    return l1;
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i = 1000;
    try
    {
      try
      {
        boolean bool;
        switch (what)
        {
        default: 
          return false;
        case 25: 
          I(true);
          break;
        case 24: 
          if (arg1 == 1) {
            bool = true;
          } else {
            bool = false;
          }
          Q(bool);
          break;
        case 23: 
          if (arg1 != 0) {
            bool = true;
          } else {
            bool = false;
          }
          R(bool);
          break;
        case 22: 
          v();
          break;
        case 21: 
          W((z4.e0)obj);
          break;
        case 20: 
          z(arg1, arg2, (z4.e0)obj);
          break;
        case 19: 
          w((b)obj);
          break;
        case 18: 
          c((a)obj, arg1);
          break;
        case 17: 
          P((a)obj);
          break;
        case 16: 
          paramMessage = (e1)obj;
          o(paramMessage, a, true, false);
          break;
        case 15: 
          M((g1)obj);
          break;
        case 14: 
          paramMessage = (g1)obj;
          paramMessage.getClass();
          L(paramMessage);
          break;
        case 13: 
          if (arg1 != 0) {
            bool = true;
          } else {
            bool = false;
          }
          O(bool, (AtomicBoolean)obj);
          break;
        case 12: 
          if (arg1 != 0) {
            bool = true;
          } else {
            bool = false;
          }
          V(bool);
          break;
        case 11: 
          U(arg1);
          break;
        case 10: 
          A();
          break;
        case 9: 
          j((r)obj);
          break;
        case 8: 
          n((r)obj);
          break;
        case 7: 
          y();
          return true;
        case 6: 
          b0(false, true);
          break;
        case 5: 
          E = ((n1)obj);
          break;
        case 4: 
          T((e1)obj);
          break;
        case 3: 
          J((g)obj);
          break;
        case 2: 
          e();
          break;
        case 1: 
          if (arg1 != 0) {
            bool = true;
          } else {
            bool = false;
          }
          S(arg2, 1, bool, true);
          break;
        case 0: 
          x();
        }
      }
      catch (RuntimeException paramMessage)
      {
        if (((paramMessage instanceof IllegalStateException)) || ((paramMessage instanceof IllegalArgumentException))) {
          i = 1004;
        }
        paramMessage = new n(2, i, paramMessage);
        break label799;
      }
      catch (IOException paramMessage)
      {
        i = 2000;
      }
      catch (z4.b paramMessage)
      {
        i = 1002;
      }
      catch (l paramMessage)
      {
        i = a;
      }
      catch (a1 paramMessage)
      {
        int j = b;
        if (j == 1) {
          if (a) {
            i = 3001;
          } else {
            i = 3003;
          }
        }
        for (;;)
        {
          break;
          if (j != 4) {
            break;
          }
          if (a) {
            i = 3002;
          } else {
            i = 3004;
          }
        }
        k(paramMessage, i);
      }
      catch (e.a paramMessage)
      {
        i = a;
      }
      k(paramMessage, i);
    }
    catch (n localn)
    {
      paramMessage = localn;
      Object localObject;
      if (c == 1)
      {
        localObject = A.i;
        paramMessage = localn;
        if (localObject != null) {
          paramMessage = localn.a(f.a);
        }
      }
      Message localMessage = paramMessage;
      if ((q) && (W == null))
      {
        m.g("ExoPlayerImplInternal", "Recoverable renderer error", localMessage);
        W = localMessage;
        paramMessage = p;
        paramMessage.c(paramMessage.k(25, localMessage));
      }
      else
      {
        localObject = W;
        paramMessage = localMessage;
        if (localObject != null)
        {
          ((Throwable)localObject).addSuppressed(localMessage);
          paramMessage = W;
        }
        label799:
        m.d("ExoPlayerImplInternal", "Playback error", paramMessage);
        b0(true, false);
        F = F.d(paramMessage);
      }
    }
    u();
    return true;
  }
  
  public final Pair<t.b, Long> i(r1 paramr1)
  {
    boolean bool = paramr1.p();
    long l1 = 0L;
    if (bool) {
      return Pair.create(d1.s, Long.valueOf(0L));
    }
    int i = paramr1.a(N);
    Pair localPair = paramr1.i(s, t, i, -9223372036854775807L);
    t.b localb = A.n(paramr1, first, 0L);
    long l2 = ((Long)second).longValue();
    if (localb.a())
    {
      paramr1.g(a, t);
      l2 = l1;
      if (c == t.f(b)) {
        l2 = t.o.c;
      }
    }
    return Pair.create(localb, Long.valueOf(l2));
  }
  
  public final void j(r paramr)
  {
    q0 localq0 = A.j;
    boolean bool = true;
    int i;
    if ((localq0 != null) && (a == paramr)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    long l = T;
    if (localq0 != null)
    {
      if (l != null) {
        bool = false;
      }
      x6.b.H(bool);
      if (d) {
        a.h(l - o);
      }
    }
    t();
  }
  
  public final void k(IOException paramIOException, int paramInt)
  {
    n localn = new n(0, paramInt, paramIOException);
    q0 localq0 = A.h;
    paramIOException = localn;
    if (localq0 != null) {
      paramIOException = localn.a(f.a);
    }
    m.d("ExoPlayerImplInternal", "Playback error", paramIOException);
    b0(false, false);
    F = F.d(paramIOException);
  }
  
  public final void l(boolean paramBoolean)
  {
    q0 localq01 = A.j;
    if (localq01 == null) {
      localObject = F.b;
    } else {
      localObject = f.a;
    }
    boolean bool = F.k.equals(localObject) ^ true;
    if (bool) {
      F = F.a((t.b)localObject);
    }
    Object localObject = F;
    if (localq01 == null) {
      l1 = r;
    } else {
      l1 = localq01.d();
    }
    p = l1;
    localObject = F;
    long l2 = p;
    q0 localq02 = A.j;
    long l1 = 0L;
    if (localq02 != null) {
      l1 = Math.max(0L, l2 - (T - o));
    }
    q = l1;
    if (((bool) || (paramBoolean)) && (localq01 != null) && (d))
    {
      localObject = n;
      f.a(a, c);
    }
  }
  
  /* Error */
  public final void m(r1 paramr1, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 155	v3/g0:F	Lv3/d1;
    //   4: astore_3
    //   5: aload_0
    //   6: getfield 493	v3/g0:S	Lv3/g0$g;
    //   9: astore 4
    //   11: aload_0
    //   12: getfield 228	v3/g0:A	Lv3/s0;
    //   15: astore 5
    //   17: aload_0
    //   18: getfield 119	v3/g0:M	I
    //   21: istore 6
    //   23: aload_0
    //   24: getfield 121	v3/g0:N	Z
    //   27: istore 7
    //   29: aload_0
    //   30: getfield 202	v3/g0:s	Lv3/r1$c;
    //   33: astore 8
    //   35: aload_0
    //   36: getfield 207	v3/g0:t	Lv3/r1$b;
    //   39: astore 9
    //   41: aload_1
    //   42: invokevirtual 268	v3/r1:p	()Z
    //   45: ifeq +25 -> 70
    //   48: new 33	v3/g0$f
    //   51: dup
    //   52: getstatic 1229	v3/d1:s	Lz4/t$b;
    //   55: lconst_0
    //   56: ldc2_w 132
    //   59: iconst_0
    //   60: iconst_1
    //   61: iconst_0
    //   62: invokespecial 1250	v3/g0$f:<init>	(Lz4/t$b;JJZZZ)V
    //   65: astore 10
    //   67: goto +978 -> 1045
    //   70: aload_3
    //   71: getfield 380	v3/d1:b	Lz4/t$b;
    //   74: astore 11
    //   76: aload 11
    //   78: getfield 491	z4/s:a	Ljava/lang/Object;
    //   81: astore 10
    //   83: aload_3
    //   84: getfield 353	v3/d1:a	Lv3/r1;
    //   87: astore 12
    //   89: aload 12
    //   91: invokevirtual 268	v3/r1:p	()Z
    //   94: ifne +30 -> 124
    //   97: aload 12
    //   99: aload 11
    //   101: getfield 491	z4/s:a	Ljava/lang/Object;
    //   104: aload 9
    //   106: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   109: getfield 293	v3/r1$b:f	Z
    //   112: ifeq +6 -> 118
    //   115: goto +9 -> 124
    //   118: iconst_0
    //   119: istore 13
    //   121: goto +6 -> 127
    //   124: iconst_1
    //   125: istore 13
    //   127: aload_3
    //   128: getfield 380	v3/d1:b	Lz4/t$b;
    //   131: invokevirtual 489	z4/s:a	()Z
    //   134: ifne +20 -> 154
    //   137: iload 13
    //   139: ifeq +6 -> 145
    //   142: goto +12 -> 154
    //   145: aload_3
    //   146: getfield 372	v3/d1:r	J
    //   149: lstore 14
    //   151: goto +9 -> 160
    //   154: aload_3
    //   155: getfield 381	v3/d1:c	J
    //   158: lstore 14
    //   160: aload 4
    //   162: ifnull +160 -> 322
    //   165: aload_1
    //   166: aload 4
    //   168: iconst_1
    //   169: iload 6
    //   171: iload 7
    //   173: aload 8
    //   175: aload 9
    //   177: invokestatic 642	v3/g0:F	(Lv3/r1;Lv3/g0$g;ZIZLv3/r1$c;Lv3/r1$b;)Landroid/util/Pair;
    //   180: astore 12
    //   182: aload 12
    //   184: ifnonnull +27 -> 211
    //   187: aload_1
    //   188: iload 7
    //   190: invokevirtual 1240	v3/r1:a	(Z)I
    //   193: istore 6
    //   195: lload 14
    //   197: lstore 16
    //   199: iconst_0
    //   200: istore 18
    //   202: iconst_0
    //   203: istore 19
    //   205: iconst_1
    //   206: istore 7
    //   208: goto +95 -> 303
    //   211: aload 4
    //   213: getfield 272	v3/g0$g:c	J
    //   216: ldc2_w 132
    //   219: lcmp
    //   220: ifne +29 -> 249
    //   223: aload_1
    //   224: aload 12
    //   226: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   229: aload 9
    //   231: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   234: getfield 295	v3/r1$b:c	I
    //   237: istore 6
    //   239: lload 14
    //   241: lstore 16
    //   243: iconst_0
    //   244: istore 7
    //   246: goto +29 -> 275
    //   249: aload 12
    //   251: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   254: astore 10
    //   256: aload 12
    //   258: getfield 501	android/util/Pair:second	Ljava/lang/Object;
    //   261: checkcast 503	java/lang/Long
    //   264: invokevirtual 506	java/lang/Long:longValue	()J
    //   267: lstore 16
    //   269: iconst_1
    //   270: istore 7
    //   272: iconst_m1
    //   273: istore 6
    //   275: aload_3
    //   276: getfield 377	v3/d1:e	I
    //   279: iconst_4
    //   280: if_icmpne +9 -> 289
    //   283: iconst_1
    //   284: istore 18
    //   286: goto +6 -> 292
    //   289: iconst_0
    //   290: istore 18
    //   292: iconst_0
    //   293: istore 20
    //   295: iload 7
    //   297: istore 19
    //   299: iload 20
    //   301: istore 7
    //   303: iload 18
    //   305: istore 20
    //   307: iload 19
    //   309: istore 18
    //   311: iload 20
    //   313: istore 19
    //   315: aload 10
    //   317: astore 4
    //   319: goto +42 -> 361
    //   322: aload 10
    //   324: astore 4
    //   326: aload 11
    //   328: astore 12
    //   330: aload_3
    //   331: getfield 353	v3/d1:a	Lv3/r1;
    //   334: invokevirtual 268	v3/r1:p	()Z
    //   337: ifeq +43 -> 380
    //   340: aload_1
    //   341: iload 7
    //   343: invokevirtual 1240	v3/r1:a	(Z)I
    //   346: istore 6
    //   348: lload 14
    //   350: lstore 16
    //   352: iconst_0
    //   353: istore 18
    //   355: iconst_0
    //   356: istore 19
    //   358: iconst_0
    //   359: istore 7
    //   361: iload 19
    //   363: istore 20
    //   365: iload 7
    //   367: istore 19
    //   369: aload 4
    //   371: astore 10
    //   373: iload 20
    //   375: istore 7
    //   377: goto +262 -> 639
    //   380: aload_1
    //   381: aload 4
    //   383: invokevirtual 288	v3/r1:b	(Ljava/lang/Object;)I
    //   386: iconst_m1
    //   387: if_icmpne +61 -> 448
    //   390: aload 8
    //   392: aload 9
    //   394: iload 6
    //   396: iload 7
    //   398: aload 4
    //   400: aload_3
    //   401: getfield 353	v3/d1:a	Lv3/r1;
    //   404: aload_1
    //   405: invokestatic 304	v3/g0:G	(Lv3/r1$c;Lv3/r1$b;IZLjava/lang/Object;Lv3/r1;Lv3/r1;)Ljava/lang/Object;
    //   408: astore 4
    //   410: aload 4
    //   412: ifnonnull +17 -> 429
    //   415: aload_1
    //   416: iload 7
    //   418: invokevirtual 1240	v3/r1:a	(Z)I
    //   421: istore 6
    //   423: iconst_1
    //   424: istore 7
    //   426: goto +19 -> 445
    //   429: aload_1
    //   430: aload 4
    //   432: aload 9
    //   434: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   437: getfield 295	v3/r1$b:c	I
    //   440: istore 6
    //   442: iconst_0
    //   443: istore 7
    //   445: goto +28 -> 473
    //   448: lload 14
    //   450: ldc2_w 132
    //   453: lcmp
    //   454: ifne +22 -> 476
    //   457: aload_1
    //   458: aload 4
    //   460: aload 9
    //   462: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   465: getfield 295	v3/r1$b:c	I
    //   468: istore 6
    //   470: iconst_0
    //   471: istore 7
    //   473: goto +148 -> 621
    //   476: iload 13
    //   478: ifeq +137 -> 615
    //   481: aload_3
    //   482: getfield 353	v3/d1:a	Lv3/r1;
    //   485: astore 10
    //   487: aload 12
    //   489: astore 11
    //   491: aload 10
    //   493: aload 11
    //   495: getfield 491	z4/s:a	Ljava/lang/Object;
    //   498: aload 9
    //   500: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   503: pop
    //   504: aload_3
    //   505: getfield 353	v3/d1:a	Lv3/r1;
    //   508: aload 9
    //   510: getfield 295	v3/r1$b:c	I
    //   513: aload 8
    //   515: invokevirtual 299	v3/r1:m	(ILv3/r1$c;)Lv3/r1$c;
    //   518: getfield 301	v3/r1$c:w	I
    //   521: aload_3
    //   522: getfield 353	v3/d1:a	Lv3/r1;
    //   525: aload 11
    //   527: getfield 491	z4/s:a	Ljava/lang/Object;
    //   530: invokevirtual 288	v3/r1:b	(Ljava/lang/Object;)I
    //   533: if_icmpne +59 -> 592
    //   536: aload 9
    //   538: getfield 1099	v3/r1$b:e	J
    //   541: lstore 16
    //   543: aload_1
    //   544: aload 8
    //   546: aload 9
    //   548: aload_1
    //   549: aload 4
    //   551: aload 9
    //   553: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   556: getfield 295	v3/r1$b:c	I
    //   559: lload 14
    //   561: lload 16
    //   563: ladd
    //   564: invokevirtual 275	v3/r1:i	(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;
    //   567: astore 4
    //   569: aload 4
    //   571: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   574: astore 10
    //   576: aload 4
    //   578: getfield 501	android/util/Pair:second	Ljava/lang/Object;
    //   581: checkcast 503	java/lang/Long
    //   584: invokevirtual 506	java/lang/Long:longValue	()J
    //   587: lstore 16
    //   589: goto +11 -> 600
    //   592: aload 4
    //   594: astore 10
    //   596: lload 14
    //   598: lstore 16
    //   600: iconst_m1
    //   601: istore 6
    //   603: iconst_0
    //   604: istore 7
    //   606: iconst_0
    //   607: istore 19
    //   609: iconst_1
    //   610: istore 18
    //   612: goto +27 -> 639
    //   615: iconst_0
    //   616: istore 7
    //   618: iconst_m1
    //   619: istore 6
    //   621: lload 14
    //   623: lstore 16
    //   625: iconst_0
    //   626: istore 20
    //   628: iconst_0
    //   629: istore 18
    //   631: iload 7
    //   633: istore 19
    //   635: iload 20
    //   637: istore 7
    //   639: iload 6
    //   641: iconst_m1
    //   642: if_icmpeq +46 -> 688
    //   645: aload_1
    //   646: aload 8
    //   648: aload 9
    //   650: iload 6
    //   652: ldc2_w 132
    //   655: invokevirtual 275	v3/r1:i	(Lv3/r1$c;Lv3/r1$b;IJ)Landroid/util/Pair;
    //   658: astore 4
    //   660: aload 4
    //   662: getfield 285	android/util/Pair:first	Ljava/lang/Object;
    //   665: astore 10
    //   667: aload 4
    //   669: getfield 501	android/util/Pair:second	Ljava/lang/Object;
    //   672: checkcast 503	java/lang/Long
    //   675: invokevirtual 506	java/lang/Long:longValue	()J
    //   678: lstore 16
    //   680: ldc2_w 132
    //   683: lstore 21
    //   685: goto +7 -> 692
    //   688: lload 16
    //   690: lstore 21
    //   692: aload 5
    //   694: aload_1
    //   695: aload 10
    //   697: lload 16
    //   699: invokevirtual 645	v3/s0:n	(Lv3/r1;Ljava/lang/Object;J)Lz4/t$b;
    //   702: astore 4
    //   704: aload 4
    //   706: getfield 972	z4/s:e	I
    //   709: istore 23
    //   711: iload 23
    //   713: iconst_m1
    //   714: if_icmpeq +32 -> 746
    //   717: aload 11
    //   719: getfield 972	z4/s:e	I
    //   722: istore 6
    //   724: iload 6
    //   726: iconst_m1
    //   727: if_icmpeq +13 -> 740
    //   730: iload 23
    //   732: iload 6
    //   734: if_icmplt +6 -> 740
    //   737: goto +9 -> 746
    //   740: iconst_0
    //   741: istore 6
    //   743: goto +6 -> 749
    //   746: iconst_1
    //   747: istore 6
    //   749: aload 11
    //   751: getfield 491	z4/s:a	Ljava/lang/Object;
    //   754: aload 10
    //   756: invokevirtual 971	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   759: ifeq +30 -> 789
    //   762: aload 11
    //   764: invokevirtual 489	z4/s:a	()Z
    //   767: ifne +22 -> 789
    //   770: aload 4
    //   772: invokevirtual 489	z4/s:a	()Z
    //   775: ifne +14 -> 789
    //   778: iload 6
    //   780: ifeq +9 -> 789
    //   783: iconst_1
    //   784: istore 6
    //   786: goto +6 -> 792
    //   789: iconst_0
    //   790: istore 6
    //   792: aload_1
    //   793: aload 10
    //   795: aload 9
    //   797: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   800: astore 10
    //   802: iload 13
    //   804: ifne +119 -> 923
    //   807: lload 14
    //   809: lload 21
    //   811: lcmp
    //   812: ifne +111 -> 923
    //   815: aload 11
    //   817: getfield 491	z4/s:a	Ljava/lang/Object;
    //   820: aload 4
    //   822: getfield 491	z4/s:a	Ljava/lang/Object;
    //   825: invokevirtual 971	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   828: ifne +6 -> 834
    //   831: goto +92 -> 923
    //   834: aload 11
    //   836: invokevirtual 489	z4/s:a	()Z
    //   839: ifeq +57 -> 896
    //   842: aload 10
    //   844: aload 11
    //   846: getfield 646	z4/s:b	I
    //   849: invokevirtual 1252	v3/r1$b:g	(I)Z
    //   852: ifeq +44 -> 896
    //   855: aload 10
    //   857: aload 11
    //   859: getfield 646	z4/s:b	I
    //   862: aload 11
    //   864: getfield 650	z4/s:c	I
    //   867: invokevirtual 1254	v3/r1$b:e	(II)I
    //   870: iconst_4
    //   871: if_icmpeq +52 -> 923
    //   874: aload 10
    //   876: aload 11
    //   878: getfield 646	z4/s:b	I
    //   881: aload 11
    //   883: getfield 650	z4/s:c	I
    //   886: invokevirtual 1254	v3/r1$b:e	(II)I
    //   889: iconst_2
    //   890: if_icmpeq +33 -> 923
    //   893: goto +24 -> 917
    //   896: aload 4
    //   898: invokevirtual 489	z4/s:a	()Z
    //   901: ifeq +22 -> 923
    //   904: aload 10
    //   906: aload 4
    //   908: getfield 646	z4/s:b	I
    //   911: invokevirtual 1252	v3/r1$b:g	(I)Z
    //   914: ifeq +9 -> 923
    //   917: iconst_1
    //   918: istore 13
    //   920: goto +6 -> 926
    //   923: iconst_0
    //   924: istore 13
    //   926: iload 6
    //   928: ifne +12 -> 940
    //   931: aload 4
    //   933: astore 10
    //   935: iload 13
    //   937: ifeq +7 -> 944
    //   940: aload 11
    //   942: astore 10
    //   944: aload 10
    //   946: invokevirtual 489	z4/s:a	()Z
    //   949: ifeq +71 -> 1020
    //   952: aload 10
    //   954: aload 11
    //   956: invokevirtual 507	z4/s:equals	(Ljava/lang/Object;)Z
    //   959: ifeq +12 -> 971
    //   962: aload_3
    //   963: getfield 372	v3/d1:r	J
    //   966: lstore 14
    //   968: goto +49 -> 1017
    //   971: aload_1
    //   972: aload 10
    //   974: getfield 491	z4/s:a	Ljava/lang/Object;
    //   977: aload 9
    //   979: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   982: pop
    //   983: aload 10
    //   985: getfield 650	z4/s:c	I
    //   988: aload 9
    //   990: aload 10
    //   992: getfield 646	z4/s:b	I
    //   995: invokevirtual 649	v3/r1$b:f	(I)I
    //   998: if_icmpne +16 -> 1014
    //   1001: aload 9
    //   1003: getfield 653	v3/r1$b:o	La5/a;
    //   1006: getfield 656	a5/a:c	J
    //   1009: lstore 14
    //   1011: goto +6 -> 1017
    //   1014: lconst_0
    //   1015: lstore 14
    //   1017: goto +7 -> 1024
    //   1020: lload 16
    //   1022: lstore 14
    //   1024: new 33	v3/g0$f
    //   1027: dup
    //   1028: aload 10
    //   1030: lload 14
    //   1032: lload 21
    //   1034: iload 7
    //   1036: iload 19
    //   1038: iload 18
    //   1040: invokespecial 1250	v3/g0$f:<init>	(Lz4/t$b;JJZZZ)V
    //   1043: astore 10
    //   1045: aload 10
    //   1047: getfield 1255	v3/g0$f:a	Lz4/t$b;
    //   1050: astore 4
    //   1052: aload 10
    //   1054: getfield 1256	v3/g0$f:c	J
    //   1057: lstore 24
    //   1059: aload 10
    //   1061: getfield 1257	v3/g0$f:d	Z
    //   1064: istore 19
    //   1066: aload 10
    //   1068: getfield 1258	v3/g0$f:b	J
    //   1071: lstore 16
    //   1073: aload_0
    //   1074: getfield 155	v3/g0:F	Lv3/d1;
    //   1077: getfield 380	v3/d1:b	Lz4/t$b;
    //   1080: aload 4
    //   1082: invokevirtual 507	z4/s:equals	(Ljava/lang/Object;)Z
    //   1085: ifeq +25 -> 1110
    //   1088: lload 16
    //   1090: aload_0
    //   1091: getfield 155	v3/g0:F	Lv3/d1;
    //   1094: getfield 372	v3/d1:r	J
    //   1097: lcmp
    //   1098: ifeq +6 -> 1104
    //   1101: goto +9 -> 1110
    //   1104: iconst_0
    //   1105: istore 13
    //   1107: goto +6 -> 1113
    //   1110: iconst_1
    //   1111: istore 13
    //   1113: aload 10
    //   1115: getfield 1259	v3/g0$f:e	Z
    //   1118: ifeq +51 -> 1169
    //   1121: aload_0
    //   1122: getfield 155	v3/g0:F	Lv3/d1;
    //   1125: getfield 377	v3/d1:e	I
    //   1128: istore 6
    //   1130: iload 6
    //   1132: iconst_1
    //   1133: if_icmpeq +16 -> 1149
    //   1136: aload_0
    //   1137: iconst_4
    //   1138: invokevirtual 658	v3/g0:X	(I)V
    //   1141: goto +8 -> 1149
    //   1144: astore 11
    //   1146: goto +14 -> 1160
    //   1149: aload_0
    //   1150: iconst_0
    //   1151: iconst_0
    //   1152: iconst_0
    //   1153: iconst_1
    //   1154: invokevirtual 660	v3/g0:B	(ZZZZ)V
    //   1157: goto +12 -> 1169
    //   1160: iconst_4
    //   1161: istore 6
    //   1163: iconst_1
    //   1164: istore 7
    //   1166: goto +425 -> 1591
    //   1169: iload 13
    //   1171: ifne +59 -> 1230
    //   1174: aload_0
    //   1175: getfield 228	v3/g0:A	Lv3/s0;
    //   1178: astore 11
    //   1180: aload_0
    //   1181: getfield 402	v3/g0:T	J
    //   1184: lstore 26
    //   1186: aload_0
    //   1187: invokevirtual 1261	v3/g0:h	()J
    //   1190: lstore 28
    //   1192: lload 16
    //   1194: lstore 21
    //   1196: lload 21
    //   1198: lstore 14
    //   1200: aload 11
    //   1202: aload_1
    //   1203: lload 26
    //   1205: lload 28
    //   1207: invokevirtual 1264	v3/s0:p	(Lv3/r1;JJ)Z
    //   1210: ifne +140 -> 1350
    //   1213: aload_0
    //   1214: iconst_0
    //   1215: invokevirtual 791	v3/g0:I	(Z)V
    //   1218: lload 21
    //   1220: lstore 14
    //   1222: goto +128 -> 1350
    //   1225: astore 11
    //   1227: goto -67 -> 1160
    //   1230: lload 16
    //   1232: lstore 21
    //   1234: lload 21
    //   1236: lstore 14
    //   1238: aload_1
    //   1239: invokevirtual 268	v3/r1:p	()Z
    //   1242: ifne +108 -> 1350
    //   1245: aload_0
    //   1246: getfield 228	v3/g0:A	Lv3/s0;
    //   1249: getfield 346	v3/s0:h	Lv3/q0;
    //   1252: astore 11
    //   1254: aload 11
    //   1256: ifnull +52 -> 1308
    //   1259: aload 11
    //   1261: getfield 410	v3/q0:f	Lv3/r0;
    //   1264: getfield 634	v3/r0:a	Lz4/t$b;
    //   1267: aload 4
    //   1269: invokevirtual 507	z4/s:equals	(Ljava/lang/Object;)Z
    //   1272: ifeq +26 -> 1298
    //   1275: aload 11
    //   1277: aload_0
    //   1278: getfield 228	v3/g0:A	Lv3/s0;
    //   1281: aload_1
    //   1282: aload 11
    //   1284: getfield 410	v3/q0:f	Lv3/r0;
    //   1287: invokevirtual 1267	v3/s0:h	(Lv3/r1;Lv3/r0;)Lv3/r0;
    //   1290: putfield 410	v3/q0:f	Lv3/r0;
    //   1293: aload 11
    //   1295: invokevirtual 1269	v3/q0:h	()V
    //   1298: aload 11
    //   1300: getfield 438	v3/q0:l	Lv3/q0;
    //   1303: astore 11
    //   1305: goto -51 -> 1254
    //   1308: aload_0
    //   1309: getfield 228	v3/g0:A	Lv3/s0;
    //   1312: astore 11
    //   1314: aload 11
    //   1316: getfield 346	v3/s0:h	Lv3/q0;
    //   1319: aload 11
    //   1321: getfield 348	v3/s0:i	Lv3/q0;
    //   1324: if_acmpeq +9 -> 1333
    //   1327: iconst_1
    //   1328: istore 7
    //   1330: goto +6 -> 1336
    //   1333: iconst_0
    //   1334: istore 7
    //   1336: aload_0
    //   1337: aload 4
    //   1339: lload 21
    //   1341: iload 7
    //   1343: iload 19
    //   1345: invokevirtual 637	v3/g0:K	(Lz4/t$b;JZZ)J
    //   1348: lstore 14
    //   1350: iconst_1
    //   1351: istore 7
    //   1353: aload_0
    //   1354: getfield 155	v3/g0:F	Lv3/d1;
    //   1357: astore 12
    //   1359: aload 12
    //   1361: getfield 353	v3/d1:a	Lv3/r1;
    //   1364: astore 11
    //   1366: aload 12
    //   1368: getfield 380	v3/d1:b	Lz4/t$b;
    //   1371: astore 12
    //   1373: aload 10
    //   1375: getfield 1270	v3/g0$f:f	Z
    //   1378: ifeq +10 -> 1388
    //   1381: lload 14
    //   1383: lstore 16
    //   1385: goto +8 -> 1393
    //   1388: ldc2_w 132
    //   1391: lstore 16
    //   1393: aload_0
    //   1394: aload_1
    //   1395: aload 4
    //   1397: aload 11
    //   1399: aload 12
    //   1401: lload 16
    //   1403: iconst_0
    //   1404: invokevirtual 677	v3/g0:f0	(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V
    //   1407: iload 13
    //   1409: ifne +16 -> 1425
    //   1412: lload 24
    //   1414: aload_0
    //   1415: getfield 155	v3/g0:F	Lv3/d1;
    //   1418: getfield 381	v3/d1:c	J
    //   1421: lcmp
    //   1422: ifeq +115 -> 1537
    //   1425: aload_0
    //   1426: getfield 155	v3/g0:F	Lv3/d1;
    //   1429: astore 10
    //   1431: aload 10
    //   1433: getfield 380	v3/d1:b	Lz4/t$b;
    //   1436: getfield 491	z4/s:a	Ljava/lang/Object;
    //   1439: astore 11
    //   1441: aload 10
    //   1443: getfield 353	v3/d1:a	Lv3/r1;
    //   1446: astore 10
    //   1448: iload 13
    //   1450: ifeq +38 -> 1488
    //   1453: iload_2
    //   1454: ifeq +34 -> 1488
    //   1457: aload 10
    //   1459: invokevirtual 268	v3/r1:p	()Z
    //   1462: ifne +26 -> 1488
    //   1465: aload 10
    //   1467: aload 11
    //   1469: aload_0
    //   1470: getfield 207	v3/g0:t	Lv3/r1$b;
    //   1473: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   1476: getfield 293	v3/r1$b:f	Z
    //   1479: ifne +9 -> 1488
    //   1482: iload 7
    //   1484: istore_2
    //   1485: goto +5 -> 1490
    //   1488: iconst_0
    //   1489: istore_2
    //   1490: aload_0
    //   1491: getfield 155	v3/g0:F	Lv3/d1;
    //   1494: getfield 383	v3/d1:d	J
    //   1497: lstore 16
    //   1499: aload_1
    //   1500: aload 11
    //   1502: invokevirtual 288	v3/r1:b	(Ljava/lang/Object;)I
    //   1505: iconst_m1
    //   1506: if_icmpne +9 -> 1515
    //   1509: iconst_4
    //   1510: istore 6
    //   1512: goto +6 -> 1518
    //   1515: iconst_3
    //   1516: istore 6
    //   1518: aload_0
    //   1519: aload_0
    //   1520: aload 4
    //   1522: lload 14
    //   1524: lload 24
    //   1526: lload 16
    //   1528: iload_2
    //   1529: iload 6
    //   1531: invokevirtual 386	v3/g0:p	(Lz4/t$b;JJJZI)Lv3/d1;
    //   1534: putfield 155	v3/g0:F	Lv3/d1;
    //   1537: aload_0
    //   1538: invokevirtual 789	v3/g0:C	()V
    //   1541: aload_0
    //   1542: aload_1
    //   1543: aload_0
    //   1544: getfield 155	v3/g0:F	Lv3/d1;
    //   1547: getfield 353	v3/d1:a	Lv3/r1;
    //   1550: invokevirtual 1272	v3/g0:E	(Lv3/r1;Lv3/r1;)V
    //   1553: aload_0
    //   1554: aload_0
    //   1555: getfield 155	v3/g0:F	Lv3/d1;
    //   1558: aload_1
    //   1559: invokevirtual 1275	v3/d1:g	(Lv3/r1;)Lv3/d1;
    //   1562: putfield 155	v3/g0:F	Lv3/d1;
    //   1565: aload_1
    //   1566: invokevirtual 268	v3/r1:p	()Z
    //   1569: ifne +8 -> 1577
    //   1572: aload_0
    //   1573: aconst_null
    //   1574: putfield 493	v3/g0:S	Lv3/g0$g;
    //   1577: aload_0
    //   1578: iconst_0
    //   1579: invokevirtual 426	v3/g0:l	(Z)V
    //   1582: return
    //   1583: iconst_1
    //   1584: istore 7
    //   1586: iconst_4
    //   1587: istore 6
    //   1589: astore 11
    //   1591: goto +11 -> 1602
    //   1594: astore 11
    //   1596: iconst_4
    //   1597: istore 6
    //   1599: iconst_1
    //   1600: istore 7
    //   1602: aload_0
    //   1603: getfield 155	v3/g0:F	Lv3/d1;
    //   1606: astore 9
    //   1608: aload 9
    //   1610: getfield 353	v3/d1:a	Lv3/r1;
    //   1613: astore 12
    //   1615: aload 9
    //   1617: getfield 380	v3/d1:b	Lz4/t$b;
    //   1620: astore 9
    //   1622: aload 10
    //   1624: getfield 1270	v3/g0$f:f	Z
    //   1627: ifeq +10 -> 1637
    //   1630: lload 16
    //   1632: lstore 14
    //   1634: goto +8 -> 1642
    //   1637: ldc2_w 132
    //   1640: lstore 14
    //   1642: aload_0
    //   1643: aload_1
    //   1644: aload 4
    //   1646: aload 12
    //   1648: aload 9
    //   1650: lload 14
    //   1652: iconst_0
    //   1653: invokevirtual 677	v3/g0:f0	(Lv3/r1;Lz4/t$b;Lv3/r1;Lz4/t$b;JZ)V
    //   1656: iload 13
    //   1658: ifne +16 -> 1674
    //   1661: lload 24
    //   1663: aload_0
    //   1664: getfield 155	v3/g0:F	Lv3/d1;
    //   1667: getfield 381	v3/d1:c	J
    //   1670: lcmp
    //   1671: ifeq +111 -> 1782
    //   1674: aload_0
    //   1675: getfield 155	v3/g0:F	Lv3/d1;
    //   1678: astore 12
    //   1680: aload 12
    //   1682: getfield 380	v3/d1:b	Lz4/t$b;
    //   1685: getfield 491	z4/s:a	Ljava/lang/Object;
    //   1688: astore 10
    //   1690: aload 12
    //   1692: getfield 353	v3/d1:a	Lv3/r1;
    //   1695: astore 12
    //   1697: iload 13
    //   1699: ifeq +35 -> 1734
    //   1702: iload_2
    //   1703: ifeq +31 -> 1734
    //   1706: aload 12
    //   1708: invokevirtual 268	v3/r1:p	()Z
    //   1711: ifne +23 -> 1734
    //   1714: aload 12
    //   1716: aload 10
    //   1718: aload_0
    //   1719: getfield 207	v3/g0:t	Lv3/r1$b;
    //   1722: invokevirtual 291	v3/r1:g	(Ljava/lang/Object;Lv3/r1$b;)Lv3/r1$b;
    //   1725: getfield 293	v3/r1$b:f	Z
    //   1728: ifne +6 -> 1734
    //   1731: goto +6 -> 1737
    //   1734: iconst_0
    //   1735: istore 7
    //   1737: aload_0
    //   1738: getfield 155	v3/g0:F	Lv3/d1;
    //   1741: getfield 383	v3/d1:d	J
    //   1744: lstore 14
    //   1746: aload_1
    //   1747: aload 10
    //   1749: invokevirtual 288	v3/r1:b	(Ljava/lang/Object;)I
    //   1752: iconst_m1
    //   1753: if_icmpne +6 -> 1759
    //   1756: goto +6 -> 1762
    //   1759: iconst_3
    //   1760: istore 6
    //   1762: aload_0
    //   1763: aload_0
    //   1764: aload 4
    //   1766: lload 16
    //   1768: lload 24
    //   1770: lload 14
    //   1772: iload 7
    //   1774: iload 6
    //   1776: invokevirtual 386	v3/g0:p	(Lz4/t$b;JJJZI)Lv3/d1;
    //   1779: putfield 155	v3/g0:F	Lv3/d1;
    //   1782: aload_0
    //   1783: invokevirtual 789	v3/g0:C	()V
    //   1786: aload_0
    //   1787: aload_1
    //   1788: aload_0
    //   1789: getfield 155	v3/g0:F	Lv3/d1;
    //   1792: getfield 353	v3/d1:a	Lv3/r1;
    //   1795: invokevirtual 1272	v3/g0:E	(Lv3/r1;Lv3/r1;)V
    //   1798: aload_0
    //   1799: aload_0
    //   1800: getfield 155	v3/g0:F	Lv3/d1;
    //   1803: aload_1
    //   1804: invokevirtual 1275	v3/d1:g	(Lv3/r1;)Lv3/d1;
    //   1807: putfield 155	v3/g0:F	Lv3/d1;
    //   1810: aload_1
    //   1811: invokevirtual 268	v3/r1:p	()Z
    //   1814: ifne +8 -> 1822
    //   1817: aload_0
    //   1818: aconst_null
    //   1819: putfield 493	v3/g0:S	Lv3/g0$g;
    //   1822: aload_0
    //   1823: iconst_0
    //   1824: invokevirtual 426	v3/g0:l	(Z)V
    //   1827: aload 11
    //   1829: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1830	0	this	g0
    //   0	1830	1	paramr1	r1
    //   0	1830	2	paramBoolean	boolean
    //   4	959	3	locald1	d1
    //   9	1756	4	localObject1	Object
    //   15	678	5	locals01	s0
    //   21	1754	6	i	int
    //   27	1746	7	bool1	boolean
    //   33	614	8	localc	r1.c
    //   39	1610	9	localObject2	Object
    //   65	1683	10	localObject3	Object
    //   74	881	11	localObject4	Object
    //   1144	1	11	localObject5	Object
    //   1178	23	11	locals02	s0
    //   1225	1	11	localObject6	Object
    //   1252	249	11	localObject7	Object
    //   1589	1	11	localObject8	Object
    //   1594	234	11	localObject9	Object
    //   87	1628	12	localObject10	Object
    //   119	1579	13	j	int
    //   149	1622	14	l1	long
    //   197	1570	16	l2	long
    //   200	839	18	bool2	boolean
    //   203	1141	19	bool3	boolean
    //   293	343	20	bool4	boolean
    //   683	657	21	l3	long
    //   709	26	23	k	int
    //   1057	712	24	l4	long
    //   1184	20	26	l5	long
    //   1190	16	28	l6	long
    // Exception table:
    //   from	to	target	type
    //   1136	1141	1144	finally
    //   1149	1157	1225	finally
    //   1174	1192	1225	finally
    //   1200	1218	1583	finally
    //   1238	1254	1583	finally
    //   1259	1298	1583	finally
    //   1298	1305	1583	finally
    //   1308	1327	1583	finally
    //   1336	1350	1583	finally
    //   1113	1130	1594	finally
  }
  
  public final void n(r paramr)
  {
    q0 localq0 = A.j;
    int i;
    if ((localq0 != null) && (a == paramr)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    float f1 = w.f().a;
    paramr = F.a;
    d = true;
    m = a.q();
    paramr = localq0.g(f1, paramr);
    Object localObject = f;
    long l1 = b;
    long l2 = e;
    long l3 = l1;
    if (l2 != -9223372036854775807L)
    {
      l3 = l1;
      if (l1 >= l2) {
        l3 = Math.max(0L, l2 - 1L);
      }
    }
    l3 = localq0.a(paramr, l3, false, new boolean[i.length]);
    l1 = o;
    paramr = f;
    o = (b - l3 + l1);
    f = paramr.b(l3);
    paramr = n;
    f.a(a, c);
    if (localq0 == A.h)
    {
      D(f.b);
      f(new boolean[a.length]);
      paramr = F;
      localObject = b;
      l3 = f.b;
      F = p((t.b)localObject, l3, c, l3, false, 5);
    }
    t();
  }
  
  public final void o(e1 parame1, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if (paramBoolean2) {
        G.a(1);
      }
      F = F.e(parame1);
    }
    float f1 = a;
    int i;
    for (q0 localq0 = A.h;; localq0 = l)
    {
      i = 0;
      j = 0;
      if (localq0 == null) {
        break;
      }
      localObject1 = n.c;
      i = localObject1.length;
      while (j < i)
      {
        Object localObject2 = localObject1[j];
        if (localObject2 != null) {
          ((h)localObject2).r(f1);
        }
        j++;
      }
    }
    Object localObject1 = a;
    int k = localObject1.length;
    for (int j = i; j < k; j++)
    {
      localq0 = localObject1[j];
      if (localq0 != null) {
        localq0.m(paramFloat, a);
      }
    }
  }
  
  public final d1 p(t.b paramb, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    if ((!V) && (paramLong1 == F.r) && (paramb.equals(F.b))) {
      bool = false;
    } else {
      bool = true;
    }
    V = bool;
    C();
    Object localObject1 = F;
    j0 localj0 = h;
    p localp = i;
    Object localObject2 = j;
    if (B.k)
    {
      localObject1 = A.h;
      if (localObject1 == null) {
        localj0 = j0.d;
      } else {
        localj0 = m;
      }
      if (localObject1 == null) {
        localp = e;
      } else {
        localp = n;
      }
      localObject3 = c;
      localObject2 = new t.a();
      int i = localObject3.length;
      int j = 0;
      int m;
      for (int k = j; j < i; k = m)
      {
        p4.a locala = localObject3[j];
        m = k;
        if (locala != null)
        {
          locala = b0r;
          if (locala == null)
          {
            ((t.a)localObject2).c(new p4.a(new a.b[0]));
            m = k;
          }
          else
          {
            ((t.a)localObject2).c(locala);
            m = 1;
          }
        }
        j++;
      }
      if (k != 0)
      {
        localObject2 = ((t.a)localObject2).e();
      }
      else
      {
        localObject2 = o7.t.b;
        localObject2 = o7.l0.e;
      }
      if (localObject1 != null)
      {
        localObject3 = f;
        if (c != paramLong2) {
          f = ((r0)localObject3).a(paramLong2);
        }
      }
    }
    else if (!paramb.equals(b))
    {
      localj0 = j0.d;
      localp = e;
      localObject2 = o7.l0.e;
    }
    if (paramBoolean)
    {
      localObject1 = G;
      if ((d) && (e != 5))
      {
        if (paramInt == 5) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        x6.b.q(paramBoolean);
      }
      else
      {
        a = true;
        d = true;
        e = paramInt;
      }
    }
    localObject1 = F;
    long l = p;
    Object localObject3 = A.j;
    if (localObject3 == null) {
      l = 0L;
    } else {
      l = Math.max(0L, l - (T - o));
    }
    return ((d1)localObject1).b(paramb, paramLong1, paramLong2, paramLong3, l, localj0, localp, (List)localObject2);
  }
  
  public final boolean q()
  {
    q0 localq0 = A.j;
    if (localq0 == null) {
      return false;
    }
    long l;
    if (!d) {
      l = 0L;
    } else {
      l = a.c();
    }
    return l != Long.MIN_VALUE;
  }
  
  public final boolean s()
  {
    q0 localq0 = A.h;
    long l = f.e;
    boolean bool;
    if ((d) && ((l == -9223372036854775807L) || (F.r < l) || (!Y()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void t()
  {
    boolean bool1 = q();
    boolean bool2 = false;
    q0 localq01;
    long l1;
    long l2;
    if (!bool1)
    {
      bool1 = false;
    }
    else
    {
      localq01 = A.j;
      if (!d) {
        l1 = 0L;
      } else {
        l1 = a.c();
      }
      q0 localq02 = A.j;
      if (localq02 == null) {
        l1 = 0L;
      } else {
        l1 = Math.max(0L, l1 - (T - o));
      }
      if (localq01 != A.h) {
        l2 = f.b;
      }
      boolean bool3 = f.e(l1, w.f().a);
      bool1 = bool3;
      if (!bool3)
      {
        bool1 = bool3;
        if (l1 < 500000L) {
          if (u <= 0L)
          {
            bool1 = bool3;
            if (!v) {}
          }
          else
          {
            A.h.a.s(F.r, false);
            bool1 = f.e(l1, w.f().a);
          }
        }
      }
    }
    L = bool1;
    if (bool1)
    {
      localq01 = A.j;
      l1 = T;
      bool1 = bool2;
      if (l == null) {
        bool1 = true;
      }
      x6.b.H(bool1);
      l2 = o;
      a.d(l1 - l2);
    }
    d0();
  }
  
  public final void u()
  {
    d locald = G;
    Object localObject = F;
    boolean bool1 = a;
    boolean bool2;
    if (b != localObject) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    bool1 |= bool2;
    a = bool1;
    b = ((d1)localObject);
    if (bool1)
    {
      localObject = (d0)z).b;
      i.e(new q(4, localObject, locald));
      G = new d(F);
    }
  }
  
  public final void v()
  {
    m(B.c(), true);
  }
  
  public final void w(b paramb)
  {
    Object localObject = G;
    boolean bool = true;
    ((d)localObject).a(1);
    localObject = B;
    paramb.getClass();
    localObject.getClass();
    if (b.size() < 0) {
      bool = false;
    }
    x6.b.q(bool);
    j = null;
    m(((z0)localObject).c(), false);
  }
  
  public final void x()
  {
    G.a(1);
    int i = 0;
    B(false, false, false, true);
    f.d();
    if (F.a.p()) {
      j = 4;
    } else {
      j = 2;
    }
    X(j);
    z0 localz0 = B;
    Object localObject = o.f();
    x6.b.H(k ^ true);
    l = ((t5.l0)localObject);
    for (int j = i; j < b.size(); j++)
    {
      localObject = (z0.c)b.get(j);
      localz0.f((z0.c)localObject);
      g.add(localObject);
    }
    k = true;
    p.i(2);
  }
  
  public final void y()
  {
    B(true, false, true, false);
    f.f();
    X(1);
    HandlerThread localHandlerThread = q;
    if (localHandlerThread != null) {
      localHandlerThread.quit();
    }
    try
    {
      H = true;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public final void z(int paramInt1, int paramInt2, z4.e0 parame0)
  {
    Object localObject = G;
    boolean bool = true;
    ((d)localObject).a(1);
    localObject = B;
    localObject.getClass();
    if ((paramInt1 < 0) || (paramInt1 > paramInt2) || (paramInt2 > b.size())) {
      bool = false;
    }
    x6.b.q(bool);
    j = parame0;
    ((z0)localObject).g(paramInt1, paramInt2);
    m(((z0)localObject).c(), false);
  }
  
  public static final class a
  {
    public final List<z0.c> a;
    public final z4.e0 b;
    public final int c;
    public final long d;
    
    public a(ArrayList paramArrayList, z4.e0 parame0, int paramInt, long paramLong)
    {
      a = paramArrayList;
      b = parame0;
      c = paramInt;
      d = paramLong;
    }
  }
  
  public static final class b {}
  
  public static final class c
    implements Comparable<c>
  {
    public final int compareTo(Object paramObject)
    {
      ((c)paramObject).getClass();
      return 0;
    }
  }
  
  public static final class d
  {
    public boolean a;
    public d1 b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    
    public d(d1 paramd1)
    {
      b = paramd1;
    }
    
    public final void a(int paramInt)
    {
      boolean bool1 = a;
      boolean bool2;
      if (paramInt > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      a = (bool1 | bool2);
      c += paramInt;
    }
  }
  
  public static abstract interface e {}
  
  public static final class f
  {
    public final t.b a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    public f(t.b paramb, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      a = paramb;
      b = paramLong1;
      c = paramLong2;
      d = paramBoolean1;
      e = paramBoolean2;
      f = paramBoolean3;
    }
  }
  
  public static final class g
  {
    public final r1 a;
    public final int b;
    public final long c;
    
    public g(r1 paramr1, int paramInt, long paramLong)
    {
      a = paramr1;
      b = paramInt;
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     v3.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */