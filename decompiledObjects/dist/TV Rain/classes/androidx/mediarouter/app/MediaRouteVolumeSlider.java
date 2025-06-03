package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.AppCompatSeekBar;
import z2;

class MediaRouteVolumeSlider
  extends AppCompatSeekBar
{
  private static final String TAG = "MediaRouteVolumeSlider";
  private int mBackgroundColor;
  private final float mDisabledAlpha;
  private boolean mHideThumb;
  private int mProgressAndThumbColor;
  private Drawable mThumb;
  
  public MediaRouteVolumeSlider(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.seekBarStyle);
  }
  
  public MediaRouteVolumeSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(paramContext);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    int i;
    if (isEnabled()) {
      i = 255;
    } else {
      i = (int)(mDisabledAlpha * 255.0F);
    }
    mThumb.setColorFilter(mProgressAndThumbColor, PorterDuff.Mode.SRC_IN);
    mThumb.setAlpha(i);
    Object localObject1 = getProgressDrawable();
    Object localObject2 = localObject1;
    if ((localObject1 instanceof LayerDrawable))
    {
      localObject1 = (LayerDrawable)getProgressDrawable();
      localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(16908301);
      ((LayerDrawable)localObject1).findDrawableByLayerId(16908288).setColorFilter(mBackgroundColor, PorterDuff.Mode.SRC_IN);
    }
    ((Drawable)localObject2).setColorFilter(mProgressAndThumbColor, PorterDuff.Mode.SRC_IN);
    ((Drawable)localObject2).setAlpha(i);
  }
  
  public void setColor(int paramInt)
  {
    setColor(paramInt, paramInt);
  }
  
  public void setColor(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder;
    if (mProgressAndThumbColor != paramInt1)
    {
      if (Color.alpha(paramInt1) != 255)
      {
        localStringBuilder = z2.t("Volume slider progress and thumb color cannot be translucent: #");
        localStringBuilder.append(Integer.toHexString(paramInt1));
        Log.e("MediaRouteVolumeSlider", localStringBuilder.toString());
      }
      mProgressAndThumbColor = paramInt1;
    }
    if (mBackgroundColor != paramInt2)
    {
      if (Color.alpha(paramInt2) != 255)
      {
        localStringBuilder = z2.t("Volume slider background color cannot be translucent: #");
        localStringBuilder.append(Integer.toHexString(paramInt2));
        Log.e("MediaRouteVolumeSlider", localStringBuilder.toString());
      }
      mBackgroundColor = paramInt2;
    }
  }
  
  public void setHideThumb(boolean paramBoolean)
  {
    if (mHideThumb == paramBoolean) {
      return;
    }
    mHideThumb = paramBoolean;
    Drawable localDrawable;
    if (paramBoolean) {
      localDrawable = null;
    } else {
      localDrawable = mThumb;
    }
    super.setThumb(localDrawable);
  }
  
  public void setThumb(Drawable paramDrawable)
  {
    mThumb = paramDrawable;
    if (mHideThumb) {
      paramDrawable = null;
    }
    super.setThumb(paramDrawable);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteVolumeSlider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */