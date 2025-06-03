package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class ActivityOptionsCompat$Api16Impl
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

/* Location:
 * Qualified Name:     androidx.core.app.ActivityOptionsCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */