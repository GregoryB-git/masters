package u4;

public final class a
  extends d
{
  public final String b;
  public final c.a c;
  public final String d;
  public final String e;
  public final long f;
  public final long g;
  public final String h;
  
  public a(String paramString1, c.a parama, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4)
  {
    b = paramString1;
    c = parama;
    d = paramString2;
    e = paramString3;
    f = paramLong1;
    g = paramLong2;
    h = paramString4;
  }
  
  public String b()
  {
    return d;
  }
  
  public long c()
  {
    return f;
  }
  
  public String d()
  {
    return b;
  }
  
  public String e()
  {
    return h;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      String str = b;
      if ((str == null ? ((d)paramObject).d() == null : str.equals(((d)paramObject).d())) && (c.equals(((d)paramObject).g())))
      {
        str = d;
        if (str == null ? ((d)paramObject).b() == null : str.equals(((d)paramObject).b()))
        {
          str = e;
          if ((str == null ? ((d)paramObject).f() == null : str.equals(((d)paramObject).f())) && (f == ((d)paramObject).c()) && (g == ((d)paramObject).h()))
          {
            str = h;
            paramObject = ((d)paramObject).e();
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
  
  public String f()
  {
    return e;
  }
  
  public c.a g()
  {
    return c;
  }
  
  public long h()
  {
    return g;
  }
  
  public int hashCode()
  {
    String str = b;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    int k = c.hashCode();
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
  
  public d.a n()
  {
    return new b(this, null);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PersistedInstallationEntry{firebaseInstallationId=");
    localStringBuilder.append(b);
    localStringBuilder.append(", registrationStatus=");
    localStringBuilder.append(c);
    localStringBuilder.append(", authToken=");
    localStringBuilder.append(d);
    localStringBuilder.append(", refreshToken=");
    localStringBuilder.append(e);
    localStringBuilder.append(", expiresInSecs=");
    localStringBuilder.append(f);
    localStringBuilder.append(", tokenCreationEpochInSecs=");
    localStringBuilder.append(g);
    localStringBuilder.append(", fisError=");
    localStringBuilder.append(h);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends d.a
  {
    public String a;
    public c.a b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;
    
    public b() {}
    
    public b(d paramd)
    {
      a = paramd.d();
      b = paramd.g();
      c = paramd.b();
      d = paramd.f();
      e = Long.valueOf(paramd.c());
      f = Long.valueOf(paramd.h());
      g = paramd.e();
    }
    
    public d a()
    {
      Object localObject1 = b;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" registrationStatus");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" expiresInSecs");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (f == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" tokenCreationEpochInSecs");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new a(a, b, c, d, e.longValue(), f.longValue(), g, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public d.a b(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public d.a c(long paramLong)
    {
      e = Long.valueOf(paramLong);
      return this;
    }
    
    public d.a d(String paramString)
    {
      a = paramString;
      return this;
    }
    
    public d.a e(String paramString)
    {
      g = paramString;
      return this;
    }
    
    public d.a f(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public d.a g(c.a parama)
    {
      if (parama != null)
      {
        b = parama;
        return this;
      }
      throw new NullPointerException("Null registrationStatus");
    }
    
    public d.a h(long paramLong)
    {
      f = Long.valueOf(paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     u4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */