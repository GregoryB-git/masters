package u7;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d8.i;
import e8.k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l6.b.a;
import m6.h.a;
import q9.c;
import r.g.e;

public final class f
{
  public static final Object k = new Object();
  public static final r.b l = new r.b();
  public final Context a;
  public final String b;
  public final j c;
  public final i d;
  public final AtomicBoolean e = new AtomicBoolean(false);
  public final AtomicBoolean f = new AtomicBoolean();
  public final d8.o<y9.a> g;
  public final t9.b<c> h;
  public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
  public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
  
  public f(Context paramContext, j paramj, String paramString)
  {
    a = paramContext;
    m6.j.e(paramString);
    b = paramString;
    c = paramj;
    a locala = FirebaseInitProvider.a;
    Trace.beginSection("Firebase");
    Trace.beginSection("ComponentDiscovery");
    ArrayList localArrayList1 = new ArrayList();
    try
    {
      paramString = paramContext.getPackageManager();
      if (paramString == null)
      {
        paramString = "Context has no PackageManager.";
      }
      else
      {
        localObject = new android/content/ComponentName;
        ((ComponentName)localObject).<init>(paramContext, ComponentDiscoveryService.class);
        paramString = paramString.getServiceInfo((ComponentName)localObject, 128);
        if (paramString != null) {
          break label171;
        }
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append(ComponentDiscoveryService.class);
        paramString.append(" has no service info.");
        paramString = paramString.toString();
      }
      Log.w("ComponentDiscovery", paramString);
      break label188;
      label171:
      paramString = metaData;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      Log.w("ComponentDiscovery", "Application info not found.");
      label188:
      paramString = null;
    }
    if (paramString == null)
    {
      Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
      localObject = Collections.emptyList();
    }
    else
    {
      localArrayList2 = new ArrayList();
      Iterator localIterator = paramString.keySet().iterator();
      for (;;)
      {
        localObject = localArrayList2;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (String)localIterator.next();
        if (("com.google.firebase.components.ComponentRegistrar".equals(paramString.get((String)localObject))) && (((String)localObject).startsWith("com.google.firebase.components:"))) {
          localArrayList2.add(((String)localObject).substring(31));
        }
      }
    }
    paramString = ((List)localObject).iterator();
    while (paramString.hasNext()) {
      localArrayList1.add(new d8.d((String)paramString.next(), 0));
    }
    Trace.endSection();
    Trace.beginSection("Runtime");
    Object localObject = k.a;
    paramString = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    paramString.addAll(localArrayList1);
    paramString.add(new d8.h(new FirebaseCommonRegistrar()));
    paramString.add(new d8.h(new ExecutorsRegistrar()));
    localArrayList2.add(d8.b.c(paramContext, Context.class, new Class[0]));
    localArrayList2.add(d8.b.c(this, f.class, new Class[0]));
    localArrayList2.add(d8.b.c(paramj, j.class, new Class[0]));
    paramj = new ha.b();
    if ((a0.o.a(paramContext)) && (FirebaseInitProvider.b.get())) {
      localArrayList2.add(d8.b.c(locala, l.class, new Class[0]));
    }
    paramj = new i((Executor)localObject, paramString, localArrayList2, paramj);
    d = paramj;
    Trace.endSection();
    g = new d8.o(new d(0, this, paramContext));
    h = paramj.b(c.class);
    paramContext = new e(this);
    a();
    if ((e.get()) && (ea.get())) {
      paramContext.a(true);
    }
    i.add(paramContext);
    Trace.endSection();
  }
  
  public static ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (k)
    {
      Iterator localIterator = ((g.e)l.values()).iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        localf.a();
        localArrayList.add(b);
      }
      Collections.sort(localArrayList);
      return localArrayList;
    }
  }
  
  public static f e()
  {
    synchronized (k)
    {
      Object localObject2 = (f)l.getOrDefault("[DEFAULT]", null);
      if (localObject2 != null)
      {
        ((c)h.get()).c();
        return (f)localObject2;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Default FirebaseApp is not initialized in this process ");
      ((StringBuilder)localObject2).append(v6.f.a());
      ((StringBuilder)localObject2).append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
      localIllegalStateException.<init>(((StringBuilder)localObject2).toString());
      throw localIllegalStateException;
    }
  }
  
  public static f f(String paramString)
  {
    synchronized (k)
    {
      Object localObject2 = (f)l.getOrDefault(paramString.trim(), null);
      if (localObject2 != null)
      {
        ((c)h.get()).c();
        return (f)localObject2;
      }
      localObject2 = d();
      if (((ArrayList)localObject2).isEmpty())
      {
        localObject2 = "";
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Available app names: ");
        localStringBuilder.append(TextUtils.join(", ", (Iterable)localObject2));
        localObject2 = localStringBuilder.toString();
      }
      localObject2 = String.format("FirebaseApp with name %s doesn't exist. %s", new Object[] { paramString, localObject2 });
      paramString = new java/lang/IllegalStateException;
      paramString.<init>((String)localObject2);
      throw paramString;
    }
  }
  
  public static f i(Context paramContext)
  {
    synchronized (k)
    {
      if (l.containsKey("[DEFAULT]"))
      {
        paramContext = e();
        return paramContext;
      }
      j localj = j.a(paramContext);
      if (localj == null)
      {
        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
        return null;
      }
      paramContext = j(paramContext, localj, "[DEFAULT]");
      return paramContext;
    }
  }
  
  public static f j(Context paramContext, j paramj, String paramString)
  {
    ??? = b.a;
    Object localObject2;
    Object localObject3;
    if ((paramContext.getApplicationContext() instanceof Application))
    {
      localObject2 = (Application)paramContext.getApplicationContext();
      if (b.a.get() == null)
      {
        ??? = new b();
        localObject3 = b.a;
        do
        {
          if (((AtomicReference)localObject3).compareAndSet(null, ???))
          {
            m = 1;
            break;
          }
        } while (((AtomicReference)localObject3).get() == null);
        int m = 0;
        if (m != 0)
        {
          l6.b.a((Application)localObject2);
          localObject3 = l6.b.e;
          localObject3.getClass();
          try
          {
            c.add(???);
          }
          finally {}
        }
      }
    }
    paramString = paramString.trim();
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    synchronized (k)
    {
      localObject3 = l;
      boolean bool = ((r.h)localObject3).containsKey(paramString);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("FirebaseApp name ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" already exists!");
      m6.j.k(true ^ bool, ((StringBuilder)localObject2).toString());
      m6.j.j(paramContext, "Application context cannot be null.");
      localObject2 = new u7/f;
      ((f)localObject2).<init>(paramContext, paramj, paramString);
      ((r.h)localObject3).put(paramString, localObject2);
      ((f)localObject2).h();
      return (f)localObject2;
    }
  }
  
  public final void a()
  {
    m6.j.k(f.get() ^ true, "FirebaseApp was deleted");
  }
  
  public final void b()
  {
    if (!f.compareAndSet(false, true)) {
      return;
    }
    synchronized (k)
    {
      l.remove(b);
      Iterator localIterator = j.iterator();
      while (localIterator.hasNext()) {
        ((g)localIterator.next()).a();
      }
      return;
    }
  }
  
  public final <T> T c(Class<T> paramClass)
  {
    a();
    return (T)d.get(paramClass);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {
      return false;
    }
    String str = b;
    paramObject = (f)paramObject;
    ((f)paramObject).a();
    return str.equals(b);
  }
  
  public final String g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a();
    Object localObject1 = b.getBytes(Charset.defaultCharset());
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = Base64.encodeToString((byte[])localObject1, 11);
    }
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append("+");
    a();
    localObject1 = c.b.getBytes(Charset.defaultCharset());
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = Base64.encodeToString((byte[])localObject1, 11);
    }
    localStringBuilder.append((String)localObject1);
    return localStringBuilder.toString();
  }
  
  public final void h()
  {
    boolean bool = a0.o.a(a);
    int m = 1;
    int n = 1;
    Object localObject1;
    Object localObject2;
    if ((bool ^ true))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
      a();
      ((StringBuilder)localObject1).append(b);
      Log.i("FirebaseApp", ((StringBuilder)localObject1).toString());
      Context localContext = a;
      if (c.b.get() == null)
      {
        localObject2 = new c(localContext);
        localObject1 = c.b;
        while (!((AtomicReference)localObject1).compareAndSet(null, localObject2)) {
          if (((AtomicReference)localObject1).get() != null) {
            n = 0;
          }
        }
        if (n != 0) {
          localContext.registerReceiver((BroadcastReceiver)localObject2, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
      }
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Device unlocked: initializing all Firebase APIs for app ");
      a();
      ((StringBuilder)localObject1).append(b);
      Log.i("FirebaseApp", ((StringBuilder)localObject1).toString());
      localObject1 = d;
      a();
      bool = "[DEFAULT]".equals(b);
      localObject2 = f;
      do
      {
        if (((AtomicReference)localObject2).compareAndSet(null, Boolean.valueOf(bool)))
        {
          n = m;
          break;
        }
      } while (((AtomicReference)localObject2).get() == null);
      n = 0;
      if (n == 0) {}
    }
    try
    {
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>(a);
      ((i)localObject1).g((Map)localObject2, bool);
      ((c)h.get()).c();
      return;
    }
    finally {}
  }
  
  public final int hashCode()
  {
    return b.hashCode();
  }
  
  public final boolean k()
  {
    a();
    synchronized ((y9.a)g.get())
    {
      boolean bool = d;
      return bool;
    }
  }
  
  public final void l(boolean paramBoolean)
  {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator localIterator = i.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramBoolean);
    }
  }
  
  /* Error */
  public final void m(Boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 290	u7/f:a	()V
    //   4: aload_0
    //   5: getfield 276	u7/f:g	Ld8/o;
    //   8: invokevirtual 509	d8/o:get	()Ljava/lang/Object;
    //   11: checkcast 511	y9/a
    //   14: astore_2
    //   15: aload_2
    //   16: monitorenter
    //   17: aload_1
    //   18: ifnonnull +33 -> 51
    //   21: aload_2
    //   22: getfield 524	y9/a:b	Landroid/content/SharedPreferences;
    //   25: invokeinterface 530 1 0
    //   30: ldc_w 532
    //   33: invokeinterface 537 2 0
    //   38: invokeinterface 540 1 0
    //   43: aload_2
    //   44: invokevirtual 542	y9/a:a	()Z
    //   47: istore_3
    //   48: goto +34 -> 82
    //   51: getstatic 546	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   54: aload_1
    //   55: invokevirtual 547	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   58: istore_3
    //   59: aload_2
    //   60: getfield 524	y9/a:b	Landroid/content/SharedPreferences;
    //   63: invokeinterface 530 1 0
    //   68: ldc_w 532
    //   71: iload_3
    //   72: invokeinterface 551 3 0
    //   77: invokeinterface 540 1 0
    //   82: aload_2
    //   83: monitorenter
    //   84: aload_2
    //   85: getfield 514	y9/a:d	Z
    //   88: iload_3
    //   89: if_icmpeq +43 -> 132
    //   92: aload_2
    //   93: iload_3
    //   94: putfield 514	y9/a:d	Z
    //   97: aload_2
    //   98: getfield 554	y9/a:c	Lc9/c;
    //   101: astore 4
    //   103: new 556	c9/a
    //   106: astore_1
    //   107: new 558	u7/b
    //   110: astore 5
    //   112: aload 5
    //   114: iload_3
    //   115: invokespecial 559	u7/b:<init>	(Z)V
    //   118: aload_1
    //   119: aload 5
    //   121: invokespecial 562	c9/a:<init>	(Lu7/b;)V
    //   124: aload 4
    //   126: aload_1
    //   127: invokeinterface 567 2 0
    //   132: aload_2
    //   133: monitorexit
    //   134: aload_2
    //   135: monitorexit
    //   136: return
    //   137: astore_1
    //   138: aload_2
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    //   142: astore_1
    //   143: aload_2
    //   144: monitorexit
    //   145: aload_1
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	f
    //   0	147	1	paramBoolean	Boolean
    //   14	130	2	locala	y9.a
    //   47	68	3	bool	boolean
    //   101	24	4	localc	c9.c
    //   110	10	5	localb	b
    // Exception table:
    //   from	to	target	type
    //   84	132	137	finally
    //   21	48	142	finally
    //   51	82	142	finally
    //   82	84	142	finally
    //   132	134	142	finally
    //   138	142	142	finally
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(b, "name");
    locala.a(c, "options");
    return locala.toString();
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  public static final class b
    implements b.a
  {
    public static AtomicReference<b> a = new AtomicReference();
    
    public final void a(boolean paramBoolean)
    {
      synchronized (f.k)
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(f.l.values());
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          f localf = (f)((Iterator)localObject2).next();
          if (e.get()) {
            localf.l(paramBoolean);
          }
        }
        return;
      }
    }
  }
  
  public static final class c
    extends BroadcastReceiver
  {
    public static AtomicReference<c> b = new AtomicReference();
    public final Context a;
    
    public c(Context paramContext)
    {
      a = paramContext;
    }
    
    public final void onReceive(Context arg1, Intent paramIntent)
    {
      synchronized (f.k)
      {
        paramIntent = ((g.e)f.l.values()).iterator();
        while (paramIntent.hasNext()) {
          ((f)paramIntent.next()).h();
        }
        a.unregisterReceiver(this);
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     u7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */