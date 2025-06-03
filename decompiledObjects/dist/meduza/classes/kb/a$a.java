package kb;

public final class a$a
{
  public String a;
  public String b;
  public int c = -1;
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("://");
    int i = b.indexOf(':');
    int j = -1;
    if (i != -1)
    {
      localStringBuilder.append('[');
      localStringBuilder.append(b);
      localStringBuilder.append(']');
    }
    else
    {
      localStringBuilder.append(b);
    }
    i = c;
    if (i == -1)
    {
      str = a;
      if (str.equals("http")) {
        i = 80;
      } else if (str.equals("https")) {
        i = 443;
      } else {
        i = -1;
      }
    }
    String str = a;
    if (str.equals("http")) {
      j = 80;
    } else if (str.equals("https")) {
      j = 443;
    }
    if (i != j)
    {
      localStringBuilder.append(':');
      localStringBuilder.append(i);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     kb.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */