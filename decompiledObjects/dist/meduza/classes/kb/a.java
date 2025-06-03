package kb;

public final class a
{
  public final String a;
  public final int b;
  public final String c;
  
  public a(a parama)
  {
    String str = a;
    a = b;
    int i = c;
    if (i == -1) {
      if (str.equals("http")) {
        i = 80;
      } else if (str.equals("https")) {
        i = 443;
      } else {
        i = -1;
      }
    }
    b = i;
    c = parama.toString();
  }
  
  public static int a(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    char c1 = 'a';
    if ((paramChar >= 'a') && (paramChar <= 'f')) {}
    do
    {
      return paramChar - c1 + 10;
      c1 = 'A';
    } while ((paramChar >= 'A') && (paramChar <= 'F'));
    return -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof a)) && (c.equals(c))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return c.hashCode();
  }
  
  public final String toString()
  {
    return c;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     kb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */