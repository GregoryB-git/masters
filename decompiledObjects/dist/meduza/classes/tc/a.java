package tc;

import d2.h0;
import ec.s;
import f;
import gc.c;
import gc.c.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nc.g0;
import sc.k;
import sc.r;

public final class a
  implements Executor, Closeable
{
  public static final AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
  public static final AtomicLongFieldUpdater q = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
  public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
  public static final h0 s = new h0("NOT_IN_STACK", 9);
  private volatile int _isTerminated;
  public final int a;
  public final int b;
  public final long c;
  private volatile long controlState;
  public final String d;
  public final d e;
  public final d f;
  public final r<a> o;
  private volatile long parkedWorkersStack;
  
  public a(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong;
    d = paramString;
    int i = 1;
    int j;
    if (paramInt1 >= 1) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      if (paramInt2 >= paramInt1) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        if (paramInt2 <= 2097150) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          if (paramLong > 0L) {
            paramInt2 = i;
          } else {
            paramInt2 = 0;
          }
          if (paramInt2 != 0)
          {
            e = new d();
            f = new d();
            o = new r((paramInt1 + 1) * 2);
            controlState = (paramInt1 << 42);
            _isTerminated = 0;
            return;
          }
          paramString = new StringBuilder();
          paramString.append("Idle worker keep alive time ");
          paramString.append(paramLong);
          paramString.append(" must be positive");
          throw new IllegalArgumentException(paramString.toString().toString());
        }
        throw new IllegalArgumentException(a0.j.h("Max pool size ", paramInt2, " should not exceed maximal supported number of threads 2097150").toString());
      }
      throw new IllegalArgumentException(f.i("Max pool size ", paramInt2, " should be greater than or equals to core pool size ", paramInt1).toString());
    }
    throw new IllegalArgumentException(a0.j.h("Core pool size ", paramInt1, " should be at least 1").toString());
  }
  
  public final void C(a parama, int paramInt1, int paramInt2)
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = p;
    long l;
    int j;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      int i = (int)(0x1FFFFF & l);
      j = i;
      if (i == paramInt1) {
        if (paramInt2 == 0)
        {
          Object localObject = parama;
          do
          {
            localObject = ((a)localObject).c();
            if (localObject == s)
            {
              j = -1;
              break;
            }
            if (localObject == null)
            {
              j = 0;
              break;
            }
            localObject = (a)localObject;
            j = ((a)localObject).b();
          } while (j == 0);
        }
        else
        {
          j = paramInt2;
        }
      }
    } while ((j < 0) || (!p.compareAndSet(this, l, 2097152L + l & 0xFFFFFFFFFFE00000 | j)));
  }
  
  public final boolean H(long paramLong)
  {
    int i = (int)(0x1FFFFF & paramLong) - (int)((paramLong & 0x3FFFFE00000) >> 21);
    int j = i;
    if (i < 0) {
      j = 0;
    }
    if (j < a)
    {
      j = f();
      if ((j == 1) && (a > 1)) {
        f();
      }
      if (j > 0) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean I()
  {
    a locala;
    do
    {
      AtomicLongFieldUpdater localAtomicLongFieldUpdater = p;
      long l;
      int i;
      h0 localh0;
      do
      {
        l = localAtomicLongFieldUpdater.get(this);
        i = (int)(0x1FFFFF & l);
        locala = (a)o.b(i);
        if (locala == null)
        {
          locala = null;
          break;
        }
        Object localObject = locala;
        do
        {
          localObject = ((a)localObject).c();
          localh0 = s;
          if (localObject == localh0)
          {
            i = -1;
            break;
          }
          if (localObject == null)
          {
            i = 0;
            break;
          }
          localObject = (a)localObject;
          i = ((a)localObject).b();
        } while (i == 0);
      } while ((i < 0) || (!p.compareAndSet(this, l, i | 2097152L + l & 0xFFFFFFFFFFE00000)));
      locala.g(localh0);
      if (locala == null) {
        return false;
      }
    } while (!a.q.compareAndSet(locala, -1, 0));
    LockSupport.unpark(locala);
    return true;
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: getstatic 55	tc/a:r	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    //   3: aload_0
    //   4: iconst_0
    //   5: iconst_1
    //   6: invokevirtual 182	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:compareAndSet	(Ljava/lang/Object;II)Z
    //   9: ifne +6 -> 15
    //   12: goto +312 -> 324
    //   15: invokestatic 195	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   18: astore_1
    //   19: aload_1
    //   20: instanceof 10
    //   23: ifeq +11 -> 34
    //   26: aload_1
    //   27: checkcast 10	tc/a$a
    //   30: astore_1
    //   31: goto +5 -> 36
    //   34: aconst_null
    //   35: astore_1
    //   36: aload_1
    //   37: ifnull +19 -> 56
    //   40: aload_1
    //   41: getfield 198	tc/a$a:p	Ltc/a;
    //   44: aload_0
    //   45: invokestatic 203	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   48: ifeq +8 -> 56
    //   51: aload_1
    //   52: astore_2
    //   53: goto +5 -> 58
    //   56: aconst_null
    //   57: astore_2
    //   58: aload_0
    //   59: getfield 92	tc/a:o	Lsc/r;
    //   62: astore_1
    //   63: aload_1
    //   64: monitorenter
    //   65: getstatic 47	tc/a:q	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   68: aload_0
    //   69: invokevirtual 147	java/util/concurrent/atomic/AtomicLongFieldUpdater:get	(Ljava/lang/Object;)J
    //   72: lstore_3
    //   73: lload_3
    //   74: ldc2_w 148
    //   77: land
    //   78: l2i
    //   79: istore 5
    //   81: aload_1
    //   82: monitorexit
    //   83: iconst_1
    //   84: iload 5
    //   86: if_icmpgt +139 -> 225
    //   89: iconst_1
    //   90: istore 6
    //   92: aload_0
    //   93: getfield 92	tc/a:o	Lsc/r;
    //   96: iload 6
    //   98: invokevirtual 173	sc/r:b	(I)Ljava/lang/Object;
    //   101: astore_1
    //   102: aload_1
    //   103: invokestatic 205	ec/i:b	(Ljava/lang/Object;)V
    //   106: aload_1
    //   107: checkcast 10	tc/a$a
    //   110: astore_1
    //   111: aload_1
    //   112: aload_2
    //   113: if_acmpeq +99 -> 212
    //   116: aload_1
    //   117: invokevirtual 208	java/lang/Thread:isAlive	()Z
    //   120: ifeq +17 -> 137
    //   123: aload_1
    //   124: invokestatic 188	java/util/concurrent/locks/LockSupport:unpark	(Ljava/lang/Thread;)V
    //   127: aload_1
    //   128: ldc2_w 209
    //   131: invokevirtual 214	java/lang/Thread:join	(J)V
    //   134: goto -18 -> 116
    //   137: aload_1
    //   138: getfield 217	tc/a$a:a	Ltc/l;
    //   141: astore_1
    //   142: aload_0
    //   143: getfield 85	tc/a:f	Ltc/d;
    //   146: astore 7
    //   148: aload_1
    //   149: invokevirtual 221	java/lang/Object:getClass	()Ljava/lang/Class;
    //   152: pop
    //   153: getstatic 226	tc/l:b	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   156: aload_1
    //   157: aconst_null
    //   158: invokevirtual 232	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:getAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: checkcast 234	tc/g
    //   164: astore 8
    //   166: aload 8
    //   168: ifnull +11 -> 179
    //   171: aload 7
    //   173: aload 8
    //   175: invokevirtual 239	sc/k:a	(Ljava/lang/Object;)Z
    //   178: pop
    //   179: aload_1
    //   180: invokevirtual 242	tc/l:b	()Ltc/g;
    //   183: astore 8
    //   185: aload 8
    //   187: ifnonnull +9 -> 196
    //   190: iconst_0
    //   191: istore 9
    //   193: goto +14 -> 207
    //   196: aload 7
    //   198: aload 8
    //   200: invokevirtual 239	sc/k:a	(Ljava/lang/Object;)Z
    //   203: pop
    //   204: iconst_1
    //   205: istore 9
    //   207: iload 9
    //   209: ifne -30 -> 179
    //   212: iload 6
    //   214: iload 5
    //   216: if_icmpeq +9 -> 225
    //   219: iinc 6 1
    //   222: goto -130 -> 92
    //   225: aload_0
    //   226: getfield 85	tc/a:f	Ltc/d;
    //   229: invokevirtual 244	sc/k:b	()V
    //   232: aload_0
    //   233: getfield 83	tc/a:e	Ltc/d;
    //   236: invokevirtual 244	sc/k:b	()V
    //   239: aload_2
    //   240: ifnull +18 -> 258
    //   243: aload_2
    //   244: iconst_1
    //   245: invokevirtual 247	tc/a$a:a	(Z)Ltc/g;
    //   248: astore 7
    //   250: aload 7
    //   252: astore_1
    //   253: aload 7
    //   255: ifnonnull +70 -> 325
    //   258: aload_0
    //   259: getfield 83	tc/a:e	Ltc/d;
    //   262: invokevirtual 249	sc/k:d	()Ljava/lang/Object;
    //   265: checkcast 234	tc/g
    //   268: astore 7
    //   270: aload 7
    //   272: astore_1
    //   273: aload 7
    //   275: ifnonnull +50 -> 325
    //   278: aload_0
    //   279: getfield 85	tc/a:f	Ltc/d;
    //   282: invokevirtual 249	sc/k:d	()Ljava/lang/Object;
    //   285: checkcast 234	tc/g
    //   288: astore 7
    //   290: aload 7
    //   292: astore_1
    //   293: aload 7
    //   295: ifnonnull +30 -> 325
    //   298: aload_2
    //   299: ifnull +9 -> 308
    //   302: aload_2
    //   303: iconst_5
    //   304: invokevirtual 252	tc/a$a:h	(I)Z
    //   307: pop
    //   308: getstatic 44	tc/a:p	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   311: aload_0
    //   312: lconst_0
    //   313: invokevirtual 256	java/util/concurrent/atomic/AtomicLongFieldUpdater:set	(Ljava/lang/Object;J)V
    //   316: getstatic 47	tc/a:q	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    //   319: aload_0
    //   320: lconst_0
    //   321: invokevirtual 256	java/util/concurrent/atomic/AtomicLongFieldUpdater:set	(Ljava/lang/Object;J)V
    //   324: return
    //   325: aload_1
    //   326: invokeinterface 261 1 0
    //   331: goto -92 -> 239
    //   334: astore 7
    //   336: invokestatic 195	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   339: astore_1
    //   340: aload_1
    //   341: invokevirtual 265	java/lang/Thread:getUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   344: aload_1
    //   345: aload 7
    //   347: invokeinterface 271 3 0
    //   352: goto -113 -> 239
    //   355: astore_1
    //   356: aload_1
    //   357: athrow
    //   358: astore_2
    //   359: aload_1
    //   360: monitorexit
    //   361: aload_2
    //   362: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	363	0	this	a
    //   18	327	1	localObject1	Object
    //   355	5	1	localObject2	Object
    //   52	251	2	localObject3	Object
    //   358	4	2	localObject4	Object
    //   72	2	3	l	long
    //   79	138	5	i	int
    //   90	130	6	j	int
    //   146	148	7	localObject5	Object
    //   334	12	7	localThrowable	Throwable
    //   164	35	8	localg	g
    //   191	17	9	k	int
    // Exception table:
    //   from	to	target	type
    //   325	331	334	finally
    //   336	352	355	finally
    //   65	73	358	finally
  }
  
  public final void execute(Runnable paramRunnable)
  {
    g(paramRunnable, j.g, false);
  }
  
  public final int f()
  {
    synchronized (o)
    {
      int i = r.get(this);
      int j = 0;
      if (i != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return -1;
      }
      AtomicLongFieldUpdater localAtomicLongFieldUpdater = q;
      long l = localAtomicLongFieldUpdater.get(this);
      int k = (int)(l & 0x1FFFFF);
      int m = k - (int)((l & 0x3FFFFE00000) >> 21);
      i = m;
      if (m < 0) {
        i = 0;
      }
      m = a;
      if (i >= m) {
        return 0;
      }
      m = b;
      if (k >= m) {
        return 0;
      }
      k = (int)(localAtomicLongFieldUpdater.get(this) & 0x1FFFFF) + 1;
      if ((k > 0) && (o.b(k) == null)) {
        m = 1;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        localObject1 = new tc/a$a;
        ((a)localObject1).<init>(this, k);
        o.c(k, (a)localObject1);
        l = localAtomicLongFieldUpdater.incrementAndGet(this);
        m = j;
        if (k == (int)(0x1FFFFF & l)) {
          m = 1;
        }
        if (m != 0)
        {
          ((Thread)localObject1).start();
          return i + 1;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Failed requirement.".toString());
        throw ((Throwable)localObject1);
      }
      Object localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Failed requirement.".toString());
      throw ((Throwable)localObject1);
    }
  }
  
  public final void g(Runnable paramRunnable, h paramh, boolean paramBoolean)
  {
    j.f.getClass();
    long l = System.nanoTime();
    if ((paramRunnable instanceof g))
    {
      paramRunnable = (g)paramRunnable;
      a = l;
      b = paramh;
    }
    else
    {
      paramRunnable = new i(paramRunnable, l, paramh);
    }
    int i = b.c();
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      l = q.addAndGet(this, 2097152L);
    } else {
      l = 0L;
    }
    paramh = Thread.currentThread();
    if ((paramh instanceof a)) {
      paramh = (a)paramh;
    } else {
      paramh = null;
    }
    if ((paramh == null) || (!ec.i.a(p, this))) {
      paramh = null;
    }
    Object localObject;
    if ((paramh != null) && (c != 5) && ((b.c() != 0) || (c != 2)))
    {
      o = true;
      localObject = a;
      if (paramBoolean)
      {
        paramRunnable = ((l)localObject).a(paramRunnable);
      }
      else
      {
        localObject.getClass();
        paramRunnable = (g)l.b.getAndSet(localObject, paramRunnable);
        if (paramRunnable == null) {
          paramRunnable = null;
        } else {
          paramRunnable = ((l)localObject).a(paramRunnable);
        }
      }
    }
    if (paramRunnable != null)
    {
      if (b.c() == 1) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0) {
        localObject = f;
      } else {
        localObject = e;
      }
      if (!((k)localObject).a(paramRunnable)) {
        throw new RejectedExecutionException(g.f(new StringBuilder(), d, " was terminated"));
      }
    }
    int k = j;
    if (paramBoolean)
    {
      k = j;
      if (paramh != null) {
        k = 1;
      }
    }
    if (i != 0)
    {
      if ((k == 0) && (!I()) && (!H(l))) {
        I();
      }
    }
    else
    {
      if (k != 0) {
        return;
      }
      if ((!I()) && (!H(q.get(this)))) {
        I();
      }
    }
  }
  
  public final String toString()
  {
    ArrayList localArrayList = new ArrayList();
    int i = o.a();
    int j = 0;
    int k = 1;
    int m = 0;
    int n = m;
    int i1 = n;
    int i2 = i1;
    int i3 = n;
    n = m;
    m = j;
    while (k < i)
    {
      a locala = (a)o.b(k);
      int i4;
      int i5;
      int i6;
      if (locala == null)
      {
        i4 = m;
        j = n;
        i5 = i3;
        i6 = i2;
      }
      else
      {
        localObject = a;
        localObject.getClass();
        int i7;
        if (l.b.get(localObject) != null) {
          i7 = l.c.get(localObject) - l.d.get(localObject) + 1;
        } else {
          i7 = l.c.get(localObject) - l.d.get(localObject);
        }
        j = q0.g.c(c);
        int i9;
        if (j != 0)
        {
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 3)
              {
                if (j != 4)
                {
                  i4 = m;
                  j = n;
                  i5 = i3;
                  i6 = i2;
                  break label396;
                }
                i6 = i2 + 1;
                i4 = m;
                j = n;
                i5 = i3;
                break label396;
              }
              int i8 = i1 + 1;
              i4 = m;
              j = n;
              i5 = i3;
              i1 = i8;
              i6 = i2;
              if (i7 <= 0) {
                break label396;
              }
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append(i7);
              j = 100;
              i1 = i8;
              i9 = j;
            }
            else
            {
              i5 = i3 + 1;
              i4 = m;
              j = n;
              i6 = i2;
              break label396;
            }
          }
          else
          {
            n++;
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append(i7);
            j = 98;
            i9 = j;
          }
        }
        else
        {
          m++;
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(i7);
          j = 99;
          i9 = j;
        }
        ((StringBuilder)localObject).append(i9);
        localArrayList.add(((StringBuilder)localObject).toString());
        i6 = i2;
        i5 = i3;
        j = n;
        i4 = m;
      }
      label396:
      k++;
      m = i4;
      n = j;
      i3 = i5;
      i2 = i6;
    }
    long l = q.get(this);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append('@');
    ((StringBuilder)localObject).append(g0.b(this));
    ((StringBuilder)localObject).append("[Pool Size {core = ");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", max = ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append("}, Worker States {CPU = ");
    ((StringBuilder)localObject).append(m);
    ((StringBuilder)localObject).append(", blocking = ");
    ((StringBuilder)localObject).append(n);
    ((StringBuilder)localObject).append(", parked = ");
    ((StringBuilder)localObject).append(i3);
    ((StringBuilder)localObject).append(", dormant = ");
    ((StringBuilder)localObject).append(i1);
    ((StringBuilder)localObject).append(", terminated = ");
    ((StringBuilder)localObject).append(i2);
    ((StringBuilder)localObject).append("}, running workers queues = ");
    ((StringBuilder)localObject).append(localArrayList);
    ((StringBuilder)localObject).append(", global CPU queue size = ");
    ((StringBuilder)localObject).append(e.c());
    ((StringBuilder)localObject).append(", global blocking queue size = ");
    ((StringBuilder)localObject).append(f.c());
    ((StringBuilder)localObject).append(", Control State {created workers= ");
    ((StringBuilder)localObject).append((int)(0x1FFFFF & l));
    ((StringBuilder)localObject).append(", blocking tasks = ");
    ((StringBuilder)localObject).append((int)((0x3FFFFE00000 & l) >> 21));
    ((StringBuilder)localObject).append(", CPUs acquired = ");
    ((StringBuilder)localObject).append(a - (int)((l & 0x7FFFFC0000000000) >> 42));
    ((StringBuilder)localObject).append("}]");
    return ((StringBuilder)localObject).toString();
  }
  
  public final class a
    extends Thread
  {
    public static final AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    public final l a;
    public final s<g> b;
    public int c;
    public long d;
    public long e;
    public int f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public boolean o;
    private volatile int workerCtl;
    
    public a() {}
    
    public a()
    {
      setDaemon(true);
      a = new l();
      b = new s();
      c = 4;
      nextParkedWorker = a.s;
      f = c.a.a();
      int i;
      f(i);
    }
    
    public final g a(boolean paramBoolean)
    {
      int i = c;
      int j = 1;
      Object localObject2;
      if (i != 1)
      {
        localObject1 = a.this;
        localObject2 = a.q;
        long l;
        do
        {
          l = ((AtomicLongFieldUpdater)localObject2).get(localObject1);
          if ((int)((0x7FFFFC0000000000 & l) >> 42) == 0)
          {
            i = 0;
            break;
          }
        } while (!a.q.compareAndSet(localObject1, l, l - 4398046511104L));
        i = 1;
        if (i != 0) {
          c = 1;
        }
      }
      else
      {
        i = 1;
        break label90;
      }
      i = 0;
      label90:
      Object localObject1 = null;
      if (i != 0)
      {
        if (paramBoolean)
        {
          if (d(a * 2) == 0) {
            i = j;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            localObject2 = e();
            if (localObject2 != null) {
              break label230;
            }
          }
          localObject1 = a;
          localObject1.getClass();
          localObject2 = (g)l.b.getAndSet(localObject1, null);
          if (localObject2 == null) {
            localObject2 = ((l)localObject1).b();
          }
          if (localObject2 != null) {
            break label230;
          }
          if (i == 0)
          {
            localObject2 = e();
            if (localObject2 != null) {
              break label230;
            }
          }
        }
        else
        {
          localObject2 = e();
          if (localObject2 != null) {
            break label230;
          }
        }
        localObject2 = i(3);
        label230:
        return (g)localObject2;
      }
      l locall = a;
      locall.getClass();
      do
      {
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = l.b;
        localObject2 = (g)localAtomicReferenceFieldUpdater.get(locall);
        if (localObject2 == null) {
          break;
        }
        if (b.c() == 1) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 1) {
          break;
        }
        do
        {
          if (localAtomicReferenceFieldUpdater.compareAndSet(locall, localObject2, null))
          {
            i = 1;
            break;
          }
        } while (localAtomicReferenceFieldUpdater.get(locall) == localObject2);
        i = 0;
      } while (i == 0);
      break label397;
      j = l.d.get(locall);
      i = l.c.get(locall);
      do
      {
        localObject2 = localObject1;
        if (j == i) {
          break;
        }
        if (l.e.get(locall) == 0)
        {
          localObject2 = localObject1;
          break;
        }
        i--;
        localObject2 = locall.c(i, true);
      } while (localObject2 == null);
      label397:
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject2 = (g)f.d();
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = i(1);
        }
      }
      return (g)localObject1;
    }
    
    public final int b()
    {
      return indexInArray;
    }
    
    public final Object c()
    {
      return nextParkedWorker;
    }
    
    public final int d(int paramInt)
    {
      int i = f;
      i ^= i << 13;
      i ^= i >> 17;
      int j = i ^ i << 5;
      f = j;
      i = paramInt - 1;
      if ((i & paramInt) == 0) {
        return j & i;
      }
      return (j & 0x7FFFFFFF) % paramInt;
    }
    
    public final g e()
    {
      if (d(2) == 0)
      {
        localObject = (g)e.d();
        if (localObject != null) {
          return (g)localObject;
        }
      }
      for (Object localObject = f;; localObject = e)
      {
        return (g)((k)localObject).d();
        localObject = (g)f.d();
        if (localObject != null) {
          return (g)localObject;
        }
      }
    }
    
    public final void f(int paramInt)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(d);
      localStringBuilder.append("-worker-");
      String str;
      if (paramInt == 0) {
        str = "TERMINATED";
      } else {
        str = String.valueOf(paramInt);
      }
      localStringBuilder.append(str);
      setName(localStringBuilder.toString());
      indexInArray = paramInt;
    }
    
    public final void g(Object paramObject)
    {
      nextParkedWorker = paramObject;
    }
    
    public final boolean h(int paramInt)
    {
      int i = c;
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      if (bool)
      {
        a locala = a.this;
        a.q.addAndGet(locala, 4398046511104L);
      }
      if (i != paramInt) {
        c = paramInt;
      }
      return bool;
    }
    
    public final g i(int paramInt)
    {
      Object localObject = a.this;
      int i = (int)(a.q.get(localObject) & 0x1FFFFF);
      if (i < 2) {
        return null;
      }
      int j = d(i);
      a locala = a.this;
      int k = 0;
      label213:
      long l3;
      for (long l1 = Long.MAX_VALUE; k < i; l1 = l3)
      {
        int m = j + 1;
        j = m;
        if (m > i) {
          j = 1;
        }
        localObject = (a)o.b(j);
        if ((localObject != null) && (localObject != this))
        {
          l locall = a;
          s locals = b;
          g localg;
          if (paramInt == 3)
          {
            localObject = locall.b();
          }
          else
          {
            locall.getClass();
            m = l.d.get(locall);
            int n = l.c.get(locall);
            boolean bool;
            if (paramInt == 1) {
              bool = true;
            } else {
              bool = false;
            }
            while ((m != n) && ((!bool) || (l.e.get(locall) != 0)))
            {
              localg = locall.c(m, bool);
              localObject = localg;
              if (localg != null) {
                break label213;
              }
              m++;
            }
            localObject = null;
          }
          m = j;
          long l2;
          if (localObject != null)
          {
            a = localObject;
            m = j;
          }
          else
          {
            localObject = l.b;
            localg = (g)((AtomicReferenceFieldUpdater)localObject).get(locall);
            if (localg != null)
            {
              if (b.c() == 1) {
                j = 1;
              } else {
                j = 0;
              }
              if (j != 0) {
                j = 1;
              } else {
                j = 2;
              }
              if ((j & paramInt) != 0) {}
            }
            else
            {
              l2 = -2L;
              break label407;
            }
            j.f.getClass();
            l3 = System.nanoTime();
            l3 -= a;
            l2 = j.b;
            if (l3 < l2)
            {
              l3 = l2 - l3;
              break label403;
            }
          }
          label403:
          label407:
          label472:
          for (;;)
          {
            if (((AtomicReferenceFieldUpdater)localObject).compareAndSet(locall, localg, null))
            {
              j = 1;
            }
            else
            {
              if (((AtomicReferenceFieldUpdater)localObject).get(locall) == localg) {
                break label472;
              }
              j = 0;
            }
            if (j != 0)
            {
              a = localg;
              l3 = -1L;
              l2 = l3;
              if (l2 == -1L)
              {
                localObject = b;
                localg = (g)a;
                a = null;
                return localg;
              }
              l3 = l1;
              j = m;
              if (l2 <= 0L) {
                break label479;
              }
              l3 = Math.min(l1, l2);
              j = m;
              break label479;
            }
            break;
          }
        }
        l3 = l1;
        label479:
        k++;
      }
      if (l1 == Long.MAX_VALUE) {
        l1 = 0L;
      }
      e = l1;
      return null;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: iconst_0
      //   3: istore_2
      //   4: aload_0
      //   5: getfield 43	tc/a$a:p	Ltc/a;
      //   8: astore_3
      //   9: aload_3
      //   10: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   13: pop
      //   14: getstatic 251	tc/a:r	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
      //   17: aload_3
      //   18: invokevirtual 150	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
      //   21: ifeq +9 -> 30
      //   24: iconst_1
      //   25: istore 4
      //   27: goto +6 -> 33
      //   30: iload_1
      //   31: istore 4
      //   33: iload 4
      //   35: ifne +784 -> 819
      //   38: aload_0
      //   39: getfield 61	tc/a$a:c	I
      //   42: iconst_5
      //   43: if_icmpeq +776 -> 819
      //   46: aload_0
      //   47: aload_0
      //   48: getfield 253	tc/a$a:o	Z
      //   51: invokevirtual 255	tc/a$a:a	(Z)Ltc/g;
      //   54: astore 5
      //   56: aload 5
      //   58: ifnull +168 -> 226
      //   61: aload_0
      //   62: lconst_0
      //   63: putfield 247	tc/a$a:e	J
      //   66: aload 5
      //   68: getfield 138	tc/g:b	Ltc/h;
      //   71: invokeinterface 142 1 0
      //   76: istore_2
      //   77: aload_0
      //   78: lconst_0
      //   79: putfield 257	tc/a$a:d	J
      //   82: aload_0
      //   83: getfield 61	tc/a$a:c	I
      //   86: iconst_3
      //   87: if_icmpne +8 -> 95
      //   90: aload_0
      //   91: iconst_2
      //   92: putfield 61	tc/a$a:c	I
      //   95: iload_2
      //   96: ifne +6 -> 102
      //   99: goto +48 -> 147
      //   102: aload_0
      //   103: iconst_2
      //   104: invokevirtual 259	tc/a$a:h	(I)Z
      //   107: ifeq +40 -> 147
      //   110: aload_0
      //   111: getfield 43	tc/a$a:p	Ltc/a;
      //   114: astore_3
      //   115: aload_3
      //   116: invokevirtual 262	tc/a:I	()Z
      //   119: ifeq +6 -> 125
      //   122: goto +25 -> 147
      //   125: aload_3
      //   126: getstatic 87	tc/a:q	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
      //   129: aload_3
      //   130: invokevirtual 93	java/util/concurrent/atomic/AtomicLongFieldUpdater:get	(Ljava/lang/Object;)J
      //   133: invokevirtual 266	tc/a:H	(J)Z
      //   136: ifeq +6 -> 142
      //   139: goto +8 -> 147
      //   142: aload_3
      //   143: invokevirtual 262	tc/a:I	()Z
      //   146: pop
      //   147: aload_0
      //   148: getfield 43	tc/a$a:p	Ltc/a;
      //   151: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   154: pop
      //   155: aload 5
      //   157: invokeinterface 270 1 0
      //   162: goto +22 -> 184
      //   165: astore_3
      //   166: invokestatic 274	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   169: astore 5
      //   171: aload 5
      //   173: invokevirtual 278	java/lang/Thread:getUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
      //   176: aload 5
      //   178: aload_3
      //   179: invokeinterface 284 3 0
      //   184: iload_2
      //   185: ifne +6 -> 191
      //   188: goto -188 -> 0
      //   191: aload_0
      //   192: getfield 43	tc/a$a:p	Ltc/a;
      //   195: astore_3
      //   196: getstatic 87	tc/a:q	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
      //   199: aload_3
      //   200: ldc2_w 285
      //   203: invokevirtual 206	java/util/concurrent/atomic/AtomicLongFieldUpdater:addAndGet	(Ljava/lang/Object;J)J
      //   206: pop2
      //   207: aload_0
      //   208: getfield 61	tc/a$a:c	I
      //   211: iconst_5
      //   212: if_icmpeq -212 -> 0
      //   215: aload_0
      //   216: iconst_4
      //   217: putfield 61	tc/a$a:c	I
      //   220: goto -220 -> 0
      //   223: astore_3
      //   224: aload_3
      //   225: athrow
      //   226: aload_0
      //   227: iload_1
      //   228: putfield 253	tc/a$a:o	Z
      //   231: aload_0
      //   232: getfield 247	tc/a$a:e	J
      //   235: lconst_0
      //   236: lcmp
      //   237: ifeq +37 -> 274
      //   240: iload_2
      //   241: ifne +8 -> 249
      //   244: iconst_1
      //   245: istore_2
      //   246: goto -242 -> 4
      //   249: aload_0
      //   250: iconst_3
      //   251: invokevirtual 259	tc/a$a:h	(I)Z
      //   254: pop
      //   255: invokestatic 289	java/lang/Thread:interrupted	()Z
      //   258: pop
      //   259: aload_0
      //   260: getfield 247	tc/a$a:e	J
      //   263: invokestatic 295	java/util/concurrent/locks/LockSupport:parkNanos	(J)V
      //   266: aload_0
      //   267: lconst_0
      //   268: putfield 247	tc/a$a:e	J
      //   271: goto -271 -> 0
      //   274: aload_0
      //   275: getfield 67	tc/a$a:nextParkedWorker	Ljava/lang/Object;
      //   278: astore_3
      //   279: getstatic 65	tc/a:s	Ld2/h0;
      //   282: astore 5
      //   284: aload_3
      //   285: aload 5
      //   287: if_acmpeq +9 -> 296
      //   290: iconst_1
      //   291: istore 4
      //   293: goto +6 -> 299
      //   296: iload_1
      //   297: istore 4
      //   299: iload 4
      //   301: ifne +104 -> 405
      //   304: aload_0
      //   305: getfield 43	tc/a$a:p	Ltc/a;
      //   308: astore_3
      //   309: aload_3
      //   310: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   313: pop
      //   314: aload_0
      //   315: getfield 67	tc/a$a:nextParkedWorker	Ljava/lang/Object;
      //   318: aload 5
      //   320: if_acmpeq +6 -> 326
      //   323: goto +70 -> 393
      //   326: getstatic 297	tc/a:p	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
      //   329: astore 5
      //   331: aload 5
      //   333: aload_3
      //   334: invokevirtual 93	java/util/concurrent/atomic/AtomicLongFieldUpdater:get	(Ljava/lang/Object;)J
      //   337: lstore 6
      //   339: lload 6
      //   341: ldc2_w 207
      //   344: land
      //   345: l2i
      //   346: istore 8
      //   348: aload_0
      //   349: getfield 167	tc/a$a:indexInArray	I
      //   352: istore 9
      //   354: aload_0
      //   355: aload_3
      //   356: getfield 213	tc/a:o	Lsc/r;
      //   359: iload 8
      //   361: invokevirtual 218	sc/r:b	(I)Ljava/lang/Object;
      //   364: putfield 67	tc/a$a:nextParkedWorker	Ljava/lang/Object;
      //   367: getstatic 297	tc/a:p	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
      //   370: aload_3
      //   371: lload 6
      //   373: lload 6
      //   375: ldc2_w 298
      //   378: ladd
      //   379: ldc2_w 285
      //   382: land
      //   383: iload 9
      //   385: i2l
      //   386: lor
      //   387: invokevirtual 101	java/util/concurrent/atomic/AtomicLongFieldUpdater:compareAndSet	(Ljava/lang/Object;JJ)Z
      //   390: ifeq +12 -> 402
      //   393: iload_1
      //   394: istore 4
      //   396: iload_2
      //   397: istore 8
      //   399: goto +411 -> 810
      //   402: goto -71 -> 331
      //   405: getstatic 38	tc/a$a:q	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
      //   408: aload_0
      //   409: iconst_m1
      //   410: invokevirtual 303	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:set	(Ljava/lang/Object;I)V
      //   413: aload_0
      //   414: getfield 67	tc/a$a:nextParkedWorker	Ljava/lang/Object;
      //   417: getstatic 65	tc/a:s	Ld2/h0;
      //   420: if_acmpeq +9 -> 429
      //   423: iconst_1
      //   424: istore 10
      //   426: goto +6 -> 432
      //   429: iload_1
      //   430: istore 10
      //   432: iload_1
      //   433: istore 4
      //   435: iload_2
      //   436: istore 8
      //   438: iload 10
      //   440: ifeq +370 -> 810
      //   443: getstatic 38	tc/a$a:q	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
      //   446: astore 11
      //   448: iload_1
      //   449: istore 4
      //   451: iload_2
      //   452: istore 8
      //   454: aload 11
      //   456: aload_0
      //   457: invokevirtual 150	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
      //   460: iconst_m1
      //   461: if_icmpne +349 -> 810
      //   464: aload_0
      //   465: getfield 43	tc/a$a:p	Ltc/a;
      //   468: astore_3
      //   469: aload_3
      //   470: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   473: pop
      //   474: getstatic 251	tc/a:r	Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
      //   477: astore 12
      //   479: aload 12
      //   481: aload_3
      //   482: invokevirtual 150	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
      //   485: ifeq +9 -> 494
      //   488: iconst_1
      //   489: istore 10
      //   491: goto +6 -> 497
      //   494: iload_1
      //   495: istore 10
      //   497: iload_1
      //   498: istore 4
      //   500: iload_2
      //   501: istore 8
      //   503: iload 10
      //   505: ifne +305 -> 810
      //   508: aload_0
      //   509: getfield 61	tc/a$a:c	I
      //   512: iconst_5
      //   513: if_icmpne +12 -> 525
      //   516: iload_1
      //   517: istore 4
      //   519: iload_2
      //   520: istore 8
      //   522: goto +288 -> 810
      //   525: aload_0
      //   526: iconst_3
      //   527: invokevirtual 259	tc/a$a:h	(I)Z
      //   530: pop
      //   531: invokestatic 289	java/lang/Thread:interrupted	()Z
      //   534: pop
      //   535: aload_0
      //   536: getfield 257	tc/a$a:d	J
      //   539: lconst_0
      //   540: lcmp
      //   541: ifne +21 -> 562
      //   544: aload_0
      //   545: invokestatic 233	java/lang/System:nanoTime	()J
      //   548: aload_0
      //   549: getfield 43	tc/a$a:p	Ltc/a;
      //   552: getfield 305	tc/a:c	J
      //   555: ladd
      //   556: putfield 257	tc/a$a:d	J
      //   559: goto +3 -> 562
      //   562: aload_0
      //   563: getfield 43	tc/a$a:p	Ltc/a;
      //   566: getfield 305	tc/a:c	J
      //   569: invokestatic 295	java/util/concurrent/locks/LockSupport:parkNanos	(J)V
      //   572: invokestatic 233	java/lang/System:nanoTime	()J
      //   575: aload_0
      //   576: getfield 257	tc/a$a:d	J
      //   579: lsub
      //   580: lconst_0
      //   581: lcmp
      //   582: iflt +223 -> 805
      //   585: aload_0
      //   586: lconst_0
      //   587: putfield 257	tc/a$a:d	J
      //   590: aload_0
      //   591: getfield 43	tc/a$a:p	Ltc/a;
      //   594: astore 5
      //   596: aload 5
      //   598: getfield 213	tc/a:o	Lsc/r;
      //   601: astore_3
      //   602: aload_3
      //   603: monitorenter
      //   604: aload 12
      //   606: aload 5
      //   608: invokevirtual 150	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:get	(Ljava/lang/Object;)I
      //   611: ifeq +9 -> 620
      //   614: iconst_1
      //   615: istore 8
      //   617: goto +6 -> 623
      //   620: iconst_0
      //   621: istore 8
      //   623: iload 8
      //   625: ifeq +6 -> 631
      //   628: goto +44 -> 672
      //   631: getstatic 87	tc/a:q	Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
      //   634: astore 12
      //   636: aload 12
      //   638: aload 5
      //   640: invokevirtual 93	java/util/concurrent/atomic/AtomicLongFieldUpdater:get	(Ljava/lang/Object;)J
      //   643: ldc2_w 207
      //   646: land
      //   647: l2i
      //   648: aload 5
      //   650: getfield 103	tc/a:a	I
      //   653: if_icmpgt +6 -> 659
      //   656: goto +16 -> 672
      //   659: aload 11
      //   661: aload_0
      //   662: iconst_m1
      //   663: iconst_1
      //   664: invokevirtual 308	java/util/concurrent/atomic/AtomicIntegerFieldUpdater:compareAndSet	(Ljava/lang/Object;II)Z
      //   667: istore_1
      //   668: iload_1
      //   669: ifne +8 -> 677
      //   672: aload_3
      //   673: monitorexit
      //   674: goto +131 -> 805
      //   677: aload_0
      //   678: getfield 167	tc/a$a:indexInArray	I
      //   681: istore 8
      //   683: aload_0
      //   684: iconst_0
      //   685: invokevirtual 82	tc/a$a:f	(I)V
      //   688: aload 5
      //   690: aload_0
      //   691: iload 8
      //   693: iconst_0
      //   694: invokevirtual 312	tc/a:C	(Ltc/a$a;II)V
      //   697: aload 12
      //   699: aload 5
      //   701: invokevirtual 315	java/util/concurrent/atomic/AtomicLongFieldUpdater:getAndDecrement	(Ljava/lang/Object;)J
      //   704: ldc2_w 207
      //   707: land
      //   708: l2i
      //   709: istore 9
      //   711: iload 9
      //   713: iload 8
      //   715: if_icmpeq +57 -> 772
      //   718: aload 5
      //   720: getfield 213	tc/a:o	Lsc/r;
      //   723: iload 9
      //   725: invokevirtual 218	sc/r:b	(I)Ljava/lang/Object;
      //   728: astore 11
      //   730: aload 11
      //   732: invokestatic 319	ec/i:b	(Ljava/lang/Object;)V
      //   735: aload 11
      //   737: checkcast 2	tc/a$a
      //   740: astore 11
      //   742: aload 5
      //   744: getfield 213	tc/a:o	Lsc/r;
      //   747: iload 8
      //   749: aload 11
      //   751: invokevirtual 322	sc/r:c	(ILtc/a$a;)V
      //   754: aload 11
      //   756: iload 8
      //   758: invokevirtual 82	tc/a$a:f	(I)V
      //   761: aload 5
      //   763: aload 11
      //   765: iload 9
      //   767: iload 8
      //   769: invokevirtual 312	tc/a:C	(Ltc/a$a;II)V
      //   772: aload 5
      //   774: getfield 213	tc/a:o	Lsc/r;
      //   777: iload 9
      //   779: aconst_null
      //   780: invokevirtual 322	sc/r:c	(ILtc/a$a;)V
      //   783: getstatic 327	rb/h:a	Lrb/h;
      //   786: astore 5
      //   788: aload_3
      //   789: monitorexit
      //   790: aload_0
      //   791: iconst_5
      //   792: putfield 61	tc/a$a:c	I
      //   795: goto +10 -> 805
      //   798: astore 5
      //   800: aload_3
      //   801: monitorexit
      //   802: aload 5
      //   804: athrow
      //   805: iconst_0
      //   806: istore_1
      //   807: goto -394 -> 413
      //   810: iload 4
      //   812: istore_1
      //   813: iload 8
      //   815: istore_2
      //   816: goto -812 -> 4
      //   819: aload_0
      //   820: iconst_5
      //   821: invokevirtual 259	tc/a$a:h	(I)Z
      //   824: pop
      //   825: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	826	0	this	a
      //   1	812	1	bool1	boolean
      //   3	813	2	i	int
      //   8	135	3	locala1	a
      //   165	14	3	localThrowable	Throwable
      //   195	5	3	locala2	a
      //   223	2	3	localObject1	Object
      //   25	786	4	bool2	boolean
      //   54	733	5	localObject3	Object
      //   798	5	5	localObject4	Object
      //   337	37	6	l	long
      //   346	468	8	j	int
      //   352	426	9	k	int
      //   424	80	10	m	int
      //   446	318	11	localObject5	Object
      //   477	221	12	localObject6	Object
      // Exception table:
      //   from	to	target	type
      //   155	162	165	finally
      //   166	184	223	finally
      //   604	614	798	finally
      //   631	656	798	finally
      //   659	668	798	finally
      //   677	711	798	finally
      //   718	772	798	finally
      //   772	788	798	finally
    }
  }
}

/* Location:
 * Qualified Name:     tc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */