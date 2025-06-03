package m8;

import a0.j;
import f;
import java.util.List;

public final class m
  extends f0.e.d.a
{
  public final f0.e.d.a.b a;
  public final List<f0.c> b;
  public final List<f0.c> c;
  public final Boolean d;
  public final f0.e.d.a.c e;
  public final List<f0.e.d.a.c> f;
  public final int g;
  
  public m() {}
  
  public m(f0.e.d.a.b paramb, List paramList1, List paramList2, Boolean paramBoolean, f0.e.d.a.c paramc, List paramList3, int paramInt)
  {
    a = paramb;
    b = paramList1;
    c = paramList2;
    d = paramBoolean;
    e = paramc;
    f = paramList3;
    g = paramInt;
  }
  
  public final List<f0.e.d.a.c> a()
  {
    return f;
  }
  
  public final Boolean b()
  {
    return d;
  }
  
  public final f0.e.d.a.c c()
  {
    return e;
  }
  
  public final List<f0.c> d()
  {
    return b;
  }
  
  public final f0.e.d.a.b e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a))
    {
      paramObject = (f0.e.d.a)paramObject;
      if (a.equals(((f0.e.d.a)paramObject).e()))
      {
        Object localObject = b;
        if (localObject == null ? ((f0.e.d.a)paramObject).d() == null : ((List)localObject).equals(((f0.e.d.a)paramObject).d()))
        {
          localObject = c;
          if (localObject == null ? ((f0.e.d.a)paramObject).f() == null : ((List)localObject).equals(((f0.e.d.a)paramObject).f()))
          {
            localObject = d;
            if (localObject == null ? ((f0.e.d.a)paramObject).b() == null : ((Boolean)localObject).equals(((f0.e.d.a)paramObject).b()))
            {
              localObject = e;
              if (localObject == null ? ((f0.e.d.a)paramObject).c() == null : localObject.equals(((f0.e.d.a)paramObject).c()))
              {
                localObject = f;
                if ((localObject == null ? ((f0.e.d.a)paramObject).a() == null : ((List)localObject).equals(((f0.e.d.a)paramObject).a())) && (g == ((f0.e.d.a)paramObject).g())) {
                  break label207;
                }
              }
            }
          }
        }
      }
      bool = false;
      label207:
      return bool;
    }
    return false;
  }
  
  public final List<f0.c> f()
  {
    return c;
  }
  
  public final int g()
  {
    return g;
  }
  
  public final a h()
  {
    return new a(this);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    Object localObject = b;
    int j = 0;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((List)localObject).hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((List)localObject).hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((Boolean)localObject).hashCode();
    }
    localObject = e;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = localObject.hashCode();
    }
    localObject = f;
    if (localObject != null) {
      j = ((List)localObject).hashCode();
    }
    return ((((((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ j) * 1000003 ^ g;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Application{execution=");
    localStringBuilder.append(a);
    localStringBuilder.append(", customAttributes=");
    localStringBuilder.append(b);
    localStringBuilder.append(", internalKeys=");
    localStringBuilder.append(c);
    localStringBuilder.append(", background=");
    localStringBuilder.append(d);
    localStringBuilder.append(", currentProcessDetails=");
    localStringBuilder.append(e);
    localStringBuilder.append(", appProcessDetails=");
    localStringBuilder.append(f);
    localStringBuilder.append(", uiOrientation=");
    return j.m(localStringBuilder, g, "}");
  }
  
  public static final class a
    extends f0.e.d.a.a
  {
    public f0.e.d.a.b a;
    public List<f0.c> b;
    public List<f0.c> c;
    public Boolean d;
    public f0.e.d.a.c e;
    public List<f0.e.d.a.c> f;
    public int g;
    public byte h;
    
    public a(f0.e.d.a parama)
    {
      a = parama.e();
      b = parama.d();
      c = parama.f();
      d = parama.b();
      e = parama.c();
      f = parama.a();
      g = parama.g();
      h = ((byte)1);
    }
    
    public final m a()
    {
      if (h == 1)
      {
        localObject = a;
        if (localObject != null) {
          return new m((f0.e.d.a.b)localObject, b, c, d, e, f, g);
        }
      }
      Object localObject = new StringBuilder();
      if (a == null) {
        ((StringBuilder)localObject).append(" execution");
      }
      if ((0x1 & h) == 0) {
        ((StringBuilder)localObject).append(" uiOrientation");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */