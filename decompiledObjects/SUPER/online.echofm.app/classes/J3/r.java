package J3;

public final class r
  extends B.e.d.a.b.e
{
  public final String a;
  public final int b;
  public final C c;
  
  public r(String paramString, int paramInt, C paramC)
  {
    a = paramString;
    b = paramInt;
    c = paramC;
  }
  
  public C b()
  {
    return c;
  }
  
  public int c()
  {
    return b;
  }
  
  public String d()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.a.b.e))
    {
      paramObject = (B.e.d.a.b.e)paramObject;
      if ((!a.equals(((B.e.d.a.b.e)paramObject).d())) || (b != ((B.e.d.a.b.e)paramObject).c()) || (!c.equals(((B.e.d.a.b.e)paramObject).b()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Thread{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(b);
    localStringBuilder.append(", frames=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.a.b.e.a
  {
    public String a;
    public Integer b;
    public C c;
    
    public B.e.d.a.b.e a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("");
        ((StringBuilder)localObject1).append(" name");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" importance");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject2 = localObject1;
      if (c == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" frames");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new r(a, b.intValue(), c, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.a.b.e.a b(C paramC)
    {
      if (paramC != null)
      {
        c = paramC;
        return this;
      }
      throw new NullPointerException("Null frames");
    }
    
    public B.e.d.a.b.e.a c(int paramInt)
    {
      b = Integer.valueOf(paramInt);
      return this;
    }
    
    public B.e.d.a.b.e.a d(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null name");
    }
  }
}

/* Location:
 * Qualified Name:     J3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */