package x3;

import Q2.a.a;
import android.os.BaseBundle;
import android.os.Bundle;
import w3.a.b;

public final class e
  implements a.a
{
  public e(f paramf) {}
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    if ((paramString1 != null) && (a.i(paramString2)))
    {
      paramString1 = new Bundle();
      paramString1.putString("name", paramString2);
      paramString1.putLong("timestampInMillis", paramLong);
      paramString1.putBundle("params", paramBundle);
      f.a(a).a(3, paramString1);
    }
  }
}

/* Location:
 * Qualified Name:     x3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */