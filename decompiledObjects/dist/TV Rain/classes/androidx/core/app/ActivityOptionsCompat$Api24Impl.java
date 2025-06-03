package androidx.core.app;

import android.app.ActivityOptions;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class ActivityOptionsCompat$Api24Impl
{
  @DoNotInline
  public static Rect getLaunchBounds(ActivityOptions paramActivityOptions)
  {
    return paramActivityOptions.getLaunchBounds();
  }
  
  @DoNotInline
  public static ActivityOptions setLaunchBounds(ActivityOptions paramActivityOptions, Rect paramRect)
  {
    return paramActivityOptions.setLaunchBounds(paramRect);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */