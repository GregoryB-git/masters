package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import q0;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  private static final int MIN_DELAY_MS = 500;
  private static final int MIN_SHOW_TIME_MS = 500;
  private final Runnable mDelayedHide = new q0(this, 2);
  private final Runnable mDelayedShow = new q0(this, 3);
  public boolean mDismissed = false;
  public boolean mPostedHide = false;
  public boolean mPostedShow = false;
  public long mStartTime = -1L;
  
  public ContentLoadingProgressBar(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentLoadingProgressBar(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  @UiThread
  private void hideOnUiThread()
  {
    mDismissed = true;
    removeCallbacks(mDelayedShow);
    mPostedShow = false;
    long l1 = System.currentTimeMillis();
    long l2 = mStartTime;
    l1 -= l2;
    if ((l1 < 500L) && (l2 != -1L))
    {
      if (!mPostedHide)
      {
        postDelayed(mDelayedHide, 500L - l1);
        mPostedHide = true;
      }
    }
    else {
      setVisibility(8);
    }
  }
  
  private void removeCallbacks()
  {
    removeCallbacks(mDelayedHide);
    removeCallbacks(mDelayedShow);
  }
  
  @UiThread
  private void showOnUiThread()
  {
    mStartTime = -1L;
    mDismissed = false;
    removeCallbacks(mDelayedHide);
    mPostedHide = false;
    if (!mPostedShow)
    {
      postDelayed(mDelayedShow, 500L);
      mPostedShow = true;
    }
  }
  
  public void hide()
  {
    post(new q0(this, 1));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    removeCallbacks();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks();
  }
  
  public void show()
  {
    post(new q0(this, 0));
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.ContentLoadingProgressBar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */