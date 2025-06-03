package M4;

import F4.a;
import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

public abstract class m
{
  public static String[] a;
  
  public static boolean a(URI paramURI, Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = localResources.getIdentifier("firebase_performance_whitelisted_domains", "array", paramContext.getPackageName());
    if (i == 0) {
      return true;
    }
    a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
    if (a == null) {
      a = localResources.getStringArray(i);
    }
    paramURI = paramURI.getHost();
    if (paramURI == null) {
      return true;
    }
    paramContext = a;
    int j = paramContext.length;
    for (i = 0; i < j; i++) {
      if (paramURI.contains(paramContext[i])) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     M4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */