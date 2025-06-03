package x7;

import android.os.BaseBundle;
import android.os.Bundle;
import b.a0;
import e7.j3;
import java.util.HashSet;

public final class d
  implements j3
{
  public d(a parama) {}
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    if (!a.a.contains(paramString2)) {
      return;
    }
    paramBundle = new Bundle();
    paramString1 = b.a;
    paramString1 = va.a.i(paramString2, a0.d, a0.b);
    if (paramString1 != null) {
      paramString2 = paramString1;
    }
    paramBundle.putString("events", paramString2);
    ((f8.b)a.b).a(2, paramBundle);
  }
}

/* Location:
 * Qualified Name:     x7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */