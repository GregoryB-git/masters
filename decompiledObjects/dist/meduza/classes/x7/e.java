package x7;

import android.os.BaseBundle;
import android.os.Bundle;
import e7.j3;
import o7.r;

public final class e
  implements j3
{
  public e(c paramc) {}
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    if ((paramString1 != null) && ((b.a.contains(paramString2) ^ true)))
    {
      paramString1 = new Bundle();
      paramString1.putString("name", paramString2);
      paramString1.putLong("timestampInMillis", paramLong);
      paramString1.putBundle("params", paramBundle);
      ((f8.b)a.a).a(3, paramString1);
    }
  }
}

/* Location:
 * Qualified Name:     x7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */