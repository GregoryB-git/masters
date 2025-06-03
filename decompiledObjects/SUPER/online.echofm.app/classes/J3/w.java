package J3;

public final class w
  extends B.e.f
{
  public final String a;
  
  public w(String paramString)
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
    if ((paramObject instanceof B.e.f))
    {
      paramObject = (B.e.f)paramObject;
      return a.equals(((B.e.f)paramObject).b());
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
    localStringBuilder.append("User{identifier=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.e.f.a
  {
    public String a;
    
    public B.e.f a()
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
      if (((String)localObject2).isEmpty()) {
        return new w(a, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.e.f.a b(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null identifier");
    }
  }
}

/* Location:
 * Qualified Name:     J3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */