package m8;

import f;
import java.util.List;

public final class n
  extends f0.e.d.a.b
{
  public final List<f0.e.d.a.b.d> a;
  public final f0.e.d.a.b.b b;
  public final f0.a c;
  public final f0.e.d.a.b.c d;
  public final List<f0.e.d.a.b.a> e;
  
  public n() {}
  
  public n(List paramList1, f0.e.d.a.b.b paramb, f0.a parama, f0.e.d.a.b.c paramc, List paramList2)
  {
    a = paramList1;
    b = paramb;
    c = parama;
    d = paramc;
    e = paramList2;
  }
  
  public final f0.a a()
  {
    return c;
  }
  
  public final List<f0.e.d.a.b.a> b()
  {
    return e;
  }
  
  public final f0.e.d.a.b.b c()
  {
    return b;
  }
  
  public final f0.e.d.a.b.c d()
  {
    return d;
  }
  
  public final List<f0.e.d.a.b.d> e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b))
    {
      paramObject = (f0.e.d.a.b)paramObject;
      Object localObject = a;
      if (localObject == null ? ((f0.e.d.a.b)paramObject).e() == null : ((List)localObject).equals(((f0.e.d.a.b)paramObject).e()))
      {
        localObject = b;
        if (localObject == null ? ((f0.e.d.a.b)paramObject).c() == null : localObject.equals(((f0.e.d.a.b)paramObject).c()))
        {
          localObject = c;
          if ((localObject == null ? ((f0.e.d.a.b)paramObject).a() == null : localObject.equals(((f0.e.d.a.b)paramObject).a())) && (d.equals(((f0.e.d.a.b)paramObject).d())) && (e.equals(((f0.e.d.a.b)paramObject).b()))) {
            break label148;
          }
        }
      }
      bool = false;
      label148:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((List)localObject).hashCode();
    }
    localObject = b;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = localObject.hashCode();
    }
    localObject = c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i) * 1000003 ^ d.hashCode()) * 1000003 ^ e.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Execution{threads=");
    localStringBuilder.append(a);
    localStringBuilder.append(", exception=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appExitInfo=");
    localStringBuilder.append(c);
    localStringBuilder.append(", signal=");
    localStringBuilder.append(d);
    localStringBuilder.append(", binaries=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */