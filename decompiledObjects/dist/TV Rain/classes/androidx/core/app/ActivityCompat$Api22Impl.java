package androidx.core.app;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class ActivityCompat$Api22Impl
{
  @DoNotInline
  public static Uri getReferrer(Activity paramActivity)
  {
    return paramActivity.getReferrer();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityCompat.Api22Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */