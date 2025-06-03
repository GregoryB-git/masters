package J3;

public final class l
  extends B.e.d
{
  public final long a;
  public final String b;
  public final B.e.d.a c;
  public final B.e.d.c d;
  public final B.e.d.d e;
  
  public l(long paramLong, String paramString, B.e.d.a parama, B.e.d.c paramc, B.e.d.d paramd)
  {
    a = paramLong;
    b = paramString;
    c = parama;
    d = paramc;
    e = paramd;
  }
  
  public B.e.d.a b()
  {
    return c;
  }
  
  public B.e.d.c c()
  {
    return d;
  }
  
  public B.e.d.d d()
  {
    return e;
  }
  
  public long e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d))
    {
      Object localObject = (B.e.d)paramObject;
      if ((a == ((B.e.d)localObject).e()) && (b.equals(((B.e.d)localObject).f())) && (c.equals(((B.e.d)localObject).b())) && (d.equals(((B.e.d)localObject).c())))
      {
        paramObject = e;
        localObject = ((B.e.d)localObject).d();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return b;
  }
  
  public B.e.d.b g()
  {
    return new b(this, null);
  }
  
  public int hashCode()
  {
    long l = a;
    int i = (int)(l ^ l >>> 32);
    int j = b.hashCode();
    int k = c.hashCode();
    int m = d.hashCode();
    B.e.d.d locald = e;
    int n;
    if (locald == null) {
      n = 0;
    } else {
      n = locald.hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Event{timestamp=");
    localStringBuilder.append(a);
    localStringBuilder.append(", type=");
    localStringBuilder.append(b);
    localStringBuilder.append(", app=");
    localStringBuilder.append(c);
    localStringBuilder.append(", device=");
    localStringBuilder.append(d);
    localStringBuilder.append(", log=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.b
  {
    public Long a;
    public String b;
    public B.e.d.a c;
    public B.e.d.c d;
    public B.e.d.d e;
    
    public b() {}
    
    public b(B.e.d paramd)
    {
      a = Long.valueOf(paramd.e());
      b = paramd.f();
      c = paramd.b();
      d = paramd.c();
      e = paramd.d();
    }
    
    public B.e.d a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" timestamp");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" type");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" app");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (d == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" device");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new l(a.longValue(), b, c, d, e, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.d.b b(B.e.d.a parama)
    {
      if (parama != null)
      {
        c = parama;
        return this;
      }
      throw new NullPointerException("Null app");
    }
    
    public B.e.d.b c(B.e.d.c paramc)
    {
      if (paramc != null)
      {
        d = paramc;
        return this;
      }
      throw new NullPointerException("Null device");
    }
    
    public B.e.d.b d(B.e.d.d paramd)
    {
      e = paramd;
      return this;
    }
    
    public B.e.d.b e(long paramLong)
    {
      a = Long.valueOf(paramLong);
      return this;
    }
    
    public B.e.d.b f(String paramString)
    {
      if (paramString != null)
      {
        b = paramString;
        return this;
      }
      throw new NullPointerException("Null type");
    }
  }
}

/* Location:
 * Qualified Name:     J3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */