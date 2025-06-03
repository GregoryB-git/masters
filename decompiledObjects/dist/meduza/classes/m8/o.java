package m8;

import f;
import g;

public final class o
  extends f0.e.d.a.b.a
{
  public final long a;
  public final long b;
  public final String c;
  public final String d;
  
  public o(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramString1;
    d = paramString2;
  }
  
  public final long a()
  {
    return a;
  }
  
  public final String b()
  {
    return c;
  }
  
  public final long c()
  {
    return b;
  }
  
  public final String d()
  {
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b.a))
    {
      Object localObject = (f0.e.d.a.b.a)paramObject;
      if ((a == ((f0.e.d.a.b.a)localObject).a()) && (b == ((f0.e.d.a.b.a)localObject).c()) && (c.equals(((f0.e.d.a.b.a)localObject).b())))
      {
        paramObject = d;
        localObject = ((f0.e.d.a.b.a)localObject).d();
        if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    l = b;
    int j = (int)(l >>> 32 ^ l);
    int k = c.hashCode();
    String str = d;
    int m;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    return (((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BinaryImage{baseAddress=");
    localStringBuilder.append(a);
    localStringBuilder.append(", size=");
    localStringBuilder.append(b);
    localStringBuilder.append(", name=");
    localStringBuilder.append(c);
    localStringBuilder.append(", uuid=");
    return g.f(localStringBuilder, d, "}");
  }
}

/* Location:
 * Qualified Name:     m8.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */