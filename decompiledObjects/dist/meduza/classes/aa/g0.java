package aa;

import android.util.Log;
import g;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g0
{
  public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
  public final String a;
  public final String b;
  public final String c;
  
  public g0(String paramString1, String paramString2)
  {
    String str;
    if ((paramString2 != null) && (paramString2.startsWith("/topics/")))
    {
      Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[] { paramString1 }));
      str = paramString2.substring(8);
    }
    else
    {
      str = paramString2;
    }
    if ((str != null) && (d.matcher(str).matches()))
    {
      a = str;
      b = paramString1;
      c = g.e(paramString1, "!", paramString2);
      return;
    }
    throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[] { str, "[a-zA-Z0-9-_.~%]{1,900}" }));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof g0;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (g0)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { b, a });
  }
}

/* Location:
 * Qualified Name:     aa.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */