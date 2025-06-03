package u6;

public final class F
{
  public final String a;
  
  public F(String paramString)
  {
    a = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('<');
    localStringBuilder.append(a);
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u6.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */