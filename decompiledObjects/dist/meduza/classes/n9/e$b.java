package n9;

public final class e$b
{
  public static final b d = new b(null, null, 0);
  public final int a;
  public final b b;
  public final String c;
  
  public e$b(b paramb, String paramString, int paramInt)
  {
    b = paramb;
    c = paramString;
    a = paramInt;
  }
  
  public final String toString()
  {
    int i = a;
    if (i == 0) {
      return "";
    }
    if (i == 1) {
      return c;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.toString());
    localStringBuilder.append(".");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n9.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */