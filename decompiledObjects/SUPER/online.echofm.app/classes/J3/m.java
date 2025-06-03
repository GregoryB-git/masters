package J3;

public final class m
  extends B.e.d.a
{
  public final B.e.d.a.b a;
  public final C b;
  public final C c;
  public final Boolean d;
  public final int e;
  
  public m(B.e.d.a.b paramb, C paramC1, C paramC2, Boolean paramBoolean, int paramInt)
  {
    a = paramb;
    b = paramC1;
    c = paramC2;
    d = paramBoolean;
    e = paramInt;
  }
  
  public Boolean b()
  {
    return d;
  }
  
  public C c()
  {
    return b;
  }
  
  public B.e.d.a.b d()
  {
    return a;
  }
  
  public C e()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a))
    {
      paramObject = (B.e.d.a)paramObject;
      if (a.equals(((B.e.d.a)paramObject).d()))
      {
        Object localObject = b;
        if (localObject == null ? ((B.e.d.a)paramObject).c() == null : ((C)localObject).equals(((B.e.d.a)paramObject).c()))
        {
          localObject = c;
          if (localObject == null ? ((B.e.d.a)paramObject).e() == null : ((C)localObject).equals(((B.e.d.a)paramObject).e()))
          {
            localObject = d;
            if ((localObject == null ? ((B.e.d.a)paramObject).b() == null : ((Boolean)localObject).equals(((B.e.d.a)paramObject).b())) && (e == ((B.e.d.a)paramObject).f())) {
              break label141;
            }
          }
        }
      }
      bool = false;
      label141:
      return bool;
    }
    return false;
  }
  
  public int f()
  {
    return e;
  }
  
  public B.e.d.a.a g()
  {
    return new b(this, null);
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
      k = ((C)localObject).hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((C)localObject).hashCode();
    }
    localObject = d;
    if (localObject != null) {
      j = ((Boolean)localObject).hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ j) * 1000003 ^ e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Application{execution=");
    localStringBuilder.append(a);
    localStringBuilder.append(", customAttributes=");
    localStringBuilder.append(b);
    localStringBuilder.append(", internalKeys=");
    localStringBuilder.append(c);
    localStringBuilder.append(", background=");
    localStringBuilder.append(d);
    localStringBuilder.append(", uiOrientation=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.a
  {
    public B.e.d.a.b a;
    public C b;
    public C c;
    public Boolean d;
    public Integer e;
    
    public b() {}
    
    public b(B.e.d.a parama)
    {
      a = parama.d();
      b = parama.c();
      c = parama.e();
      d = parama.b();
      e = Integer.valueOf(parama.f());
    }
    
    public B.e.d.a a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" execution");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (e == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" uiOrientation");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new m(a, b, c, d, e.intValue(), null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.e.d.a.a b(Boolean paramBoolean)
    {
      d = paramBoolean;
      return this;
    }
    
    public B.e.d.a.a c(C paramC)
    {
      b = paramC;
      return this;
    }
    
    public B.e.d.a.a d(B.e.d.a.b paramb)
    {
      if (paramb != null)
      {
        a = paramb;
        return this;
      }
      throw new NullPointerException("Null execution");
    }
    
    public B.e.d.a.a e(C paramC)
    {
      c = paramC;
      return this;
    }
    
    public B.e.d.a.a f(int paramInt)
    {
      e = Integer.valueOf(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */