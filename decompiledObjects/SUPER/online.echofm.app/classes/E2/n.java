package E2;

import java.util.regex.Pattern;

public abstract class n
{
  public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}

/* Location:
 * Qualified Name:     E2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */