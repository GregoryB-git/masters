package J3;

public final class n
  extends B.e.d.a.b
{
  public final C a;
  public final B.e.d.a.b.c b;
  public final B.a c;
  public final B.e.d.a.b.d d;
  public final C e;
  
  public n(C paramC1, B.e.d.a.b.c paramc, B.a parama, B.e.d.a.b.d paramd, C paramC2)
  {
    a = paramC1;
    b = paramc;
    c = parama;
    d = paramd;
    e = paramC2;
  }
  
  public B.a b()
  {
    return c;
  }
  
  public C c()
  {
    return e;
  }
  
  public B.e.d.a.b.c d()
  {
    return b;
  }
  
  public B.e.d.a.b.d e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b))
    {
      paramObject = (B.e.d.a.b)paramObject;
      Object localObject = a;
      if (localObject == null ? ((B.e.d.a.b)paramObject).f() == null : ((C)localObject).equals(((B.e.d.a.b)paramObject).f()))
      {
        localObject = b;
        if (localObject == null ? ((B.e.d.a.b)paramObject).d() == null : localObject.equals(((B.e.d.a.b)paramObject).d()))
        {
          localObject = c;
          if ((localObject == null ? ((B.e.d.a.b)paramObject).b() == null : localObject.equals(((B.e.d.a.b)paramObject).b())) && (d.equals(((B.e.d.a.b)paramObject).e())) && (e.equals(((B.e.d.a.b)paramObject).c()))) {
            break label144;
          }
        }
      }
      bool = false;
      label144:
      return bool;
    }
    return false;
  }
  
  public C f()
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
      j = ((C)localObject).hashCode();
    }
    localObject = b;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = localObject.hashCode();
    }
    localObject = c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ i) * 1000003 ^ d.hashCode()) * 1000003 ^ e.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Execution{threads=");
    localStringBuilder.append(a);
    localStringBuilder.append(", exception=");
    localStringBuilder.append(b);
    localStringBuilder.append(", appExitInfo=");
    localStringBuilder.append(c);
    localStringBuilder.append(", signal=");
    localStringBuilder.append(d);
    localStringBuilder.append(", binaries=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.b
  {
    public C a;
    public B.e.d.a.b.c b;
    public B.a c;
    public B.e.d.a.b.d d;
    public C e;
    
    public B.e.d.a.b a()
    {
      Object localObject1 = d;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" signal");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" binaries");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new n(a, b, c, d, e, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.d.a.b.b b(B.a parama)
    {
      c = parama;
      return this;
    }
    
    public B.e.d.a.b.b c(C paramC)
    {
      if (paramC != null)
      {
        e = paramC;
        return this;
      }
      throw new NullPointerException("Null binaries");
    }
    
    public B.e.d.a.b.b d(B.e.d.a.b.c paramc)
    {
      b = paramc;
      return this;
    }
    
    public B.e.d.a.b.b e(B.e.d.a.b.d paramd)
    {
      if (paramd != null)
      {
        d = paramd;
        return this;
      }
      throw new NullPointerException("Null signal");
    }
    
    public B.e.d.a.b.b f(C paramC)
    {
      a = paramC;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */