package J3;

public final class p
  extends B.e.d.a.b.c
{
  public final String a;
  public final String b;
  public final C c;
  public final B.e.d.a.b.c d;
  public final int e;
  
  public p(String paramString1, String paramString2, C paramC, B.e.d.a.b.c paramc, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramC;
    d = paramc;
    e = paramInt;
  }
  
  public B.e.d.a.b.c b()
  {
    return d;
  }
  
  public C c()
  {
    return c;
  }
  
  public int d()
  {
    return e;
  }
  
  public String e()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b.c))
    {
      paramObject = (B.e.d.a.b.c)paramObject;
      if (a.equals(((B.e.d.a.b.c)paramObject).f()))
      {
        Object localObject = b;
        if ((localObject == null ? ((B.e.d.a.b.c)paramObject).e() == null : ((String)localObject).equals(((B.e.d.a.b.c)paramObject).e())) && (c.equals(((B.e.d.a.b.c)paramObject).c())))
        {
          localObject = d;
          if ((localObject == null ? ((B.e.d.a.b.c)paramObject).b() == null : localObject.equals(((B.e.d.a.b.c)paramObject).b())) && (e == ((B.e.d.a.b.c)paramObject).d())) {
            break label125;
          }
        }
      }
      bool = false;
      label125:
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Exception{type=");
    localStringBuilder.append(a);
    localStringBuilder.append(", reason=");
    localStringBuilder.append(b);
    localStringBuilder.append(", frames=");
    localStringBuilder.append(c);
    localStringBuilder.append(", causedBy=");
    localStringBuilder.append(d);
    localStringBuilder.append(", overflowCount=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.c.a
  {
    public String a;
    public String b;
    public C c;
    public B.e.d.a.b.c d;
    public Integer e;
    
    public B.e.d.a.b.c a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" type");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (c == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" frames");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (e == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" overflowCount");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new p(a, b, c, d, e.intValue(), null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.a.b.c.a b(B.e.d.a.b.c paramc)
    {
      d = paramc;
      return this;
    }
    
    public B.e.d.a.b.c.a c(C paramC)
    {
      if (paramC != null)
      {
        c = paramC;
        return this;
      }
      throw new NullPointerException("Null frames");
    }
    
    public B.e.d.a.b.c.a d(int paramInt)
    {
      e = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.d.a.b.c.a e(String paramString)
    {
      b = paramString;
      return this;
    }
    
    public B.e.d.a.b.c.a f(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null type");
    }
  }
}

/* Location:
 * Qualified Name:     J3.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */