package R2;

import android.os.Bundle;
import android.text.TextUtils;

public final class K5
  implements U5
{
  public K5(D5 paramD5) {}
  
  public final void r(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      if (D5.h(a) != null) {
        D5.h(a).j().G().b("AppId not known when logging event", paramString2);
      }
    }
    else {
      a.e().D(new J5(this, paramString1, paramString2, paramBundle));
    }
  }
}

/* Location:
 * Qualified Name:     R2.K5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */