package J3;

public final class v
  extends B.e.e
{
  public final int a;
  public final String b;
  public final String c;
  public final boolean d;
  
  public v(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    a = paramInt;
    b = paramString1;
    c = paramString2;
    d = paramBoolean;
  }
  
  public String b()
  {
    return c;
  }
  
  public int c()
  {
    return a;
  }
  
  public String d()
  {
    return b;
  }
  
  public boolean e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.e))
    {
      paramObject = (B.e.e)paramObject;
      if ((a != ((B.e.e)paramObject).c()) || (!b.equals(((B.e.e)paramObject).d())) || (!c.equals(((B.e.e)paramObject).b())) || (d != ((B.e.e)paramObject).e())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a;
    int j = b.hashCode();
    int k = c.hashCode();
    int m;
    if (d) {
      m = 1231;
    } else {
      m = 1237;
    }
    return (((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OperatingSystem{platform=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    localStringBuilder.append(b);
    localStringBuilder.append(", buildVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", jailbroken=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.e.a
  {
    public Integer a;
    public String b;
    public String c;
    public Boolean d;
    
    public B.e.e a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" platform");
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
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" buildVersion");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" jailbroken");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new v(a.intValue(), b, c, d.booleanValue(), null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.e.a b(String paramString)
    {
      if (paramString != null)
      {
        c = paramString;
        return this;
      }
      throw new NullPointerException("Null buildVersion");
    }
    
    public B.e.e.a c(boolean paramBoolean)
    {
      d = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public B.e.e.a d(int paramInt)
    {
      a = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.e.a e(String paramString)
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
 * Qualified Name:     J3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */