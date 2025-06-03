package gb;

import eb.c0;
import eb.d1;
import eb.d1.a;
import eb.f;
import eb.m;
import eb.n0;
import eb.o0;
import eb.s;
import eb.w0;
import eb.w0.a;
import hb.e.b;
import hb.e.c;
import hb.e.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class e2
  extends o0<e2>
{
  public static final long A;
  public static final long B;
  public static final j3 C;
  public static final s D;
  public static final m E;
  public static final Method F;
  public static final Logger z = Logger.getLogger(e2.class.getName());
  public j3 a;
  public j3 b;
  public final ArrayList c;
  public w0 d;
  public final ArrayList e;
  public final String f;
  public final eb.b g;
  public String h;
  public s i;
  public m j;
  public long k;
  public int l;
  public int m;
  public long n;
  public long o;
  public boolean p;
  public c0 q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public final b x;
  public final a y;
  
  static
  {
    A = TimeUnit.MINUTES.toMillis(30L);
    B = TimeUnit.SECONDS.toMillis(1L);
    C = new j3(v0.p);
    D = s.d;
    E = m.b;
    try
    {
      Class localClass = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
      Object localObject = Boolean.TYPE;
      localObject = localClass.getDeclaredMethod("getClientInterceptor", new Class[] { localObject, localObject, localObject, localObject });
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    z.log(Level.FINE, "Unable to apply census stats", localClassNotFoundException);
    Method localMethod = null;
    F = localMethod;
  }
  
  public e2(String paramString, e.c paramc, e.b paramb)
  {
    Object localObject1 = C;
    a = ((j3)localObject1);
    b = ((j3)localObject1);
    c = new ArrayList();
    localObject1 = w0.d;
    try
    {
      if (w0.e == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        try
        {
          boolean bool = j0.a;
          ((ArrayList)localObject1).add(j0.class);
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          w0.d.log(Level.FINE, "Unable to find DNS NameResolver", localClassNotFoundException);
        }
        localObject1 = Collections.unmodifiableList((List)localObject1);
        Object localObject2 = eb.v0.class.getClassLoader();
        ??? = new eb/w0$a;
        ((w0.a)???).<init>();
        localObject1 = d1.a(eb.v0.class, (List)localObject1, (ClassLoader)localObject2, (d1.a)???);
        if (((List)localObject1).isEmpty()) {
          w0.d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
        }
        localObject2 = new eb/w0;
        ((w0)localObject2).<init>();
        w0.e = (w0)localObject2;
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (eb.v0)((Iterator)localObject1).next();
          ??? = w0.d;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Service loader found ");
          localStringBuilder.append(localObject2);
          ((Logger)???).fine(localStringBuilder.toString());
          synchronized (w0.e)
          {
            x6.b.s("isAvailable() returned false", ((eb.v0)localObject2).d());
            b.add(localObject2);
          }
        }
        w0.e.a();
      }
      localObject1 = w0.e;
      d = ((w0)localObject1);
      e = new ArrayList();
      h = "pick_first";
      i = D;
      j = E;
      k = A;
      l = 5;
      m = 5;
      n = 16777216L;
      o = 1048576L;
      p = true;
      q = c0.e;
      r = true;
      s = true;
      t = true;
      u = true;
      v = true;
      w = true;
      x6.b.y(paramString, "target");
      f = paramString;
      g = null;
      x = paramc;
      y = paramb;
      return;
    }
    finally {}
  }
  
  public final n0 a()
  {
    e.d locald = x.a();
    k0.a locala = new k0.a();
    j3 localj3 = new j3(v0.p);
    v0.d locald1 = v0.r;
    ArrayList localArrayList = new ArrayList(c);
    boolean bool = s;
    Object localObject1 = null;
    Object localObject3;
    if (bool)
    {
      Object localObject2 = F;
      if (localObject2 != null)
      {
        try
        {
          localObject2 = (f)((Method)localObject2).invoke(null, new Object[] { Boolean.valueOf(t), Boolean.valueOf(u), Boolean.FALSE, Boolean.valueOf(v) });
        }
        catch (InvocationTargetException localInvocationTargetException1) {}catch (IllegalAccessException localIllegalAccessException1) {}
        z.log(Level.FINE, "Unable to apply census stats", localIllegalAccessException1);
      }
      else
      {
        localObject3 = null;
      }
      if (localObject3 != null) {
        localArrayList.add(0, localObject3);
      }
    }
    if (w)
    {
      try
      {
        localObject3 = (f)Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
      }
      catch (InvocationTargetException localInvocationTargetException2) {}catch (IllegalAccessException localIllegalAccessException2) {}catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
      z.log(Level.FINE, "Unable to apply census stats", localClassNotFoundException);
      Object localObject4 = localObject1;
      if (localObject4 != null) {
        localArrayList.add(0, localObject4);
      }
    }
    return new f2(new r1(this, locald, locala, localj3, locald1, localArrayList));
  }
  
  public static abstract interface a
  {
    public abstract int a();
  }
  
  public static abstract interface b
  {
    public abstract e.d a();
  }
}

/* Location:
 * Qualified Name:     gb.e2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */