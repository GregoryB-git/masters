package J3;

public final class b
  extends B
{
  public final String b;
  public final String c;
  public final int d;
  public final String e;
  public final String f;
  public final String g;
  public final String h;
  public final String i;
  public final B.e j;
  public final B.d k;
  public final B.a l;
  
  public b(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, B.e parame, B.d paramd, B.a parama)
  {
    b = paramString1;
    c = paramString2;
    d = paramInt;
    e = paramString3;
    f = paramString4;
    g = paramString5;
    h = paramString6;
    i = paramString7;
    j = parame;
    k = paramd;
    l = parama;
  }
  
  public B.a c()
  {
    return l;
  }
  
  public String d()
  {
    return g;
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
    if ((paramObject instanceof B))
    {
      paramObject = (B)paramObject;
      if ((b.equals(((B)paramObject).l())) && (c.equals(((B)paramObject).h())) && (d == ((B)paramObject).k()) && (e.equals(((B)paramObject).i())))
      {
        Object localObject = f;
        if (localObject == null ? ((B)paramObject).g() == null : ((String)localObject).equals(((B)paramObject).g()))
        {
          localObject = g;
          if ((localObject == null ? ((B)paramObject).d() == null : ((String)localObject).equals(((B)paramObject).d())) && (h.equals(((B)paramObject).e())) && (i.equals(((B)paramObject).f())))
          {
            localObject = j;
            if (localObject == null ? ((B)paramObject).m() == null : localObject.equals(((B)paramObject).m()))
            {
              localObject = k;
              if (localObject == null ? ((B)paramObject).j() == null : localObject.equals(((B)paramObject).j()))
              {
                localObject = l;
                paramObject = ((B)paramObject).c();
                if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {
                  break label256;
                }
              }
            }
          }
        }
      }
      bool = false;
      label256:
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return i;
  }
  
  public String g()
  {
    return f;
  }
  
  public String h()
  {
    return c;
  }
  
  public int hashCode()
  {
    int m = b.hashCode();
    int n = c.hashCode();
    int i1 = d;
    int i2 = e.hashCode();
    Object localObject = f;
    int i3 = 0;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((String)localObject).hashCode();
    }
    localObject = g;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    int i6 = h.hashCode();
    int i7 = i.hashCode();
    localObject = j;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = localObject.hashCode();
    }
    localObject = k;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = localObject.hashCode();
    }
    localObject = l;
    if (localObject != null) {
      i3 = localObject.hashCode();
    }
    return ((((((((((m ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i3;
  }
  
  public String i()
  {
    return e;
  }
  
  public B.d j()
  {
    return k;
  }
  
  public int k()
  {
    return d;
  }
  
  public String l()
  {
    return b;
  }
  
  public B.e m()
  {
    return j;
  }
  
  public B.b n()
  {
    return new b(this, null);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CrashlyticsReport{sdkVersion=");
    localStringBuilder.append(b);
    localStringBuilder.append(", gmpAppId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", platform=");
    localStringBuilder.append(d);
    localStringBuilder.append(", installationUuid=");
    localStringBuilder.append(e);
    localStringBuilder.append(", firebaseInstallationId=");
    localStringBuilder.append(f);
    localStringBuilder.append(", appQualitySessionId=");
    localStringBuilder.append(g);
    localStringBuilder.append(", buildVersion=");
    localStringBuilder.append(h);
    localStringBuilder.append(", displayVersion=");
    localStringBuilder.append(i);
    localStringBuilder.append(", session=");
    localStringBuilder.append(j);
    localStringBuilder.append(", ndkPayload=");
    localStringBuilder.append(k);
    localStringBuilder.append(", appExitInfo=");
    localStringBuilder.append(l);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.b
  {
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public B.e i;
    public B.d j;
    public B.a k;
    
    public b() {}
    
    public b(B paramB)
    {
      a = paramB.l();
      b = paramB.h();
      c = Integer.valueOf(paramB.k());
      d = paramB.i();
      e = paramB.g();
      f = paramB.d();
      g = paramB.e();
      h = paramB.f();
      i = paramB.m();
      j = paramB.j();
      k = paramB.c();
    }
    
    public B a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" sdkVersion");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" gmpAppId");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" platform");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" installationUuid");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (g == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" buildVersion");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (h == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" displayVersion");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new b(a, b, c.intValue(), d, e, f, g, h, i, j, k, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.b b(B.a parama)
    {
      k = parama;
      return this;
    }
    
    public B.b c(String paramString)
    {
      f = paramString;
      return this;
    }
    
    public B.b d(String paramString)
    {
      if (paramString != null)
      {
        g = paramString;
        return this;
      }
      throw new NullPointerException("Null buildVersion");
    }
    
    public B.b e(String paramString)
    {
      if (paramString != null)
      {
        h = paramString;
        return this;
      }
      throw new NullPointerException("Null displayVersion");
    }
    
    public B.b f(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public B.b g(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null gmpAppId");
    }
    
    public B.b h(String paramString)
    {
      if (paramString != null)
      {
        d = paramString;
        return this;
      }
      throw new NullPointerException("Null installationUuid");
    }
    
    public B.b i(B.d paramd)
    {
      j = paramd;
      return this;
    }
    
    public B.b j(int paramInt)
    {
      c = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.b k(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null sdkVersion");
    }
    
    public B.b l(B.e parame)
    {
      i = parame;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */