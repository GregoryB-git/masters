package nc;

import f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p2.m0;
import sc.x;
import sc.y;

public abstract class y0
  extends z0
  implements l0
{
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed");
  public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(y0.class, "_isCompleted");
  private volatile Object _delayed;
  private volatile int _isCompleted = 0;
  private volatile Object _queue;
  
  public static final boolean K0(y0 paramy0)
  {
    paramy0.getClass();
    boolean bool;
    if (q.get(paramy0) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public final long G0()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 76	nc/x0:H0	()Z
    //   4: istore_1
    //   5: lconst_0
    //   6: lstore_2
    //   7: iload_1
    //   8: ifeq +5 -> 13
    //   11: lconst_0
    //   12: lreturn
    //   13: getstatic 44	nc/y0:p	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   16: aload_0
    //   17: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   20: checkcast 17	nc/y0$d
    //   23: astore 4
    //   25: aconst_null
    //   26: astore 5
    //   28: iconst_1
    //   29: istore 6
    //   31: aload 4
    //   33: ifnull +157 -> 190
    //   36: aload 4
    //   38: invokevirtual 84	sc/x:b	()I
    //   41: ifne +9 -> 50
    //   44: iconst_1
    //   45: istore 7
    //   47: goto +6 -> 53
    //   50: iconst_0
    //   51: istore 7
    //   53: iload 7
    //   55: ifne +135 -> 190
    //   58: invokestatic 89	java/lang/System:nanoTime	()J
    //   61: lstore 8
    //   63: aload 4
    //   65: monitorenter
    //   66: aload 4
    //   68: getfield 92	sc/x:a	[Lsc/y;
    //   71: astore 10
    //   73: aload 10
    //   75: ifnull +12 -> 87
    //   78: aload 10
    //   80: iconst_0
    //   81: aaload
    //   82: astore 10
    //   84: goto +6 -> 90
    //   87: aconst_null
    //   88: astore 10
    //   90: aload 10
    //   92: ifnonnull +12 -> 104
    //   95: aload 4
    //   97: monitorexit
    //   98: aconst_null
    //   99: astore 10
    //   101: goto +70 -> 171
    //   104: aload 10
    //   106: checkcast 14	nc/y0$c
    //   109: astore 10
    //   111: lload 8
    //   113: aload 10
    //   115: getfield 95	nc/y0$c:a	J
    //   118: lsub
    //   119: lconst_0
    //   120: lcmp
    //   121: iflt +9 -> 130
    //   124: iconst_1
    //   125: istore 7
    //   127: goto +6 -> 133
    //   130: iconst_0
    //   131: istore 7
    //   133: iload 7
    //   135: ifeq +13 -> 148
    //   138: aload_0
    //   139: aload 10
    //   141: invokevirtual 99	nc/y0:M0	(Ljava/lang/Runnable;)Z
    //   144: istore_1
    //   145: goto +5 -> 150
    //   148: iconst_0
    //   149: istore_1
    //   150: iload_1
    //   151: ifeq +14 -> 165
    //   154: aload 4
    //   156: iconst_0
    //   157: invokevirtual 102	sc/x:c	(I)Lsc/y;
    //   160: astore 10
    //   162: goto +6 -> 168
    //   165: aconst_null
    //   166: astore 10
    //   168: aload 4
    //   170: monitorexit
    //   171: aload 10
    //   173: checkcast 14	nc/y0$c
    //   176: ifnonnull -113 -> 63
    //   179: goto +11 -> 190
    //   182: astore 10
    //   184: aload 4
    //   186: monitorexit
    //   187: aload 10
    //   189: athrow
    //   190: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   193: astore 4
    //   195: aload 4
    //   197: aload_0
    //   198: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   201: astore 10
    //   203: aload 10
    //   205: ifnonnull +6 -> 211
    //   208: goto +93 -> 301
    //   211: aload 10
    //   213: instanceof 104
    //   216: ifeq +77 -> 293
    //   219: aload 10
    //   221: checkcast 104	sc/l
    //   224: astore 11
    //   226: aload 11
    //   228: invokevirtual 107	sc/l:d	()Ljava/lang/Object;
    //   231: astore 12
    //   233: aload 12
    //   235: getstatic 111	sc/l:g	Ld2/h0;
    //   238: if_acmpeq +13 -> 251
    //   241: aload 12
    //   243: checkcast 113	java/lang/Runnable
    //   246: astore 10
    //   248: goto +108 -> 356
    //   251: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   254: astore 12
    //   256: aload 11
    //   258: invokevirtual 116	sc/l:c	()Lsc/l;
    //   261: astore 11
    //   263: aload 12
    //   265: aload_0
    //   266: aload 10
    //   268: aload 11
    //   270: invokevirtual 120	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   273: ifeq +6 -> 279
    //   276: goto -81 -> 195
    //   279: aload 12
    //   281: aload_0
    //   282: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   285: aload 10
    //   287: if_acmpeq -24 -> 263
    //   290: goto -95 -> 195
    //   293: aload 10
    //   295: getstatic 125	p2/m0:s	Ld2/h0;
    //   298: if_acmpne +9 -> 307
    //   301: aconst_null
    //   302: astore 10
    //   304: goto +52 -> 356
    //   307: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   310: astore 11
    //   312: aload 11
    //   314: aload_0
    //   315: aload 10
    //   317: aconst_null
    //   318: invokevirtual 120	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   321: ifeq +9 -> 330
    //   324: iconst_1
    //   325: istore 7
    //   327: goto +17 -> 344
    //   330: aload 11
    //   332: aload_0
    //   333: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   336: aload 10
    //   338: if_acmpeq -26 -> 312
    //   341: iconst_0
    //   342: istore 7
    //   344: iload 7
    //   346: ifeq -151 -> 195
    //   349: aload 10
    //   351: checkcast 113	java/lang/Runnable
    //   354: astore 10
    //   356: aload 10
    //   358: ifnull +12 -> 370
    //   361: aload 10
    //   363: invokeinterface 128 1 0
    //   368: lconst_0
    //   369: lreturn
    //   370: aload_0
    //   371: getfield 132	nc/x0:e	Lsb/i;
    //   374: astore 10
    //   376: aload 10
    //   378: ifnonnull +6 -> 384
    //   381: goto +11 -> 392
    //   384: aload 10
    //   386: invokevirtual 137	sb/i:isEmpty	()Z
    //   389: ifeq +11 -> 400
    //   392: ldc2_w 138
    //   395: lstore 8
    //   397: goto +6 -> 403
    //   400: lconst_0
    //   401: lstore 8
    //   403: lload 8
    //   405: lconst_0
    //   406: lcmp
    //   407: ifne +9 -> 416
    //   410: lload_2
    //   411: lstore 8
    //   413: goto +199 -> 612
    //   416: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   419: aload_0
    //   420: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   423: astore 10
    //   425: aload 10
    //   427: ifnull +85 -> 512
    //   430: aload 10
    //   432: instanceof 104
    //   435: ifeq +63 -> 498
    //   438: aload 10
    //   440: checkcast 104	sc/l
    //   443: astore 10
    //   445: getstatic 143	sc/l:f	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   448: aload 10
    //   450: invokevirtual 148	java/util/concurrent/atomic/AtomicLongFieldUpdater:get	(Ljava/lang/Object;)J
    //   453: lstore 8
    //   455: ldc2_w 149
    //   458: lload 8
    //   460: land
    //   461: iconst_0
    //   462: lshr
    //   463: l2i
    //   464: lload 8
    //   466: ldc2_w 151
    //   469: land
    //   470: bipush 30
    //   472: lshr
    //   473: l2i
    //   474: if_icmpne +10 -> 484
    //   477: iload 6
    //   479: istore 7
    //   481: goto +6 -> 487
    //   484: iconst_0
    //   485: istore 7
    //   487: iload 7
    //   489: ifne +23 -> 512
    //   492: lload_2
    //   493: lstore 8
    //   495: goto +117 -> 612
    //   498: lload_2
    //   499: lstore 8
    //   501: aload 10
    //   503: getstatic 125	p2/m0:s	Ld2/h0;
    //   506: if_acmpne +106 -> 612
    //   509: goto +98 -> 607
    //   512: getstatic 44	nc/y0:p	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   515: aload_0
    //   516: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   519: checkcast 17	nc/y0$d
    //   522: astore 4
    //   524: aload 4
    //   526: ifnull +81 -> 607
    //   529: aload 4
    //   531: monitorenter
    //   532: aload 4
    //   534: getfield 92	sc/x:a	[Lsc/y;
    //   537: astore 11
    //   539: aload 5
    //   541: astore 10
    //   543: aload 11
    //   545: ifnull +9 -> 554
    //   548: aload 11
    //   550: iconst_0
    //   551: aaload
    //   552: astore 10
    //   554: aload 4
    //   556: monitorexit
    //   557: aload 10
    //   559: checkcast 14	nc/y0$c
    //   562: astore 10
    //   564: aload 10
    //   566: ifnonnull +6 -> 572
    //   569: goto +38 -> 607
    //   572: aload 10
    //   574: getfield 95	nc/y0$c:a	J
    //   577: invokestatic 89	java/lang/System:nanoTime	()J
    //   580: lsub
    //   581: lstore 8
    //   583: lload 8
    //   585: lconst_0
    //   586: lcmp
    //   587: ifge +9 -> 596
    //   590: lload_2
    //   591: lstore 8
    //   593: goto +19 -> 612
    //   596: goto +16 -> 612
    //   599: astore 10
    //   601: aload 4
    //   603: monitorexit
    //   604: aload 10
    //   606: athrow
    //   607: ldc2_w 138
    //   610: lstore 8
    //   612: lload 8
    //   614: lreturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	615	0	this	y0
    //   4	147	1	bool	boolean
    //   6	585	2	l1	long
    //   23	579	4	localObject1	Object
    //   26	514	5	localObject2	Object
    //   29	449	6	i	int
    //   45	443	7	j	int
    //   61	552	8	l2	long
    //   71	101	10	localObject3	Object
    //   182	6	10	localObject4	Object
    //   201	372	10	localObject5	Object
    //   599	6	10	localObject6	Object
    //   224	325	11	localObject7	Object
    //   231	49	12	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   66	73	182	finally
    //   104	124	182	finally
    //   138	145	182	finally
    //   154	162	182	finally
    //   532	539	599	finally
  }
  
  public void L0(Runnable paramRunnable)
  {
    if (M0(paramRunnable))
    {
      paramRunnable = I0();
      if (Thread.currentThread() != paramRunnable) {
        LockSupport.unpark(paramRunnable);
      }
    }
    else
    {
      h0.r.L0(paramRunnable);
    }
  }
  
  public final boolean M0(Runnable paramRunnable)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = o;
    int i;
    label172:
    label174:
    do
    {
      Object localObject1;
      int j;
      for (;;)
      {
        localObject1 = localAtomicReferenceFieldUpdater.get(this);
        i = q.get(this);
        j = 0;
        int k = 0;
        if (i != 0) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          return false;
        }
        if (localObject1 == null)
        {
          localObject1 = o;
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject1).compareAndSet(this, null, paramRunnable))
            {
              i = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject1).get(this) == null);
          i = k;
          if (i != 0) {
            return true;
          }
        }
        else
        {
          if (!(localObject1 instanceof sc.l)) {
            break label174;
          }
          localObject2 = (sc.l)localObject1;
          i = ((sc.l)localObject2).a(paramRunnable);
          if (i == 0) {
            break label172;
          }
          if (i != 1)
          {
            if (i == 2) {
              return false;
            }
          }
          else
          {
            localObject3 = o;
            localObject2 = ((sc.l)localObject2).c();
            if (!((AtomicReferenceFieldUpdater)localObject3).compareAndSet(this, localObject1, localObject2)) {
              if (((AtomicReferenceFieldUpdater)localObject3).get(this) == localObject1) {
                break;
              }
            }
          }
        }
      }
      return true;
      if (localObject1 == m0.s) {
        return false;
      }
      Object localObject3 = new sc.l(8, true);
      ((sc.l)localObject3).a((Runnable)localObject1);
      ((sc.l)localObject3).a(paramRunnable);
      Object localObject2 = o;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, localObject1, localObject3))
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject2).get(this) == localObject1);
      i = j;
    } while (i == 0);
    return true;
  }
  
  public final boolean N0()
  {
    Object localObject = e;
    boolean bool1 = true;
    boolean bool2;
    if (localObject != null) {
      bool2 = ((sb.i)localObject).isEmpty();
    } else {
      bool2 = true;
    }
    if (!bool2) {
      return false;
    }
    localObject = (d)p.get(this);
    if (localObject != null)
    {
      int i;
      if (((x)localObject).b() == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        return false;
      }
    }
    localObject = o.get(this);
    if (localObject == null)
    {
      bool2 = bool1;
    }
    else
    {
      if ((localObject instanceof sc.l))
      {
        localObject = (sc.l)localObject;
        long l = sc.l.f.get(localObject);
        if ((int)((0x3FFFFFFF & l) >> 0) == (int)((l & 0xFFFFFFFC0000000) >> 30)) {
          return bool1;
        }
      }
      else if (localObject == m0.s)
      {
        return bool1;
      }
      bool2 = false;
    }
    return bool2;
  }
  
  public final void O0(long paramLong, c paramc)
  {
    int i = q.get(this);
    int j = 1;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    y[] arrayOfy = null;
    Object localObject1 = null;
    d locald;
    Object localObject2;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = p;
      locald = (d)localAtomicReferenceFieldUpdater.get(this);
      localObject2 = locald;
      if (locald == null)
      {
        localObject2 = new d(paramLong);
        while ((!localAtomicReferenceFieldUpdater.compareAndSet(this, null, localObject2)) && (localAtomicReferenceFieldUpdater.get(this) == null)) {}
        localObject2 = p.get(this);
        ec.i.b(localObject2);
        localObject2 = (d)localObject2;
      }
      i = paramc.h(paramLong, (d)localObject2, this);
    }
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          throw new IllegalStateException("unexpected result".toString());
        }
      }
      else {
        J0(paramLong, paramc);
      }
    }
    else
    {
      locald = (d)p.get(this);
      localObject2 = arrayOfy;
      if (locald != null) {}
      try
      {
        arrayOfy = a;
        localObject2 = localObject1;
        if (arrayOfy != null) {
          localObject2 = arrayOfy[0];
        }
        localObject2 = (c)localObject2;
      }
      finally {}
      i = j;
      break label256;
      i = 0;
      label256:
      if (i != 0)
      {
        paramc = I0();
        if (Thread.currentThread() != paramc) {
          LockSupport.unpark(paramc);
        }
      }
    }
  }
  
  public final void f(long paramLong, l paraml)
  {
    long l = 0L;
    if (paramLong <= 0L) {
      paramLong = l;
    } else if (paramLong >= 9223372036854L) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = 1000000L * paramLong;
    }
    if (paramLong < 4611686018427387903L)
    {
      l = System.nanoTime();
      a locala = new a(paramLong + l, paraml);
      O0(l, locala);
      paraml.v(new u0(locala));
    }
  }
  
  public t0 q0(long paramLong, e2 parame2, ub.h paramh)
  {
    return l0.a.a(paramLong, parame2, paramh);
  }
  
  /* Error */
  public void shutdown()
  {
    // Byte code:
    //   0: getstatic 246	nc/c2:a	Ljava/lang/ThreadLocal;
    //   3: astore_1
    //   4: getstatic 246	nc/c2:a	Ljava/lang/ThreadLocal;
    //   7: aconst_null
    //   8: invokevirtual 251	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   11: getstatic 52	nc/y0:q	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   14: aload_0
    //   15: iconst_1
    //   16: invokevirtual 254	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:set	(Ljava/lang/Object;I)V
    //   19: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   22: astore_1
    //   23: aload_1
    //   24: aload_0
    //   25: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnonnull +48 -> 78
    //   33: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   36: astore_3
    //   37: getstatic 125	p2/m0:s	Ld2/h0;
    //   40: astore 4
    //   42: aload_3
    //   43: aload_0
    //   44: aconst_null
    //   45: aload 4
    //   47: invokevirtual 120	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   50: ifeq +9 -> 59
    //   53: iconst_1
    //   54: istore 5
    //   56: goto +14 -> 70
    //   59: aload_3
    //   60: aload_0
    //   61: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   64: ifnull -22 -> 42
    //   67: iconst_0
    //   68: istore 5
    //   70: iload 5
    //   72: ifeq -49 -> 23
    //   75: goto +91 -> 166
    //   78: aload_2
    //   79: instanceof 104
    //   82: ifeq +14 -> 96
    //   85: aload_2
    //   86: checkcast 104	sc/l
    //   89: invokevirtual 256	sc/l:b	()Z
    //   92: pop
    //   93: goto +73 -> 166
    //   96: aload_2
    //   97: getstatic 125	p2/m0:s	Ld2/h0;
    //   100: if_acmpne +6 -> 106
    //   103: goto +63 -> 166
    //   106: new 104	sc/l
    //   109: dup
    //   110: bipush 8
    //   112: iconst_1
    //   113: invokespecial 182	sc/l:<init>	(IZ)V
    //   116: astore_3
    //   117: aload_3
    //   118: aload_2
    //   119: checkcast 113	java/lang/Runnable
    //   122: invokevirtual 179	sc/l:a	(Ljava/lang/Object;)I
    //   125: pop
    //   126: getstatic 41	nc/y0:o	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   129: astore 4
    //   131: aload 4
    //   133: aload_0
    //   134: aload_2
    //   135: aload_3
    //   136: invokevirtual 120	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   139: ifeq +9 -> 148
    //   142: iconst_1
    //   143: istore 5
    //   145: goto +16 -> 161
    //   148: aload 4
    //   150: aload_0
    //   151: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   154: aload_2
    //   155: if_acmpeq -24 -> 131
    //   158: iconst_0
    //   159: istore 5
    //   161: iload 5
    //   163: ifeq -140 -> 23
    //   166: aload_0
    //   167: invokevirtual 258	nc/y0:G0	()J
    //   170: lconst_0
    //   171: lcmp
    //   172: ifle -6 -> 166
    //   175: invokestatic 89	java/lang/System:nanoTime	()J
    //   178: lstore 6
    //   180: getstatic 44	nc/y0:p	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   183: aload_0
    //   184: invokevirtual 79	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   187: checkcast 17	nc/y0$d
    //   190: astore_3
    //   191: aload_3
    //   192: ifnull +52 -> 244
    //   195: aload_3
    //   196: monitorenter
    //   197: aload_3
    //   198: invokevirtual 84	sc/x:b	()I
    //   201: ifle +12 -> 213
    //   204: aload_3
    //   205: iconst_0
    //   206: invokevirtual 102	sc/x:c	(I)Lsc/y;
    //   209: astore_1
    //   210: goto +5 -> 215
    //   213: aconst_null
    //   214: astore_1
    //   215: aload_3
    //   216: monitorexit
    //   217: aload_1
    //   218: checkcast 14	nc/y0$c
    //   221: astore_1
    //   222: aload_1
    //   223: ifnonnull +6 -> 229
    //   226: goto +18 -> 244
    //   229: aload_0
    //   230: lload 6
    //   232: aload_1
    //   233: invokevirtual 211	nc/z0:J0	(JLnc/y0$c;)V
    //   236: goto -56 -> 180
    //   239: astore_1
    //   240: aload_3
    //   241: monitorexit
    //   242: aload_1
    //   243: athrow
    //   244: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	this	y0
    //   3	230	1	localObject1	Object
    //   239	4	1	localObject2	Object
    //   28	127	2	localObject3	Object
    //   36	205	3	localObject4	Object
    //   40	109	4	localObject5	Object
    //   54	108	5	i	int
    //   178	53	6	l	long
    // Exception table:
    //   from	to	target	type
    //   197	210	239	finally
  }
  
  public final void z0(ub.h paramh, Runnable paramRunnable)
  {
    L0(paramRunnable);
  }
  
  public final class a
    extends y0.c
  {
    public final k<rb.h> c;
    
    public a(long paramLong, l paraml)
    {
      super();
      c = paraml;
    }
    
    public final void run()
    {
      c.h(y0.this, rb.h.a);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(super.toString());
      localStringBuilder.append(c);
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends y0.c
  {
    public final Runnable c;
    
    public b(e2 parame2, long paramLong)
    {
      super();
      c = parame2;
    }
    
    public final void run()
    {
      c.run();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(super.toString());
      localStringBuilder.append(c);
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class c
    implements Runnable, Comparable<c>, t0, y
  {
    private volatile Object _heap;
    public long a;
    public int b;
    
    public c(long paramLong)
    {
      a = paramLong;
      b = -1;
    }
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (c)paramObject;
      boolean bool = a - a < 0L;
      int i;
      if (bool) {
        bool = true;
      } else if (bool) {
        i = -1;
      } else {
        i = 0;
      }
      return i;
    }
    
    public final void dispose()
    {
      try
      {
        Object localObject1 = _heap;
        d2.h0 localh0 = m0.r;
        if (localObject1 == localh0) {
          return;
        }
        boolean bool = localObject1 instanceof y0.d;
        x localx = null;
        if (bool) {
          localObject1 = (y0.d)localObject1;
        } else {
          localObject1 = null;
        }
        if (localObject1 != null) {
          try
          {
            Object localObject4 = _heap;
            if ((localObject4 instanceof x)) {
              localx = (x)localObject4;
            }
            if (localx != null) {
              ((x)localObject1).c(b);
            }
          }
          finally {}
        }
        _heap = localh0;
        localObject1 = rb.h.a;
        return;
      }
      finally {}
    }
    
    public final void f(y0.d paramd)
    {
      int i;
      if (_heap != m0.r) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        _heap = paramd;
        return;
      }
      throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    /* Error */
    public final int h(long paramLong, y0.d paramd, y0 paramy0)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 37	nc/y0$c:_heap	Ljava/lang/Object;
      //   6: astore 5
      //   8: getstatic 43	p2/m0:r	Ld2/h0;
      //   11: astore 6
      //   13: iconst_0
      //   14: istore 7
      //   16: aload 5
      //   18: aload 6
      //   20: if_acmpne +9 -> 29
      //   23: iconst_2
      //   24: istore 7
      //   26: goto +131 -> 157
      //   29: aload_3
      //   30: monitorenter
      //   31: aload_3
      //   32: getfield 73	sc/x:a	[Lsc/y;
      //   35: astore 5
      //   37: aload 5
      //   39: ifnull +12 -> 51
      //   42: aload 5
      //   44: iconst_0
      //   45: aaload
      //   46: astore 5
      //   48: goto +6 -> 54
      //   51: aconst_null
      //   52: astore 5
      //   54: aload 5
      //   56: checkcast 2	nc/y0$c
      //   59: astore 5
      //   61: aload 4
      //   63: invokestatic 77	nc/y0:K0	(Lnc/y0;)Z
      //   66: istore 8
      //   68: iload 8
      //   70: ifeq +9 -> 79
      //   73: aload_3
      //   74: monitorexit
      //   75: aload_0
      //   76: monitorexit
      //   77: iconst_1
      //   78: ireturn
      //   79: aload 5
      //   81: ifnonnull +6 -> 87
      //   84: goto +36 -> 120
      //   87: aload 5
      //   89: getfield 29	nc/y0$c:a	J
      //   92: lstore 9
      //   94: lload 9
      //   96: lload_1
      //   97: lsub
      //   98: lconst_0
      //   99: lcmp
      //   100: iflt +6 -> 106
      //   103: goto +6 -> 109
      //   106: lload 9
      //   108: lstore_1
      //   109: lload_1
      //   110: aload_3
      //   111: getfield 79	nc/y0$d:c	J
      //   114: lsub
      //   115: lconst_0
      //   116: lcmp
      //   117: ifle +8 -> 125
      //   120: aload_3
      //   121: lload_1
      //   122: putfield 79	nc/y0$d:c	J
      //   125: aload_0
      //   126: getfield 29	nc/y0$c:a	J
      //   129: lstore 9
      //   131: aload_3
      //   132: getfield 79	nc/y0$d:c	J
      //   135: lstore_1
      //   136: lload 9
      //   138: lload_1
      //   139: lsub
      //   140: lconst_0
      //   141: lcmp
      //   142: ifge +8 -> 150
      //   145: aload_0
      //   146: lload_1
      //   147: putfield 29	nc/y0$c:a	J
      //   150: aload_3
      //   151: aload_0
      //   152: invokevirtual 82	sc/x:a	(Lnc/y0$c;)V
      //   155: aload_3
      //   156: monitorexit
      //   157: aload_0
      //   158: monitorexit
      //   159: iload 7
      //   161: ireturn
      //   162: astore 4
      //   164: aload_3
      //   165: monitorexit
      //   166: aload 4
      //   168: athrow
      //   169: astore_3
      //   170: aload_0
      //   171: monitorexit
      //   172: aload_3
      //   173: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	174	0	this	c
      //   0	174	1	paramLong	long
      //   0	174	3	paramd	y0.d
      //   0	174	4	paramy0	y0
      //   6	82	5	localObject	Object
      //   11	8	6	localh0	d2.h0
      //   14	146	7	i	int
      //   66	3	8	bool	boolean
      //   92	45	9	l	long
      // Exception table:
      //   from	to	target	type
      //   31	37	162	finally
      //   54	68	162	finally
      //   87	94	162	finally
      //   109	120	162	finally
      //   120	125	162	finally
      //   125	136	162	finally
      //   145	150	162	finally
      //   150	155	162	finally
      //   2	13	169	finally
      //   29	31	169	finally
      //   73	75	169	finally
      //   155	157	169	finally
      //   164	169	169	finally
    }
    
    public final void setIndex(int paramInt)
    {
      b = paramInt;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = f.l("Delayed[nanos=");
      localStringBuilder.append(a);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
  
  public static final class d
    extends x<y0.c>
  {
    public long c;
    
    public d(long paramLong)
    {
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     nc.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */