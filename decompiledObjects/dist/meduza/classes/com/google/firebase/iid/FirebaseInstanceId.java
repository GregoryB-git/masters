package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r9.c;
import r9.i;
import u9.d;

@Deprecated
public class FirebaseInstanceId
{
  public static final long i = TimeUnit.HOURS.toSeconds(8L);
  public static a j;
  public static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
  public static ScheduledThreadPoolExecutor l;
  public final Executor a;
  public final u7.f b;
  public final r9.h c;
  public final r9.e d;
  public final i e;
  public final d f;
  public boolean g = false;
  public final ArrayList h = new ArrayList();
  
  public FirebaseInstanceId() {}
  
  public FirebaseInstanceId(u7.f paramf, t9.b<ca.f> paramb, t9.b<q9.f> paramb1, d paramd)
  {
    if (r9.h.a(paramf) != null) {
      try
      {
        if (j == null)
        {
          a locala = new com/google/firebase/iid/a;
          paramf.a();
          locala.<init>(a);
          j = locala;
        }
        b = paramf;
        c = localh;
        d = new r9.e(paramf, localh, paramb, paramb1, paramd);
        a = localThreadPoolExecutor2;
        e = new i(localThreadPoolExecutor1);
        f = paramd;
        return;
      }
      finally {}
    }
    throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
  }
  
  public static <T> T b(Task<T> paramTask)
  {
    if (paramTask != null)
    {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      paramTask.addOnCompleteListener(r9.b.a, new c(localCountDownLatch));
      localCountDownLatch.await(30000L, TimeUnit.MILLISECONDS);
      if (paramTask.isSuccessful()) {
        return (T)paramTask.getResult();
      }
      if (!paramTask.isCanceled())
      {
        if (paramTask.isComplete()) {
          throw new IllegalStateException(paramTask.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
      }
      throw new CancellationException("Task is already canceled");
    }
    throw new NullPointerException("Task must not be null");
  }
  
  public static void d(u7.f paramf)
  {
    paramf.a();
    m6.j.f("Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.", c.g);
    paramf.a();
    m6.j.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.", c.b);
    paramf.a();
    m6.j.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.", c.a);
    paramf.a();
    m6.j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c.b.contains(":"));
    paramf.a();
    paramf = c.a;
    m6.j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.matcher(paramf).matches());
  }
  
  public static void e(b paramb, long paramLong)
  {
    try
    {
      if (l == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        w6.a locala = new w6/a;
        locala.<init>("FirebaseInstanceId");
        localScheduledThreadPoolExecutor.<init>(1, locala);
        l = localScheduledThreadPoolExecutor;
      }
      l.schedule(paramb, paramLong, TimeUnit.SECONDS);
      return;
    }
    finally {}
  }
  
  public static FirebaseInstanceId getInstance(u7.f paramf)
  {
    d(paramf);
    paramf = (FirebaseInstanceId)paramf.c(FirebaseInstanceId.class);
    m6.j.j(paramf, "Firebase Instance ID component is not present");
    return paramf;
  }
  
  public final <T> T a(Task<T> arg1)
  {
    try
    {
      ??? = Tasks.await(???, 30000L, TimeUnit.MILLISECONDS);
      return (T)???;
    }
    catch (InterruptedException|TimeoutException ???)
    {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (ExecutionException ???)
    {
      Throwable localThrowable = ???.getCause();
      if ((localThrowable instanceof IOException)) {
        if ("INSTANCE_ID_RESET".equals(localThrowable.getMessage())) {
          try
          {
            synchronized (j)
            {
              b.clear();
              a.edit().clear().commit();
            }
            throw ((IOException)localObject);
          }
          finally {}
        }
      }
      if ((localObject instanceof RuntimeException)) {
        throw ((RuntimeException)localObject);
      }
      throw new IOException(???);
    }
  }
  
  public final String c()
  {
    String str = r9.h.a(b);
    d(b);
    if (Looper.getMainLooper() != Looper.myLooper()) {
      return ((r9.f)a(Tasks.forResult(null).continueWithTask(a, new l3.j(this, str, "*")))).a();
    }
    throw new IOException("MAIN_THREAD");
  }
  
  /* Error */
  public final String f()
  {
    // Byte code:
    //   0: getstatic 90	com/google/firebase/iid/FirebaseInstanceId:j	Lcom/google/firebase/iid/a;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield 95	com/google/firebase/iid/FirebaseInstanceId:b	Lu7/f;
    //   8: invokevirtual 365	u7/f:g	()Ljava/lang/String;
    //   11: astore_2
    //   12: aload_1
    //   13: monitorenter
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 368	com/google/firebase/iid/a:c	(Ljava/lang/String;)J
    //   19: lstore_3
    //   20: aload_1
    //   21: getfield 307	com/google/firebase/iid/a:b	Lr/b;
    //   24: aload_2
    //   25: lload_3
    //   26: invokestatic 374	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   29: invokevirtual 378	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_1
    //   34: monitorexit
    //   35: aload_0
    //   36: getfield 115	com/google/firebase/iid/FirebaseInstanceId:f	Lu9/d;
    //   39: invokeinterface 384 1 0
    //   44: invokestatic 386	com/google/firebase/iid/FirebaseInstanceId:b	(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    //   47: checkcast 222	java/lang/String
    //   50: areturn
    //   51: astore_2
    //   52: aload_1
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    //   56: astore_1
    //   57: new 117	java/lang/IllegalStateException
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 176	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	FirebaseInstanceId
    //   3	50	1	locala	a
    //   56	6	1	localInterruptedException	InterruptedException
    //   11	14	2	str	String
    //   51	4	2	localObject	Object
    //   19	7	3	l1	long
    // Exception table:
    //   from	to	target	type
    //   14	33	51	finally
    //   0	14	56	java/lang/InterruptedException
    //   33	51	56	java/lang/InterruptedException
    //   52	56	56	java/lang/InterruptedException
  }
  
  public final String g()
  {
    Object localObject = b;
    ((u7.f)localObject).a();
    if ("[DEFAULT]".equals(b)) {
      localObject = "";
    } else {
      localObject = b.g();
    }
    return (String)localObject;
  }
  
  @Deprecated
  public final String h()
  {
    d(b);
    String str1 = r9.h.a(b);
    a locala = j;
    String str3 = g();
    try
    {
      Object localObject3 = a;
      str3 = a.b(str3, str1, "*");
      str1 = null;
      localObject3 = a.a.b(((SharedPreferences)localObject3).getString(str3, null));
      if (k((a.a)localObject3)) {
        try
        {
          if (!g) {
            j(0L);
          }
        }
        finally
        {
          localObject1 = finally;
          throw ((Throwable)localObject1);
        }
      }
      String str2;
      if (localObject3 != null) {
        str2 = a;
      }
      return str2;
    }
    finally {}
  }
  
  public final boolean i()
  {
    synchronized (c)
    {
      int m = e;
      boolean bool = true;
      if (m == 0)
      {
        Object localObject1 = a.getPackageManager();
        if (((PackageManager)localObject1).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
        {
          Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
          m = 0;
          break label225;
        }
        if (!v6.e.a())
        {
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>("com.google.android.c2dm.intent.REGISTER");
          ((Intent)localObject3).setPackage("com.google.android.gms");
          localObject3 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject3, 0);
          if ((localObject3 != null) && (((List)localObject3).size() > 0))
          {
            e = 1;
            m = 1;
            break label225;
          }
        }
        Object localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>("com.google.iid.TOKEN_REQUEST");
        ((Intent)localObject3).setPackage("com.google.android.gms");
        localObject1 = ((PackageManager)localObject1).queryBroadcastReceivers((Intent)localObject3, 0);
        m = 2;
        if ((localObject1 != null) && (((List)localObject1).size() > 0))
        {
          e = 2;
          break label225;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (v6.e.a())
        {
          e = 2;
          m = 2;
        }
        else
        {
          e = 1;
          m = 1;
        }
      }
      label225:
      if (m == 0) {
        bool = false;
      }
      return bool;
    }
  }
  
  public final void j(long paramLong)
  {
    try
    {
      long l1 = Math.min(Math.max(30L, paramLong + paramLong), i);
      b localb = new com/google/firebase/iid/b;
      localb.<init>(this, l1);
      e(localb, paramLong);
      g = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean k(a.a parama)
  {
    if (parama != null) {
      synchronized (c)
      {
        if (b == null) {
          ???.c();
        }
        String str = b;
        int m;
        if ((System.currentTimeMillis() <= c + a.a.d) && (str.equals(b))) {
          m = 0;
        } else {
          m = 1;
        }
        if (m == 0) {
          return false;
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.FirebaseInstanceId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */