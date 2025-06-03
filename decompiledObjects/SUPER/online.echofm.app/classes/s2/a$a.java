package s2;

public final class a$a
{
  public final String a;
  public final boolean b;
  
  public a$a(String paramString, boolean paramBoolean)
  {
    a = paramString;
    b = paramBoolean;
  }
  
  public String a()
  {
    return a;
  }
  
  public boolean b()
  {
    return b;
  }
  
  public String toString()
  {
    String str = a;
    boolean bool = b;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
    localStringBuilder.append("{");
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    localStringBuilder.append(bool);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     s2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */