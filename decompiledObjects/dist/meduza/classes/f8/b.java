package f8;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import w7.a.a;

public final class b
  implements a.a
{
  public h8.b a;
  public h8.b b;
  
  public final void a(int paramInt, Bundle paramBundle)
  {
    Object localObject = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[] { Integer.valueOf(paramInt), paramBundle });
    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
      Log.v("FirebaseCrashlytics", (String)localObject, null);
    }
    String str = paramBundle.getString("name");
    if (str != null)
    {
      localObject = paramBundle.getBundle("params");
      paramBundle = (Bundle)localObject;
      if (localObject == null) {
        paramBundle = new Bundle();
      }
      if ("clx".equals(paramBundle.getString("_o"))) {
        localObject = a;
      } else {
        localObject = b;
      }
      if (localObject != null) {
        ((h8.b)localObject).b(paramBundle, str);
      }
    }
  }
}

/* Location:
 * Qualified Name:     f8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */