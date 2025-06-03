package W2;

public final class d$b
  extends d.a
{
  public final char o;
  
  public d$b(char paramChar)
  {
    o = ((char)paramChar);
  }
  
  public boolean e(char paramChar)
  {
    boolean bool;
    if (paramChar == o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CharMatcher.is('");
    localStringBuilder.append(d.a(o));
    localStringBuilder.append("')");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     W2.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */