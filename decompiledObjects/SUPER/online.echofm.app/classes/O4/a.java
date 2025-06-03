package O4;

public final class a
  extends f
{
  public final String a;
  public final String b;
  
  public a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      if (paramString2 != null)
      {
        b = paramString2;
        return;
      }
      throw new NullPointerException("Null version");
    }
    throw new NullPointerException("Null libraryName");
  }
  
  public String b()
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
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      if ((!a.equals(((f)paramObject).b())) || (!b.equals(((f)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LibraryVersion{libraryName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     O4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */