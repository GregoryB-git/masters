package androidx.core.app;

import android.app.Activity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import g;

@RequiresApi(31)
class ActivityCompat$Api31Impl
{
  @DoNotInline
  public static boolean isLaunchedFromBubble(@NonNull Activity paramActivity)
  {
    return g.p(paramActivity);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */