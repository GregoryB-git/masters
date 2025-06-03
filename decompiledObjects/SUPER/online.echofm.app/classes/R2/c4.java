package R2;

import android.os.Bundle;
import android.text.TextUtils;

public final class c4
  implements U5
{
  public c4(C3 paramC3) {}
  
  public final void r(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      a.Y("auto", paramString2, paramBundle, paramString1);
      return;
    }
    a.y0("auto", paramString2, paramBundle);
  }
}

/* Location:
 * Qualified Name:     R2.c4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */