package c2;

public final class o$d
{
  public final boolean a;
  public final String b;
  public final String c;
  public final o.c d;
  
  public o$d(String paramString1, String paramString2, boolean paramBoolean, o.c paramc)
  {
    if ((!paramString2.isEmpty()) && (paramString2.charAt(0) == '/'))
    {
      if (paramString2.endsWith("/"))
      {
        b = paramString1;
        c = paramString2;
        a = paramBoolean;
        d = paramc;
        return;
      }
      throw new IllegalArgumentException("Path should end with a slash '/'");
    }
    throw new IllegalArgumentException("Path should start with a slash '/'.");
  }
}

/* Location:
 * Qualified Name:     c2.o.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */