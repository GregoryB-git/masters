package p1;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import ec.i;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q1.a;
import sb.s;
import sb.t;
import sb.u;
import t1.c.c;

public abstract class j
{
  public volatile t1.b a;
  public Executor b;
  public q c;
  public t1.c d;
  public final e e = d();
  public boolean f;
  public List<? extends b> g;
  public LinkedHashMap h = new LinkedHashMap();
  public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
  public final ThreadLocal<Integer> j = new ThreadLocal();
  public final Map<String, Object> k;
  public final LinkedHashMap l;
  
  public j()
  {
    Map localMap = Collections.synchronizedMap(new LinkedHashMap());
    i.d(localMap, "synchronizedMap(mutableMapOf())");
    k = localMap;
    l = new LinkedHashMap();
  }
  
  public static Object o(Class paramClass, t1.c paramc)
  {
    if (paramClass.isInstance(paramc)) {
      return paramc;
    }
    if ((paramc instanceof c)) {
      paramClass = o(paramClass, ((c)paramc).f());
    } else {
      paramClass = null;
    }
    return paramClass;
  }
  
  public final void a()
  {
    if (f) {
      return;
    }
    int m;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      m = 1;
    } else {
      m = 0;
    }
    if ((m ^ 0x1) != 0) {
      return;
    }
    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
  }
  
  public final void b()
  {
    int m;
    if ((!g().getWritableDatabase().j0()) && (j.get() != null)) {
      m = 0;
    } else {
      m = 1;
    }
    if (m != 0) {
      return;
    }
    throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
  }
  
  public final void c()
  {
    a();
    a();
    t1.b localb = g().getWritableDatabase();
    e.g(localb);
    if (localb.n0()) {
      localb.J();
    } else {
      localb.h();
    }
  }
  
  public abstract e d();
  
  public abstract t1.c e(b paramb);
  
  public List f(LinkedHashMap paramLinkedHashMap)
  {
    i.e(paramLinkedHashMap, "autoMigrationSpecs");
    return s.a;
  }
  
  public final t1.c g()
  {
    t1.c localc = d;
    if (localc != null) {
      return localc;
    }
    i.i("internalOpenHelper");
    throw null;
  }
  
  public Set<Class<? extends a>> h()
  {
    return u.a;
  }
  
  public Map<Class<?>, List<Class<?>>> i()
  {
    return t.a;
  }
  
  public final void j()
  {
    g().getWritableDatabase().X();
    if (!g().getWritableDatabase().j0())
    {
      e locale = e;
      if (f.compareAndSet(false, true))
      {
        Executor localExecutor = a.b;
        if (localExecutor != null)
        {
          localExecutor.execute(n);
        }
        else
        {
          i.i("internalQueryExecutor");
          throw null;
        }
      }
    }
  }
  
  public final boolean k()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = Boolean.valueOf(((t1.b)localObject).isOpen());
    } else {
      localObject = null;
    }
    return i.a(localObject, Boolean.TRUE);
  }
  
  public final Cursor l(t1.e parame, CancellationSignal paramCancellationSignal)
  {
    i.e(parame, "query");
    a();
    b();
    if (paramCancellationSignal != null) {
      parame = g().getWritableDatabase().V(parame, paramCancellationSignal);
    } else {
      parame = g().getWritableDatabase().y(parame);
    }
    return parame;
  }
  
  public final <V> V m(Callable<V> paramCallable)
  {
    c();
    try
    {
      paramCallable = paramCallable.call();
      n();
      return paramCallable;
    }
    finally
    {
      j();
    }
  }
  
  public final void n()
  {
    g().getWritableDatabase().G();
  }
  
  public static final class a<T extends j>
  {
    public final Context a;
    public final Class<T> b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public Executor g;
    public Executor h;
    public c.c i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public long n;
    public final j.c o;
    public LinkedHashSet p;
    public HashSet q;
    
    public a(Context paramContext, String paramString)
    {
      a = paramContext;
      b = WorkDatabase.class;
      c = paramString;
      d = new ArrayList();
      e = new ArrayList();
      f = new ArrayList();
      k = 1;
      l = true;
      n = -1L;
      o = new j.c();
      p = new LinkedHashSet();
    }
    
    public final void a(q1.b... paramVarArgs)
    {
      if (q == null) {
        q = new HashSet();
      }
      int i1 = 0;
      int i2 = paramVarArgs.length;
      while (i1 < i2)
      {
        q1.b localb = paramVarArgs[i1];
        HashSet localHashSet = q;
        i.b(localHashSet);
        localHashSet.add(Integer.valueOf(a));
        localHashSet = q;
        i.b(localHashSet);
        localHashSet.add(Integer.valueOf(b));
        i1++;
      }
      o.a((q1.b[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    }
  }
  
  public static abstract class b
  {
    public void a(u1.c paramc) {}
  }
  
  public static final class c
  {
    public final LinkedHashMap a = new LinkedHashMap();
    
    public final void a(q1.b... paramVarArgs)
    {
      i.e(paramVarArgs, "migrations");
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++)
      {
        q1.b localb = paramVarArgs[j];
        int k = a;
        int m = b;
        LinkedHashMap localLinkedHashMap = a;
        Integer localInteger = Integer.valueOf(k);
        Object localObject1 = localLinkedHashMap.get(localInteger);
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = new TreeMap();
          localLinkedHashMap.put(localInteger, localObject2);
        }
        localObject1 = (TreeMap)localObject2;
        if (((Map)localObject1).containsKey(Integer.valueOf(m)))
        {
          localObject2 = f.l("Overriding migration ");
          ((StringBuilder)localObject2).append(((TreeMap)localObject1).get(Integer.valueOf(m)));
          ((StringBuilder)localObject2).append(" with ");
          ((StringBuilder)localObject2).append(localb);
          Log.w("ROOM", ((StringBuilder)localObject2).toString());
        }
        ((Map)localObject1).put(Integer.valueOf(m), localb);
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     p1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */