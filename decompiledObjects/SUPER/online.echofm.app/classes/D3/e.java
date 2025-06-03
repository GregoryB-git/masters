package D3;

import E3.f;
import F3.b;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Locale;
import w3.a.b;

public class e
  implements a.b
{
  public b a;
  public b b;
  
  public static void b(b paramb, String paramString, Bundle paramBundle)
  {
    if (paramb == null) {
      return;
    }
    paramb.t(paramString, paramBundle);
  }
  
  public void a(int paramInt, Bundle paramBundle)
  {
    f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[] { Integer.valueOf(paramInt), paramBundle }));
    if (paramBundle == null) {
      return;
    }
    String str = paramBundle.getString("name");
    if (str != null)
    {
      Bundle localBundle = paramBundle.getBundle("params");
      paramBundle = localBundle;
      if (localBundle == null) {
        paramBundle = new Bundle();
      }
      c(str, paramBundle);
    }
  }
  
  public final void c(String paramString, Bundle paramBundle)
  {
    b localb;
    if ("clx".equals(paramBundle.getString("_o"))) {
      localb = a;
    } else {
      localb = b;
    }
    b(localb, paramString, paramBundle);
  }
  
  public void d(b paramb)
  {
    b = paramb;
  }
  
  public void e(b paramb)
  {
    a = paramb;
  }
}

/* Location:
 * Qualified Name:     D3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */