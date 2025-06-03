package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.NonNull;

public final class ActivityManagerCompat
{
  public static boolean isLowRamDevice(@NonNull ActivityManager paramActivityManager)
  {
    return paramActivityManager.isLowRamDevice();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */