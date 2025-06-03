package v4;

public final class a
  extends d
{
  public final String a;
  public final String b;
  public final String c;
  public final f d;
  public final d.b e;
  
  public a(String paramString1, String paramString2, String paramString3, f paramf, d.b paramb)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramf;
    e = paramb;
  }
  
  public f b()
  {
    return d;
  }
  
  public String c()
  {
    return b;
  }
  
  public String d()
  {
    return c;
  }
  
  public d.b e()
  {
    return e;
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
      Object localObject = a;
      if (localObject == null ? ((d)paramObject).f() == null : ((String)localObject).equals(((d)paramObject).f()))
      {
        localObject = b;
        if (localObject == null ? ((d)paramObject).c() == null : ((String)localObject).equals(((d)paramObject).c()))
        {
          localObject = c;
          if (localObject == null ? ((d)paramObject).d() == null : ((String)localObject).equals(((d)paramObject).d()))
          {
            localObject = d;
            if (localObject == null ? ((d)paramObject).b() == null : localObject.equals(((d)paramObject).b()))
            {
              localObject = e;
              paramObject = ((d)paramObject).e();
              if (localObject == null ? paramObject == null : localObject.equals(paramObject)) {
                break label175;
              }
            }
          }
        }
      }
      bool = false;
      label175:
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return a;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((String)localObject).hashCode();
    }
    localObject = b;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((String)localObject).hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    localObject = e;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("InstallationResponse{uri=");
    localStringBuilder.append(a);
    localStringBuilder.append(", fid=");
    localStringBuilder.append(b);
    localStringBuilder.append(", refreshToken=");
    localStringBuilder.append(c);
    localStringBuilder.append(", authToken=");
    localStringBuilder.append(d);
    localStringBuilder.append(", responseCode=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends d.a
  {
    public String a;
    public String b;
    public String c;
    public f d;
    public d.b e;
    
    public d a()
    {
      return new a(a, b, c, d, e, null);
    }
    
    public d.a b(f paramf)
    {
      d = paramf;
      return this;
    }
    
    public d.a c(String paramString)
    {
      b = paramString;
      return this;
    }
    
    public d.a d(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public d.a e(d.b paramb)
    {
      e = paramb;
      return this;
    }
    
    public d.a f(String paramString)
    {
      a = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     v4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */