package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ActivityOptionsCompat
{
  public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
  public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
  
  @NonNull
  public static ActivityOptionsCompat makeBasic()
  {
    return new ActivityOptionsCompatImpl(Api23Impl.makeBasic());
  }
  
  @NonNull
  public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new ActivityOptionsCompatImpl(Api23Impl.makeClipRevealAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  @NonNull
  public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context paramContext, int paramInt1, int paramInt2)
  {
    return new ActivityOptionsCompatImpl(Api16Impl.makeCustomAnimation(paramContext, paramInt1, paramInt2));
  }
  
  @NonNull
  public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new ActivityOptionsCompatImpl(Api16Impl.makeScaleUpAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  @NonNull
  public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity paramActivity, @NonNull View paramView, @NonNull String paramString)
  {
    return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(paramActivity, paramView, paramString));
  }
  
  @NonNull
  public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity paramActivity, @Nullable androidx.core.util.Pair<View, String>... paramVarArgs)
  {
    Object localObject = null;
    if (paramVarArgs != null)
    {
      android.util.Pair[] arrayOfPair = new android.util.Pair[paramVarArgs.length];
      for (int i = 0;; i++)
      {
        localObject = arrayOfPair;
        if (i >= paramVarArgs.length) {
          break;
        }
        localObject = paramVarArgs[i];
        arrayOfPair[i] = android.util.Pair.create((View)first, (String)second);
      }
    }
    return new ActivityOptionsCompatImpl(Api21Impl.makeSceneTransitionAnimation(paramActivity, (android.util.Pair[])localObject));
  }
  
  @NonNull
  public static ActivityOptionsCompat makeTaskLaunchBehind()
  {
    return new ActivityOptionsCompatImpl(Api21Impl.makeTaskLaunchBehind());
  }
  
  @NonNull
  public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View paramView, @NonNull Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return new ActivityOptionsCompatImpl(Api16Impl.makeThumbnailScaleUpAnimation(paramView, paramBitmap, paramInt1, paramInt2));
  }
  
  @Nullable
  public Rect getLaunchBounds()
  {
    return null;
  }
  
  public void requestUsageTimeReport(@NonNull PendingIntent paramPendingIntent) {}
  
  @NonNull
  public ActivityOptionsCompat setLaunchBounds(@Nullable Rect paramRect)
  {
    return this;
  }
  
  @Nullable
  public Bundle toBundle()
  {
    return null;
  }
  
  public void update(@NonNull ActivityOptionsCompat paramActivityOptionsCompat) {}
  
  @RequiresApi(16)
  public static class ActivityOptionsCompatImpl
    extends ActivityOptionsCompat
  {
    private final ActivityOptions mActivityOptions;
    
    public ActivityOptionsCompatImpl(ActivityOptions paramActivityOptions)
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
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static ActivityOptions makeCustomAnimation(Context paramContext, int paramInt1, int paramInt2)
    {
      return ActivityOptions.makeCustomAnimation(paramContext, paramInt1, paramInt2);
    }
    
    @DoNotInline
    public static ActivityOptions makeScaleUpAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return ActivityOptions.makeScaleUpAnimation(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static ActivityOptions makeThumbnailScaleUpAnimation(View paramView, Bitmap paramBitmap, int paramInt1, int paramInt2)
    {
      return ActivityOptions.makeThumbnailScaleUpAnimation(paramView, paramBitmap, paramInt1, paramInt2);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static ActivityOptions makeSceneTransitionAnimation(Activity paramActivity, View paramView, String paramString)
    {
      return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramView, paramString);
    }
    
    @SafeVarargs
    @DoNotInline
    public static ActivityOptions makeSceneTransitionAnimation(Activity paramActivity, android.util.Pair<View, String>... paramVarArgs)
    {
      return ActivityOptions.makeSceneTransitionAnimation(paramActivity, paramVarArgs);
    }
    
    @DoNotInline
    public static ActivityOptions makeTaskLaunchBehind()
    {
      return ActivityOptions.makeTaskLaunchBehind();
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
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
  
  @RequiresApi(24)
  public static class Api24Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */