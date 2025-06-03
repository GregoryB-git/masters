package x3;

import Q2.a.a;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Set;
import w3.a.b;

public final class c
  implements a.a
{
  public c(d paramd) {}
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    if (!a.a.contains(paramString2)) {
      return;
    }
    paramString1 = new Bundle();
    paramString1.putString("events", a.b(paramString2));
    d.a(a).a(2, paramString1);
  }
}

/* Location:
 * Qualified Name:     x3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */