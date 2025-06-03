package com.google.firebase.iid;

import V2.j;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.d;
import p4.k;
import p4.l;
import q4.a.a;
import s4.i;

@Deprecated
public class FirebaseInstanceId
{
  public static final long i = TimeUnit.HOURS.toSeconds(8L);
  public static b j;
  public static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
  public static ScheduledExecutorService l;
  public final Executor a;
  public final s3.e b;
  public final p4.n c;
  public final k d;
  public final a e;
  public final i f;
  public boolean g = false;
  public final List h = new ArrayList();
  
  public FirebaseInstanceId(s3.e parame, p4.n paramn, Executor paramExecutor1, Executor paramExecutor2, r4.b paramb1, r4.b paramb2, i parami)
  {
    if (p4.n.c(parame) != null)
    {
      try
      {
        if (j == null)
        {
          b localb = new com/google/firebase/iid/b;
          localb.<init>(parame.m());
          j = localb;
        }
      }
      finally
      {
        break label119;
      }
      b = parame;
      c = paramn;
      d = new k(parame, paramn, paramb1, paramb2, parami);
      a = paramExecutor2;
      e = new a(paramExecutor1);
      f = parami;
      return;
      label119:
      throw parame;
    }
    throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
  }
  
  public FirebaseInstanceId(s3.e parame, r4.b paramb1, r4.b paramb2, i parami)
  {
    this(parame, new p4.n(parame.m()), p4.b.b(), p4.b.b(), paramb1, paramb2, parami);
  }
  
  public static String A(String paramString)
  {
    if ((!paramString.isEmpty()) && (!paramString.equalsIgnoreCase("fcm")) && (!paramString.equalsIgnoreCase("gcm"))) {
      return paramString;
    }
    return "*";
  }
  
  public static Object c(j paramj)
  {
    A2.n.j(paramj, "Task must not be null");
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    paramj.c(d.o, new p4.e(localCountDownLatch));
    localCountDownLatch.await(30000L, TimeUnit.MILLISECONDS);
    return l(paramj);
  }
  
  public static void e(s3.e parame)
  {
    A2.n.f(parame.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
    A2.n.f(parame.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
    A2.n.f(parame.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
    A2.n.b(u(parame.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    A2.n.b(t(parame.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
  }
  
  @Keep
  @NonNull
  public static FirebaseInstanceId getInstance(@NonNull s3.e parame)
  {
    e(parame);
    parame = (FirebaseInstanceId)parame.k(FirebaseInstanceId.class);
    A2.n.j(parame, "Firebase Instance ID component is not present");
    return parame;
  }
  
  public static Object l(j paramj)
  {
    if (paramj.n()) {
      return paramj.j();
    }
    if (!paramj.l())
    {
      if (paramj.m()) {
        throw new IllegalStateException(paramj.i());
      }
      throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }
    throw new CancellationException("Task is already canceled");
  }
  
  public static boolean r()
  {
    boolean bool1 = Log.isLoggable("FirebaseInstanceId", 3);
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (!bool1) {
      if (Build.VERSION.SDK_INT == 23)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
          bool3 = bool2;
        } else {
          return false;
        }
      }
      else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public static boolean t(String paramString)
  {
    return k.matcher(paramString).matches();
  }
  
  public static boolean u(String paramString)
  {
    return paramString.contains(":");
  }
  
  public void B()
  {
    try
    {
      j.d();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void C(boolean paramBoolean)
  {
    try
    {
      g = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void D()
  {
    try
    {
      if (!g)
      {
        E(0L);
        return;
      }
    }
    finally
    {
      localObject = finally;
      break label24;
      return;
      label24:
      throw ((Throwable)localObject);
    }
  }
  
  public void E(long paramLong)
  {
    try
    {
      long l1 = Math.min(Math.max(30L, paramLong + paramLong), i);
      c localc = new com/google/firebase/iid/c;
      localc.<init>(this, l1);
      g(localc, paramLong);
      g = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean F(b.a parama)
  {
    return (parama == null) || (parama.c(c.a()));
  }
  
  public void a(a.a parama)
  {
    h.add(parama);
  }
  
  public final Object b(j paramj)
  {
    try
    {
      paramj = V2.m.b(paramj, 30000L, TimeUnit.MILLISECONDS);
      return paramj;
    }
    catch (ExecutionException paramj) {}catch (InterruptedException|TimeoutException paramj)
    {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    Throwable localThrowable = paramj.getCause();
    if ((localThrowable instanceof IOException))
    {
      if ("INSTANCE_ID_RESET".equals(localThrowable.getMessage())) {
        B();
      }
      throw ((IOException)localThrowable);
    }
    if ((localThrowable instanceof RuntimeException)) {
      throw ((RuntimeException)localThrowable);
    }
    throw new IOException(paramj);
  }
  
  public String d()
  {
    return o(p4.n.c(b), "*");
  }
  
  public void f(String paramString1, String paramString2)
  {
    e(b);
    if (Looper.getMainLooper() != Looper.myLooper())
    {
      String str = A(paramString2);
      paramString2 = i();
      b(d.b(paramString2, paramString1, str));
      j.e(m(), paramString1, str);
      return;
    }
    throw new IOException("MAIN_THREAD");
  }
  
  public void g(Runnable paramRunnable, long paramLong)
  {
    try
    {
      if (l == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        F2.a locala = new F2/a;
        locala.<init>("FirebaseInstanceId");
        localScheduledThreadPoolExecutor.<init>(1, locala);
        l = localScheduledThreadPoolExecutor;
      }
    }
    finally
    {
      break label65;
    }
    l.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
    return;
    label65:
    throw paramRunnable;
  }
  
  public s3.e h()
  {
    return b;
  }
  
  public String i()
  {
    try
    {
      j.j(b.s());
      String str = (String)c(f.a());
      return str;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IllegalStateException(localInterruptedException);
    }
  }
  
  public j j()
  {
    e(b);
    return k(p4.n.c(b), "*");
  }
  
  public final j k(String paramString1, String paramString2)
  {
    paramString2 = A(paramString2);
    return V2.m.e(null).h(a, new p4.c(this, paramString1, paramString2));
  }
  
  public final String m()
  {
    String str;
    if ("[DEFAULT]".equals(b.q())) {
      str = "";
    } else {
      str = b.s();
    }
    return str;
  }
  
  public String n()
  {
    e(b);
    b.a locala = p();
    if (F(locala)) {
      D();
    }
    return b.a.b(locala);
  }
  
  public String o(String paramString1, String paramString2)
  {
    e(b);
    if (Looper.getMainLooper() != Looper.myLooper()) {
      return ((l)b(k(paramString1, paramString2))).a();
    }
    throw new IOException("MAIN_THREAD");
  }
  
  public b.a p()
  {
    return q(p4.n.c(b), "*");
  }
  
  public b.a q(String paramString1, String paramString2)
  {
    return j.g(m(), paramString1, paramString2);
  }
  
  public boolean s()
  {
    return c.g();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */