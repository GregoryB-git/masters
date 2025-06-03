package J3;

public final class i
  extends B.e.a
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  
  public i(String paramString1, String paramString2, String paramString3, B.e.a.b paramb, String paramString4, String paramString5, String paramString6)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
    f = paramString6;
  }
  
  public String b()
  {
    return e;
  }
  
  public String c()
  {
    return f;
  }
  
  public String d()
  {
    return c;
  }
  
  public String e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.a))
    {
      paramObject = (B.e.a)paramObject;
      if ((a.equals(((B.e.a)paramObject).e())) && (b.equals(((B.e.a)paramObject).h())))
      {
        String str = c;
        if (str == null ? ((B.e.a)paramObject).d() == null : str.equals(((B.e.a)paramObject).d()))
        {
          ((B.e.a)paramObject).g();
          str = d;
          if (str == null ? ((B.e.a)paramObject).f() == null : str.equals(((B.e.a)paramObject).f()))
          {
            str = e;
            if (str == null ? ((B.e.a)paramObject).b() == null : str.equals(((B.e.a)paramObject).b()))
            {
              str = f;
              paramObject = ((B.e.a)paramObject).c();
              if (str == null ? paramObject == null : str.equals(paramObject)) {
                break label178;
              }
            }
          }
        }
      }
      bool = false;
      label178:
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return d;
  }
  
  public B.e.a.b g()
  {
    return null;
  }
  
  public String h()
  {
    return b;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    String str = c;
    int k = 0;
    int m;
    if (str == null) {
      m = 0;
    } else {
      m = str.hashCode();
    }
    str = d;
    int n;
    if (str == null) {
      n = 0;
    } else {
      n = str.hashCode();
    }
    str = e;
    int i1;
    if (str == null) {
      i1 = 0;
    } else {
      i1 = str.hashCode();
    }
    str = f;
    if (str != null) {
      k = str.hashCode();
    }
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * -721379959 ^ n) * 1000003 ^ i1) * 1000003 ^ k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Application{identifier=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    localStringBuilder.append(b);
    localStringBuilder.append(", displayVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", organization=");
    localStringBuilder.append(null);
    localStringBuilder.append(", installationUuid=");
    localStringBuilder.append(d);
    localStringBuilder.append(", developmentPlatform=");
    localStringBuilder.append(e);
    localStringBuilder.append(", developmentPlatformVersion=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.a.a
  {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    
    public B.e.a a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" identifier");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" version");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new i(a, b, c, null, d, e, f, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.a.a b(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public B.e.a.a c(String paramString)
    {
      f = paramString;
      return this;
    }
    
    public B.e.a.a d(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public B.e.a.a e(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null identifier");
    }
    
    public B.e.a.a f(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public B.e.a.a g(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null version");
    }
  }
}

/* Location:
 * Qualified Name:     J3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */