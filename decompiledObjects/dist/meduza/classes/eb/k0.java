package eb;

import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;
import n7.g.a;
import nb.i.g.a;
import x6.b;

public abstract class k0
{
  public static final a.b<Map<String, ?>> b = new a.b("internal:health-checking-config");
  public static final k0.b.b<k> c = new k0.b.b();
  public static final a.b<Boolean> d = new a.b("internal:has-health-check-producer-listener");
  public static final a.b<Boolean> e = new a.b("io.grpc.IS_PETIOLE_POLICY");
  public int a;
  
  static
  {
    new a();
  }
  
  public e1 a(h paramh)
  {
    if ((a.isEmpty()) && (!b()))
    {
      e1 locale1 = e1.n;
      StringBuilder localStringBuilder = f.l("NameResolver returned no usable address. addrs=");
      localStringBuilder.append(a);
      localStringBuilder.append(", attrs=");
      localStringBuilder.append(b);
      paramh = locale1.g(localStringBuilder.toString());
      c(paramh);
      return paramh;
    }
    int i = a;
    a = (i + 1);
    if (i == 0) {
      d(paramh);
    }
    a = 0;
    return e1.e;
  }
  
  public boolean b()
  {
    return false;
  }
  
  public abstract void c(e1 parame1);
  
  public void d(h paramh)
  {
    int i = a;
    a = (i + 1);
    if (i == 0) {
      a(paramh);
    }
    a = 0;
  }
  
  public void e() {}
  
  public abstract void f();
  
  public final class a
    extends k0.j
  {
    public final k0.f a(k0.g paramg)
    {
      return k0.f.e;
    }
    
    public final String toString()
    {
      return "EMPTY_PICKER";
    }
  }
  
  public static final class b
  {
    public final List<u> a;
    public final a b;
    public final Object[][] c;
    
    public b(List paramList, a parama, Object[][] paramArrayOfObject)
    {
      b.y(paramList, "addresses are not set");
      a = paramList;
      b.y(parama, "attrs");
      b = parama;
      b.y(paramArrayOfObject, "customOptions");
      c = paramArrayOfObject;
    }
    
    public final Object a()
    {
      b localb = k0.c;
      for (int i = 0;; i++)
      {
        Object[][] arrayOfObject = c;
        if (i >= arrayOfObject.length) {
          break;
        }
        if (localb.equals(arrayOfObject[i][0])) {
          return c[i][1];
        }
      }
      return null;
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "addrs");
      locala.a(b, "attrs");
      locala.a(Arrays.deepToString(c), "customOptions");
      return locala.toString();
    }
    
    public static final class a
    {
      public List<u> a;
      public a b = a.b;
      public Object[][] c = new Object[0][2];
      
      public final void a(k0.k paramk)
      {
        k0.b.b localb = k0.c;
        Object[][] arrayOfObject1;
        for (int i = 0;; i++)
        {
          arrayOfObject1 = c;
          if (i >= arrayOfObject1.length) {
            break;
          }
          if (localb.equals(arrayOfObject1[i][0])) {
            break label43;
          }
        }
        i = -1;
        label43:
        int j = i;
        if (i == -1)
        {
          arrayOfObject1 = new Object[c.length + 1][2];
          Object[][] arrayOfObject2 = c;
          System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
          c = arrayOfObject1;
          j = arrayOfObject1.length - 1;
        }
        c[j] = { localb, paramk };
      }
      
      public final void b(List paramList)
      {
        b.s("addrs is empty", paramList.isEmpty() ^ true);
        a = Collections.unmodifiableList(new ArrayList(paramList));
      }
    }
    
    public static final class b<T>
    {
      public final String a = "internal:health-check-consumer-listener";
      
      public final String toString()
      {
        return a;
      }
    }
  }
  
  public static abstract class c
  {
    public abstract k0 a(k0.e parame);
  }
  
  public static final class d
    extends k0.j
  {
    public final k0.f a;
    
    public d(k0.f paramf)
    {
      b.y(paramf, "result");
      a = paramf;
    }
    
    public final k0.f a(k0.g paramg)
    {
      return a;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("FixedResultPicker(");
      localStringBuilder.append(a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class e
  {
    public abstract k0.i a(k0.b paramb);
    
    public abstract d b();
    
    public abstract ScheduledExecutorService c();
    
    public abstract h1 d();
    
    public abstract void e();
    
    public abstract void f(n paramn, k0.j paramj);
  }
  
  public static final class f
  {
    public static final f e = new f(null, null, e1.e, false);
    public final k0.i a;
    public final h.a b;
    public final e1 c;
    public final boolean d;
    
    public f(k0.i parami, i.g.a parama, e1 parame1, boolean paramBoolean)
    {
      a = parami;
      b = parama;
      b.y(parame1, "status");
      c = parame1;
      d = paramBoolean;
    }
    
    public static f a(e1 parame1)
    {
      b.s("error status shouldn't be OK", parame1.e() ^ true);
      return new f(null, null, parame1, false);
    }
    
    public static f b(k0.i parami, i.g.a parama)
    {
      b.y(parami, "subchannel");
      return new f(parami, parama, e1.e, false);
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof f;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (f)paramObject;
      bool1 = bool2;
      if (b.Q(a, a))
      {
        bool1 = bool2;
        if (b.Q(c, c))
        {
          bool1 = bool2;
          if (b.Q(b, b))
          {
            bool1 = bool2;
            if (d == d) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, c, b, Boolean.valueOf(d) });
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "subchannel");
      locala.a(b, "streamTracerFactory");
      locala.a(c, "status");
      locala.c("drop", d);
      return locala.toString();
    }
  }
  
  public static abstract class g {}
  
  public static final class h
  {
    public final List<u> a;
    public final a b;
    public final Object c;
    
    public h() {}
    
    public h(List paramList, a parama, Object paramObject)
    {
      b.y(paramList, "addresses");
      a = Collections.unmodifiableList(new ArrayList(paramList));
      b.y(parama, "attributes");
      b = parama;
      c = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof h;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (h)paramObject;
      bool1 = bool2;
      if (b.Q(a, a))
      {
        bool1 = bool2;
        if (b.Q(b, b))
        {
          bool1 = bool2;
          if (b.Q(c, c)) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b, c });
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "addresses");
      locala.a(b, "attributes");
      locala.a(c, "loadBalancingPolicyConfig");
      return locala.toString();
    }
  }
  
  public static abstract class i
  {
    public final u a()
    {
      List localList = b();
      boolean bool = true;
      if ((localList == null) || (localList.size() != 1)) {
        bool = false;
      }
      b.G(localList, "%s does not have exactly one group", bool);
      return (u)localList.get(0);
    }
    
    public abstract List<u> b();
    
    public abstract a c();
    
    public abstract d d();
    
    public abstract Object e();
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void h(k0.k paramk);
    
    public abstract void i(List<u> paramList);
  }
  
  public static abstract class j
  {
    public abstract k0.f a(k0.g paramg);
  }
  
  public static abstract interface k
  {
    public abstract void a(o paramo);
  }
}

/* Location:
 * Qualified Name:     eb.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */