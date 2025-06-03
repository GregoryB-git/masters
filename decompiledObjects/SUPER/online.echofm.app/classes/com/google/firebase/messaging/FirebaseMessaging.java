package com.google.firebase.messaging;

import V2.j;
import V2.k;
import V2.m;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import c2.g;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n4.d;
import s3.e;
import s4.i;

public class FirebaseMessaging
{
  public static final long o = TimeUnit.HOURS.toSeconds(8L);
  public static b0 p;
  public static g q;
  public static ScheduledExecutorService r;
  public final e a;
  public final q4.a b;
  public final i c;
  public final Context d;
  public final F e;
  public final W f;
  public final a g;
  public final Executor h;
  public final Executor i;
  public final Executor j;
  public final j k;
  public final K l;
  public boolean m = false;
  public final Application.ActivityLifecycleCallbacks n;
  
  public FirebaseMessaging(e parame, q4.a parama, r4.b paramb1, r4.b paramb2, i parami, g paramg, d paramd)
  {
    this(parame, parama, paramb1, paramb2, parami, paramg, paramd, new K(parame.m()));
  }
  
  public FirebaseMessaging(e parame, q4.a parama, r4.b paramb1, r4.b paramb2, i parami, g paramg, d paramd, K paramK)
  {
    this(parame, parama, parami, paramg, paramd, paramK, new F(parame, paramK, paramb1, paramb2, parami), o.f(), o.c(), o.b());
  }
  
  public FirebaseMessaging(e parame, q4.a parama, i parami, g paramg, d paramd, K paramK, F paramF, Executor paramExecutor1, Executor paramExecutor2, Executor paramExecutor3)
  {
    q = paramg;
    a = parame;
    b = parama;
    c = parami;
    g = new a(paramd);
    parami = parame.m();
    d = parami;
    paramg = new q();
    n = paramg;
    l = paramK;
    i = paramExecutor1;
    e = paramF;
    f = new W(paramExecutor1);
    h = paramExecutor2;
    j = paramExecutor3;
    parame = parame.m();
    if ((parame instanceof Application))
    {
      ((Application)parame).registerActivityLifecycleCallbacks(paramg);
    }
    else
    {
      paramg = new StringBuilder();
      paramg.append("Context ");
      paramg.append(parame);
      paramg.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
      Log.w("FirebaseMessaging", paramg.toString());
    }
    if (parama != null) {
      parama.d(new r(this));
    }
    paramExecutor2.execute(new t(this));
    parame = g0.f(this, paramK, paramF, parami, o.g());
    k = parame;
    parame.e(paramExecutor2, new u(this));
    paramExecutor2.execute(new v(this));
  }
  
  @Keep
  @NonNull
  public static FirebaseMessaging getInstance(@NonNull e parame)
  {
    try
    {
      parame = (FirebaseMessaging)parame.k(FirebaseMessaging.class);
      A2.n.j(parame, "Firebase Messaging component is not present");
      return parame;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  public static FirebaseMessaging r()
  {
    try
    {
      FirebaseMessaging localFirebaseMessaging = getInstance(e.o());
      return localFirebaseMessaging;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static b0 s(Context paramContext)
  {
    try
    {
      if (p == null)
      {
        b0 localb0 = new com/google/firebase/messaging/b0;
        localb0.<init>(paramContext);
        p = localb0;
      }
    }
    finally
    {
      break label38;
    }
    paramContext = p;
    return paramContext;
    label38:
    throw paramContext;
  }
  
  public static g w()
  {
    return q;
  }
  
  public void L(T paramT)
  {
    if (!TextUtils.isEmpty(paramT.U()))
    {
      Intent localIntent1 = new Intent("com.google.android.gcm.intent.SEND");
      Intent localIntent2 = new Intent();
      localIntent2.setPackage("com.google.example.invalidpackage");
      localIntent1.putExtra("app", PendingIntent.getBroadcast(d, 0, localIntent2, 67108864));
      localIntent1.setPackage("com.google.android.gms");
      paramT.W(localIntent1);
      d.sendOrderedBroadcast(localIntent1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
      return;
    }
    throw new IllegalArgumentException("Missing 'to'");
  }
  
  public void M(boolean paramBoolean)
  {
    g.f(paramBoolean);
  }
  
  public void N(boolean paramBoolean)
  {
    J.y(paramBoolean);
  }
  
  public void O(boolean paramBoolean)
  {
    try
    {
      m = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void P()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 95	com/google/firebase/messaging/FirebaseMessaging:m	Z
    //   6: ifne +15 -> 21
    //   9: aload_0
    //   10: lconst_0
    //   11: invokevirtual 436	com/google/firebase/messaging/FirebaseMessaging:S	(J)V
    //   14: goto +7 -> 21
    //   17: astore_1
    //   18: goto +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	FirebaseMessaging
    //   17	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void Q()
  {
    q4.a locala = b;
    if (locala != null)
    {
      locala.a();
      return;
    }
    if (T(v())) {
      P();
    }
  }
  
  public j R(String paramString)
  {
    return k.o(new x(paramString));
  }
  
  public void S(long paramLong)
  {
    try
    {
      long l1 = Math.min(Math.max(30L, 2L * paramLong), o);
      c0 localc0 = new com/google/firebase/messaging/c0;
      localc0.<init>(this, l1);
      p(localc0, paramLong);
      m = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean T(b0.a parama)
  {
    boolean bool;
    if ((parama != null) && (!parama.b(l.a()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public j U(String paramString)
  {
    return k.o(new z(paramString));
  }
  
  public String n()
  {
    Object localObject1 = b;
    if (localObject1 != null)
    {
      try
      {
        localObject1 = (String)m.a(((q4.a)localObject1).b());
        return (String)localObject1;
      }
      catch (InterruptedException localInterruptedException1) {}catch (ExecutionException localExecutionException1) {}
      throw new IOException(localExecutionException1);
    }
    Object localObject2 = v();
    if (!T((b0.a)localObject2)) {
      return a;
    }
    String str = K.c(a);
    localObject2 = f.b(str, new w(this, str, (b0.a)localObject2));
    try
    {
      localObject2 = (String)m.a((j)localObject2);
      return (String)localObject2;
    }
    catch (InterruptedException localInterruptedException2) {}catch (ExecutionException localExecutionException2) {}
    throw new IOException(localExecutionException2);
  }
  
  public j o()
  {
    if (b != null)
    {
      localk = new k();
      h.execute(new A(this, localk));
      return localk.a();
    }
    if (v() == null) {
      return m.e(null);
    }
    k localk = new k();
    o.e().execute(new B(this, localk));
    return localk.a();
  }
  
  public void p(Runnable paramRunnable, long paramLong)
  {
    try
    {
      if (r == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        F2.a locala = new F2/a;
        locala.<init>("TAG");
        localScheduledThreadPoolExecutor.<init>(1, locala);
        r = localScheduledThreadPoolExecutor;
      }
    }
    finally
    {
      break label65;
    }
    r.schedule(paramRunnable, paramLong, TimeUnit.SECONDS);
    return;
    label65:
    throw paramRunnable;
  }
  
  public Context q()
  {
    return d;
  }
  
  public final String t()
  {
    String str;
    if ("[DEFAULT]".equals(a.q())) {
      str = "";
    } else {
      str = a.s();
    }
    return str;
  }
  
  public j u()
  {
    Object localObject = b;
    if (localObject != null) {
      return ((q4.a)localObject).b();
    }
    localObject = new k();
    h.execute(new y(this, (k)localObject));
    return ((k)localObject).a();
  }
  
  public b0.a v()
  {
    return s(d).e(t(), K.c(a));
  }
  
  public final void x(String paramString)
  {
    if ("[DEFAULT]".equals(a.q()))
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invoking onNewToken for app: ");
        ((StringBuilder)localObject).append(a.q());
        Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
      }
      Object localObject = new Intent("com.google.firebase.messaging.NEW_TOKEN");
      ((Intent)localObject).putExtra("token", paramString);
      new n(d).k((Intent)localObject);
    }
  }
  
  public boolean y()
  {
    return g.c();
  }
  
  public boolean z()
  {
    return l.g();
  }
  
  public class a
  {
    public final d a;
    public boolean b;
    public n4.b c;
    public Boolean d;
    
    public a(d paramd)
    {
      a = paramd;
    }
    
    public void b()
    {
      try
      {
        boolean bool = b;
        if (bool) {
          return;
        }
        Object localObject1 = e();
        d = ((Boolean)localObject1);
        if (localObject1 == null)
        {
          localObject1 = new com/google/firebase/messaging/C;
          ((C)localObject1).<init>(this);
          c = ((n4.b)localObject1);
          a.c(s3.b.class, (n4.b)localObject1);
        }
      }
      finally
      {
        break label69;
      }
      b = true;
      return;
      label69:
      throw ((Throwable)localObject2);
    }
    
    public boolean c()
    {
      try
      {
        b();
        Boolean localBoolean = d;
        if (localBoolean != null) {
          bool = localBoolean.booleanValue();
        }
      }
      finally
      {
        break label42;
      }
      boolean bool = FirebaseMessaging.l(FirebaseMessaging.this).x();
      return bool;
      label42:
      throw ((Throwable)localObject);
    }
    
    public final Boolean e()
    {
      Object localObject1 = FirebaseMessaging.l(FirebaseMessaging.this).m();
      Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
      if (((SharedPreferences)localObject2).contains("auto_init")) {
        return Boolean.valueOf(((SharedPreferences)localObject2).getBoolean("auto_init", false));
      }
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager();
        if (localObject2 != null)
        {
          localObject2 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
          if (localObject2 != null)
          {
            localObject1 = metaData;
            if ((localObject1 != null) && (((BaseBundle)localObject1).containsKey("firebase_messaging_auto_init_enabled")))
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
    
    public void f(boolean paramBoolean)
    {
      try
      {
        b();
        n4.b localb = c;
        if (localb != null)
        {
          a.d(s3.b.class, localb);
          c = null;
        }
      }
      finally
      {
        break label99;
      }
      SharedPreferences.Editor localEditor = FirebaseMessaging.l(FirebaseMessaging.this).m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
      localEditor.putBoolean("auto_init", paramBoolean);
      localEditor.apply();
      if (paramBoolean) {
        FirebaseMessaging.m(FirebaseMessaging.this);
      }
      d = Boolean.valueOf(paramBoolean);
      return;
      label99:
      throw localEditor;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessaging
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */