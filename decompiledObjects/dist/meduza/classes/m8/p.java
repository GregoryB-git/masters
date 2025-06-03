package m8;

import a0.j;
import f;
import java.util.List;

public final class p
  extends f0.e.d.a.b.b
{
  public final String a;
  public final String b;
  public final List<f0.e.d.a.b.d.a> c;
  public final f0.e.d.a.b.b d;
  public final int e;
  
  public p() {}
  
  public p(String paramString1, String paramString2, List paramList, f0.e.d.a.b.b paramb, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramList;
    d = paramb;
    e = paramInt;
  }
  
  public final f0.e.d.a.b.b a()
  {
    return d;
  }
  
  public final List<f0.e.d.a.b.d.a> b()
  {
    return c;
  }
  
  public final int c()
  {
    return e;
  }
  
  public final String d()
  {
    return b;
  }
  
  public final String e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b.b))
    {
      paramObject = (f0.e.d.a.b.b)paramObject;
      if (a.equals(((f0.e.d.a.b.b)paramObject).e()))
      {
        Object localObject = b;
        if ((localObject == null ? ((f0.e.d.a.b.b)paramObject).d() == null : ((String)localObject).equals(((f0.e.d.a.b.b)paramObject).d())) && (c.equals(((f0.e.d.a.b.b)paramObject).b())))
        {
          localObject = d;
          if ((localObject == null ? ((f0.e.d.a.b.b)paramObject).a() == null : localObject.equals(((f0.e.d.a.b.b)paramObject).a())) && (e == ((f0.e.d.a.b.b)paramObject).c())) {
            break label127;
          }
        }
      }
      bool = false;
      label127:
      return bool;
    }
    return false;
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
      k = ((String)localObject).hashCode();
    }
    int m = c.hashCode();
    localObject = d;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ j) * 1000003 ^ e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Exception{type=");
    localStringBuilder.append(a);
    localStringBuilder.append(", reason=");
    localStringBuilder.append(b);
    localStringBuilder.append(", frames=");
    localStringBuilder.append(c);
    localStringBuilder.append(", causedBy=");
    localStringBuilder.append(d);
    localStringBuilder.append(", overflowCount=");
    return j.m(localStringBuilder, e, "}");
  }
}

/* Location:
 * Qualified Name:     m8.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */