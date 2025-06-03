package H3;

public final class c
  extends D.a
{
  public final String a;
  public final String b;
  
  public c(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      b = paramString2;
      return;
    }
    throw new NullPointerException("Null crashlyticsInstallId");
  }
  
  public String c()
  {
    return a;
  }
  
  public String d()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof D.a))
    {
      Object localObject = (D.a)paramObject;
      if (a.equals(((D.a)localObject).c()))
      {
        paramObject = b;
        localObject = ((D.a)localObject).d();
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
    localStringBuilder.append("InstallIds{crashlyticsInstallId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", firebaseInstallationId=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     H3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */