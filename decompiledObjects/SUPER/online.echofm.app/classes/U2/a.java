package U2;

import E2.p;
import N2.i;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a
{
  public static final long r = TimeUnit.DAYS.toMillis(366L);
  public static volatile ScheduledExecutorService s = null;
  public static final Object t = new Object();
  public static volatile e u = new c();
  public final Object a = new Object();
  public final PowerManager.WakeLock b;
  public int c = 0;
  public Future d;
  public long e;
  public final Set f = new HashSet();
  public boolean g = true;
  public int h;
  public N2.b i;
  public E2.e j = E2.h.d();
  public WorkSource k;
  public final String l;
  public final String m;
  public final Context n;
  public final Map o = new HashMap();
  public AtomicInteger p = new AtomicInteger(0);
  public final ScheduledExecutorService q;
  
  public a(Context paramContext, int paramInt, String paramString)
  {
    A2.n.j(paramContext, "WakeLock: context must not be null");
    A2.n.f(paramString, "WakeLock: wakeLockName must not be empty");
    n = paramContext.getApplicationContext();
    m = paramString;
    i = null;
    if (!"com.google.android.gms".equals(paramContext.getPackageName()))
    {
      ??? = String.valueOf(paramString);
      if (((String)???).length() != 0) {
        ??? = "*gcore*:".concat((String)???);
      } else {
        ??? = new String("*gcore*:");
      }
      l = ((String)???);
    }
    else
    {
      l = paramString;
    }
    ??? = (PowerManager)paramContext.getSystemService("power");
    if (??? != null)
    {
      ??? = ((PowerManager)???).newWakeLock(paramInt, paramString);
      b = ((PowerManager.WakeLock)???);
      if (p.c(paramContext))
      {
        paramString = str;
        if (E2.n.a(str)) {
          paramString = paramContext.getPackageName();
        }
        paramContext = p.b(paramContext, paramString);
        k = paramContext;
        if (paramContext != null) {
          i((PowerManager.WakeLock)???, paramContext);
        }
      }
      paramString = s;
      paramContext = paramString;
      if (paramString == null)
      {
        synchronized (t)
        {
          paramString = s;
          paramContext = paramString;
          if (paramString == null)
          {
            N2.h.a();
            paramContext = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
            s = paramContext;
          }
        }
        break label304;
        throw paramContext;
      }
      label304:
      q = paramContext;
      return;
    }
    paramContext = new StringBuilder(29);
    paramContext.append("expected a non-null reference", 0, 29);
    throw new i(paramContext.toString());
  }
  
  public static void i(PowerManager.WakeLock paramWakeLock, WorkSource paramWorkSource)
  {
    try
    {
      paramWakeLock.setWorkSource(paramWorkSource);
      return;
    }
    catch (ArrayIndexOutOfBoundsException paramWakeLock) {}catch (IllegalArgumentException paramWakeLock) {}
    Log.wtf("WakeLock", paramWakeLock.toString());
  }
  
  public void a(long paramLong)
  {
    p.incrementAndGet();
    long l1 = r;
    long l2 = Long.MAX_VALUE;
    long l3 = Math.max(Math.min(Long.MAX_VALUE, l1), 1L);
    l1 = l3;
    if (paramLong > 0L) {
      l1 = Math.min(paramLong, l3);
    }
    synchronized (a)
    {
      if (!b())
      {
        i = N2.b.a(false, null);
        b.acquire();
        j.b();
      }
    }
    c += 1;
    h += 1;
    f(null);
    Object localObject4 = (d)o.get(null);
    Object localObject3 = localObject4;
    if (localObject4 == null)
    {
      localObject3 = new U2/d;
      ((d)localObject3).<init>(null);
      o.put(null, localObject3);
    }
    a += 1;
    l3 = j.b();
    paramLong = l2;
    if (Long.MAX_VALUE - l3 > l1) {
      paramLong = l3 + l1;
    }
    if (paramLong > e)
    {
      e = paramLong;
      localObject3 = d;
      if (localObject3 != null) {
        ((Future)localObject3).cancel(false);
      }
      localObject3 = q;
      localObject4 = new U2/b;
      ((b)localObject4).<init>(this);
      d = ((ScheduledExecutorService)localObject3).schedule((Runnable)localObject4, l1, TimeUnit.MILLISECONDS);
    }
    return;
    throw ((Throwable)localObject3);
  }
  
  public boolean b()
  {
    synchronized (a)
    {
      boolean bool;
      if (c > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public void c()
  {
    if (p.decrementAndGet() < 0) {
      Log.e("WakeLock", String.valueOf(l).concat(" release without a matched acquire!"));
    }
    synchronized (a)
    {
      f(null);
      if (o.containsKey(null))
      {
        d locald = (d)o.get(null);
        if (locald == null) {
          break label126;
        }
        int i1 = a - 1;
        a = i1;
        if (i1 != 0) {
          break label126;
        }
        o.remove(null);
      }
    }
    Log.w("WakeLock", String.valueOf(l).concat(" counter does not exist"));
    label126:
    h(0);
    return;
    throw ((Throwable)localObject2);
  }
  
  public void d(boolean paramBoolean)
  {
    synchronized (a)
    {
      g = paramBoolean;
      return;
    }
  }
  
  public final String f(String paramString)
  {
    if (g) {
      TextUtils.isEmpty(null);
    }
    return null;
  }
  
  public final void g()
  {
    if (f.isEmpty()) {
      return;
    }
    ArrayList localArrayList = new ArrayList(f);
    f.clear();
    if (localArrayList.size() <= 0) {
      return;
    }
    android.support.v4.media.a.a(localArrayList.get(0));
    throw null;
  }
  
  /* Error */
  public final void h(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 79	U2/a:a	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: invokevirtual 224	U2/a:b	()Z
    //   11: ifne +10 -> 21
    //   14: aload_2
    //   15: monitorexit
    //   16: return
    //   17: astore_3
    //   18: goto +246 -> 264
    //   21: aload_0
    //   22: getfield 88	U2/a:g	Z
    //   25: ifeq +25 -> 50
    //   28: aload_0
    //   29: getfield 81	U2/a:c	I
    //   32: iconst_1
    //   33: isub
    //   34: istore_1
    //   35: aload_0
    //   36: iload_1
    //   37: putfield 81	U2/a:c	I
    //   40: iload_1
    //   41: ifgt +6 -> 47
    //   44: goto +11 -> 55
    //   47: aload_2
    //   48: monitorexit
    //   49: return
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield 81	U2/a:c	I
    //   55: aload_0
    //   56: invokevirtual 235	U2/a:g	()V
    //   59: aload_0
    //   60: getfield 100	U2/a:o	Ljava/util/Map;
    //   63: invokeinterface 376 1 0
    //   68: invokeinterface 382 1 0
    //   73: astore_3
    //   74: aload_3
    //   75: invokeinterface 387 1 0
    //   80: ifeq +19 -> 99
    //   83: aload_3
    //   84: invokeinterface 391 1 0
    //   89: checkcast 291	U2/d
    //   92: iconst_0
    //   93: putfield 299	U2/d:a	I
    //   96: goto -22 -> 74
    //   99: aload_0
    //   100: getfield 100	U2/a:o	Ljava/util/Map;
    //   103: invokeinterface 392 1 0
    //   108: aload_0
    //   109: getfield 303	U2/a:d	Ljava/util/concurrent/Future;
    //   112: astore_3
    //   113: aload_3
    //   114: ifnull +21 -> 135
    //   117: aload_3
    //   118: iconst_0
    //   119: invokeinterface 309 2 0
    //   124: pop
    //   125: aload_0
    //   126: aconst_null
    //   127: putfield 303	U2/a:d	Ljava/util/concurrent/Future;
    //   130: aload_0
    //   131: lconst_0
    //   132: putfield 301	U2/a:e	J
    //   135: aload_0
    //   136: iconst_0
    //   137: putfield 281	U2/a:h	I
    //   140: aload_0
    //   141: getfield 170	U2/a:b	Landroid/os/PowerManager$WakeLock;
    //   144: invokevirtual 395	android/os/PowerManager$WakeLock:isHeld	()Z
    //   147: istore 4
    //   149: iload 4
    //   151: ifeq +91 -> 242
    //   154: aload_0
    //   155: getfield 170	U2/a:b	Landroid/os/PowerManager$WakeLock;
    //   158: invokevirtual 398	android/os/PowerManager$WakeLock:release	()V
    //   161: aload_0
    //   162: getfield 129	U2/a:i	LN2/b;
    //   165: ifnull +96 -> 261
    //   168: aload_0
    //   169: aconst_null
    //   170: putfield 129	U2/a:i	LN2/b;
    //   173: goto +88 -> 261
    //   176: astore_3
    //   177: goto +51 -> 228
    //   180: astore_3
    //   181: aload_3
    //   182: invokevirtual 402	java/lang/Object:getClass	()Ljava/lang/Class;
    //   185: ldc_w 372
    //   188: invokevirtual 403	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   191: ifeq +35 -> 226
    //   194: ldc -30
    //   196: aload_0
    //   197: getfield 156	U2/a:l	Ljava/lang/String;
    //   200: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   203: ldc_w 405
    //   206: invokevirtual 151	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   209: aload_3
    //   210: invokestatic 408	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   213: pop
    //   214: aload_0
    //   215: getfield 129	U2/a:i	LN2/b;
    //   218: astore_3
    //   219: aload_3
    //   220: ifnull +41 -> 261
    //   223: goto -55 -> 168
    //   226: aload_3
    //   227: athrow
    //   228: aload_0
    //   229: getfield 129	U2/a:i	LN2/b;
    //   232: ifnull +8 -> 240
    //   235: aload_0
    //   236: aconst_null
    //   237: putfield 129	U2/a:i	LN2/b;
    //   240: aload_3
    //   241: athrow
    //   242: ldc -30
    //   244: aload_0
    //   245: getfield 156	U2/a:l	Ljava/lang/String;
    //   248: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   251: ldc_w 410
    //   254: invokevirtual 151	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   257: invokestatic 233	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   260: pop
    //   261: aload_2
    //   262: monitorexit
    //   263: return
    //   264: aload_2
    //   265: monitorexit
    //   266: aload_3
    //   267: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	this	a
    //   0	268	1	paramInt	int
    //   4	261	2	localObject1	Object
    //   17	1	3	localObject2	Object
    //   73	45	3	localObject3	Object
    //   176	1	3	localObject4	Object
    //   180	30	3	localRuntimeException	RuntimeException
    //   218	49	3	localb	N2.b
    //   147	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   7	16	17	finally
    //   21	40	17	finally
    //   47	49	17	finally
    //   50	55	17	finally
    //   55	74	17	finally
    //   74	96	17	finally
    //   99	113	17	finally
    //   117	135	17	finally
    //   135	149	17	finally
    //   161	168	17	finally
    //   168	173	17	finally
    //   214	219	17	finally
    //   228	240	17	finally
    //   240	242	17	finally
    //   242	261	17	finally
    //   261	263	17	finally
    //   264	266	17	finally
    //   154	161	176	finally
    //   181	214	176	finally
    //   226	228	176	finally
    //   154	161	180	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     U2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */