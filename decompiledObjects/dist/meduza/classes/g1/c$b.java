package g1;

import android.os.Bundle;

public final class c$b
{
  public final String a;
  public final Bundle b;
  
  public c$b(Bundle paramBundle, String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      b = paramBundle;
      return;
    }
    throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
  }
}

/* Location:
 * Qualified Name:     g1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */