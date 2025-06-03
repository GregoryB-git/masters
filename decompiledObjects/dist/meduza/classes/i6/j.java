package i6;

import android.os.Build.VERSION;
import android.util.Log;
import java.util.Objects;

public final class j
  extends ClassLoader
{
  public final Class loadClass(String paramString, boolean paramBoolean)
  {
    if (Objects.equals(paramString, "com.google.android.gms.iid.MessengerCompat"))
    {
      if ((Log.isLoggable("CloudMessengerCompat", 3)) || ((Build.VERSION.SDK_INT == 23) && (Log.isLoggable("CloudMessengerCompat", 3)))) {
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
      }
      return k.class;
    }
    return super.loadClass(paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     i6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */