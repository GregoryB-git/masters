package m8;

import a0.j;
import f;

public final class s
  extends f0.e.d.a.b.d.a
{
  public final long a;
  public final String b;
  public final String c;
  public final long d;
  public final int e;
  
  public s(long paramLong1, String paramString1, String paramString2, long paramLong2, int paramInt)
  {
    a = paramLong1;
    b = paramString1;
    c = paramString2;
    d = paramLong2;
    e = paramInt;
  }
  
  public final String a()
  {
    return c;
  }
  
  public final int b()
  {
    return e;
  }
  
  public final long c()
  {
    return d;
  }
  
  public final long d()
  {
    return a;
  }
  
  public final String e()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b.d.a))
    {
      paramObject = (f0.e.d.a.b.d.a)paramObject;
      if ((a == ((f0.e.d.a.b.d.a)paramObject).d()) && (b.equals(((f0.e.d.a.b.d.a)paramObject).e())))
      {
        String str = c;
        if ((str == null ? ((f0.e.d.a.b.d.a)paramObject).a() == null : str.equals(((f0.e.d.a.b.d.a)paramObject).a())) && (d == ((f0.e.d.a.b.d.a)paramObject).c()) && (e == ((f0.e.d.a.b.d.a)paramObject).b())) {}
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
    int j = b.hashCode();
    String str = c;
    int k;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    }
    l = d;
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l >>> 32 ^ l)) * 1000003 ^ e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Frame{pc=");
    localStringBuilder.append(a);
    localStringBuilder.append(", symbol=");
    localStringBuilder.append(b);
    localStringBuilder.append(", file=");
    localStringBuilder.append(c);
    localStringBuilder.append(", offset=");
    localStringBuilder.append(d);
    localStringBuilder.append(", importance=");
    return j.m(localStringBuilder, e, "}");
  }
  
  public static final class a
    extends f0.e.d.a.b.d.a.a
  {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;
    
    public final s a()
    {
      if (f == 7)
      {
        localObject = b;
        if (localObject != null) {
          return new s(a, (String)localObject, c, d, e);
        }
      }
      Object localObject = new StringBuilder();
      if ((f & 0x1) == 0) {
        ((StringBuilder)localObject).append(" pc");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" symbol");
      }
      if ((f & 0x2) == 0) {
        ((StringBuilder)localObject).append(" offset");
      }
      if ((f & 0x4) == 0) {
        ((StringBuilder)localObject).append(" importance");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */