package D5;

public enum o$g
{
  public final String o;
  
  public o$g(String paramString1)
  {
    o = paramString1;
  }
  
  public static g e(String paramString)
  {
    for (g localg : )
    {
      String str = o;
      if (((str == null) && (paramString == null)) || ((str != null) && (str.equals(paramString)))) {
        return localg;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("No such HapticFeedbackType: ");
    ((StringBuilder)???).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)???).toString());
  }
}

/* Location:
 * Qualified Name:     D5.o.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */