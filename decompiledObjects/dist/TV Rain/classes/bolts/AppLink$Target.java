package bolts;

import android.net.Uri;

public class AppLink$Target
{
  private final String appName;
  private final String className;
  private final String packageName;
  private final Uri url;
  
  public AppLink$Target(String paramString1, String paramString2, Uri paramUri, String paramString3)
  {
    packageName = paramString1;
    className = paramString2;
    url = paramUri;
    appName = paramString3;
  }
  
  public String getAppName()
  {
    return appName;
  }
  
  public String getClassName()
  {
    return className;
  }
  
  public String getPackageName()
  {
    return packageName;
  }
  
  public Uri getUrl()
  {
    return url;
  }
}

/* Location:
 * Qualified Name:     bolts.AppLink.Target
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */