package b5;

import a4.g.a;
import android.net.Uri;
import com.google.android.exoplayer2.source.dash.d.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import t5.c0.c;
import t5.d0.b;
import t5.d0.d;
import t5.d0.e;
import t5.j0;
import t5.u;
import v3.i0;
import v5.e0;
import z4.b0;
import z4.n;
import z4.q;
import z4.w.a;

public final class h<T extends i>
  implements z4.c0, z4.d0, t5.d0.a<e>, d0.e
{
  public long A;
  public long B;
  public int C;
  public a D;
  public boolean E;
  public final int a;
  public final int[] b;
  public final i0[] c;
  public final boolean[] d;
  public final T e;
  public final z4.d0.a<h<T>> f;
  public final w.a o;
  public final t5.c0 p;
  public final t5.d0 q;
  public final g r;
  public final ArrayList<a> s;
  public final List<a> t;
  public final b0 u;
  public final b0[] v;
  public final c w;
  public e x;
  public i0 y;
  public b<T> z;
  
  public h(int paramInt, int[] paramArrayOfInt, i0[] paramArrayOfi0, T paramT, z4.d0.a<h<T>> parama, t5.b paramb, long paramLong, a4.h paramh, g.a parama1, t5.c0 paramc0, w.a parama2)
  {
    a = paramInt;
    int i = 0;
    int[] arrayOfInt = paramArrayOfInt;
    if (paramArrayOfInt == null) {
      arrayOfInt = new int[0];
    }
    b = arrayOfInt;
    paramArrayOfInt = paramArrayOfi0;
    if (paramArrayOfi0 == null) {
      paramArrayOfInt = new i0[0];
    }
    c = paramArrayOfInt;
    e = paramT;
    f = parama;
    o = parama2;
    p = paramc0;
    q = new t5.d0("ChunkSampleStream");
    r = new g(0);
    paramArrayOfInt = new ArrayList();
    s = paramArrayOfInt;
    t = Collections.unmodifiableList(paramArrayOfInt);
    int j = arrayOfInt.length;
    v = new b0[j];
    d = new boolean[j];
    int k = j + 1;
    paramArrayOfInt = new int[k];
    paramArrayOfi0 = new b0[k];
    paramh.getClass();
    parama1.getClass();
    paramT = new b0(paramb, paramh, parama1);
    u = paramT;
    paramArrayOfInt[0] = paramInt;
    paramArrayOfi0[0] = paramT;
    for (paramInt = i; paramInt < j; paramInt = i)
    {
      paramT = new b0(paramb, null, null);
      v[paramInt] = paramT;
      i = paramInt + 1;
      paramArrayOfi0[i] = paramT;
      paramArrayOfInt[i] = b[paramInt];
    }
    w = new c(paramArrayOfInt, paramArrayOfi0);
    A = paramLong;
    B = paramLong;
  }
  
  public final void A(b<T> paramb)
  {
    z = paramb;
    Object localObject = u;
    ((b0)localObject).h();
    paramb = h;
    if (paramb != null)
    {
      paramb.f(e);
      h = null;
      g = null;
    }
    for (paramb : v)
    {
      paramb.h();
      a4.e locale = h;
      if (locale != null)
      {
        locale.f(e);
        h = null;
        g = null;
      }
    }
    q.e(this);
  }
  
  /* Error */
  public final void B(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: lload_1
    //   2: putfield 142	b5/h:B	J
    //   5: aload_0
    //   6: invokevirtual 173	b5/h:x	()Z
    //   9: ifeq +9 -> 18
    //   12: aload_0
    //   13: lload_1
    //   14: putfield 140	b5/h:A	J
    //   17: return
    //   18: iconst_0
    //   19: istore_3
    //   20: iconst_0
    //   21: istore 4
    //   23: iconst_0
    //   24: istore 5
    //   26: iload 5
    //   28: aload_0
    //   29: getfield 108	b5/h:s	Ljava/util/ArrayList;
    //   32: invokevirtual 177	java/util/ArrayList:size	()I
    //   35: if_icmpge +60 -> 95
    //   38: aload_0
    //   39: getfield 108	b5/h:s	Ljava/util/ArrayList;
    //   42: iload 5
    //   44: invokevirtual 181	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   47: checkcast 183	b5/a
    //   50: astore 6
    //   52: aload 6
    //   54: getfield 187	b5/e:g	J
    //   57: lload_1
    //   58: lcmp
    //   59: istore 7
    //   61: iload 7
    //   63: ifne +18 -> 81
    //   66: aload 6
    //   68: getfield 190	b5/a:k	J
    //   71: ldc2_w 191
    //   74: lcmp
    //   75: ifne +6 -> 81
    //   78: goto +20 -> 98
    //   81: iload 7
    //   83: ifle +6 -> 89
    //   86: goto +9 -> 95
    //   89: iinc 5 1
    //   92: goto -66 -> 26
    //   95: aconst_null
    //   96: astore 6
    //   98: aload 6
    //   100: ifnull +131 -> 231
    //   103: aload_0
    //   104: getfield 131	b5/h:u	Lz4/b0;
    //   107: astore 8
    //   109: aload 6
    //   111: iconst_0
    //   112: invokevirtual 195	b5/a:e	(I)I
    //   115: istore 7
    //   117: aload 8
    //   119: monitorenter
    //   120: aload 8
    //   122: monitorenter
    //   123: aload 8
    //   125: iconst_0
    //   126: putfield 197	z4/b0:s	I
    //   129: aload 8
    //   131: getfield 200	z4/b0:a	Lz4/a0;
    //   134: astore 6
    //   136: aload 6
    //   138: aload 6
    //   140: getfield 205	z4/a0:d	Lz4/a0$a;
    //   143: putfield 207	z4/a0:e	Lz4/a0$a;
    //   146: aload 8
    //   148: monitorexit
    //   149: aload 8
    //   151: getfield 209	z4/b0:q	I
    //   154: istore 5
    //   156: iload 7
    //   158: iload 5
    //   160: if_icmplt +43 -> 203
    //   163: iload 7
    //   165: aload 8
    //   167: getfield 211	z4/b0:p	I
    //   170: iload 5
    //   172: iadd
    //   173: if_icmple +6 -> 179
    //   176: goto +27 -> 203
    //   179: aload 8
    //   181: ldc2_w 212
    //   184: putfield 215	z4/b0:t	J
    //   187: aload 8
    //   189: iload 7
    //   191: iload 5
    //   193: isub
    //   194: putfield 197	z4/b0:s	I
    //   197: iconst_1
    //   198: istore 9
    //   200: goto +6 -> 206
    //   203: iconst_0
    //   204: istore 9
    //   206: aload 8
    //   208: monitorexit
    //   209: goto +56 -> 265
    //   212: astore 6
    //   214: goto +11 -> 225
    //   217: astore 6
    //   219: aload 8
    //   221: monitorexit
    //   222: aload 6
    //   224: athrow
    //   225: aload 8
    //   227: monitorexit
    //   228: aload 6
    //   230: athrow
    //   231: aload_0
    //   232: getfield 131	b5/h:u	Lz4/b0;
    //   235: astore 6
    //   237: lload_1
    //   238: aload_0
    //   239: invokevirtual 218	b5/h:c	()J
    //   242: lcmp
    //   243: ifge +9 -> 252
    //   246: iconst_1
    //   247: istore 9
    //   249: goto +6 -> 255
    //   252: iconst_0
    //   253: istore 9
    //   255: aload 6
    //   257: lload_1
    //   258: iload 9
    //   260: invokevirtual 221	z4/b0:x	(JZ)Z
    //   263: istore 9
    //   265: iload 9
    //   267: ifeq +66 -> 333
    //   270: aload_0
    //   271: getfield 131	b5/h:u	Lz4/b0;
    //   274: astore 6
    //   276: aload_0
    //   277: aload_0
    //   278: aload 6
    //   280: getfield 209	z4/b0:q	I
    //   283: aload 6
    //   285: getfield 197	z4/b0:s	I
    //   288: iadd
    //   289: iconst_0
    //   290: invokevirtual 224	b5/h:z	(II)I
    //   293: putfield 226	b5/h:C	I
    //   296: aload_0
    //   297: getfield 120	b5/h:v	[Lz4/b0;
    //   300: astore 6
    //   302: aload 6
    //   304: arraylength
    //   305: istore_3
    //   306: iload 4
    //   308: istore 5
    //   310: iload 5
    //   312: iload_3
    //   313: if_icmpge +156 -> 469
    //   316: aload 6
    //   318: iload 5
    //   320: aaload
    //   321: lload_1
    //   322: iconst_1
    //   323: invokevirtual 221	z4/b0:x	(JZ)Z
    //   326: pop
    //   327: iinc 5 1
    //   330: goto -20 -> 310
    //   333: aload_0
    //   334: lload_1
    //   335: putfield 140	b5/h:A	J
    //   338: aload_0
    //   339: iconst_0
    //   340: putfield 228	b5/h:E	Z
    //   343: aload_0
    //   344: getfield 108	b5/h:s	Ljava/util/ArrayList;
    //   347: invokevirtual 231	java/util/ArrayList:clear	()V
    //   350: aload_0
    //   351: iconst_0
    //   352: putfield 226	b5/h:C	I
    //   355: aload_0
    //   356: getfield 96	b5/h:q	Lt5/d0;
    //   359: invokevirtual 233	t5/d0:d	()Z
    //   362: ifeq +55 -> 417
    //   365: aload_0
    //   366: getfield 131	b5/h:u	Lz4/b0;
    //   369: invokevirtual 151	z4/b0:h	()V
    //   372: aload_0
    //   373: getfield 120	b5/h:v	[Lz4/b0;
    //   376: astore 6
    //   378: aload 6
    //   380: arraylength
    //   381: istore 4
    //   383: iload_3
    //   384: istore 5
    //   386: iload 5
    //   388: iload 4
    //   390: if_icmpge +17 -> 407
    //   393: aload 6
    //   395: iload 5
    //   397: aaload
    //   398: invokevirtual 151	z4/b0:h	()V
    //   401: iinc 5 1
    //   404: goto -18 -> 386
    //   407: aload_0
    //   408: getfield 96	b5/h:q	Lt5/d0;
    //   411: invokevirtual 235	t5/d0:b	()V
    //   414: goto +55 -> 469
    //   417: aload_0
    //   418: getfield 96	b5/h:q	Lt5/d0;
    //   421: aconst_null
    //   422: putfield 238	t5/d0:c	Ljava/io/IOException;
    //   425: aload_0
    //   426: getfield 131	b5/h:u	Lz4/b0;
    //   429: iconst_0
    //   430: invokevirtual 241	z4/b0:v	(Z)V
    //   433: aload_0
    //   434: getfield 120	b5/h:v	[Lz4/b0;
    //   437: astore 6
    //   439: aload 6
    //   441: arraylength
    //   442: istore 4
    //   444: iconst_0
    //   445: istore 5
    //   447: iload 5
    //   449: iload 4
    //   451: if_icmpge +18 -> 469
    //   454: aload 6
    //   456: iload 5
    //   458: aaload
    //   459: iconst_0
    //   460: invokevirtual 241	z4/b0:v	(Z)V
    //   463: iinc 5 1
    //   466: goto -19 -> 447
    //   469: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	470	0	this	h
    //   0	470	1	paramLong	long
    //   19	365	3	i	int
    //   21	431	4	j	int
    //   24	440	5	k	int
    //   50	89	6	localObject1	Object
    //   212	1	6	localObject2	Object
    //   217	12	6	localObject3	Object
    //   235	220	6	localObject4	Object
    //   59	23	7	bool1	boolean
    //   115	79	7	m	int
    //   107	119	8	localb0	b0
    //   198	68	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   120	123	212	finally
    //   146	156	212	finally
    //   163	176	212	finally
    //   179	197	212	finally
    //   219	225	212	finally
    //   123	146	217	finally
  }
  
  public final void a()
  {
    q.a();
    u.s();
    if (!q.d()) {
      e.a();
    }
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((!x()) && (u.q(E))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long c()
  {
    if (x()) {
      return A;
    }
    long l;
    if (E) {
      l = Long.MIN_VALUE;
    } else {
      l = vh;
    }
    return l;
  }
  
  public final boolean d(long paramLong)
  {
    boolean bool1 = E;
    int i = 0;
    if ((!bool1) && (!q.d()) && (!q.c()))
    {
      boolean bool2 = x();
      long l;
      if (bool2)
      {
        localObject1 = Collections.emptyList();
        l = A;
      }
      else
      {
        localObject1 = t;
        l = vh;
      }
      e.i(paramLong, l, (List)localObject1, r);
      Object localObject2 = r;
      bool1 = a;
      Object localObject1 = (e)b;
      b = null;
      a = false;
      if (bool1)
      {
        A = -9223372036854775807L;
        E = true;
        return true;
      }
      if (localObject1 == null) {
        return false;
      }
      x = ((e)localObject1);
      if ((localObject1 instanceof a))
      {
        localObject2 = (a)localObject1;
        if (bool2)
        {
          paramLong = g;
          l = A;
          if (paramLong != l)
          {
            u.t = l;
            localObject3 = v;
            int j = localObject3.length;
            for (k = 0; k < j; k++) {
              t = A;
            }
          }
          A = -9223372036854775807L;
        }
        localObject3 = w;
        m = ((c)localObject3);
        int[] arrayOfInt = new int[b.length];
        for (k = i;; k++)
        {
          Object localObject4 = b;
          if (k >= localObject4.length) {
            break;
          }
          localObject4 = localObject4[k];
          arrayOfInt[k] = (q + p);
        }
        n = arrayOfInt;
        s.add(localObject2);
      }
      else if ((localObject1 instanceof l))
      {
        k = w;
      }
      Object localObject3 = q;
      localObject2 = p;
      int k = c;
      paramLong = ((t5.d0)localObject3).f((d0.d)localObject1, this, ((u)localObject2).b(k));
      o.n(new n(a, b, paramLong), c, a, d, e, f, g, h);
      return true;
    }
    return false;
  }
  
  public final void f()
  {
    Object localObject1 = u;
    ((b0)localObject1).v(true);
    ??? = h;
    if (??? != null)
    {
      ((a4.e)???).f(e);
      h = null;
      g = null;
    }
    for (localObject1 : v)
    {
      ((b0)localObject1).v(true);
      ??? = h;
      if (??? != null)
      {
        ((a4.e)???).f(e);
        h = null;
        g = null;
      }
    }
    e.release();
    ??? = z;
    if (??? != null) {
      synchronized ((com.google.android.exoplayer2.source.dash.b)???)
      {
        localObject1 = (d.c)v.remove(this);
        if (localObject1 != null)
        {
          ??? = a;
          ((b0)???).v(true);
          localObject1 = h;
          if (localObject1 != null)
          {
            ((a4.e)localObject1).f(e);
            h = null;
            g = null;
          }
        }
      }
    }
  }
  
  public final long g()
  {
    if (E) {
      return Long.MIN_VALUE;
    }
    if (x()) {
      return A;
    }
    long l1 = B;
    Object localObject1 = v();
    if (!((m)localObject1).d()) {
      if (s.size() > 1)
      {
        localObject1 = s;
        localObject1 = (a)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 2);
      }
      else
      {
        localObject1 = null;
      }
    }
    long l2 = l1;
    if (localObject1 != null) {
      l2 = Math.max(l1, h);
    }
    synchronized (u)
    {
      l1 = v;
      return Math.max(l2, l1);
    }
  }
  
  public final void h(long paramLong)
  {
    if ((!q.c()) && (!x()))
    {
      Object localObject;
      if (q.d())
      {
        localObject = x;
        localObject.getClass();
        boolean bool = localObject instanceof a;
        if ((bool) && (w(s.size() - 1))) {
          return;
        }
        if (e.f(paramLong, (e)localObject, t))
        {
          q.b();
          if (bool) {
            D = ((a)localObject);
          }
        }
        return;
      }
      int i = e.h(paramLong, t);
      if (i < s.size())
      {
        x6.b.H(q.d() ^ true);
        int j = s.size();
        while (i < j)
        {
          if (!w(i)) {
            break label184;
          }
          i++;
        }
        i = -1;
        label184:
        if (i != -1)
        {
          paramLong = vh;
          localObject = t(i);
          if (s.isEmpty()) {
            A = B;
          }
          E = false;
          w.a locala = o;
          locala.p(new q(1, a, null, 3, null, locala.a(g), locala.a(paramLong)));
        }
      }
    }
  }
  
  public final boolean isLoading()
  {
    return q.d();
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (e)paramd;
    x = null;
    D = null;
    paramLong1 = a;
    j0 localj0 = i;
    Object localObject = c;
    localObject = new n(d);
    p.getClass();
    o.e((n)localObject, c, a, d, e, f, g, h);
    if (!paramBoolean)
    {
      if (x())
      {
        u.v(false);
        paramd = v;
        int i = paramd.length;
        for (int j = 0; j < i; j++) {
          paramd[j].v(false);
        }
      }
      if ((paramd instanceof a))
      {
        t(s.size() - 1);
        if (s.isEmpty()) {
          A = B;
        }
      }
      f.a(this);
    }
  }
  
  public final int m(long paramLong)
  {
    if (x()) {
      return 0;
    }
    int i = u.o(paramLong, E);
    Object localObject = D;
    int j = i;
    if (localObject != null)
    {
      j = ((a)localObject).e(0);
      localObject = u;
      j = Math.min(i, j - (q + s));
    }
    u.y(j);
    y();
    return j;
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    paramd = (e)paramd;
    x = null;
    e.j(paramd);
    paramLong1 = a;
    Object localObject = i;
    Uri localUri = c;
    localObject = new n(d);
    p.getClass();
    o.h((n)localObject, c, a, d, e, f, g, h);
    f.a(this);
  }
  
  public final int r(l3.l paraml, z3.g paramg, int paramInt)
  {
    if (x()) {
      return -3;
    }
    Object localObject = D;
    if (localObject != null)
    {
      int i = ((a)localObject).e(0);
      localObject = u;
      if (i <= q + s) {
        return -3;
      }
    }
    y();
    return u.u(paraml, paramg, paramInt, E);
  }
  
  public final void s(long paramLong, boolean paramBoolean)
  {
    if (x()) {
      return;
    }
    Object localObject1 = u;
    int i = q;
    ((b0)localObject1).g(paramLong, paramBoolean, true);
    localObject1 = u;
    int j = q;
    if (j > i) {
      try
      {
        if (p == 0) {
          paramLong = Long.MIN_VALUE;
        } else {
          paramLong = n[r];
        }
        for (i = 0;; i++)
        {
          localObject1 = v;
          if (i >= localObject1.length) {
            break;
          }
          localObject1[i].g(paramLong, paramBoolean, d[i]);
        }
        i = Math.min(z(j, 0), C);
      }
      finally {}
    }
    if (i > 0)
    {
      e0.N(0, i, s);
      C -= i;
    }
  }
  
  public final a t(int paramInt)
  {
    a locala = (a)s.get(paramInt);
    Object localObject = s;
    e0.N(paramInt, ((ArrayList)localObject).size(), (ArrayList)localObject);
    C = Math.max(C, s.size());
    localObject = u;
    for (paramInt = 0;; paramInt++)
    {
      ((b0)localObject).j(locala.e(paramInt));
      localObject = v;
      if (paramInt >= localObject.length) {
        break;
      }
      localObject = localObject[paramInt];
    }
    return locala;
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    e locale = (e)paramd;
    paramLong1 = i.b;
    boolean bool1 = locale instanceof a;
    int i = s.size() - 1;
    if ((paramLong1 != 0L) && (bool1) && (w(i))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    Object localObject = i;
    paramd = c;
    n localn = new n(d);
    e0.R(g);
    e0.R(h);
    c0.c localc = new c0.c(paramIOException, paramInt);
    if (e.g(locale, bool2, localc, p))
    {
      if (bool2)
      {
        localObject = t5.d0.e;
        paramd = (d0.d)localObject;
        if (bool1)
        {
          if (t(i) == locale) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          x6.b.H(bool2);
          paramd = (d0.d)localObject;
          if (s.isEmpty())
          {
            A = B;
            paramd = (d0.d)localObject;
          }
        }
      }
      else
      {
        v5.m.f("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
      }
    }
    else {
      paramd = null;
    }
    localObject = paramd;
    if (paramd == null)
    {
      paramLong1 = ((u)p).c(localc);
      if (paramLong1 != -9223372036854775807L) {
        localObject = new d0.b(0, paramLong1);
      } else {
        localObject = t5.d0.f;
      }
    }
    boolean bool2 = true ^ ((d0.b)localObject).a();
    o.j(localn, c, a, d, e, f, g, h, paramIOException, bool2);
    if (bool2)
    {
      x = null;
      p.getClass();
      f.a(this);
    }
    return (d0.b)localObject;
  }
  
  public final a v()
  {
    ArrayList localArrayList = s;
    return (a)localArrayList.get(localArrayList.size() - 1);
  }
  
  public final boolean w(int paramInt)
  {
    a locala = (a)s.get(paramInt);
    Object localObject = u;
    if (q + s > locala.e(0)) {
      return true;
    }
    paramInt = 0;
    int i;
    int j;
    int k;
    do
    {
      localObject = v;
      if (paramInt >= localObject.length) {
        break;
      }
      localObject = localObject[paramInt];
      i = q;
      j = s;
      k = paramInt + 1;
      paramInt = k;
    } while (i + j <= locala.e(k));
    return true;
    return false;
  }
  
  public final boolean x()
  {
    boolean bool;
    if (A != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void y()
  {
    Object localObject = u;
    int i = z(q + s, C - 1);
    for (;;)
    {
      int j = C;
      if (j > i) {
        break;
      }
      C = (j + 1);
      a locala = (a)s.get(j);
      localObject = d;
      if (!((i0)localObject).equals(y)) {
        o.b(a, (i0)localObject, e, f, g);
      }
      y = ((i0)localObject);
    }
  }
  
  public final int z(int paramInt1, int paramInt2)
  {
    int i;
    do
    {
      i = paramInt2 + 1;
      if (i >= s.size()) {
        break;
      }
      paramInt2 = i;
    } while (((a)s.get(i)).e(0) <= paramInt1);
    return i - 1;
    return s.size() - 1;
  }
  
  public final class a
    implements z4.c0
  {
    public final h<T> a;
    public final b0 b;
    public final int c;
    public boolean d;
    
    public a(b0 paramb0, int paramInt)
    {
      a = paramb0;
      b = paramInt;
      int i;
      c = i;
    }
    
    public final void a() {}
    
    public final boolean b()
    {
      boolean bool;
      if ((!x()) && (b.q(E))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void c()
    {
      if (!d)
      {
        h localh = h.this;
        w.a locala = o;
        int[] arrayOfInt = b;
        int i = c;
        locala.b(arrayOfInt[i], c[i], 0, null, B);
        d = true;
      }
    }
    
    public final int m(long paramLong)
    {
      if (x()) {
        return 0;
      }
      int i = b.o(paramLong, E);
      Object localObject = D;
      int j = i;
      if (localObject != null)
      {
        j = ((a)localObject).e(c + 1);
        localObject = b;
        j = Math.min(i, j - (q + s));
      }
      b.y(j);
      if (j > 0) {
        c();
      }
      return j;
    }
    
    public final int r(l3.l paraml, z3.g paramg, int paramInt)
    {
      if (x()) {
        return -3;
      }
      Object localObject = D;
      if (localObject != null)
      {
        int i = ((a)localObject).e(c + 1);
        localObject = b;
        if (i <= q + s) {
          return -3;
        }
      }
      c();
      return b.u(paraml, paramg, paramInt, E);
    }
  }
  
  public static abstract interface b<T extends i> {}
}

/* Location:
 * Qualified Name:     b5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */