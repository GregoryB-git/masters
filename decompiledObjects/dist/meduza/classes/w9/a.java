package w9;

import f;

public final class a
  extends d
{
  public final String b;
  public final int c;
  public final String d;
  public final String e;
  public final long f;
  public final long g;
  public final String h;
  
  public a(String paramString1, int paramInt, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4)
  {
    b = paramString1;
    c = paramInt;
    d = paramString2;
    e = paramString3;
    f = paramLong1;
    g = paramLong2;
    h = paramString4;
  }
  
  public final String a()
  {
    return d;
  }
  
  public final long b()
  {
    return f;
  }
  
  public final String c()
  {
    return b;
  }
  
  public final String d()
  {
    return h;
  }
  
  public final String e()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      String str = b;
      if ((str == null ? ((d)paramObject).c() == null : str.equals(((d)paramObject).c())) && (q0.g.b(c, ((d)paramObject).f())))
      {
        str = d;
        if (str == null ? ((d)paramObject).a() == null : str.equals(((d)paramObject).a()))
        {
          str = e;
          if ((str == null ? ((d)paramObject).e() == null : str.equals(((d)paramObject).e())) && (f == ((d)paramObject).b()) && (g == ((d)paramObject).g()))
          {
            str = h;
            paramObject = ((d)paramObject).d();
            if (str == null ? paramObject == null : str.equals(paramObject)) {
              break label183;
            }
          }
        }
      }
      bool = false;
      label183:
      return bool;
    }
    return false;
  }
  
  public final int f()
  {
    return c;
  }
  
  public final long g()
  {
    return g;
  }
  
  public final a h()
  {
    return new a(this);
  }
  
  public final int hashCode()
  {
    String str = b;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    int k = q0.g.c(c);
    str = d;
    int m;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    str = e;
    int n;
    if (str == null) {
      n = 0;
    } else {
      n = str.hashCode();
    }
    long l = f;
    int i1 = (int)(l ^ l >>> 32);
    l = g;
    int i2 = (int)(l ^ l >>> 32);
    str = h;
    if (str != null) {
      i = str.hashCode();
    }
    return ((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PersistedInstallationEntry{firebaseInstallationId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", registrationStatus=");
    localStringBuilder.append(f.u(c));
    localStringBuilder.append(", authToken=");
    localStringBuilder.append(d);
    localStringBuilder.append(", refreshToken=");
    localStringBuilder.append(e);
    localStringBuilder.append(", expiresInSecs=");
    localStringBuilder.append(f);
    localStringBuilder.append(", tokenCreationEpochInSecs=");
    localStringBuilder.append(g);
    localStringBuilder.append(", fisError=");
    return g.f(localStringBuilder, h, "}");
  }
  
  public static final class a
    extends d.a
  {
    public String a;
    public int b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;
    
    public a() {}
    
    public a(d paramd)
    {
      a = paramd.c();
      b = paramd.f();
      c = paramd.a();
      d = paramd.e();
      e = Long.valueOf(paramd.b());
      f = Long.valueOf(paramd.g());
      g = paramd.d();
    }
    
    public final a a()
    {
      if (b == 0) {
        localObject1 = " registrationStatus";
      } else {
        localObject1 = "";
      }
      Object localObject2 = localObject1;
      if (e == null) {
        localObject2 = g.d((String)localObject1, " expiresInSecs");
      }
      Object localObject1 = localObject2;
      if (f == null) {
        localObject1 = g.d((String)localObject2, " tokenCreationEpochInSecs");
      }
      if (((String)localObject1).isEmpty()) {
        return new a(a, b, c, d, e.longValue(), f.longValue(), g);
      }
      throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
    }
    
    public final a b(int paramInt)
    {
      if (paramInt != 0)
      {
        b = paramInt;
        return this;
      }
      throw new NullPointerException("Null registrationStatus");
    }
  }
}

/* Location:
 * Qualified Name:     w9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */