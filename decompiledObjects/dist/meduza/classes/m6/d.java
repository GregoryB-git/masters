package m6;

public final class d
{
  public final String a;
  public final String b;
  
  public d(String paramString1, String paramString2)
  {
    int i = paramString1.length();
    int j = 0;
    if (i <= 23) {
      j = 1;
    }
    if (j != 0)
    {
      a = paramString1;
      if (paramString2 != null)
      {
        paramString1 = paramString2;
        if (paramString2.length() > 0) {}
      }
      else
      {
        paramString1 = null;
      }
      b = paramString1;
      return;
    }
    throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", new Object[] { paramString1, Integer.valueOf(23) }));
  }
}

/* Location:
 * Qualified Name:     m6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */