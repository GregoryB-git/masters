package c2;

public final class b
{
  public final String a;
  
  public b(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return;
    }
    throw new NullPointerException("name is null");
  }
  
  public static b b(String paramString)
  {
    return new b(paramString);
  }
  
  public String a()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    return a.equals(a);
  }
  
  public int hashCode()
  {
    return a.hashCode() ^ 0xF4243;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Encoding{name=\"");
    localStringBuilder.append(a);
    localStringBuilder.append("\"}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     c2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */