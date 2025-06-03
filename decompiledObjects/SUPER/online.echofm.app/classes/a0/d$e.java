package a0;

import android.os.Bundle;

public final class d$e
{
  public final String a;
  public final Bundle b;
  
  public d$e(String paramString, Bundle paramBundle)
  {
    if (paramString != null)
    {
      a = paramString;
      b = paramBundle;
      return;
    }
    throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
  }
  
  public Bundle c()
  {
    return b;
  }
  
  public String d()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     a0.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */