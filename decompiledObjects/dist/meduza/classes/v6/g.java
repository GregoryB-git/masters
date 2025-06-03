package v6;

import android.text.TextUtils;
import java.util.regex.Pattern;

public final class g
{
  static
  {
    Pattern.compile("\\$\\{(.*?)\\}");
  }
  
  public static String a(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = null;
    }
    return str;
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}

/* Location:
 * Qualified Name:     v6.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */