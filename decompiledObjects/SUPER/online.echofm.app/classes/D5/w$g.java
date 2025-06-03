package D5;

public enum w$g
{
  public final String o;
  
  public w$g(String paramString1)
  {
    o = paramString1;
  }
  
  public static g e(String paramString)
  {
    for (g localg : ) {
      if (o.equals(paramString)) {
        return localg;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("No such TextInputType: ");
    ((StringBuilder)???).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)???).toString());
  }
}

/* Location:
 * Qualified Name:     D5.w.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */