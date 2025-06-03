package P;

import V5.t;
import g6.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p6.I;
import p6.P;
import p6.w;

public final class m
  implements f
{
  public static final a k = new a(null);
  public static final Set l = new LinkedHashSet();
  public static final Object m = new Object();
  public final g6.a a;
  public final k b;
  public final b c;
  public final I d;
  public final s6.b e;
  public final String f;
  public final V5.h g;
  public final s6.j h;
  public List i;
  public final l j;
  
  public m(g6.a parama, k paramk, List paramList, b paramb, I paramI)
  {
    a = parama;
    b = paramk;
    c = paramb;
    d = paramI;
    e = s6.d.e(new g(this, null));
    f = ".tmp";
    g = V5.i.a(new h(this));
    h = s6.m.a(o.a);
    i = W5.m.G((Iterable)paramList);
    j = new l(paramI, new d(this), e.o, new f(this, null));
  }
  
  /* Error */
  public final Object A(Object paramObject, X5.d paramd)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 59
    //   4: ifeq +34 -> 38
    //   7: aload_2
    //   8: checkcast 59	P/m$r
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 235	P/m$r:v	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc -20
    //   22: iand
    //   23: ifeq +15 -> 38
    //   26: aload_3
    //   27: iload 4
    //   29: ldc -20
    //   31: iadd
    //   32: putfield 235	P/m$r:v	I
    //   35: goto +13 -> 48
    //   38: new 59	P/m$r
    //   41: dup
    //   42: aload_0
    //   43: aload_2
    //   44: invokespecial 237	P/m$r:<init>	(LP/m;LX5/d;)V
    //   47: astore_3
    //   48: aload_3
    //   49: getfield 239	P/m$r:t	Ljava/lang/Object;
    //   52: astore 5
    //   54: invokestatic 243	Y5/b:c	()Ljava/lang/Object;
    //   57: astore 6
    //   59: aload_3
    //   60: getfield 235	P/m$r:v	I
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +99 -> 166
    //   70: iload 4
    //   72: iconst_1
    //   73: if_icmpne +82 -> 155
    //   76: aload_3
    //   77: getfield 245	P/m$r:s	Ljava/lang/Object;
    //   80: checkcast 247	java/io/FileOutputStream
    //   83: astore 7
    //   85: aload_3
    //   86: getfield 249	P/m$r:r	Ljava/lang/Object;
    //   89: checkcast 251	java/lang/Throwable
    //   92: astore 6
    //   94: aload_3
    //   95: getfield 254	P/m$r:q	Ljava/lang/Object;
    //   98: checkcast 256	java/io/Closeable
    //   101: astore 8
    //   103: aload_3
    //   104: getfield 258	P/m$r:p	Ljava/lang/Object;
    //   107: checkcast 260	java/io/File
    //   110: astore_1
    //   111: aload_3
    //   112: getfield 262	P/m$r:o	Ljava/lang/Object;
    //   115: checkcast 2	P/m
    //   118: astore 9
    //   120: aload 8
    //   122: astore 10
    //   124: aload_1
    //   125: astore_2
    //   126: aload 5
    //   128: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   131: aload 8
    //   133: astore_3
    //   134: aload 7
    //   136: astore 8
    //   138: goto +157 -> 295
    //   141: astore 6
    //   143: aload 10
    //   145: astore_3
    //   146: aload_2
    //   147: astore_1
    //   148: aload 6
    //   150: astore 10
    //   152: goto +280 -> 432
    //   155: new 269	java/lang/IllegalStateException
    //   158: dup
    //   159: ldc_w 271
    //   162: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   165: athrow
    //   166: aload 5
    //   168: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   171: aload_0
    //   172: aload_0
    //   173: invokevirtual 193	P/m:r	()Ljava/io/File;
    //   176: invokevirtual 277	P/m:q	(Ljava/io/File;)V
    //   179: new 260	java/io/File
    //   182: dup
    //   183: aload_0
    //   184: invokevirtual 193	P/m:r	()Ljava/io/File;
    //   187: invokevirtual 281	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   190: aload_0
    //   191: getfield 139	P/m:f	Ljava/lang/String;
    //   194: invokestatic 284	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   197: invokespecial 285	java/io/File:<init>	(Ljava/lang/String;)V
    //   200: astore 10
    //   202: new 247	java/io/FileOutputStream
    //   205: dup
    //   206: aload 10
    //   208: invokespecial 287	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   211: astore_2
    //   212: aload_0
    //   213: getfield 121	P/m:b	LP/k;
    //   216: astore 8
    //   218: new 18	P/m$c
    //   221: astore 9
    //   223: aload 9
    //   225: aload_2
    //   226: invokespecial 290	P/m$c:<init>	(Ljava/io/FileOutputStream;)V
    //   229: aload_3
    //   230: aload_0
    //   231: putfield 262	P/m$r:o	Ljava/lang/Object;
    //   234: aload_3
    //   235: aload 10
    //   237: putfield 258	P/m$r:p	Ljava/lang/Object;
    //   240: aload_3
    //   241: aload_2
    //   242: putfield 254	P/m$r:q	Ljava/lang/Object;
    //   245: aload_3
    //   246: aconst_null
    //   247: putfield 249	P/m$r:r	Ljava/lang/Object;
    //   250: aload_3
    //   251: aload_2
    //   252: putfield 245	P/m$r:s	Ljava/lang/Object;
    //   255: aload_3
    //   256: iconst_1
    //   257: putfield 235	P/m$r:v	I
    //   260: aload 8
    //   262: aload_1
    //   263: aload 9
    //   265: aload_3
    //   266: invokeinterface 295 4 0
    //   271: astore_1
    //   272: aload_1
    //   273: aload 6
    //   275: if_acmpne +6 -> 281
    //   278: aload 6
    //   280: areturn
    //   281: aload_0
    //   282: astore 9
    //   284: aload 10
    //   286: astore_1
    //   287: aload_2
    //   288: astore 8
    //   290: aconst_null
    //   291: astore 6
    //   293: aload_2
    //   294: astore_3
    //   295: aload_3
    //   296: astore 10
    //   298: aload_1
    //   299: astore_2
    //   300: aload 8
    //   302: invokevirtual 299	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   305: invokevirtual 304	java/io/FileDescriptor:sync	()V
    //   308: aload_3
    //   309: astore 10
    //   311: aload_1
    //   312: astore_2
    //   313: getstatic 309	V5/t:a	LV5/t;
    //   316: astore 8
    //   318: aload_1
    //   319: astore_2
    //   320: aload_3
    //   321: aload 6
    //   323: invokestatic 314	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   326: aload_1
    //   327: astore_2
    //   328: aload_1
    //   329: aload 9
    //   331: invokevirtual 193	P/m:r	()Ljava/io/File;
    //   334: invokevirtual 318	java/io/File:renameTo	(Ljava/io/File;)Z
    //   337: istore 11
    //   339: iload 11
    //   341: ifeq +7 -> 348
    //   344: getstatic 309	V5/t:a	LV5/t;
    //   347: areturn
    //   348: aload_1
    //   349: astore_2
    //   350: new 232	java/io/IOException
    //   353: astore_3
    //   354: aload_1
    //   355: astore_2
    //   356: new 320	java/lang/StringBuilder
    //   359: astore 10
    //   361: aload_1
    //   362: astore_2
    //   363: aload 10
    //   365: invokespecial 321	java/lang/StringBuilder:<init>	()V
    //   368: aload_1
    //   369: astore_2
    //   370: aload 10
    //   372: ldc_w 323
    //   375: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload_1
    //   380: astore_2
    //   381: aload 10
    //   383: aload_1
    //   384: invokevirtual 330	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload_1
    //   389: astore_2
    //   390: aload 10
    //   392: ldc_w 332
    //   395: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload_1
    //   400: astore_2
    //   401: aload_3
    //   402: aload 10
    //   404: invokevirtual 335	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   407: invokespecial 336	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   410: aload_1
    //   411: astore_2
    //   412: aload_3
    //   413: athrow
    //   414: astore_1
    //   415: aload_2
    //   416: astore 10
    //   418: goto +33 -> 451
    //   421: astore_1
    //   422: aload 10
    //   424: astore_3
    //   425: aload_1
    //   426: astore 10
    //   428: aload_3
    //   429: astore_1
    //   430: aload_2
    //   431: astore_3
    //   432: aload 10
    //   434: athrow
    //   435: astore 6
    //   437: aload_1
    //   438: astore_2
    //   439: aload_3
    //   440: aload 10
    //   442: invokestatic 314	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   445: aload_1
    //   446: astore_2
    //   447: aload 6
    //   449: athrow
    //   450: astore_1
    //   451: aload 10
    //   453: invokevirtual 340	java/io/File:exists	()Z
    //   456: ifeq +9 -> 465
    //   459: aload 10
    //   461: invokevirtual 343	java/io/File:delete	()Z
    //   464: pop
    //   465: aload_1
    //   466: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	467	0	this	m
    //   0	467	1	paramObject	Object
    //   0	467	2	paramd	X5.d
    //   11	429	3	localObject1	Object
    //   16	58	4	n	int
    //   52	115	5	localObject2	Object
    //   57	36	6	localObject3	Object
    //   141	138	6	localObject4	Object
    //   291	31	6	localThrowable	Throwable
    //   435	13	6	localObject5	Object
    //   83	52	7	localFileOutputStream	FileOutputStream
    //   101	216	8	localObject6	Object
    //   118	212	9	localObject7	Object
    //   122	338	10	localObject8	Object
    //   337	3	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   126	131	141	finally
    //   300	308	141	finally
    //   313	318	141	finally
    //   320	326	414	java/io/IOException
    //   328	339	414	java/io/IOException
    //   350	354	414	java/io/IOException
    //   356	361	414	java/io/IOException
    //   363	368	414	java/io/IOException
    //   370	379	414	java/io/IOException
    //   381	388	414	java/io/IOException
    //   390	399	414	java/io/IOException
    //   401	410	414	java/io/IOException
    //   412	414	414	java/io/IOException
    //   439	445	414	java/io/IOException
    //   447	450	414	java/io/IOException
    //   212	272	421	finally
    //   432	435	435	finally
    //   202	212	450	java/io/IOException
  }
  
  public Object a(p paramp, X5.d paramd)
  {
    p6.u localu = w.b(null, 1, null);
    paramp = new m.b.b(paramp, localu, (n)h.getValue(), paramd.getContext());
    j.e(paramp);
    return localu.m(paramd);
  }
  
  public s6.b b()
  {
    return e;
  }
  
  public final void q(File paramFile)
  {
    File localFile = paramFile.getCanonicalFile().getParentFile();
    if (localFile != null)
    {
      localFile.mkdirs();
      if (!localFile.isDirectory()) {}
    }
    else
    {
      return;
    }
    throw new IOException(Intrinsics.i("Unable to create parent directories of ", paramFile));
  }
  
  public final File r()
  {
    return (File)g.getValue();
  }
  
  public final Object s(m.b.a parama, X5.d paramd)
  {
    n localn = (n)h.getValue();
    if (!(localn instanceof c)) {
      if ((localn instanceof j))
      {
        if (localn == parama.a())
        {
          parama = w(paramd);
          if (parama == Y5.b.c()) {
            return parama;
          }
          return t.a;
        }
      }
      else
      {
        if (Intrinsics.a(localn, o.a))
        {
          parama = w(paramd);
          if (parama == Y5.b.c()) {
            return parama;
          }
          return t.a;
        }
        if ((localn instanceof h)) {
          break label97;
        }
      }
    }
    return t.a;
    label97:
    throw new IllegalStateException("Can't read in final state.".toString());
  }
  
  public final Object t(m.b.b paramb, X5.d paramd)
  {
    if ((paramd instanceof i))
    {
      localObject1 = (i)paramd;
      n = t;
      if ((n & 0x80000000) != 0)
      {
        t = (n + Integer.MIN_VALUE);
        break label48;
      }
    }
    Object localObject1 = new i(this, paramd);
    label48:
    Object localObject2 = r;
    Object localObject3 = Y5.b.c();
    int n = t;
    Object localObject4;
    Object localObject5;
    if (n != 0)
    {
      if (n != 1) {
        if (n != 2) {
          if (n != 3) {}
        }
      }
      for (paramd = (p6.u)o;; paramd = (p6.u)o)
      {
        paramb = paramd;
        try
        {
          V5.o.b(localObject2);
        }
        finally
        {
          break label527;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        paramd = (p6.u)q;
        localObject4 = (m)p;
        localObject5 = (m.b.b)o;
        paramb = paramd;
        V5.o.b(localObject2);
        paramb = (m.b.b)localObject4;
        break;
      }
    }
    else
    {
      V5.o.b(localObject2);
      paramd = paramb.a();
      localObject2 = paramd;
      do
      {
        try
        {
          localObject5 = V5.n.o;
          localObject2 = paramd;
          localObject5 = (n)h.getValue();
          localObject2 = paramd;
          if ((localObject5 instanceof c))
          {
            localObject2 = paramd;
            localObject5 = paramb.d();
            localObject2 = paramd;
            paramb = paramb.b();
            localObject2 = paramd;
            o = paramd;
            localObject2 = paramd;
            t = 1;
            localObject2 = paramd;
            localObject1 = z((p)localObject5, paramb, (X5.d)localObject1);
            paramb = (m.b.b)localObject1;
            if (localObject1 == localObject3) {
              return localObject3;
            }
            localObject2 = paramb;
          }
        }
        finally
        {
          paramb = (m.b.b)localObject2;
          break label527;
        }
        localObject2 = paramd;
        if (!(localObject5 instanceof j))
        {
          localObject2 = paramd;
          if (!(localObject5 instanceof o)) {
            break label485;
          }
        }
        localObject2 = paramd;
        if (localObject5 != paramb.c()) {
          break;
        }
        localObject2 = paramd;
        o = paramb;
        localObject2 = paramd;
        p = this;
        localObject2 = paramd;
        q = paramd;
        localObject2 = paramd;
        t = 2;
        localObject2 = paramd;
        if (v((X5.d)localObject1) == localObject3) {
          return localObject3;
        }
        localObject2 = this;
        localObject5 = paramb;
        paramb = (m.b.b)localObject2;
        localObject2 = paramd;
        localObject4 = ((m.b.b)localObject5).d();
        localObject2 = paramd;
        localObject5 = ((m.b.b)localObject5).b();
        localObject2 = paramd;
        o = paramd;
        localObject2 = paramd;
        p = null;
        localObject2 = paramd;
        q = null;
        localObject2 = paramd;
        t = 3;
        localObject2 = paramd;
        localObject1 = paramb.z((p)localObject4, (X5.g)localObject5, (X5.d)localObject1);
        paramb = (m.b.b)localObject1;
      } while (localObject1 != localObject3);
      return localObject3;
    }
    paramb = paramd;
    localObject2 = V5.n.a(localObject2);
    paramb = paramd;
    paramd = (X5.d)localObject2;
    break label540;
    localObject2 = paramd;
    throw ((j)localObject5).a();
    label485:
    localObject2 = paramd;
    if ((localObject5 instanceof h))
    {
      localObject2 = paramd;
      throw ((h)localObject5).a();
    }
    localObject2 = paramd;
    paramb = new V5/l;
    localObject2 = paramd;
    paramb.<init>();
    localObject2 = paramd;
    throw paramb;
    label527:
    localObject2 = V5.n.o;
    paramd = V5.n.a(V5.o.a(paramd));
    label540:
    w.c(paramb, paramd);
    return t.a;
  }
  
  public final Object u(X5.d paramd)
  {
    if ((paramd instanceof j))
    {
      localObject1 = (j)paramd;
      n = w;
      if ((n & 0x80000000) != 0)
      {
        w = (n + Integer.MIN_VALUE);
        break label45;
      }
    }
    Object localObject1 = new j(this, paramd);
    label45:
    Object localObject2 = u;
    Object localObject3 = Y5.b.c();
    int n = w;
    int i1 = 0;
    final Object localObject6;
    Object localObject7;
    if (n != 0)
    {
      if (n != 1)
      {
        if (n != 2)
        {
          if (n == 3)
          {
            localObject4 = (y6.a)r;
            localObject5 = (s)q;
            paramd = (kotlin.jvm.internal.u)p;
            localObject6 = (m)o;
            V5.o.b(localObject2);
            break label599;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject7 = (Iterator)t;
        localk = (k)s;
        localObject5 = (s)r;
        localObject6 = (kotlin.jvm.internal.u)q;
        localObject4 = (y6.a)p;
        paramd = (m)o;
        V5.o.b(localObject2);
        localObject2 = localObject7;
        break label437;
      }
      localObject5 = (kotlin.jvm.internal.u)r;
      localObject4 = (kotlin.jvm.internal.u)q;
      paramd = (y6.a)p;
      localObject6 = (m)o;
      V5.o.b(localObject2);
    }
    else
    {
      V5.o.b(localObject2);
      if ((!Intrinsics.a(h.getValue(), o.a)) && (!(h.getValue() instanceof j))) {
        n = 0;
      } else {
        n = 1;
      }
      if (n == 0) {
        break label672;
      }
      paramd = y6.c.b(false, 1, null);
      localObject5 = new kotlin.jvm.internal.u();
      o = this;
      p = paramd;
      q = localObject5;
      r = localObject5;
      w = 1;
      localObject2 = y((X5.d)localObject1);
      if (localObject2 == localObject3) {
        return localObject3;
      }
      localObject6 = this;
      localObject4 = localObject5;
    }
    o = localObject2;
    final Object localObject5 = new s();
    k localk = new k(paramd, (s)localObject5, (kotlin.jvm.internal.u)localObject4, (m)localObject6);
    localObject2 = i;
    if (localObject2 != null)
    {
      localObject2 = ((Iterable)localObject2).iterator();
      localObject7 = localObject6;
      localObject6 = localObject4;
      localObject4 = paramd;
      paramd = (X5.d)localObject7;
      label437:
      while (((Iterator)localObject2).hasNext())
      {
        localObject7 = (p)((Iterator)localObject2).next();
        o = paramd;
        p = localObject4;
        q = localObject6;
        r = localObject5;
        s = localk;
        t = localObject2;
        w = 2;
        if (((p)localObject7).invoke(localk, localObject1) == localObject3) {
          return localObject3;
        }
      }
      localObject2 = localObject6;
      localObject6 = paramd;
      paramd = (X5.d)localObject4;
      localObject4 = localObject2;
    }
    i = null;
    o = localObject6;
    p = localObject4;
    q = localObject5;
    r = paramd;
    s = null;
    t = null;
    w = 3;
    if (paramd.a(null, (X5.d)localObject1) == localObject3) {
      return localObject3;
    }
    localObject1 = localObject4;
    final Object localObject4 = paramd;
    paramd = (X5.d)localObject1;
    try
    {
      label599:
      o = true;
      localObject1 = t.a;
      ((y6.a)localObject4).b(null);
      localObject4 = h;
      paramd = o;
      n = i1;
      if (paramd != null) {
        n = paramd.hashCode();
      }
      ((s6.j)localObject4).setValue(new c(paramd, n));
      return t.a;
    }
    finally
    {
      ((y6.a)localObject4).b(null);
    }
    label672:
    throw new IllegalStateException("Check failed.".toString());
  }
  
  /* Error */
  public final Object v(X5.d paramd)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 47
    //   4: ifeq +33 -> 37
    //   7: aload_1
    //   8: checkcast 47	P/m$l
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 510	P/m$l:r	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -20
    //   20: iand
    //   21: ifeq +16 -> 37
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -20
    //   28: iadd
    //   29: putfield 510	P/m$l:r	I
    //   32: aload_2
    //   33: astore_1
    //   34: goto +13 -> 47
    //   37: new 47	P/m$l
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial 511	P/m$l:<init>	(LP/m;LX5/d;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield 512	P/m$l:p	Ljava/lang/Object;
    //   51: astore 4
    //   53: invokestatic 243	Y5/b:c	()Ljava/lang/Object;
    //   56: astore_2
    //   57: aload_1
    //   58: getfield 510	P/m$l:r	I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq +39 -> 102
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne +23 -> 91
    //   71: aload_1
    //   72: getfield 513	P/m$l:o	Ljava/lang/Object;
    //   75: checkcast 2	P/m
    //   78: astore_1
    //   79: aload 4
    //   81: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   84: goto +46 -> 130
    //   87: astore_2
    //   88: goto +49 -> 137
    //   91: new 269	java/lang/IllegalStateException
    //   94: dup
    //   95: ldc_w 271
    //   98: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   101: athrow
    //   102: aload 4
    //   104: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   107: aload_1
    //   108: aload_0
    //   109: putfield 513	P/m$l:o	Ljava/lang/Object;
    //   112: aload_1
    //   113: iconst_1
    //   114: putfield 510	P/m$l:r	I
    //   117: aload_0
    //   118: aload_1
    //   119: invokevirtual 209	P/m:u	(LX5/d;)Ljava/lang/Object;
    //   122: astore_1
    //   123: aload_1
    //   124: aload_2
    //   125: if_acmpne +5 -> 130
    //   128: aload_2
    //   129: areturn
    //   130: getstatic 309	V5/t:a	LV5/t;
    //   133: areturn
    //   134: astore_2
    //   135: aload_0
    //   136: astore_1
    //   137: aload_1
    //   138: getfield 161	P/m:h	Ls6/j;
    //   141: new 393	P/j
    //   144: dup
    //   145: aload_2
    //   146: invokespecial 516	P/j:<init>	(Ljava/lang/Throwable;)V
    //   149: invokeinterface 506 2 0
    //   154: aload_2
    //   155: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	this	m
    //   0	156	1	paramd	X5.d
    //   11	46	2	localObject1	Object
    //   87	42	2	localObject2	Object
    //   134	21	2	localThrowable	Throwable
    //   16	53	3	n	int
    //   51	52	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   79	84	87	finally
    //   107	123	134	finally
  }
  
  /* Error */
  public final Object w(X5.d paramd)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 49
    //   4: ifeq +33 -> 37
    //   7: aload_1
    //   8: checkcast 49	P/m$m
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 517	P/m$m:r	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -20
    //   20: iand
    //   21: ifeq +16 -> 37
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -20
    //   28: iadd
    //   29: putfield 517	P/m$m:r	I
    //   32: aload_2
    //   33: astore_1
    //   34: goto +13 -> 47
    //   37: new 49	P/m$m
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial 518	P/m$m:<init>	(LP/m;LX5/d;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield 519	P/m$m:p	Ljava/lang/Object;
    //   51: astore 4
    //   53: invokestatic 243	Y5/b:c	()Ljava/lang/Object;
    //   56: astore_2
    //   57: aload_1
    //   58: getfield 517	P/m$m:r	I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq +42 -> 105
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne +26 -> 94
    //   71: aload_1
    //   72: getfield 520	P/m$m:o	Ljava/lang/Object;
    //   75: checkcast 2	P/m
    //   78: astore 5
    //   80: aload 4
    //   82: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   85: goto +72 -> 157
    //   88: astore_1
    //   89: aload_1
    //   90: astore_2
    //   91: goto +48 -> 139
    //   94: new 269	java/lang/IllegalStateException
    //   97: dup
    //   98: ldc_w 271
    //   101: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   104: athrow
    //   105: aload 4
    //   107: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   110: aload_1
    //   111: aload_0
    //   112: putfield 520	P/m$m:o	Ljava/lang/Object;
    //   115: aload_1
    //   116: iconst_1
    //   117: putfield 517	P/m$m:r	I
    //   120: aload_0
    //   121: aload_1
    //   122: invokevirtual 209	P/m:u	(LX5/d;)Ljava/lang/Object;
    //   125: astore_1
    //   126: aload_1
    //   127: aload_2
    //   128: if_acmpne +29 -> 157
    //   131: aload_2
    //   132: areturn
    //   133: astore_2
    //   134: aload_0
    //   135: astore_1
    //   136: aload_1
    //   137: astore 5
    //   139: aload 5
    //   141: getfield 161	P/m:h	Ls6/j;
    //   144: new 393	P/j
    //   147: dup
    //   148: aload_2
    //   149: invokespecial 516	P/j:<init>	(Ljava/lang/Throwable;)V
    //   152: invokeinterface 506 2 0
    //   157: getstatic 309	V5/t:a	LV5/t;
    //   160: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	m
    //   0	161	1	paramd	X5.d
    //   11	121	2	localObject1	Object
    //   133	16	2	localThrowable	Throwable
    //   16	53	3	n	int
    //   51	55	4	localObject2	Object
    //   78	62	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   80	85	88	finally
    //   110	126	133	finally
  }
  
  /* Error */
  public final Object x(X5.d paramd)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 51
    //   4: ifeq +31 -> 35
    //   7: aload_1
    //   8: checkcast 51	P/m$n
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 523	P/m$n:t	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -20
    //   20: iand
    //   21: ifeq +14 -> 35
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -20
    //   28: iadd
    //   29: putfield 523	P/m$n:t	I
    //   32: goto +13 -> 45
    //   35: new 51	P/m$n
    //   38: dup
    //   39: aload_0
    //   40: aload_1
    //   41: invokespecial 524	P/m$n:<init>	(LP/m;LX5/d;)V
    //   44: astore_2
    //   45: aload_2
    //   46: getfield 525	P/m$n:r	Ljava/lang/Object;
    //   49: astore 4
    //   51: invokestatic 243	Y5/b:c	()Ljava/lang/Object;
    //   54: astore 5
    //   56: aload_2
    //   57: getfield 523	P/m$n:t	I
    //   60: istore_3
    //   61: iload_3
    //   62: ifeq +63 -> 125
    //   65: iload_3
    //   66: iconst_1
    //   67: if_icmpne +47 -> 114
    //   70: aload_2
    //   71: getfield 526	P/m$n:q	Ljava/lang/Object;
    //   74: checkcast 251	java/lang/Throwable
    //   77: astore 6
    //   79: aload_2
    //   80: getfield 527	P/m$n:p	Ljava/lang/Object;
    //   83: checkcast 256	java/io/Closeable
    //   86: astore 5
    //   88: aload_2
    //   89: getfield 528	P/m$n:o	Ljava/lang/Object;
    //   92: checkcast 2	P/m
    //   95: astore_1
    //   96: aload 4
    //   98: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   101: aload 4
    //   103: astore_2
    //   104: goto +95 -> 199
    //   107: astore 6
    //   109: aload_1
    //   110: astore_2
    //   111: goto +113 -> 224
    //   114: new 269	java/lang/IllegalStateException
    //   117: dup
    //   118: ldc_w 271
    //   121: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   124: athrow
    //   125: aload 4
    //   127: invokestatic 267	V5/o:b	(Ljava/lang/Object;)V
    //   130: new 530	java/io/FileInputStream
    //   133: dup
    //   134: aload_0
    //   135: invokevirtual 193	P/m:r	()Ljava/io/File;
    //   138: invokespecial 531	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   141: astore_1
    //   142: aload_0
    //   143: getfield 121	P/m:b	LP/k;
    //   146: astore 6
    //   148: aload_2
    //   149: aload_0
    //   150: putfield 528	P/m$n:o	Ljava/lang/Object;
    //   153: aload_2
    //   154: aload_1
    //   155: putfield 527	P/m$n:p	Ljava/lang/Object;
    //   158: aload_2
    //   159: aconst_null
    //   160: putfield 526	P/m$n:q	Ljava/lang/Object;
    //   163: aload_2
    //   164: iconst_1
    //   165: putfield 523	P/m$n:t	I
    //   168: aload 6
    //   170: aload_1
    //   171: aload_2
    //   172: invokeinterface 534 3 0
    //   177: astore_2
    //   178: aload_2
    //   179: aload 5
    //   181: if_acmpne +6 -> 187
    //   184: aload 5
    //   186: areturn
    //   187: aload_0
    //   188: astore 4
    //   190: aconst_null
    //   191: astore 6
    //   193: aload_1
    //   194: astore 5
    //   196: aload 4
    //   198: astore_1
    //   199: aload 5
    //   201: aload 6
    //   203: invokestatic 314	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   206: aload_2
    //   207: areturn
    //   208: astore_2
    //   209: aload_1
    //   210: astore 5
    //   212: aload_2
    //   213: astore_1
    //   214: goto +33 -> 247
    //   217: astore 6
    //   219: aload_0
    //   220: astore_2
    //   221: aload_1
    //   222: astore 5
    //   224: aload 6
    //   226: athrow
    //   227: astore 4
    //   229: aload_2
    //   230: astore_1
    //   231: aload 5
    //   233: aload 6
    //   235: invokestatic 314	e6/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   238: aload_2
    //   239: astore_1
    //   240: aload 4
    //   242: athrow
    //   243: astore_1
    //   244: aload_0
    //   245: astore 5
    //   247: aload 5
    //   249: invokevirtual 193	P/m:r	()Ljava/io/File;
    //   252: invokevirtual 340	java/io/File:exists	()Z
    //   255: ifne +14 -> 269
    //   258: aload 5
    //   260: getfield 121	P/m:b	LP/k;
    //   263: invokeinterface 536 1 0
    //   268: areturn
    //   269: aload_1
    //   270: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	this	m
    //   0	271	1	paramd	X5.d
    //   11	196	2	localObject1	Object
    //   208	5	2	localFileNotFoundException	java.io.FileNotFoundException
    //   220	19	2	localm	m
    //   16	52	3	n	int
    //   49	148	4	localObject2	Object
    //   227	14	4	localObject3	Object
    //   54	205	5	localObject4	Object
    //   77	1	6	localThrowable1	Throwable
    //   107	1	6	localObject5	Object
    //   146	56	6	localk	k
    //   217	17	6	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   96	101	107	finally
    //   199	206	208	java/io/FileNotFoundException
    //   231	238	208	java/io/FileNotFoundException
    //   240	243	208	java/io/FileNotFoundException
    //   142	178	217	finally
    //   224	227	227	finally
    //   130	142	243	java/io/FileNotFoundException
  }
  
  public final Object y(X5.d paramd)
  {
    if ((paramd instanceof o))
    {
      localObject1 = (o)paramd;
      n = s;
      if ((n & 0x80000000) != 0)
      {
        s = (n + Integer.MIN_VALUE);
        break label45;
      }
    }
    Object localObject1 = new o(this, paramd);
    label45:
    Object localObject2 = q;
    Object localObject4 = Y5.b.c();
    int n = s;
    if (n != 0)
    {
      if (n != 1)
      {
        if (n != 2)
        {
          if (n == 3)
          {
            paramd = p;
            localObject1 = (a)o;
            try
            {
              V5.o.b(localObject2);
            }
            catch (IOException paramd)
            {
              localObject2 = localObject1;
              localObject1 = paramd;
              break label312;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramd = (a)p;
        localObject5 = (m)o;
        V5.o.b(localObject2);
        break label265;
      }
      paramd = (m)o;
      try
      {
        V5.o.b(localObject2);
      }
      catch (a locala1)
      {
        break label207;
      }
    }
    else
    {
      V5.o.b(locala1);
    }
    try
    {
      o = this;
      s = 1;
      paramd = x((X5.d)localObject1);
      X5.d locald1 = paramd;
      if (paramd == localObject4) {
        return localObject4;
      }
      return locald1;
    }
    catch (a locala2)
    {
      paramd = this;
    }
    label207:
    Object localObject6 = c;
    o = paramd;
    p = locala2;
    s = 2;
    Object localObject5 = ((b)localObject6).a(locala2, (X5.d)localObject1);
    if (localObject5 == localObject4) {
      return localObject4;
    }
    localObject6 = locala2;
    Object localObject3 = localObject5;
    localObject5 = paramd;
    paramd = (X5.d)localObject6;
    label265:
    X5.d locald2;
    try
    {
      o = paramd;
      p = localObject3;
      s = 3;
      localObject1 = ((m)localObject5).A(localObject3, (X5.d)localObject1);
      if (localObject1 == localObject4) {
        return localObject4;
      }
      paramd = (X5.d)localObject3;
      return paramd;
    }
    catch (IOException localIOException)
    {
      localObject1 = localIOException;
      locald2 = paramd;
    }
    label312:
    V5.a.a(locald2, (Throwable)localObject1);
    throw locald2;
  }
  
  public final Object z(p paramp, X5.g paramg, X5.d paramd)
  {
    if ((paramd instanceof p))
    {
      localp = (p)paramd;
      n = t;
      if ((n & 0x80000000) != 0)
      {
        t = (n + Integer.MIN_VALUE);
        break label52;
      }
    }
    p localp = new p(this, paramd);
    label52:
    paramd = r;
    Object localObject1 = Y5.b.c();
    int n = t;
    final Object localObject2;
    if (n != 0)
    {
      if (n != 1)
      {
        if (n == 2)
        {
          paramp = p;
          paramg = (m)o;
          V5.o.b(paramd);
          break label310;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramg = q;
      localObject2 = (c)p;
      paramp = (m)o;
      V5.o.b(paramd);
    }
    else
    {
      V5.o.b(paramd);
      paramd = (c)h.getValue();
      paramd.a();
      localObject2 = paramd.b();
      paramp = new q(paramp, localObject2, null);
      o = this;
      p = paramd;
      q = localObject2;
      t = 1;
      paramg = p6.g.g(paramg, paramp, localp);
      if (paramg == localObject1) {
        return localObject1;
      }
      paramp = paramd;
      paramd = paramg;
      paramg = (X5.g)localObject2;
      m localm = this;
      localObject2 = paramp;
      paramp = localm;
    }
    ((c)localObject2).a();
    if (Intrinsics.a(paramg, paramd))
    {
      paramp = paramg;
    }
    else
    {
      o = paramp;
      p = paramd;
      q = null;
      t = 2;
      if (paramp.A(paramd, localp) == localObject1) {
        return localObject1;
      }
      paramg = paramp;
      paramp = paramd;
      label310:
      paramg = h;
      if (paramp != null) {
        n = paramp.hashCode();
      } else {
        n = 0;
      }
      paramg.setValue(new c(paramp, n));
    }
    return paramp;
  }
  
  public static final class a
  {
    public final Set a()
    {
      return m.c();
    }
    
    public final Object b()
    {
      return m.d();
    }
  }
  
  public static abstract class b
  {
    public static final class a
      extends m.b
    {
      public final n a;
      
      public a(n paramn)
      {
        super();
        a = paramn;
      }
      
      public n a()
      {
        return a;
      }
    }
    
    public static final class b
      extends m.b
    {
      public final p a;
      public final p6.u b;
      public final n c;
      public final X5.g d;
      
      public b(p paramp, p6.u paramu, n paramn, X5.g paramg)
      {
        super();
        a = paramp;
        b = paramu;
        c = paramn;
        d = paramg;
      }
      
      public final p6.u a()
      {
        return b;
      }
      
      public final X5.g b()
      {
        return d;
      }
      
      public n c()
      {
        return c;
      }
      
      public final p d()
      {
        return a;
      }
    }
  }
  
  public static final class c
    extends OutputStream
  {
    public final FileOutputStream o;
    
    public c(FileOutputStream paramFileOutputStream)
    {
      o = paramFileOutputStream;
    }
    
    public void close() {}
    
    public void flush()
    {
      o.flush();
    }
    
    public void write(int paramInt)
    {
      o.write(paramInt);
    }
    
    public void write(byte[] paramArrayOfByte)
    {
      Intrinsics.checkNotNullParameter(paramArrayOfByte, "b");
      o.write(paramArrayOfByte);
    }
    
    public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      Intrinsics.checkNotNullParameter(paramArrayOfByte, "bytes");
      o.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static final class d
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public d(m paramm)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      if (paramThrowable != null) {
        m.f(o).setValue(new h(paramThrowable));
      }
      Object localObject1 = m.k;
      paramThrowable = ((m.a)localObject1).b();
      m localm = o;
      try
      {
        ((m.a)localObject1).a().remove(m.g(localm).getAbsolutePath());
        localObject1 = t.a;
        return;
      }
      finally
      {
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public static final class e
    extends kotlin.jvm.internal.l
    implements p
  {
    public static final e o = new e();
    
    public e()
    {
      super();
    }
    
    public final void a(m.b paramb, Throwable paramThrowable)
    {
      Intrinsics.checkNotNullParameter(paramb, "msg");
      if ((paramb instanceof m.b.b))
      {
        p6.u localu = ((m.b.b)paramb).a();
        paramb = paramThrowable;
        if (paramThrowable == null) {
          paramb = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        localu.l(paramb);
      }
    }
  }
  
  public static final class f
    extends Z5.k
    implements p
  {
    public int o;
    
    public f(m paramm, X5.d paramd)
    {
      super(paramd);
    }
    
    public final Object a(m.b paramb, X5.d paramd)
    {
      return ((f)create(paramb, paramd)).invokeSuspend(t.a);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new f(q, paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      int i = o;
      if (i != 0)
      {
        if ((i != 1) && (i != 2)) {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        V5.o.b(paramObject);
      }
      else
      {
        V5.o.b(paramObject);
        Object localObject2 = (m.b)p;
        if ((localObject2 instanceof m.b.a))
        {
          paramObject = q;
          localObject2 = (m.b.a)localObject2;
          o = 1;
          if (m.i((m)paramObject, (m.b.a)localObject2, this) == localObject1) {
            return localObject1;
          }
        }
        else if ((localObject2 instanceof m.b.b))
        {
          paramObject = q;
          localObject2 = (m.b.b)localObject2;
          o = 2;
          if (m.j((m)paramObject, (m.b.b)localObject2, this) == localObject1) {
            return localObject1;
          }
        }
      }
      return t.a;
    }
  }
  
  public static final class g
    extends Z5.k
    implements p
  {
    public int o;
    
    public g(m paramm, X5.d paramd)
    {
      super(paramd);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      paramd = new g(q, paramd);
      p = paramObject;
      return paramd;
    }
    
    public final Object invoke(s6.c paramc, X5.d paramd)
    {
      return ((g)create(paramc, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      int i = o;
      if (i != 0)
      {
        if (i == 1) {
          V5.o.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        V5.o.b(paramObject);
        paramObject = (s6.c)p;
        Object localObject2 = (n)m.f(q).getValue();
        if (!(localObject2 instanceof c)) {
          m.e(q).e(new m.b.a((n)localObject2));
        }
        localObject2 = new b(s6.d.a(m.f(q), new a((n)localObject2, null)));
        o = 1;
        if (s6.d.b((s6.c)paramObject, (s6.b)localObject2, this) == localObject1) {
          return localObject1;
        }
      }
      return t.a;
    }
    
    public static final class a
      extends Z5.k
      implements p
    {
      public int o;
      
      public a(n paramn, X5.d paramd)
      {
        super(paramd);
      }
      
      public final Object a(n paramn, X5.d paramd)
      {
        return ((a)create(paramn, paramd)).invokeSuspend(t.a);
      }
      
      public final X5.d create(Object paramObject, X5.d paramd)
      {
        paramd = new a(q, paramd);
        p = paramObject;
        return paramd;
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        Y5.b.c();
        if (o == 0)
        {
          V5.o.b(paramObject);
          n localn = (n)p;
          paramObject = q;
          boolean bool1 = paramObject instanceof c;
          boolean bool2 = false;
          boolean bool3 = bool2;
          if (!bool1) {
            if ((paramObject instanceof h))
            {
              bool3 = bool2;
            }
            else
            {
              bool3 = bool2;
              if (localn == paramObject) {
                bool3 = true;
              }
            }
          }
          return Z5.b.a(bool3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    
    public static final class b
      implements s6.b
    {
      public b(s6.b paramb) {}
      
      public Object a(s6.c paramc, X5.d paramd)
      {
        paramc = o.a(new a(paramc), paramd);
        if (paramc == Y5.b.c()) {
          return paramc;
        }
        return t.a;
      }
      
      public static final class a
        implements s6.c
      {
        public a(s6.c paramc) {}
        
        public Object emit(Object paramObject, X5.d paramd)
        {
          if ((paramd instanceof a))
          {
            localObject1 = (a)paramd;
            i = p;
            if ((i & 0x80000000) != 0)
            {
              p = (i + Integer.MIN_VALUE);
              paramd = (X5.d)localObject1;
              break label50;
            }
          }
          paramd = new a(this, paramd);
          label50:
          Object localObject2 = o;
          Object localObject1 = Y5.b.c();
          int i = p;
          if (i != 0)
          {
            if (i == 1) {
              V5.o.b(localObject2);
            } else {
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
          }
          else
          {
            V5.o.b(localObject2);
            localObject2 = o;
            paramObject = (n)paramObject;
            if ((paramObject instanceof j)) {
              break label200;
            }
            if ((paramObject instanceof h)) {
              break label192;
            }
            if (!(paramObject instanceof c)) {
              break label164;
            }
            paramObject = ((c)paramObject).b();
            p = 1;
            if (((s6.c)localObject2).emit(paramObject, paramd) == localObject1) {
              return localObject1;
            }
          }
          return t.a;
          label164:
          if ((paramObject instanceof o)) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
          }
          throw new V5.l();
          label192:
          throw ((h)paramObject).a();
          label200:
          throw ((j)paramObject).a();
        }
        
        public static final class a
          extends Z5.d
        {
          public int p;
          
          public a(m.g.b.a parama, X5.d paramd)
          {
            super();
          }
          
          public final Object invokeSuspend(Object paramObject)
          {
            o = paramObject;
            p |= 0x80000000;
            return q.emit(null, this);
          }
        }
      }
    }
  }
  
  public static final class h
    extends kotlin.jvm.internal.l
    implements g6.a
  {
    public h(m paramm)
    {
      super();
    }
    
    public final File a()
    {
      File localFile = (File)m.h(o).invoke();
      Object localObject2 = localFile.getAbsolutePath();
      Object localObject3 = m.k;
      Object localObject4 = ((m.a)localObject3).b();
      String str;
      label124:
      try
      {
        if ((((m.a)localObject3).a().contains(localObject2) ^ true))
        {
          localObject3 = ((m.a)localObject3).a();
          Intrinsics.checkNotNullExpressionValue(localObject2, "it");
          ((Set)localObject3).add(localObject2);
          return localFile;
        }
      }
      finally
      {
        break label124;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("There are multiple DataStores active for the same file: ");
        ((StringBuilder)localObject2).append(localObject1);
        ((StringBuilder)localObject2).append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
        str = ((StringBuilder)localObject2).toString();
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(str.toString());
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public static final class i
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public int t;
    
    public i(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      r = paramObject;
      t |= 0x80000000;
      return m.j(s, null, this);
    }
  }
  
  public static final class j
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public int w;
    
    public j(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      u = paramObject;
      w |= 0x80000000;
      return m.k(v, this);
    }
  }
  
  public static final class k
    implements i
  {
    public k(y6.a parama, s params, kotlin.jvm.internal.u paramu, m paramm) {}
    
    public Object a(p paramp, X5.d paramd)
    {
      if ((paramd instanceof a))
      {
        localObject1 = (a)paramd;
        i = v;
        if ((i & 0x80000000) != 0)
        {
          v = (i + Integer.MIN_VALUE);
          break label48;
        }
      }
      Object localObject1 = new a(this, paramd);
      label48:
      Object localObject2 = t;
      Object localObject3 = Y5.b.c();
      int i = v;
      Object localObject4;
      Object localObject5;
      Object localObject7;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              localObject4 = q;
              localObject5 = (kotlin.jvm.internal.u)p;
              paramd = (y6.a)o;
              paramp = paramd;
              try
              {
                V5.o.b(localObject2);
                localObject2 = localObject4;
              }
              finally
              {
                break label528;
              }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
          localObject4 = (m)q;
          paramd = (kotlin.jvm.internal.u)p;
          paramp = (y6.a)o;
          localObject5 = paramp;
          try
          {
            V5.o.b(localObject2);
          }
          finally
          {
            paramp = (p)localObject5;
            break label528;
          }
        }
        paramp = (m)s;
        localObject5 = (kotlin.jvm.internal.u)r;
        localObject4 = (s)q;
        paramd = (y6.a)p;
        localObject7 = (p)o;
        V5.o.b(localObject2);
        localObject2 = localObject7;
      }
      else
      {
        V5.o.b(localObject2);
        paramd = a;
        localObject4 = localObject5;
        localObject5 = localObject4;
        localObject7 = localObject6;
        o = paramp;
        p = paramd;
        q = localObject4;
        r = localObject5;
        s = localObject7;
        v = 1;
        if (paramd.a(null, (X5.d)localObject1) == localObject3) {
          return localObject3;
        }
        localObject2 = paramp;
        paramp = (p)localObject7;
      }
      try
      {
        if (!o)
        {
          localObject4 = o;
          o = paramd;
          p = localObject5;
          q = paramp;
          r = null;
          s = null;
          v = 2;
          localObject2 = ((p)localObject2).invoke(localObject4, localObject1);
          if (localObject2 == localObject3) {
            return localObject3;
          }
          localObject4 = paramp;
          paramp = paramd;
          paramd = (X5.d)localObject5;
          localObject5 = paramp;
          if (!Intrinsics.a(localObject2, o))
          {
            localObject5 = paramp;
            o = paramp;
            localObject5 = paramp;
            p = paramd;
            localObject5 = paramp;
            q = localObject2;
            localObject5 = paramp;
            v = 3;
            localObject5 = paramp;
            localObject1 = ((m)localObject4).A(localObject2, (X5.d)localObject1);
            if (localObject1 == localObject3) {
              return localObject3;
            }
            localObject5 = paramd;
            paramd = paramp;
            paramp = paramd;
            o = localObject2;
          }
          else
          {
            localObject5 = paramd;
            paramd = paramp;
          }
          paramp = paramd;
          localObject5 = o;
          paramd.b(null);
          return localObject5;
        }
      }
      finally
      {
        paramp = paramd;
        paramd = (X5.d)localObject6;
        break label528;
      }
      paramp = new java/lang/IllegalStateException;
      paramp.<init>("InitializerApi.updateData should not be called after initialization is complete.");
      throw paramp;
      label528:
      paramp.b(null);
      throw paramd;
    }
    
    public static final class a
      extends Z5.d
    {
      public Object o;
      public Object p;
      public Object q;
      public Object r;
      public Object s;
      public int v;
      
      public a(m.k paramk, X5.d paramd)
      {
        super();
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        t = paramObject;
        v |= 0x80000000;
        return u.a(null, this);
      }
    }
  }
  
  public static final class l
    extends Z5.d
  {
    public Object o;
    public int r;
    
    public l(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      p = paramObject;
      r |= 0x80000000;
      return m.l(q, this);
    }
  }
  
  public static final class m
    extends Z5.d
  {
    public Object o;
    public int r;
    
    public m(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      p = paramObject;
      r |= 0x80000000;
      return m.m(q, this);
    }
  }
  
  public static final class n
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public int t;
    
    public n(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      r = paramObject;
      t |= 0x80000000;
      return m.n(s, this);
    }
  }
  
  public static final class o
    extends Z5.d
  {
    public Object o;
    public Object p;
    public int s;
    
    public o(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      q = paramObject;
      s |= 0x80000000;
      return m.o(r, this);
    }
  }
  
  public static final class p
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public int t;
    
    public p(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      r = paramObject;
      t |= 0x80000000;
      return m.p(s, null, null, this);
    }
  }
  
  public static final class q
    extends Z5.k
    implements p
  {
    public int o;
    
    public q(p paramp, Object paramObject, X5.d paramd)
    {
      super(paramd);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      return new q(p, localObject2, paramd);
    }
    
    public final Object invoke(I paramI, X5.d paramd)
    {
      return ((q)create(paramI, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      int i = o;
      if (i != 0)
      {
        if (i == 1) {
          V5.o.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        V5.o.b(paramObject);
        paramObject = p;
        Object localObject2 = localObject2;
        o = 1;
        localObject2 = ((p)paramObject).invoke(localObject2, this);
        paramObject = localObject2;
        if (localObject2 == localObject1) {
          return localObject1;
        }
      }
      return paramObject;
    }
  }
  
  public static final class r
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public int v;
    
    public r(m paramm, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      t = paramObject;
      v |= 0x80000000;
      return u.A(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     P.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */