package v6;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
{
  public static final Pattern a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  
  static
  {
    Pattern.compile("\\\\.");
  }
  
  public static String a(String paramString)
  {
    Object localObject1 = paramString;
    if (!TextUtils.isEmpty(paramString))
    {
      Matcher localMatcher = a.matcher(paramString);
      localObject1 = null;
      while (localMatcher.find())
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new StringBuffer();
        }
        int i = localMatcher.group().charAt(0);
        if (i != 12) {
          if (i != 13) {
            if (i != 34) {
              if (i != 47) {
                if (i != 92) {
                  switch (i)
                  {
                  default: 
                    localObject1 = localObject2;
                    break;
                  case 10: 
                    localObject1 = "\\\\n";
                    break;
                  case 9: 
                    localObject1 = "\\\\t";
                    break;
                  case 8: 
                    localObject1 = "\\\\b";
                  }
                }
              }
            }
          }
        }
        for (;;)
        {
          localMatcher.appendReplacement((StringBuffer)localObject2, (String)localObject1);
          localObject1 = localObject2;
          break;
          localObject1 = "\\\\\\\\";
          continue;
          localObject1 = "\\\\/";
          continue;
          localObject1 = "\\\\\\\"";
          continue;
          localObject1 = "\\\\r";
          continue;
          localObject1 = "\\\\f";
        }
      }
      if (localObject1 == null)
      {
        localObject1 = paramString;
      }
      else
      {
        localMatcher.appendTail((StringBuffer)localObject1);
        localObject1 = ((StringBuffer)localObject1).toString();
      }
    }
    return (String)localObject1;
  }
}

/* Location:
 * Qualified Name:     v6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */