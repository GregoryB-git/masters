package androidx.core.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ActivityOptionsCompat$Api23Impl
{
  @DoNotInline
  public static ActivityOptions makeBasic()
  {
    return ActivityOptions.makeBasic();
  }
  
  @DoNotInline
  public static ActivityOptions makeClipRevealAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return ActivityOptions.makeClipRevealAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @DoNotInline
  public static void requestUsageTimeReport(ActivityOptions paramActivityOptions, PendingIntent paramPendingIntent)
  {
    paramActivityOptions.requestUsageTimeReport(paramPendingIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */