package o0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import nc.d0;

public final class q<T>
  implements i<T>
{
  public static final LinkedHashSet k = new LinkedHashSet();
  public static final Object l = new Object();
  public final dc.a<File> a;
  public final m<T> b;
  public final b<T> c;
  public final d0 d;
  public final qc.r e;
  public final String f;
  public final rb.g g;
  public final qc.t h;
  public List<? extends dc.p<? super k<T>, ? super ub.e<? super rb.h>, ? extends Object>> i;
  public final p<a<T>> j;
  
  public q(r0.c paramc, List paramList, b paramb, d0 paramd0)
  {
    a = paramc;
    b = localf;
    c = paramb;
    d = paramd0;
    e = new qc.r(new u(this, null));
    f = ".tmp";
    g = b.z.n(new w(this));
    paramb = c0.a;
    paramc = paramb;
    if (paramb == null) {
      paramc = eb.y.b;
    }
    h = new qc.t(paramc);
    i = sb.q.u(paramList);
    j = new p(paramd0, new r(this), s.a, new t(this, null));
  }
  
  /* Error */
  public static final Object b(q paramq, q.a.b paramb, ub.e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: pop
    //   5: aload_2
    //   6: instanceof 164
    //   9: ifeq +34 -> 43
    //   12: aload_2
    //   13: checkcast 164	o0/x
    //   16: astore_3
    //   17: aload_3
    //   18: getfield 167	o0/x:f	I
    //   21: istore 4
    //   23: iload 4
    //   25: ldc -88
    //   27: iand
    //   28: ifeq +15 -> 43
    //   31: aload_3
    //   32: iload 4
    //   34: ldc -88
    //   36: iadd
    //   37: putfield 167	o0/x:f	I
    //   40: goto +13 -> 53
    //   43: new 164	o0/x
    //   46: dup
    //   47: aload_0
    //   48: aload_2
    //   49: invokespecial 169	o0/x:<init>	(Lo0/q;Lub/e;)V
    //   52: astore_3
    //   53: aload_3
    //   54: getfield 171	o0/x:d	Ljava/lang/Object;
    //   57: astore_2
    //   58: getstatic 176	vb/a:a	Lvb/a;
    //   61: astore 5
    //   63: aload_3
    //   64: getfield 167	o0/x:f	I
    //   67: istore 4
    //   69: iconst_1
    //   70: istore 6
    //   72: iload 4
    //   74: ifeq +93 -> 167
    //   77: iload 4
    //   79: iconst_1
    //   80: if_icmpeq +62 -> 142
    //   83: iload 4
    //   85: iconst_2
    //   86: if_icmpeq +22 -> 108
    //   89: iload 4
    //   91: iconst_3
    //   92: if_icmpne +6 -> 98
    //   95: goto +47 -> 142
    //   98: new 178	java/lang/IllegalStateException
    //   101: dup
    //   102: ldc -76
    //   104: invokespecial 183	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   107: athrow
    //   108: aload_3
    //   109: getfield 186	o0/x:c	Lnc/r;
    //   112: astore_1
    //   113: aload_3
    //   114: getfield 189	o0/x:b	Lo0/q;
    //   117: astore 7
    //   119: aload_3
    //   120: getfield 191	o0/x:a	Ljava/lang/Object;
    //   123: checkcast 14	o0/q$a$b
    //   126: astore 8
    //   128: aload_1
    //   129: astore_0
    //   130: aload_2
    //   131: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   134: aload_1
    //   135: astore_0
    //   136: aload 7
    //   138: astore_1
    //   139: goto +183 -> 322
    //   142: aload_3
    //   143: getfield 191	o0/x:a	Ljava/lang/Object;
    //   146: checkcast 197	nc/r
    //   149: astore_1
    //   150: aload_1
    //   151: astore_0
    //   152: aload_2
    //   153: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   156: aload_1
    //   157: astore_0
    //   158: aload_2
    //   159: astore_1
    //   160: goto +272 -> 432
    //   163: astore_1
    //   164: goto +263 -> 427
    //   167: aload_2
    //   168: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   171: aload_1
    //   172: getfield 199	o0/q$a$b:b	Lnc/r;
    //   175: astore_2
    //   176: aload_0
    //   177: getfield 131	o0/q:h	Lqc/t;
    //   180: invokevirtual 202	qc/t:b	()Ljava/lang/Object;
    //   183: checkcast 204	o0/b0
    //   186: astore 8
    //   188: aload 8
    //   190: instanceof 206
    //   193: ifeq +50 -> 243
    //   196: aload_1
    //   197: getfield 209	o0/q$a$b:a	Ldc/p;
    //   200: astore 8
    //   202: aload_1
    //   203: getfield 212	o0/q$a$b:d	Lub/h;
    //   206: astore_1
    //   207: aload_3
    //   208: aload_2
    //   209: putfield 191	o0/x:a	Ljava/lang/Object;
    //   212: aload_3
    //   213: iconst_1
    //   214: putfield 167	o0/x:f	I
    //   217: aload_0
    //   218: aload_3
    //   219: aload_1
    //   220: aload 8
    //   222: invokevirtual 215	o0/q:i	(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;
    //   225: astore_1
    //   226: aload_1
    //   227: aload 5
    //   229: if_acmpne +9 -> 238
    //   232: aload 5
    //   234: astore_0
    //   235: goto +229 -> 464
    //   238: aload_2
    //   239: astore_0
    //   240: goto +192 -> 432
    //   243: aload 8
    //   245: instanceof 217
    //   248: ifeq +6 -> 254
    //   251: goto +10 -> 261
    //   254: aload 8
    //   256: instanceof 116
    //   259: istore 6
    //   261: iload 6
    //   263: ifeq +132 -> 395
    //   266: aload 8
    //   268: aload_1
    //   269: getfield 220	o0/q$a$b:c	Lo0/b0;
    //   272: if_acmpne +114 -> 386
    //   275: aload_3
    //   276: aload_1
    //   277: putfield 191	o0/x:a	Ljava/lang/Object;
    //   280: aload_3
    //   281: aload_0
    //   282: putfield 189	o0/x:b	Lo0/q;
    //   285: aload_3
    //   286: aload_2
    //   287: putfield 186	o0/x:c	Lnc/r;
    //   290: aload_3
    //   291: iconst_2
    //   292: putfield 167	o0/x:f	I
    //   295: aload_0
    //   296: aload_3
    //   297: invokevirtual 223	o0/q:e	(Lub/e;)Ljava/lang/Object;
    //   300: astore 8
    //   302: aload 8
    //   304: aload 5
    //   306: if_acmpne +9 -> 315
    //   309: aload 5
    //   311: astore_0
    //   312: goto +152 -> 464
    //   315: aload_1
    //   316: astore 8
    //   318: aload_0
    //   319: astore_1
    //   320: aload_2
    //   321: astore_0
    //   322: aload 8
    //   324: getfield 209	o0/q$a$b:a	Ldc/p;
    //   327: astore_2
    //   328: aload 8
    //   330: getfield 212	o0/q$a$b:d	Lub/h;
    //   333: astore 8
    //   335: aload_3
    //   336: aload_0
    //   337: putfield 191	o0/x:a	Ljava/lang/Object;
    //   340: aload_3
    //   341: aconst_null
    //   342: putfield 189	o0/x:b	Lo0/q;
    //   345: aload_3
    //   346: aconst_null
    //   347: putfield 186	o0/x:c	Lnc/r;
    //   350: aload_3
    //   351: iconst_3
    //   352: putfield 167	o0/x:f	I
    //   355: aload_1
    //   356: aload_3
    //   357: aload 8
    //   359: aload_2
    //   360: invokevirtual 215	o0/q:i	(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;
    //   363: astore_2
    //   364: aload_2
    //   365: astore_1
    //   366: aload_2
    //   367: aload 5
    //   369: if_acmpne +63 -> 432
    //   372: aload 5
    //   374: astore_0
    //   375: goto +89 -> 464
    //   378: astore_1
    //   379: aload_0
    //   380: astore_2
    //   381: aload_1
    //   382: astore_0
    //   383: goto +40 -> 423
    //   386: aload 8
    //   388: checkcast 217	o0/l
    //   391: getfield 226	o0/l:a	Ljava/lang/Throwable;
    //   394: athrow
    //   395: aload 8
    //   397: instanceof 228
    //   400: ifeq +12 -> 412
    //   403: aload 8
    //   405: checkcast 228	o0/j
    //   408: getfield 229	o0/j:a	Ljava/lang/Throwable;
    //   411: athrow
    //   412: new 231	n7/w
    //   415: astore_0
    //   416: aload_0
    //   417: invokespecial 232	n7/w:<init>	()V
    //   420: aload_0
    //   421: athrow
    //   422: astore_0
    //   423: aload_0
    //   424: astore_1
    //   425: aload_2
    //   426: astore_0
    //   427: aload_1
    //   428: invokestatic 235	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   431: astore_1
    //   432: aload_1
    //   433: invokestatic 240	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   436: astore_2
    //   437: aload_2
    //   438: ifnonnull +14 -> 452
    //   441: aload_0
    //   442: aload_1
    //   443: invokeinterface 244 2 0
    //   448: pop
    //   449: goto +11 -> 460
    //   452: aload_0
    //   453: aload_2
    //   454: invokeinterface 248 2 0
    //   459: pop
    //   460: getstatic 253	rb/h:a	Lrb/h;
    //   463: astore_0
    //   464: aload_0
    //   465: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	466	0	paramq	q
    //   0	466	1	paramb	q.a.b
    //   0	466	2	parame	ub.e
    //   16	341	3	localx	x
    //   21	72	4	m	int
    //   61	312	5	locala	vb.a
    //   70	192	6	bool	boolean
    //   117	20	7	localq	q
    //   126	278	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   130	134	163	finally
    //   152	156	163	finally
    //   322	364	378	finally
    //   176	226	422	finally
    //   243	251	422	finally
    //   254	261	422	finally
    //   266	302	422	finally
    //   386	395	422	finally
    //   395	412	422	finally
    //   412	422	422	finally
  }
  
  public final Object a(dc.p<? super T, ? super ub.e<? super T>, ? extends Object> paramp, ub.e<? super T> parame)
  {
    nc.s locals = b.z.b();
    paramp = new q.a.b(paramp, locals, (b0)h.b(), parame.getContext());
    j.a(paramp);
    return locals.await(parame);
  }
  
  public final File c()
  {
    return (File)g.getValue();
  }
  
  public final Object d(final ub.e<? super rb.h> parame)
  {
    if ((parame instanceof c))
    {
      localc = (c)parame;
      m = q;
      if ((m & 0x80000000) != 0)
      {
        q = (m + Integer.MIN_VALUE);
        break label45;
      }
    }
    c localc = new c(this, parame);
    label45:
    Object localObject1 = o;
    vb.a locala = vb.a.a;
    int m = q;
    int n = 0;
    final Object localObject4;
    Iterator localIterator;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m == 3)
          {
            localObject2 = (vc.a)d;
            localObject3 = (ec.r)c;
            parame = (ec.s)b;
            localObject4 = a;
            rb.f.b(localObject1);
            break label578;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localIterator = f;
        locald = e;
        parame = (ec.r)d;
        localObject4 = (ec.s)c;
        localObject2 = (vc.a)b;
        localObject5 = a;
        rb.f.b(localObject1);
        localObject1 = localObject4;
        break label415;
      }
      localObject5 = (ec.s)d;
      parame = (ec.s)c;
      localObject2 = (vc.a)b;
      localObject4 = a;
      rb.f.b(localObject1);
    }
    else
    {
      rb.f.b(localObject1);
      if ((!ec.i.a(h.b(), c0.a)) && (!(h.b() instanceof l))) {
        m = 0;
      } else {
        m = 1;
      }
      if (m == 0) {
        break label650;
      }
      localObject2 = b.a0.e();
      localObject5 = new ec.s();
      a = this;
      b = localObject2;
      c = ((Serializable)localObject5);
      d = localObject5;
      q = 1;
      localObject1 = h(localc);
      if (localObject1 == locala) {
        return locala;
      }
      localObject4 = this;
      parame = (ub.e<? super rb.h>)localObject5;
    }
    a = localObject1;
    final Object localObject3 = new ec.r();
    d locald = new d((vc.a)localObject2, (ec.r)localObject3, parame, (q)localObject4);
    Object localObject5 = i;
    Object localObject6;
    Object localObject7;
    if (localObject5 == null)
    {
      localObject6 = localObject2;
      localObject7 = parame;
    }
    else
    {
      localIterator = ((Iterable)localObject5).iterator();
      localObject5 = localObject4;
      localObject1 = parame;
      parame = (ub.e<? super rb.h>)localObject3;
      label415:
      do
      {
        localObject3 = parame;
        localObject7 = localObject1;
        localObject6 = localObject2;
        localObject4 = localObject5;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject4 = (dc.p)localIterator.next();
        a = ((q)localObject5);
        b = localObject2;
        c = ((Serializable)localObject1);
        d = parame;
        e = locald;
        f = localIterator;
        q = 2;
      } while (((dc.p)localObject4).invoke(locald, localc) != locala);
      return locala;
    }
    i = null;
    a = ((q)localObject4);
    b = localObject7;
    c = ((Serializable)localObject3);
    d = localObject6;
    e = null;
    f = null;
    q = 3;
    if (((vc.a)localObject6).b(localc) == locala) {
      return locala;
    }
    parame = (ub.e<? super rb.h>)localObject7;
    Object localObject2 = localObject6;
    try
    {
      label578:
      a = true;
      localObject5 = rb.h.a;
      ((vc.a)localObject2).a(null);
      localObject2 = h;
      parame = a;
      m = n;
      if (parame != null) {
        m = parame.hashCode();
      }
      ((qc.t)localObject2).setValue(new c(parame, m));
      return rb.h.a;
    }
    finally
    {
      ((vc.a)localObject2).a(null);
    }
    label650:
    throw new IllegalStateException("Check failed.".toString());
  }
  
  /* Error */
  public final Object e(ub.e<? super rb.h> parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 23
    //   4: ifeq +33 -> 37
    //   7: aload_1
    //   8: checkcast 23	o0/q$e
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 377	o0/q$e:d	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -88
    //   20: iand
    //   21: ifeq +16 -> 37
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -88
    //   28: iadd
    //   29: putfield 377	o0/q$e:d	I
    //   32: aload_2
    //   33: astore_1
    //   34: goto +13 -> 47
    //   37: new 23	o0/q$e
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial 378	o0/q$e:<init>	(Lo0/q;Lub/e;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield 379	o0/q$e:b	Ljava/lang/Object;
    //   51: astore 4
    //   53: getstatic 176	vb/a:a	Lvb/a;
    //   56: astore_2
    //   57: aload_1
    //   58: getfield 377	o0/q$e:d	I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq +35 -> 98
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne +20 -> 88
    //   71: aload_1
    //   72: getfield 380	o0/q$e:a	Lo0/q;
    //   75: astore_2
    //   76: aload 4
    //   78: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   81: goto +45 -> 126
    //   84: astore_1
    //   85: goto +48 -> 133
    //   88: new 178	java/lang/IllegalStateException
    //   91: dup
    //   92: ldc -76
    //   94: invokespecial 183	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   97: athrow
    //   98: aload 4
    //   100: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   103: aload_1
    //   104: aload_0
    //   105: putfield 380	o0/q$e:a	Lo0/q;
    //   108: aload_1
    //   109: iconst_1
    //   110: putfield 377	o0/q$e:d	I
    //   113: aload_0
    //   114: aload_1
    //   115: invokevirtual 382	o0/q:d	(Lub/e;)Ljava/lang/Object;
    //   118: astore_1
    //   119: aload_1
    //   120: aload_2
    //   121: if_acmpne +5 -> 126
    //   124: aload_2
    //   125: areturn
    //   126: getstatic 253	rb/h:a	Lrb/h;
    //   129: areturn
    //   130: astore_1
    //   131: aload_0
    //   132: astore_2
    //   133: aload_2
    //   134: getfield 131	o0/q:h	Lqc/t;
    //   137: new 217	o0/l
    //   140: dup
    //   141: aload_1
    //   142: invokespecial 385	o0/l:<init>	(Ljava/lang/Throwable;)V
    //   145: invokevirtual 368	qc/t:setValue	(Ljava/lang/Object;)V
    //   148: aload_1
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	q
    //   0	150	1	parame	ub.e<? super rb.h>
    //   11	123	2	localObject1	Object
    //   16	53	3	m	int
    //   51	48	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   76	81	84	finally
    //   103	119	130	finally
  }
  
  /* Error */
  public final Object f(ub.e<? super rb.h> parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 25
    //   4: ifeq +33 -> 37
    //   7: aload_1
    //   8: checkcast 25	o0/q$f
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 386	o0/q$f:d	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -88
    //   20: iand
    //   21: ifeq +16 -> 37
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -88
    //   28: iadd
    //   29: putfield 386	o0/q$f:d	I
    //   32: aload_2
    //   33: astore_1
    //   34: goto +13 -> 47
    //   37: new 25	o0/q$f
    //   40: dup
    //   41: aload_0
    //   42: aload_1
    //   43: invokespecial 387	o0/q$f:<init>	(Lo0/q;Lub/e;)V
    //   46: astore_1
    //   47: aload_1
    //   48: getfield 388	o0/q$f:b	Ljava/lang/Object;
    //   51: astore 4
    //   53: getstatic 176	vb/a:a	Lvb/a;
    //   56: astore_2
    //   57: aload_1
    //   58: getfield 386	o0/q$f:d	I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq +35 -> 98
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne +20 -> 88
    //   71: aload_1
    //   72: getfield 389	o0/q$f:a	Lo0/q;
    //   75: astore_2
    //   76: aload 4
    //   78: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   81: goto +63 -> 144
    //   84: astore_1
    //   85: goto +44 -> 129
    //   88: new 178	java/lang/IllegalStateException
    //   91: dup
    //   92: ldc -76
    //   94: invokespecial 183	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   97: athrow
    //   98: aload 4
    //   100: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   103: aload_1
    //   104: aload_0
    //   105: putfield 389	o0/q$f:a	Lo0/q;
    //   108: aload_1
    //   109: iconst_1
    //   110: putfield 386	o0/q$f:d	I
    //   113: aload_0
    //   114: aload_1
    //   115: invokevirtual 382	o0/q:d	(Lub/e;)Ljava/lang/Object;
    //   118: astore_1
    //   119: aload_1
    //   120: aload_2
    //   121: if_acmpne +23 -> 144
    //   124: aload_2
    //   125: areturn
    //   126: astore_1
    //   127: aload_0
    //   128: astore_2
    //   129: aload_2
    //   130: getfield 131	o0/q:h	Lqc/t;
    //   133: new 217	o0/l
    //   136: dup
    //   137: aload_1
    //   138: invokespecial 385	o0/l:<init>	(Ljava/lang/Throwable;)V
    //   141: invokevirtual 368	qc/t:setValue	(Ljava/lang/Object;)V
    //   144: getstatic 253	rb/h:a	Lrb/h;
    //   147: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	q
    //   0	148	1	parame	ub.e<? super rb.h>
    //   11	119	2	localObject1	Object
    //   16	53	3	m	int
    //   51	48	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   76	81	84	finally
    //   103	119	126	finally
  }
  
  /* Error */
  public final Object g(ub.e<? super T> parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 27
    //   4: ifeq +31 -> 35
    //   7: aload_1
    //   8: checkcast 27	o0/q$g
    //   11: astore_2
    //   12: aload_2
    //   13: getfield 393	o0/q$g:e	I
    //   16: istore_3
    //   17: iload_3
    //   18: ldc -88
    //   20: iand
    //   21: ifeq +14 -> 35
    //   24: aload_2
    //   25: iload_3
    //   26: ldc -88
    //   28: iadd
    //   29: putfield 393	o0/q$g:e	I
    //   32: goto +13 -> 45
    //   35: new 27	o0/q$g
    //   38: dup
    //   39: aload_0
    //   40: aload_1
    //   41: invokespecial 394	o0/q$g:<init>	(Lo0/q;Lub/e;)V
    //   44: astore_2
    //   45: aload_2
    //   46: getfield 396	o0/q$g:c	Ljava/lang/Object;
    //   49: astore 4
    //   51: getstatic 176	vb/a:a	Lvb/a;
    //   54: astore 5
    //   56: aload_2
    //   57: getfield 393	o0/q$g:e	I
    //   60: istore_3
    //   61: iload_3
    //   62: ifeq +47 -> 109
    //   65: iload_3
    //   66: iconst_1
    //   67: if_icmpne +32 -> 99
    //   70: aload_2
    //   71: getfield 399	o0/q$g:b	Ljava/io/FileInputStream;
    //   74: astore 5
    //   76: aload_2
    //   77: getfield 400	o0/q$g:a	Lo0/q;
    //   80: astore_1
    //   81: aload 4
    //   83: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   86: aload 4
    //   88: astore_2
    //   89: goto +81 -> 170
    //   92: astore 4
    //   94: aload_1
    //   95: astore_2
    //   96: goto +93 -> 189
    //   99: new 178	java/lang/IllegalStateException
    //   102: dup
    //   103: ldc -76
    //   105: invokespecial 183	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   108: athrow
    //   109: aload 4
    //   111: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   114: new 402	java/io/FileInputStream
    //   117: dup
    //   118: aload_0
    //   119: invokevirtual 404	o0/q:c	()Ljava/io/File;
    //   122: invokespecial 407	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   125: astore_1
    //   126: aload_0
    //   127: getfield 81	o0/q:b	Lo0/m;
    //   130: astore 4
    //   132: aload_2
    //   133: aload_0
    //   134: putfield 400	o0/q$g:a	Lo0/q;
    //   137: aload_2
    //   138: aload_1
    //   139: putfield 399	o0/q$g:b	Ljava/io/FileInputStream;
    //   142: aload_2
    //   143: iconst_1
    //   144: putfield 393	o0/q$g:e	I
    //   147: aload 4
    //   149: aload_1
    //   150: invokeinterface 412 2 0
    //   155: astore_2
    //   156: aload_2
    //   157: aload 5
    //   159: if_acmpne +6 -> 165
    //   162: aload 5
    //   164: areturn
    //   165: aload_1
    //   166: astore 5
    //   168: aload_0
    //   169: astore_1
    //   170: aload 5
    //   172: aconst_null
    //   173: invokestatic 418	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   176: aload_2
    //   177: areturn
    //   178: astore_2
    //   179: goto +32 -> 211
    //   182: astore 4
    //   184: aload_0
    //   185: astore_2
    //   186: aload_1
    //   187: astore 5
    //   189: aload 4
    //   191: athrow
    //   192: astore 6
    //   194: aload_2
    //   195: astore_1
    //   196: aload 5
    //   198: aload 4
    //   200: invokestatic 418	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   203: aload_2
    //   204: astore_1
    //   205: aload 6
    //   207: athrow
    //   208: astore_2
    //   209: aload_0
    //   210: astore_1
    //   211: aload_1
    //   212: invokevirtual 404	o0/q:c	()Ljava/io/File;
    //   215: invokevirtual 421	java/io/File:exists	()Z
    //   218: ifne +13 -> 231
    //   221: aload_1
    //   222: getfield 81	o0/q:b	Lo0/m;
    //   225: invokeinterface 424 1 0
    //   230: areturn
    //   231: aload_2
    //   232: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	q
    //   0	233	1	parame	ub.e<? super T>
    //   11	166	2	localObject1	Object
    //   178	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   185	19	2	localq	q
    //   208	24	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   16	52	3	m	int
    //   49	38	4	localObject2	Object
    //   92	18	4	localObject3	Object
    //   130	18	4	localm	m
    //   182	17	4	localThrowable	Throwable
    //   54	143	5	localObject4	Object
    //   192	14	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   81	86	92	finally
    //   170	176	178	java/io/FileNotFoundException
    //   196	203	178	java/io/FileNotFoundException
    //   205	208	178	java/io/FileNotFoundException
    //   126	156	182	finally
    //   189	192	192	finally
    //   114	126	208	java/io/FileNotFoundException
  }
  
  public final qc.e<T> getData()
  {
    return e;
  }
  
  public final Object h(ub.e<? super T> parame)
  {
    if ((parame instanceof h))
    {
      localObject1 = (h)parame;
      m = e;
      if ((m & 0x80000000) != 0)
      {
        e = (m + Integer.MIN_VALUE);
        break label45;
      }
    }
    Object localObject1 = new h(this, parame);
    label45:
    Object localObject2 = c;
    vb.a locala = vb.a.a;
    int m = e;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m == 3)
          {
            localObject4 = b;
            parame = (a)a;
            try
            {
              rb.f.b(localObject2);
              localObject2 = localObject4;
            }
            catch (IOException localIOException1)
            {
              break label303;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        parame = (a)b;
        localObject5 = (q)a;
        rb.f.b(localIOException1);
        break label264;
      }
      parame = (q)a;
      try
      {
        rb.f.b(localIOException1);
      }
      catch (a locala1)
      {
        break label207;
      }
    }
    else
    {
      rb.f.b(locala1);
    }
    try
    {
      a = this;
      e = 1;
      parame = g((ub.e)localObject1);
      ub.e<? super T> locale = parame;
      if (parame == locala) {
        return locala;
      }
      return locale;
    }
    catch (a locala2)
    {
      parame = this;
    }
    label207:
    Object localObject4 = c;
    a = parame;
    b = locala2;
    e = 2;
    Object localObject5 = ((b)localObject4).a(locala2);
    if (localObject5 == locala) {
      return locala;
    }
    localObject4 = locala2;
    Object localObject3 = localObject5;
    localObject5 = parame;
    parame = (ub.e<? super T>)localObject4;
    try
    {
      label264:
      a = parame;
      b = localObject3;
      e = 3;
      localObject1 = ((q)localObject5).j(localObject3, (ub.e)localObject1);
      if (localObject1 == locala) {
        return locala;
      }
      return localObject3;
    }
    catch (IOException localIOException2) {}
    label303:
    x6.b.e(parame, localIOException2);
    throw parame;
  }
  
  public final Object i(ub.e parame, ub.h paramh, dc.p paramp)
  {
    if ((parame instanceof z))
    {
      localz = (z)parame;
      m = f;
      if ((m & 0x80000000) != 0)
      {
        f = (m + Integer.MIN_VALUE);
        break label52;
      }
    }
    z localz = new z(this, parame);
    label52:
    Object localObject = d;
    vb.a locala = vb.a.a;
    int m = f;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m == 2)
        {
          parame = b;
          paramh = a;
          rb.f.b(localObject);
          break label301;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramh = c;
      c localc = (c)b;
      parame = a;
      rb.f.b(localObject);
      paramp = (dc.p)localObject;
      localObject = localc;
    }
    else
    {
      rb.f.b(localObject);
      localObject = (c)h.b();
      ((c)localObject).a();
      parame = a;
      paramp = new a0(parame, null, paramp);
      a = this;
      b = localObject;
      c = parame;
      f = 1;
      paramp = x6.b.z0(localz, paramh, paramp);
      if (paramp == locala) {
        return locala;
      }
      paramh = parame;
      parame = this;
    }
    ((c)localObject).a();
    if (ec.i.a(paramh, paramp))
    {
      parame = paramh;
    }
    else
    {
      a = parame;
      b = paramp;
      c = null;
      f = 2;
      if (parame.j(paramp, localz) == locala) {
        return locala;
      }
      paramh = parame;
      parame = paramp;
      label301:
      paramh = h;
      if (parame != null) {
        m = parame.hashCode();
      } else {
        m = 0;
      }
      paramh.setValue(new c(parame, m));
    }
    return parame;
  }
  
  /* Error */
  public final Object j(T paramT, ub.e<? super rb.h> parame)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 31
    //   4: ifeq +34 -> 38
    //   7: aload_2
    //   8: checkcast 31	o0/q$i
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 471	o0/q$i:o	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc -88
    //   22: iand
    //   23: ifeq +15 -> 38
    //   26: aload_3
    //   27: iload 4
    //   29: ldc -88
    //   31: iadd
    //   32: putfield 471	o0/q$i:o	I
    //   35: goto +13 -> 48
    //   38: new 31	o0/q$i
    //   41: dup
    //   42: aload_0
    //   43: aload_2
    //   44: invokespecial 472	o0/q$i:<init>	(Lo0/q;Lub/e;)V
    //   47: astore_3
    //   48: aload_3
    //   49: getfield 474	o0/q$i:e	Ljava/lang/Object;
    //   52: astore 5
    //   54: getstatic 176	vb/a:a	Lvb/a;
    //   57: astore 6
    //   59: aload_3
    //   60: getfield 471	o0/q$i:o	I
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +67 -> 134
    //   70: iload 4
    //   72: iconst_1
    //   73: if_icmpne +51 -> 124
    //   76: aload_3
    //   77: getfield 477	o0/q$i:d	Ljava/io/FileOutputStream;
    //   80: astore 7
    //   82: aload_3
    //   83: getfield 479	o0/q$i:c	Ljava/io/FileOutputStream;
    //   86: astore 6
    //   88: aload_3
    //   89: getfield 482	o0/q$i:b	Ljava/io/File;
    //   92: astore_1
    //   93: aload_3
    //   94: getfield 483	o0/q$i:a	Lo0/q;
    //   97: astore 8
    //   99: aload 6
    //   101: astore 9
    //   103: aload_1
    //   104: astore_2
    //   105: aload 5
    //   107: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   110: aload 6
    //   112: astore_3
    //   113: aload 7
    //   115: astore 6
    //   117: goto +175 -> 292
    //   120: astore_1
    //   121: goto +297 -> 418
    //   124: new 178	java/lang/IllegalStateException
    //   127: dup
    //   128: ldc -76
    //   130: invokespecial 183	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   133: athrow
    //   134: aload 5
    //   136: invokestatic 195	rb/f:b	(Ljava/lang/Object;)V
    //   139: aload_0
    //   140: invokevirtual 404	o0/q:c	()Ljava/io/File;
    //   143: astore 9
    //   145: aload 9
    //   147: invokevirtual 486	java/io/File:getCanonicalFile	()Ljava/io/File;
    //   150: invokevirtual 489	java/io/File:getParentFile	()Ljava/io/File;
    //   153: astore_2
    //   154: aload_2
    //   155: ifnonnull +6 -> 161
    //   158: goto +15 -> 173
    //   161: aload_2
    //   162: invokevirtual 492	java/io/File:mkdirs	()Z
    //   165: pop
    //   166: aload_2
    //   167: invokevirtual 495	java/io/File:isDirectory	()Z
    //   170: ifeq +289 -> 459
    //   173: aload_0
    //   174: invokevirtual 404	o0/q:c	()Ljava/io/File;
    //   177: invokevirtual 498	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   180: astore_2
    //   181: new 284	java/io/File
    //   184: dup
    //   185: aload_0
    //   186: getfield 101	o0/q:f	Ljava/lang/String;
    //   189: aload_2
    //   190: invokestatic 501	ec/i:h	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    //   193: invokespecial 502	java/io/File:<init>	(Ljava/lang/String;)V
    //   196: astore_2
    //   197: aload_2
    //   198: astore 9
    //   200: new 504	java/io/FileOutputStream
    //   203: dup
    //   204: aload_2
    //   205: invokespecial 505	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   208: astore 8
    //   210: aload_0
    //   211: getfield 81	o0/q:b	Lo0/m;
    //   214: astore 7
    //   216: new 17	o0/q$b
    //   219: astore 9
    //   221: aload 9
    //   223: aload 8
    //   225: invokespecial 508	o0/q$b:<init>	(Ljava/io/FileOutputStream;)V
    //   228: aload_3
    //   229: aload_0
    //   230: putfield 483	o0/q$i:a	Lo0/q;
    //   233: aload_3
    //   234: aload_2
    //   235: putfield 482	o0/q$i:b	Ljava/io/File;
    //   238: aload_3
    //   239: aload 8
    //   241: putfield 479	o0/q$i:c	Ljava/io/FileOutputStream;
    //   244: aload_3
    //   245: aload 8
    //   247: putfield 477	o0/q$i:d	Ljava/io/FileOutputStream;
    //   250: aload_3
    //   251: iconst_1
    //   252: putfield 471	o0/q$i:o	I
    //   255: aload 7
    //   257: aload_1
    //   258: aload 9
    //   260: invokeinterface 511 3 0
    //   265: astore_1
    //   266: aload_1
    //   267: aload 6
    //   269: if_acmpne +6 -> 275
    //   272: aload 6
    //   274: areturn
    //   275: aload_0
    //   276: astore 9
    //   278: aload 8
    //   280: astore_1
    //   281: aload_1
    //   282: astore_3
    //   283: aload_1
    //   284: astore 6
    //   286: aload_2
    //   287: astore_1
    //   288: aload 9
    //   290: astore 8
    //   292: aload_3
    //   293: astore 9
    //   295: aload_1
    //   296: astore_2
    //   297: aload 6
    //   299: invokevirtual 515	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   302: invokevirtual 520	java/io/FileDescriptor:sync	()V
    //   305: aload_3
    //   306: astore 9
    //   308: aload_1
    //   309: astore_2
    //   310: getstatic 253	rb/h:a	Lrb/h;
    //   313: astore 6
    //   315: aload_1
    //   316: astore 9
    //   318: aload_3
    //   319: aconst_null
    //   320: invokestatic 418	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   323: aload_1
    //   324: astore 9
    //   326: aload_1
    //   327: aload 8
    //   329: invokevirtual 404	o0/q:c	()Ljava/io/File;
    //   332: invokevirtual 524	java/io/File:renameTo	(Ljava/io/File;)Z
    //   335: istore 10
    //   337: iload 10
    //   339: ifeq +7 -> 346
    //   342: getstatic 253	rb/h:a	Lrb/h;
    //   345: areturn
    //   346: aload_1
    //   347: astore 9
    //   349: new 430	java/io/IOException
    //   352: astore_2
    //   353: aload_1
    //   354: astore 9
    //   356: new 526	java/lang/StringBuilder
    //   359: astore_3
    //   360: aload_1
    //   361: astore 9
    //   363: aload_3
    //   364: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   367: aload_1
    //   368: astore 9
    //   370: aload_3
    //   371: ldc_w 529
    //   374: invokevirtual 533	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: pop
    //   378: aload_1
    //   379: astore 9
    //   381: aload_3
    //   382: aload_1
    //   383: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   386: pop
    //   387: aload_1
    //   388: astore 9
    //   390: aload_3
    //   391: ldc_w 538
    //   394: invokevirtual 533	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: aload_1
    //   399: astore 9
    //   401: aload_2
    //   402: aload_3
    //   403: invokevirtual 539	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: invokespecial 540	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   409: aload_1
    //   410: astore 9
    //   412: aload_2
    //   413: athrow
    //   414: astore_1
    //   415: goto +28 -> 443
    //   418: aload 9
    //   420: astore 8
    //   422: goto +4 -> 426
    //   425: astore_1
    //   426: aload_1
    //   427: athrow
    //   428: astore_3
    //   429: aload_2
    //   430: astore 9
    //   432: aload 8
    //   434: aload_1
    //   435: invokestatic 418	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   438: aload_2
    //   439: astore 9
    //   441: aload_3
    //   442: athrow
    //   443: aload 9
    //   445: invokevirtual 421	java/io/File:exists	()Z
    //   448: ifeq +9 -> 457
    //   451: aload 9
    //   453: invokevirtual 543	java/io/File:delete	()Z
    //   456: pop
    //   457: aload_1
    //   458: athrow
    //   459: new 430	java/io/IOException
    //   462: dup
    //   463: aload 9
    //   465: ldc_w 545
    //   468: invokestatic 501	ec/i:h	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    //   471: invokespecial 540	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   474: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	475	0	this	q
    //   0	475	1	paramT	T
    //   0	475	2	parame	ub.e<? super rb.h>
    //   11	392	3	localObject1	Object
    //   428	14	3	localObject2	Object
    //   16	58	4	m	int
    //   52	83	5	localObject3	Object
    //   57	257	6	localObject4	Object
    //   80	176	7	localObject5	Object
    //   97	336	8	localObject6	Object
    //   101	363	9	localObject7	Object
    //   335	3	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   105	110	120	finally
    //   297	305	120	finally
    //   310	315	120	finally
    //   200	210	414	java/io/IOException
    //   318	323	414	java/io/IOException
    //   326	337	414	java/io/IOException
    //   349	353	414	java/io/IOException
    //   356	360	414	java/io/IOException
    //   363	367	414	java/io/IOException
    //   370	378	414	java/io/IOException
    //   381	387	414	java/io/IOException
    //   390	398	414	java/io/IOException
    //   401	409	414	java/io/IOException
    //   412	414	414	java/io/IOException
    //   432	438	414	java/io/IOException
    //   441	443	414	java/io/IOException
    //   210	266	425	finally
    //   426	428	428	finally
  }
  
  public static abstract class a<T>
  {
    public static final class a<T>
      extends q.a<T>
    {
      public final b0<T> a;
      
      public a(b0<T> paramb0)
      {
        a = paramb0;
      }
    }
    
    public static final class b<T>
      extends q.a<T>
    {
      public final dc.p<T, ub.e<? super T>, Object> a;
      public final nc.r<T> b;
      public final b0<T> c;
      public final ub.h d;
      
      public b(dc.p paramp, nc.s params, b0 paramb0, ub.h paramh)
      {
        a = paramp;
        b = params;
        c = paramb0;
        d = paramh;
      }
    }
  }
  
  public static final class b
    extends OutputStream
  {
    public final FileOutputStream a;
    
    public b(FileOutputStream paramFileOutputStream)
    {
      a = paramFileOutputStream;
    }
    
    public final void close() {}
    
    public final void flush()
    {
      a.flush();
    }
    
    public final void write(int paramInt)
    {
      a.write(paramInt);
    }
    
    public final void write(byte[] paramArrayOfByte)
    {
      ec.i.e(paramArrayOfByte, "b");
      a.write(paramArrayOfByte);
    }
    
    public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      ec.i.e(paramArrayOfByte, "bytes");
      a.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={322, 348, 505}, m="readAndInit")
  public static final class c
    extends wb.c
  {
    public q a;
    public Object b;
    public Serializable c;
    public Object d;
    public q.d e;
    public Iterator f;
    public int q;
    
    public c(q<T> paramq, ub.e<? super c> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      o = paramObject;
      q |= 0x80000000;
      q localq = p;
      paramObject = q.k;
      return localq.d(this);
    }
  }
  
  public static final class d
    implements k<T>
  {
    public d(vc.a parama, ec.r paramr, ec.s<T> params, q<T> paramq) {}
    
    public final Object a(g paramg, ub.e parame)
    {
      if ((parame instanceof y))
      {
        localObject1 = (y)parame;
        i = p;
        if ((i & 0x80000000) != 0)
        {
          p = (i + Integer.MIN_VALUE);
          break label48;
        }
      }
      Object localObject1 = new y(this, parame);
      label48:
      Object localObject2 = f;
      vb.a locala = vb.a.a;
      int i = p;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              localObject3 = c;
              localObject4 = (ec.s)b;
              parame = (vc.a)a;
              paramg = parame;
              try
              {
                rb.f.b(localObject2);
                localObject2 = localObject3;
              }
              finally
              {
                break label494;
              }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
          localObject3 = (q)c;
          parame = (ec.s)b;
          paramg = (vc.a)a;
          localObject4 = paramg;
          try
          {
            rb.f.b(localObject2);
          }
          finally
          {
            break label497;
          }
        }
        localObject4 = e;
        parame = d;
        localObject5 = (ec.r)c;
        paramg = (vc.a)b;
        localObject3 = (dc.p)a;
        rb.f.b(localObject2);
      }
      else
      {
        rb.f.b(localObject2);
        localObject5 = a;
        parame = localObject3;
        localObject2 = parame;
        localObject4 = localObject4;
        a = paramg;
        b = localObject5;
        c = parame;
        d = ((ec.s)localObject2);
        e = ((q)localObject4);
        p = 1;
        if (((vc.a)localObject5).b((wb.c)localObject1) == locala) {
          return locala;
        }
        localObject3 = paramg;
        paramg = (g)localObject5;
        localObject5 = parame;
        parame = (ub.e)localObject2;
      }
      try
      {
        if (a) {
          break label507;
        }
        localObject2 = a;
        a = paramg;
        b = parame;
        c = localObject4;
        d = null;
        e = null;
        p = 2;
        localObject2 = ((dc.p)localObject3).invoke(localObject2, localObject1);
        if (localObject2 == locala) {
          return locala;
        }
        localObject3 = localObject4;
        localObject4 = paramg;
        if (!ec.i.a(localObject2, a))
        {
          localObject4 = paramg;
          a = paramg;
          localObject4 = paramg;
          b = parame;
          localObject4 = paramg;
          c = localObject2;
          localObject4 = paramg;
          p = 3;
          localObject4 = paramg;
          localObject1 = ((q)localObject3).j(localObject2, (ub.e)localObject1);
          if (localObject1 == locala) {
            return locala;
          }
          localObject4 = parame;
          parame = paramg;
          paramg = parame;
          a = localObject2;
        }
        else
        {
          localObject4 = parame;
          parame = paramg;
        }
        paramg = parame;
        localObject4 = a;
        parame.a(null);
        return localObject4;
      }
      finally
      {
        label494:
        break label519;
      }
      break label519;
      label497:
      paramg = (g)localObject4;
      break label519;
      label507:
      parame = new java/lang/IllegalStateException;
      parame.<init>("InitializerApi.updateData should not be called after initialization is complete.");
      throw parame;
      label519:
      paramg.a(null);
      throw parame;
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={302}, m="readAndInitOrPropagateAndThrowFailure")
  public static final class e
    extends wb.c
  {
    public q a;
    public int d;
    
    public e(q<T> paramq, ub.e<? super e> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      q localq = c;
      paramObject = q.k;
      return localq.e(this);
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={311}, m="readAndInitOrPropagateFailure")
  public static final class f
    extends wb.c
  {
    public q a;
    public int d;
    
    public f(q<T> paramq, ub.e<? super f> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      paramObject = c;
      LinkedHashSet localLinkedHashSet = q.k;
      return ((q)paramObject).f(this);
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={381}, m="readData")
  public static final class g
    extends wb.c
  {
    public q a;
    public FileInputStream b;
    public int e;
    
    public g(q<T> paramq, ub.e<? super g> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      c = paramObject;
      e |= 0x80000000;
      paramObject = d;
      LinkedHashSet localLinkedHashSet = q.k;
      return ((q)paramObject).g(this);
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={359, 362, 365}, m="readDataOrHandleCorruption")
  public static final class h
    extends wb.c
  {
    public Object a;
    public Object b;
    public int e;
    
    public h(q<T> paramq, ub.e<? super h> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      c = paramObject;
      e |= 0x80000000;
      paramObject = d;
      LinkedHashSet localLinkedHashSet = q.k;
      return ((q)paramObject).h(this);
    }
  }
  
  @wb.e(c="androidx.datastore.core.SingleProcessDataStore", f="SingleProcessDataStore.kt", l={426}, m="writeData$datastore_core")
  public static final class i
    extends wb.c
  {
    public q a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public int o;
    
    public i(q<T> paramq, ub.e<? super i> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      e = paramObject;
      o |= 0x80000000;
      return f.j(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     o0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */