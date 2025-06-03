package Y3;

import java.util.Random;

public abstract class j
{
  public static final Random a = new Random();
  public static long b = 0L;
  public static final int[] c = new int[12];
  
  public static final String a(String paramString)
  {
    n.g(paramString);
    Integer localInteger = m.k(paramString);
    if (localInteger != null)
    {
      if (localInteger.intValue() == Integer.MIN_VALUE) {
        return "[MIN_NAME]";
      }
      return String.valueOf(localInteger.intValue() - 1);
    }
    paramString = new StringBuilder(paramString);
    if (paramString.charAt(paramString.length() - 1) == '-')
    {
      if (paramString.length() == 1) {
        return String.valueOf(Integer.MAX_VALUE);
      }
      return paramString.substring(0, paramString.length() - 1);
    }
    paramString.setCharAt(paramString.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(paramString.charAt(paramString.length() - 1)) - 1));
    paramString.append(new String(new char[786 - paramString.length()]).replace("\000", "z"));
    return paramString.toString();
  }
  
  public static final String b(String paramString)
  {
    n.g(paramString);
    Integer localInteger = m.k(paramString);
    if (localInteger != null)
    {
      if (localInteger.intValue() == Integer.MAX_VALUE) {
        return String.valueOf('-');
      }
      return String.valueOf(localInteger.intValue() + 1);
    }
    paramString = new StringBuilder(paramString);
    if (paramString.length() < 786)
    {
      paramString.append('-');
      return paramString.toString();
    }
    for (int i = paramString.length() - 1; (i >= 0) && (paramString.charAt(i) == 'z'); i--) {}
    if (i == -1) {
      return "[MAX_KEY]";
    }
    char c1 = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(paramString.charAt(i)) + 1);
    int j = i + 1;
    paramString.replace(i, j, String.valueOf(c1));
    return paramString.substring(0, j);
  }
}

/* Location:
 * Qualified Name:     Y3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */