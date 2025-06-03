package H3;

import E3.f;
import G3.b;
import M3.g;
import P3.d;
import V2.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s3.e;

public class s
{
  public final Context a;
  public final e b;
  public final y c;
  public final H d;
  public final long e;
  public t f;
  public t g;
  public boolean h;
  public q i;
  public final C j;
  public final g k;
  public final b l;
  public final F3.a m;
  public final ExecutorService n;
  public final n o;
  public final m p;
  public final E3.a q;
  
  public s(e parame, C paramC, E3.a parama, y paramy, b paramb, F3.a parama1, g paramg, ExecutorService paramExecutorService, m paramm)
  {
    b = parame;
    c = paramy;
    a = parame.m();
    j = paramC;
    q = parama;
    l = paramb;
    m = parama1;
    n = paramExecutorService;
    k = paramg;
    o = new n(paramExecutorService);
    p = paramm;
    e = System.currentTimeMillis();
    d = new H();
  }
  
  public static String l()
  {
    return "18.5.1";
  }
  
  public static boolean m(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      f.f().i("Configured not to require a build ID.");
      return true;
    }
    if (!TextUtils.isEmpty(paramString)) {
      return true;
    }
    Log.e("FirebaseCrashlytics", ".");
    Log.e("FirebaseCrashlytics", ".     |  | ");
    Log.e("FirebaseCrashlytics", ".     |  |");
    Log.e("FirebaseCrashlytics", ".     |  |");
    Log.e("FirebaseCrashlytics", ".   \\ |  | /");
    Log.e("FirebaseCrashlytics", ".    \\    /");
    Log.e("FirebaseCrashlytics", ".     \\  /");
    Log.e("FirebaseCrashlytics", ".      \\/");
    Log.e("FirebaseCrashlytics", ".");
    Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    Log.e("FirebaseCrashlytics", ".");
    Log.e("FirebaseCrashlytics", ".      /\\");
    Log.e("FirebaseCrashlytics", ".     /  \\");
    Log.e("FirebaseCrashlytics", ".    /    \\");
    Log.e("FirebaseCrashlytics", ".   / |  | \\");
    Log.e("FirebaseCrashlytics", ".     |  |");
    Log.e("FirebaseCrashlytics", ".     |  |");
    Log.e("FirebaseCrashlytics", ".     |  |");
    Log.e("FirebaseCrashlytics", ".");
    return false;
  }
  
  public final void d()
  {
    Object localObject = o.h(new d());
    try
    {
      localObject = (Boolean)c0.f((j)localObject);
      bool = Boolean.TRUE.equals(localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    h = bool;
  }
  
  public j e()
  {
    return i.o();
  }
  
  public j f()
  {
    return i.t();
  }
  
  public boolean g()
  {
    return h;
  }
  
  public boolean h()
  {
    return f.c();
  }
  
  /* Error */
  public final j i(O3.i parami)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 198	H3/s:r	()V
    //   4: aload_0
    //   5: getfield 67	H3/s:l	LG3/b;
    //   8: astore_2
    //   9: new 200	H3/r
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial 201	H3/r:<init>	(LH3/s;)V
    //   18: aload_2
    //   19: aload_3
    //   20: invokeinterface 206 2 0
    //   25: aload_0
    //   26: getfield 106	H3/s:i	LH3/q;
    //   29: invokevirtual 209	H3/q:V	()V
    //   32: aload_1
    //   33: invokeinterface 214 1 0
    //   38: getfield 219	O3/d:b	LO3/d$a;
    //   41: getfield 223	O3/d$a:a	Z
    //   44: ifne +40 -> 84
    //   47: invokestatic 115	E3/f:f	()LE3/f;
    //   50: ldc -31
    //   52: invokevirtual 227	E3/f:b	(Ljava/lang/String;)V
    //   55: new 229	java/lang/RuntimeException
    //   58: astore_1
    //   59: aload_1
    //   60: ldc -31
    //   62: invokespecial 231	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   65: aload_1
    //   66: invokestatic 236	V2/m:d	(Ljava/lang/Exception;)LV2/j;
    //   69: astore_1
    //   70: aload_0
    //   71: invokevirtual 238	H3/s:q	()V
    //   74: aload_1
    //   75: areturn
    //   76: astore_1
    //   77: goto +66 -> 143
    //   80: astore_1
    //   81: goto +42 -> 123
    //   84: aload_0
    //   85: getfield 106	H3/s:i	LH3/q;
    //   88: aload_1
    //   89: invokevirtual 242	H3/q:B	(LO3/i;)Z
    //   92: ifne +11 -> 103
    //   95: invokestatic 115	E3/f:f	()LE3/f;
    //   98: ldc -12
    //   100: invokevirtual 246	E3/f:k	(Ljava/lang/String;)V
    //   103: aload_0
    //   104: getfield 106	H3/s:i	LH3/q;
    //   107: aload_1
    //   108: invokeinterface 248 1 0
    //   113: invokevirtual 252	H3/q:a0	(LV2/j;)LV2/j;
    //   116: astore_1
    //   117: aload_0
    //   118: invokevirtual 238	H3/s:q	()V
    //   121: aload_1
    //   122: areturn
    //   123: invokestatic 115	E3/f:f	()LE3/f;
    //   126: ldc -2
    //   128: aload_1
    //   129: invokevirtual 257	E3/f:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: aload_1
    //   133: invokestatic 236	V2/m:d	(Ljava/lang/Exception;)LV2/j;
    //   136: astore_1
    //   137: aload_0
    //   138: invokevirtual 238	H3/s:q	()V
    //   141: aload_1
    //   142: areturn
    //   143: aload_0
    //   144: invokevirtual 238	H3/s:q	()V
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	s
    //   0	149	1	parami	O3.i
    //   8	11	2	localb	b
    //   12	8	3	localr	r
    // Exception table:
    //   from	to	target	type
    //   4	70	76	finally
    //   84	103	76	finally
    //   103	117	76	finally
    //   123	137	76	finally
    //   4	70	80	java/lang/Exception
    //   84	103	80	java/lang/Exception
    //   103	117	80	java/lang/Exception
  }
  
  public j j(final O3.i parami)
  {
    return c0.h(n, new a(parami));
  }
  
  public final void k(final O3.i parami)
  {
    parami = new b(parami);
    parami = n.submit(parami);
    f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
    try
    {
      parami.get(3L, TimeUnit.SECONDS);
    }
    catch (TimeoutException localTimeoutException) {}catch (ExecutionException localExecutionException)
    {
      break label75;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label86;
    }
    parami = f.f();
    String str = "Crashlytics timed out during initialization.";
    for (;;)
    {
      parami.e(str, localInterruptedException);
      break;
      label75:
      parami = f.f();
      str = "Crashlytics encountered a problem during initialization.";
      continue;
      label86:
      parami = f.f();
      str = "Crashlytics was interrupted during initialization.";
    }
  }
  
  public void n(String paramString)
  {
    long l1 = System.currentTimeMillis();
    long l2 = e;
    i.e0(l1 - l2, paramString);
  }
  
  public void o(Throwable paramThrowable)
  {
    i.d0(Thread.currentThread(), paramThrowable);
  }
  
  public void p(Throwable paramThrowable)
  {
    f localf = f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Recorded on-demand fatal events: ");
    localStringBuilder.append(d.b());
    localf.b(localStringBuilder.toString());
    localf = f.f();
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("Dropped on-demand fatal events: ");
    localStringBuilder.append(d.a());
    localf.b(localStringBuilder.toString());
    i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(d.b()));
    i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(d.a()));
    i.Q(Thread.currentThread(), paramThrowable);
  }
  
  public void q()
  {
    o.h(new c());
  }
  
  public void r()
  {
    o.b();
    f.a();
    f.f().i("Initialization marker file was created.");
  }
  
  public boolean s(a parama, O3.i parami)
  {
    boolean bool = i.j(a, "com.crashlytics.RequireBuildId", true);
    if (m(b, bool))
    {
      String str = new h(j).toString();
      try
      {
        Object localObject1 = new H3/t;
        ((t)localObject1).<init>("crash_marker", k);
        g = ((t)localObject1);
        localObject1 = new H3/t;
        ((t)localObject1).<init>("initialization_marker", k);
        f = ((t)localObject1);
        localObject1 = new I3/i;
        ((I3.i)localObject1).<init>(str, k, o);
        I3.c localc = new I3/c;
        localc.<init>(k);
        Object localObject2 = new P3/a;
        Object localObject3 = new P3/c;
        ((P3.c)localObject3).<init>(10);
        ((P3.a)localObject2).<init>(1024, new d[] { localObject3 });
        localObject3 = V.g(a, j, k, parama, localc, (I3.i)localObject1, (d)localObject2, parami, d, p);
        localObject2 = new H3/q;
        ((q)localObject2).<init>(a, o, j, c, k, g, parama, (I3.i)localObject1, localc, (V)localObject3, q, m, p);
        i = ((q)localObject2);
        bool = h();
        d();
        i.z(str, Thread.getDefaultUncaughtExceptionHandler(), parami);
        if ((bool) && (i.d(a)))
        {
          f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
          k(parami);
          return false;
        }
      }
      catch (Exception parama)
      {
        break label312;
        f.f().b("Successfully configured exception handler.");
        return true;
        label312:
        f.f().e("Crashlytics was not started due to an exception during initialization", parama);
        i = null;
        return false;
      }
    }
    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
  }
  
  public j t()
  {
    return i.W();
  }
  
  public void u(Boolean paramBoolean)
  {
    c.h(paramBoolean);
  }
  
  public void v(String paramString1, String paramString2)
  {
    i.X(paramString1, paramString2);
  }
  
  public void w(String paramString1, String paramString2)
  {
    i.Y(paramString1, paramString2);
  }
  
  public void x(String paramString)
  {
    i.Z(paramString);
  }
  
  public class a
    implements Callable
  {
    public a(O3.i parami) {}
    
    public j a()
    {
      return s.a(s.this, parami);
    }
  }
  
  public class b
    implements Runnable
  {
    public b(O3.i parami) {}
    
    public void run()
    {
      s.a(s.this, parami);
    }
  }
  
  public class c
    implements Callable
  {
    public c() {}
    
    public Boolean a()
    {
      boolean bool;
      try
      {
        bool = s.b(s.this).d();
        if (!bool) {
          f.f().k("Initialization marker file was not properly removed.");
        }
      }
      catch (Exception localException)
      {
        break label35;
      }
      return Boolean.valueOf(bool);
      label35:
      f.f().e("Problem encountered deleting Crashlytics initialization marker.", localException);
      return Boolean.FALSE;
    }
  }
  
  public class d
    implements Callable
  {
    public d() {}
    
    public Boolean a()
    {
      return Boolean.valueOf(s.c(s.this).u());
    }
  }
}

/* Location:
 * Qualified Name:     H3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */