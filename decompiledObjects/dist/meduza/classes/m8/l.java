package m8;

import a0.j;
import f;

public final class l
  extends f0.e.d
{
  public final long a;
  public final String b;
  public final f0.e.d.a c;
  public final f0.e.d.c d;
  public final f0.e.d.d e;
  public final f0.e.d.f f;
  
  public l(long paramLong, String paramString, f0.e.d.a parama, f0.e.d.c paramc, f0.e.d.d paramd, f0.e.d.f paramf)
  {
    a = paramLong;
    b = paramString;
    c = parama;
    d = paramc;
    e = paramd;
    f = paramf;
  }
  
  public final f0.e.d.a a()
  {
    return c;
  }
  
  public final f0.e.d.c b()
  {
    return d;
  }
  
  public final f0.e.d.d c()
  {
    return e;
  }
  
  public final f0.e.d.f d()
  {
    return f;
  }
  
  public final long e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d))
    {
      paramObject = (f0.e.d)paramObject;
      if ((a == ((f0.e.d)paramObject).e()) && (b.equals(((f0.e.d)paramObject).f())) && (c.equals(((f0.e.d)paramObject).a())) && (d.equals(((f0.e.d)paramObject).b())))
      {
        Object localObject = e;
        if (localObject == null ? ((f0.e.d)paramObject).c() == null : localObject.equals(((f0.e.d)paramObject).c()))
        {
          localObject = f;
          paramObject = ((f0.e.d)paramObject).d();
          if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {
            break label139;
          }
        }
      }
      bool = false;
      label139:
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return b;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    int j = b.hashCode();
    int k = c.hashCode();
    int m = d.hashCode();
    Object localObject = e;
    int n = 0;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = localObject.hashCode();
    }
    localObject = f;
    if (localObject != null) {
      n = localObject.hashCode();
    }
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ i1) * 1000003 ^ n;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Event{timestamp=");
    localStringBuilder.append(a);
    localStringBuilder.append(", type=");
    localStringBuilder.append(b);
    localStringBuilder.append(", app=");
    localStringBuilder.append(c);
    localStringBuilder.append(", device=");
    localStringBuilder.append(d);
    localStringBuilder.append(", log=");
    localStringBuilder.append(e);
    localStringBuilder.append(", rollouts=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.e.d.b
  {
    public long a;
    public String b;
    public f0.e.d.a c;
    public f0.e.d.c d;
    public f0.e.d.d e;
    public f0.e.d.f f;
    public byte g;
    
    public a() {}
    
    public a(f0.e.d paramd)
    {
      a = paramd.e();
      b = paramd.f();
      c = paramd.a();
      d = paramd.b();
      e = paramd.c();
      f = paramd.d();
      g = ((byte)1);
    }
    
    public final l a()
    {
      if (g == 1)
      {
        localObject = b;
        if (localObject != null)
        {
          f0.e.d.a locala = c;
          if (locala != null)
          {
            f0.e.d.c localc = d;
            if (localc != null) {
              return new l(a, (String)localObject, locala, localc, e, f);
            }
          }
        }
      }
      Object localObject = new StringBuilder();
      if ((0x1 & g) == 0) {
        ((StringBuilder)localObject).append(" timestamp");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" type");
      }
      if (c == null) {
        ((StringBuilder)localObject).append(" app");
      }
      if (d == null) {
        ((StringBuilder)localObject).append(" device");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */