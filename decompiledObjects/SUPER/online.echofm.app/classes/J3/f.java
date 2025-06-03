package J3;

public final class f
  extends B.d
{
  public final C a;
  public final String b;
  
  public f(C paramC, String paramString)
  {
    a = paramC;
    b = paramString;
  }
  
  public C b()
  {
    return a;
  }
  
  public String c()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.d))
    {
      Object localObject = (B.d)paramObject;
      if (a.equals(((B.d)localObject).b()))
      {
        paramObject = b;
        localObject = ((B.d)localObject).c();
        if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    String str = b;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilesPayload{files=");
    localStringBuilder.append(a);
    localStringBuilder.append(", orgId=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.d.a
  {
    public C a;
    public String b;
    
    public B.d a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" files");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new f(a, b, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public B.d.a b(C paramC)
    {
      if (paramC != null)
      {
        a = paramC;
        return this;
      }
      throw new NullPointerException("Null files");
    }
    
    public B.d.a c(String paramString)
    {
      b = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     J3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */