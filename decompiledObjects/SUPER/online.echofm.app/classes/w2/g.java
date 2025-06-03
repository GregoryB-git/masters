package w2;

import android.os.Build.VERSION;
import android.util.Log;

public final class g
  extends ClassLoader
{
  public final Class loadClass(String paramString, boolean paramBoolean)
  {
    if ("com.google.android.gms.iid.MessengerCompat".equals(paramString))
    {
      if ((Log.isLoggable("CloudMessengerCompat", 3)) || ((Build.VERSION.SDK_INT == 23) && (Log.isLoggable("CloudMessengerCompat", 3)))) {
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
      }
      return h.class;
    }
    return super.loadClass(paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */