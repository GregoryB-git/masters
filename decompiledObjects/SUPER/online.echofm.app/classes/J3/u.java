package J3;

public final class u
  extends B.e.d.d
{
  public final String a;
  
  public u(String paramString)
  {
    a = paramString;
  }
  
  public String b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.e.d.d))
    {
      paramObject = (B.e.d.d)paramObject;
      return a.equals(((B.e.d.d)paramObject).b());
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Log{content=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.d.d.a
  {
    public String a;
    
    public B.e.d.d a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" content");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new u(a, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.d.d.a b(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null content");
    }
  }
}

/* Location:
 * Qualified Name:     J3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */