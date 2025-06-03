package com.google.firebase.messaging;

import aa.b0;
import aa.f0;
import aa.i0;
import aa.j0;
import aa.k;
import aa.l;
import aa.m0;
import aa.o;
import aa.q;
import aa.u;
import aa.x;
import aa.z;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h3.i;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.h;
import x0.q0;

public class FirebaseMessaging
{
  public static final long l = TimeUnit.HOURS.toSeconds(8L);
  public static a m;
  public static t9.b<i> n = new d8.r(2);
  public static ScheduledThreadPoolExecutor o;
  public final u7.f a;
  public final s9.a b;
  public final Context c;
  public final o d;
  public final b0 e;
  public final a f;
  public final Executor g;
  public final Executor h;
  public final Task<j0> i;
  public final aa.r j;
  public boolean k = false;
  
  public FirebaseMessaging() {}
  
  public FirebaseMessaging(u7.f paramf, s9.a parama, t9.b<ca.f> paramb, t9.b<q9.f> paramb1, u9.d paramd, t9.b<i> paramb2, c9.d paramd1)
  {
    n = paramb2;
    a = paramf;
    b = parama;
    f = new a(paramd1);
    paramf.a();
    paramd = a;
    c = paramd;
    paramb2 = new k();
    j = localr;
    d = paramb1;
    e = new b0(localExecutorService);
    g = paramb;
    h = localThreadPoolExecutor;
    paramf.a();
    paramf = a;
    if ((paramf instanceof Application))
    {
      ((Application)paramf).registerActivityLifecycleCallbacks(paramb2);
    }
    else
    {
      paramb2 = new StringBuilder();
      paramb2.append("Context ");
      paramb2.append(paramf);
      paramb2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
      Log.w("FirebaseMessaging", paramb2.toString());
    }
    if (parama != null) {
      parama.c(new l(this));
    }
    paramb.execute(new b.d(this, 20));
    paramf = new ScheduledThreadPoolExecutor(1, new w6.a("Firebase-Messaging-Topics-Io"));
    int i1 = j0.j;
    paramf = Tasks.call(paramf, new i0(paramd, this, paramb1, localr, paramf));
    i = paramf;
    paramf.addOnSuccessListener(paramb, new m0(this, 13));
    paramb.execute(new b.m(this, 19));
  }
  
  public static void c(f0 paramf0, long paramLong)
  {
    try
    {
      if (o == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        w6.a locala = new w6/a;
        locala.<init>("TAG");
        localScheduledThreadPoolExecutor.<init>(1, locala);
        o = localScheduledThreadPoolExecutor;
      }
      o.schedule(paramf0, paramLong, TimeUnit.SECONDS);
      return;
    }
    finally {}
  }
  
  public static FirebaseMessaging d()
  {
    try
    {
      FirebaseMessaging localFirebaseMessaging = getInstance(u7.f.e());
      return localFirebaseMessaging;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static a e(Context paramContext)
  {
    try
    {
      if (m == null)
      {
        a locala = new com/google/firebase/messaging/a;
        locala.<init>(paramContext);
        m = locala;
      }
      paramContext = m;
      return paramContext;
    }
    finally {}
  }
  
  public static FirebaseMessaging getInstance(u7.f paramf)
  {
    try
    {
      paramf = (FirebaseMessaging)paramf.c(FirebaseMessaging.class);
      m6.j.j(paramf, "Firebase Messaging component is not present");
      return paramf;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
  
  public final String a()
  {
    Object localObject1 = b;
    if (localObject1 != null)
    {
      try
      {
        localObject1 = (String)Tasks.await(((s9.a)localObject1).d());
        return (String)localObject1;
      }
      catch (InterruptedException localInterruptedException1) {}catch (ExecutionException localExecutionException1) {}
      throw new IOException(localExecutionException1);
    }
    Object localObject2 = g();
    if (!o((a.a)localObject2)) {
      return a;
    }
    String str = aa.r.a(a);
    synchronized (e)
    {
      Object localObject4 = (Task)b.getOrDefault(str, null);
      if (localObject4 != null)
      {
        localObject2 = localObject4;
        if (Log.isLoggable("FirebaseMessaging", 3))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Joining ongoing request for: ");
          ((StringBuilder)localObject2).append(str);
          Log.d("FirebaseMessaging", ((StringBuilder)localObject2).toString());
          localObject2 = localObject4;
        }
      }
      else
      {
        if (Log.isLoggable("FirebaseMessaging", 3))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("Making new request for: ");
          ((StringBuilder)localObject4).append(str);
          Log.d("FirebaseMessaging", ((StringBuilder)localObject4).toString());
        }
        Object localObject5 = d;
        Object localObject6 = aa.r.a(a);
        localObject4 = new android/os/Bundle;
        ((Bundle)localObject4).<init>();
        localObject5 = ((o)localObject5).a(((o)localObject5).c((String)localObject6, "*", (Bundle)localObject4));
        localObject4 = h;
        localObject6 = new r3/r;
        ((r3.r)localObject6).<init>(this, str, localObject2, 3);
        localObject5 = ((Task)localObject5).onSuccessTask((Executor)localObject4, (SuccessContinuation)localObject6);
        localObject2 = a;
        localObject4 = new k1/a;
        ((k1.a)localObject4).<init>(12, ???, str);
        localObject2 = ((Task)localObject5).continueWithTask((Executor)localObject2, (Continuation)localObject4);
        b.put(str, localObject2);
      }
      try
      {
        localObject2 = (String)Tasks.await((Task)localObject2);
        return (String)localObject2;
      }
      catch (InterruptedException localInterruptedException2) {}catch (ExecutionException localExecutionException2) {}
      throw new IOException(localExecutionException2);
    }
  }
  
  public final Task<Void> b()
  {
    if (b != null)
    {
      localTaskCompletionSource = new TaskCompletionSource();
      g.execute(new x0.f(22, this, localTaskCompletionSource));
      return localTaskCompletionSource.getTask();
    }
    if (g() == null) {
      return Tasks.forResult(null);
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    Executors.newSingleThreadExecutor(new w6.a("Firebase-Messaging-Network-Io")).execute(new q0(17, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public final String f()
  {
    Object localObject = a;
    ((u7.f)localObject).a();
    if ("[DEFAULT]".equals(b)) {
      localObject = "";
    } else {
      localObject = a.g();
    }
    return (String)localObject;
  }
  
  public final a.a g()
  {
    a locala = e(c);
    Object localObject1 = f();
    String str = aa.r.a(a);
    try
    {
      localObject1 = a.a.b(a.getString(a.a((String)localObject1, str), null));
      return (a.a)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  /* Error */
  public final void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 136	com/google/firebase/messaging/FirebaseMessaging:d	Laa/o;
    //   4: getfield 406	aa/o:c	Li6/c;
    //   7: astore_1
    //   8: aload_1
    //   9: getfield 411	i6/c:c	Li6/a0;
    //   12: invokevirtual 416	i6/a0:a	()I
    //   15: ldc_w 417
    //   18: if_icmplt +63 -> 81
    //   21: aload_1
    //   22: getfield 419	i6/c:b	Landroid/content/Context;
    //   25: invokestatic 424	i6/z:a	(Landroid/content/Context;)Li6/z;
    //   28: astore_1
    //   29: getstatic 428	android/os/Bundle:EMPTY	Landroid/os/Bundle;
    //   32: astore_2
    //   33: aload_1
    //   34: monitorenter
    //   35: aload_1
    //   36: getfield 430	i6/z:d	I
    //   39: istore_3
    //   40: aload_1
    //   41: iload_3
    //   42: iconst_1
    //   43: iadd
    //   44: putfield 430	i6/z:d	I
    //   47: aload_1
    //   48: monitorexit
    //   49: aload_1
    //   50: new 432	i6/y
    //   53: dup
    //   54: iload_3
    //   55: iconst_5
    //   56: aload_2
    //   57: invokespecial 435	i6/y:<init>	(IILandroid/os/Bundle;)V
    //   60: invokevirtual 438	i6/z:b	(Li6/x;)Lcom/google/android/gms/tasks/Task;
    //   63: getstatic 443	i6/b0:a	Li6/b0;
    //   66: getstatic 448	i6/e:a	Li6/e;
    //   69: invokevirtual 451	com/google/android/gms/tasks/Task:continueWith	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;
    //   72: astore_1
    //   73: goto +22 -> 95
    //   76: astore_2
    //   77: aload_1
    //   78: monitorexit
    //   79: aload_2
    //   80: athrow
    //   81: new 280	java/io/IOException
    //   84: dup
    //   85: ldc_w 453
    //   88: invokespecial 454	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   91: invokestatic 458	com/google/android/gms/tasks/Tasks:forException	(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;
    //   94: astore_1
    //   95: aload_1
    //   96: aload_0
    //   97: getfield 145	com/google/firebase/messaging/FirebaseMessaging:g	Ljava/util/concurrent/Executor;
    //   100: new 459	e
    //   103: dup
    //   104: aload_0
    //   105: bipush 10
    //   107: invokespecial 460	e:<init>	(Ljava/lang/Object;I)V
    //   110: invokevirtual 227	com/google/android/gms/tasks/Task:addOnSuccessListener	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;
    //   113: pop
    //   114: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	FirebaseMessaging
    //   7	89	1	localObject1	Object
    //   32	25	2	localBundle	Bundle
    //   76	4	2	localObject2	Object
    //   39	16	3	i1	int
    // Exception table:
    //   from	to	target	type
    //   35	47	76	finally
  }
  
  public final void i(String paramString)
  {
    Object localObject = a;
    ((u7.f)localObject).a();
    if ("[DEFAULT]".equals(b))
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        StringBuilder localStringBuilder = f.l("Invoking onNewToken for app: ");
        localObject = a;
        ((u7.f)localObject).a();
        localStringBuilder.append(b);
        Log.d("FirebaseMessaging", localStringBuilder.toString());
      }
      localObject = new Intent("com.google.firebase.messaging.NEW_TOKEN");
      ((Intent)localObject).putExtra("token", paramString);
      new aa.j(c).b((Intent)localObject);
    }
  }
  
  @Deprecated
  public final void j(z paramz)
  {
    if (!TextUtils.isEmpty(a.getString("google.to")))
    {
      Intent localIntent1 = new Intent("com.google.android.gcm.intent.SEND");
      Intent localIntent2 = new Intent();
      localIntent2.setPackage("com.google.example.invalidpackage");
      localIntent1.putExtra("app", PendingIntent.getBroadcast(c, 0, localIntent2, 67108864));
      localIntent1.setPackage("com.google.android.gms");
      localIntent1.putExtras(a);
      c.sendOrderedBroadcast(localIntent1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
      return;
    }
    throw new IllegalArgumentException("Missing 'to'");
  }
  
  public final void k(boolean paramBoolean)
  {
    synchronized (f)
    {
      ???.a();
      Object localObject1 = c;
      if (localObject1 != null)
      {
        a.c((c9.b)localObject1);
        c = null;
      }
      localObject1 = e.a;
      ((u7.f)localObject1).a();
      localObject1 = a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
      ((SharedPreferences.Editor)localObject1).putBoolean("auto_init", paramBoolean);
      ((SharedPreferences.Editor)localObject1).apply();
      if (paramBoolean) {
        e.m();
      }
      d = Boolean.valueOf(paramBoolean);
      return;
    }
  }
  
  public final boolean l()
  {
    x.a(c);
    Context localContext = c;
    int i1 = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i1 >= 29) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 == 0)
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
      }
    }
    else
    {
      if (Binder.getCallingUid() == getApplicationInfouid) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 == 0)
      {
        StringBuilder localStringBuilder = f.l("error retrieving notification delegate for package ");
        localStringBuilder.append(localContext.getPackageName());
        Log.e("FirebaseMessaging", localStringBuilder.toString());
      }
      else if ("com.google.android.gms".equals(u.e((NotificationManager)localContext.getSystemService(NotificationManager.class))))
      {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        i1 = 1;
        break label159;
      }
    }
    i1 = 0;
    label159:
    if (i1 == 0) {
      return false;
    }
    if (a.c(w7.a.class) != null) {
      return true;
    }
    if ((!q.a()) || (n == null)) {
      bool = false;
    }
    return bool;
  }
  
  public final void m()
  {
    s9.a locala = b;
    if (locala != null)
    {
      locala.a();
      return;
    }
    if (o(g())) {
      try
      {
        if (!k) {
          n(0L);
        }
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  public final void n(long paramLong)
  {
    try
    {
      long l1 = Math.min(Math.max(30L, 2L * paramLong), l);
      f0 localf0 = new aa/f0;
      localf0.<init>(this, l1);
      c(localf0, paramLong);
      k = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean o(a.a parama)
  {
    boolean bool = false;
    if (parama != null) {
      synchronized (j)
      {
        if (b == null) {
          ???.d();
        }
        String str = b;
        int i1;
        if ((System.currentTimeMillis() <= c + a.a.d) && (str.equals(b))) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if (i1 == 0) {
          return bool;
        }
      }
    }
    bool = true;
    return bool;
  }
  
  public final class a
  {
    public final c9.d a;
    public boolean b;
    public aa.m c;
    public Boolean d;
    
    public a(c9.d paramd)
    {
      a = paramd;
    }
    
    public final void a()
    {
      try
      {
        boolean bool = b;
        if (bool) {
          return;
        }
        Object localObject1 = b();
        d = ((Boolean)localObject1);
        if (localObject1 == null)
        {
          localObject1 = new aa/m;
          ((aa.m)localObject1).<init>(this);
          c = ((aa.m)localObject1);
          a.a((aa.m)localObject1);
        }
        b = true;
        return;
      }
      finally {}
    }
    
    public final Boolean b()
    {
      Object localObject1 = a;
      ((u7.f)localObject1).a();
      localObject1 = a;
      Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
      if (((SharedPreferences)localObject2).contains("auto_init")) {
        return Boolean.valueOf(((SharedPreferences)localObject2).getBoolean("auto_init", false));
      }
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager();
        if (localObject2 != null)
        {
          localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if (localObject1 != null)
          {
            localObject2 = metaData;
            if ((localObject2 != null) && (((BaseBundle)localObject2).containsKey("firebase_messaging_auto_init_enabled")))
            {
              boolean bool = metaData.getBoolean("firebase_messaging_auto_init_enabled");
              return Boolean.valueOf(bool);
            }
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;) {}
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessaging
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */