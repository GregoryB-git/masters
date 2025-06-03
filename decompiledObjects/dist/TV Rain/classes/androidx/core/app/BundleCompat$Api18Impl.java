package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class BundleCompat$Api18Impl
{
  @DoNotInline
  public static IBinder getBinder(Bundle paramBundle, String paramString)
  {
    return paramBundle.getBinder(paramString);
  }
  
  @DoNotInline
  public static void putBinder(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    paramBundle.putBinder(paramString, paramIBinder);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.BundleCompat.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */