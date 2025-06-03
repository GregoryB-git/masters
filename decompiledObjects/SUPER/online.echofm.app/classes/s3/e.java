package s3;

import A2.m.a;
import B3.g;
import B3.o;
import B3.o.b;
import B3.x;
import C3.B;
import E.r;
import E2.l;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z2.c.a;

public class e
{
  public static final Object k = new Object();
  public static final Map l = new t.a();
  public final Context a;
  public final String b;
  public final m c;
  public final o d;
  public final AtomicBoolean e = new AtomicBoolean(false);
  public final AtomicBoolean f = new AtomicBoolean();
  public final x g;
  public final r4.b h;
  public final List i = new CopyOnWriteArrayList();
  public final List j = new CopyOnWriteArrayList();
  
  public e(Context paramContext, String paramString, m paramm)
  {
    a = ((Context)A2.n.i(paramContext));
    b = A2.n.e(paramString);
    c = ((m)A2.n.i(paramm));
    paramString = FirebaseInitProvider.b();
    U4.c.b("Firebase");
    U4.c.b("ComponentDiscovery");
    List localList = g.c(paramContext, ComponentDiscoveryService.class).b();
    U4.c.a();
    U4.c.b("Runtime");
    paramm = o.m(B.o).d(localList).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(B3.c.s(paramContext, Context.class, new Class[0])).b(B3.c.s(this, e.class, new Class[0])).b(B3.c.s(paramm, m.class, new Class[0])).g(new U4.b());
    if ((r.a(paramContext)) && (FirebaseInitProvider.c())) {
      paramm.b(B3.c.s(paramString, n.class, new Class[0]));
    }
    paramString = paramm.e();
    d = paramString;
    U4.c.a();
    g = new x(new c(this, paramContext));
    h = paramString.g(o4.f.class);
    g(new d(this));
    U4.c.a();
  }
  
  public static String B(String paramString)
  {
    return paramString.trim();
  }
  
  public static List l()
  {
    ArrayList localArrayList = new ArrayList();
    synchronized (k)
    {
      Iterator localIterator = l.values().iterator();
      if (localIterator.hasNext()) {
        localArrayList.add(((e)localIterator.next()).q());
      }
    }
  }
  
  public static List n(Context arg0)
  {
    synchronized (k)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(l.values());
      return localArrayList;
    }
  }
  
  public static e o()
  {
    Object localObject1 = k;
    StringBuilder localStringBuilder;
    label95:
    try
    {
      e locale = (e)l.get("[DEFAULT]");
      if (locale != null)
      {
        ((o4.f)h.get()).l();
        return locale;
      }
    }
    finally
    {
      break label95;
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Default FirebaseApp is not initialized in this process ");
      localStringBuilder.append(E2.m.a());
      localStringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
      localIllegalStateException.<init>(localStringBuilder.toString());
      throw localIllegalStateException;
    }
  }
  
  public static e p(String paramString)
  {
    Object localObject1 = k;
    label133:
    try
    {
      localObject2 = (e)l.get(B(paramString));
      if (localObject2 != null)
      {
        ((o4.f)h.get()).l();
        return (e)localObject2;
      }
    }
    finally
    {
      break label133;
      List localList = l();
      if (localList.isEmpty())
      {
        localObject2 = "";
      }
      else
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Available app names: ");
        ((StringBuilder)localObject2).append(TextUtils.join(", ", localList));
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      paramString = String.format("FirebaseApp with name %s doesn't exist. %s", new Object[] { paramString, localObject2 });
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(paramString);
      throw ((Throwable)localObject2);
    }
  }
  
  public static e u(Context paramContext)
  {
    m localm;
    synchronized (k)
    {
      if (l.containsKey("[DEFAULT]"))
      {
        paramContext = o();
        return paramContext;
      }
    }
  }
  
  public static e v(Context paramContext, m paramm)
  {
    return w(paramContext, paramm, "[DEFAULT]");
  }
  
  public static e w(Context paramContext, m paramm, String paramString)
  {
    b.b(paramContext);
    paramString = B(paramString);
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    synchronized (k)
    {
      Map localMap = l;
      boolean bool = localMap.containsKey(paramString);
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("FirebaseApp name ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" already exists!");
      A2.n.m(bool ^ true, ((StringBuilder)localObject2).toString());
      A2.n.j(paramContext, "Application context cannot be null.");
      localObject2 = new s3/e;
      ((e)localObject2).<init>(paramContext, paramString, paramm);
      localMap.put(paramString, localObject2);
      ((e)localObject2).t();
      return (e)localObject2;
    }
  }
  
  public final void C(boolean paramBoolean)
  {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator localIterator = i.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a(paramBoolean);
    }
  }
  
  public final void D()
  {
    Iterator localIterator = j.iterator();
    while (localIterator.hasNext()) {
      ((f)localIterator.next()).a(b, c);
    }
  }
  
  public void E(boolean paramBoolean)
  {
    i();
    if (e.compareAndSet(paramBoolean ^ true, paramBoolean))
    {
      boolean bool = z2.c.b().d();
      if ((paramBoolean) && (bool)) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        C(paramBoolean);
        break;
        if ((paramBoolean) || (!bool)) {
          break;
        }
      }
    }
  }
  
  public void F(Boolean paramBoolean)
  {
    i();
    ((x4.a)g.get()).e(paramBoolean);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {
      return false;
    }
    return b.equals(((e)paramObject).q());
  }
  
  public void g(a parama)
  {
    i();
    if ((e.get()) && (z2.c.b().d())) {
      parama.a(true);
    }
    i.add(parama);
  }
  
  public void h(f paramf)
  {
    i();
    A2.n.i(paramf);
    j.add(paramf);
  }
  
  public int hashCode()
  {
    return b.hashCode();
  }
  
  public final void i()
  {
    A2.n.m(f.get() ^ true, "FirebaseApp was deleted");
  }
  
  public void j()
  {
    if (!f.compareAndSet(false, true)) {
      return;
    }
    synchronized (k)
    {
      l.remove(b);
      D();
      return;
    }
  }
  
  public Object k(Class paramClass)
  {
    i();
    return d.a(paramClass);
  }
  
  public Context m()
  {
    i();
    return a;
  }
  
  public String q()
  {
    i();
    return b;
  }
  
  public m r()
  {
    i();
    return c;
  }
  
  public String s()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(E2.c.a(q().getBytes(Charset.defaultCharset())));
    localStringBuilder.append("+");
    localStringBuilder.append(E2.c.a(r().c().getBytes(Charset.defaultCharset())));
    return localStringBuilder.toString();
  }
  
  public final void t()
  {
    StringBuilder localStringBuilder;
    if ((r.a(a) ^ true))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
      localStringBuilder.append(q());
      Log.i("FirebaseApp", localStringBuilder.toString());
      c.a(a);
    }
    else
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Device unlocked: initializing all Firebase APIs for app ");
      localStringBuilder.append(q());
      Log.i("FirebaseApp", localStringBuilder.toString());
      d.p(y());
      ((o4.f)h.get()).l();
    }
  }
  
  public String toString()
  {
    return A2.m.c(this).a("name", b).a("options", c).toString();
  }
  
  public boolean x()
  {
    i();
    return ((x4.a)g.get()).b();
  }
  
  public boolean y()
  {
    return "[DEFAULT]".equals(q());
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  public static class b
    implements c.a
  {
    public static AtomicReference a = new AtomicReference();
    
    public static void c(Context paramContext)
    {
      if ((l.a()) && ((paramContext.getApplicationContext() instanceof Application)))
      {
        paramContext = (Application)paramContext.getApplicationContext();
        if (a.get() == null)
        {
          b localb = new b();
          if (t0.f.a(a, null, localb))
          {
            z2.c.c(paramContext);
            z2.c.b().a(localb);
          }
        }
      }
    }
    
    public void a(boolean paramBoolean)
    {
      synchronized ()
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(e.l.values());
        Iterator localIterator = ((ArrayList)localObject2).iterator();
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject2 = (e)localIterator.next();
        } while (!e.e((e)localObject2).get());
        e.f((e)localObject2, paramBoolean);
      }
    }
  }
  
  public static class c
    extends BroadcastReceiver
  {
    public static AtomicReference b = new AtomicReference();
    public final Context a;
    
    public c(Context paramContext)
    {
      a = paramContext;
    }
    
    public static void b(Context paramContext)
    {
      if (b.get() == null)
      {
        c localc = new c(paramContext);
        if (t0.f.a(b, null, localc)) {
          paramContext.registerReceiver(localc, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
      }
    }
    
    public void c()
    {
      a.unregisterReceiver(this);
    }
    
    public void onReceive(Context arg1, Intent paramIntent)
    {
      synchronized ()
      {
        paramIntent = e.l.values().iterator();
        if (paramIntent.hasNext()) {
          e.d((e)paramIntent.next());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     s3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */