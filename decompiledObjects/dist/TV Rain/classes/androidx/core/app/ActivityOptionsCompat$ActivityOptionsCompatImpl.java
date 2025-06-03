package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class ActivityOptionsCompat$ActivityOptionsCompatImpl
  extends ActivityOptionsCompat
{
  private final ActivityOptions mActivityOptions;
  
  public ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions paramActivityOptions)
  {
    mActivityOptions = paramActivityOptions;
  }
  
  public Rect getLaunchBounds()
  {
    return ActivityOptionsCompat.Api24Impl.getLaunchBounds(mActivityOptions);
  }
  
  public void requestUsageTimeReport(@NonNull PendingIntent paramPendingIntent)
  {
    ActivityOptionsCompat.Api23Impl.requestUsageTimeReport(mActivityOptions, paramPendingIntent);
  }
  
  @NonNull
  public ActivityOptionsCompat setLaunchBounds(@Nullable Rect paramRect)
  {
    return new ActivityOptionsCompatImpl(ActivityOptionsCompat.Api24Impl.setLaunchBounds(mActivityOptions, paramRect));
  }
  
  public Bundle toBundle()
  {
    return mActivityOptions.toBundle();
  }
  
  public void update(@NonNull ActivityOptionsCompat paramActivityOptionsCompat)
  {
    if ((paramActivityOptionsCompat instanceof ActivityOptionsCompatImpl))
    {
      paramActivityOptionsCompat = (ActivityOptionsCompatImpl)paramActivityOptionsCompat;
      mActivityOptions.update(mActivityOptions);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */