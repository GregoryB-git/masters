package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TooltipCompatHandler
  implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
  private static final long HOVER_HIDE_TIMEOUT_MS = 15000L;
  private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000L;
  private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500L;
  private static final String TAG = "TooltipCompatHandler";
  private static TooltipCompatHandler sActiveHandler;
  private static TooltipCompatHandler sPendingHandler;
  private final View mAnchor;
  private int mAnchorX;
  private int mAnchorY;
  private boolean mForceNextChangeSignificant;
  private boolean mFromTouch;
  private final Runnable mHideRunnable = new a(this, 1);
  private final int mHoverSlop;
  private TooltipPopup mPopup;
  private final Runnable mShowRunnable = new a(this, 0);
  private final CharSequence mTooltipText;
  
  private TooltipCompatHandler(View paramView, CharSequence paramCharSequence)
  {
    mAnchor = paramView;
    mTooltipText = paramCharSequence;
    mHoverSlop = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(paramView.getContext()));
    forceNextChangeSignificant();
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  private void cancelPendingShow()
  {
    mAnchor.removeCallbacks(mShowRunnable);
  }
  
  private void forceNextChangeSignificant()
  {
    mForceNextChangeSignificant = true;
  }
  
  private void scheduleShow()
  {
    mAnchor.postDelayed(mShowRunnable, ViewConfiguration.getLongPressTimeout());
  }
  
  private static void setPendingHandler(TooltipCompatHandler paramTooltipCompatHandler)
  {
    TooltipCompatHandler localTooltipCompatHandler = sPendingHandler;
    if (localTooltipCompatHandler != null) {
      localTooltipCompatHandler.cancelPendingShow();
    }
    sPendingHandler = paramTooltipCompatHandler;
    if (paramTooltipCompatHandler != null) {
      paramTooltipCompatHandler.scheduleShow();
    }
  }
  
  public static void setTooltipText(View paramView, CharSequence paramCharSequence)
  {
    TooltipCompatHandler localTooltipCompatHandler = sPendingHandler;
    if ((localTooltipCompatHandler != null) && (mAnchor == paramView)) {
      setPendingHandler(null);
    }
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramCharSequence = sActiveHandler;
      if ((paramCharSequence != null) && (mAnchor == paramView)) {
        paramCharSequence.hide();
      }
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
    }
    else
    {
      new TooltipCompatHandler(paramView, paramCharSequence);
    }
  }
  
  private boolean updateAnchorPos(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    if ((!mForceNextChangeSignificant) && (Math.abs(i - mAnchorX) <= mHoverSlop) && (Math.abs(j - mAnchorY) <= mHoverSlop)) {
      return false;
    }
    mAnchorX = i;
    mAnchorY = j;
    mForceNextChangeSignificant = false;
    return true;
  }
  
  public void hide()
  {
    if (sActiveHandler == this)
    {
      sActiveHandler = null;
      TooltipPopup localTooltipPopup = mPopup;
      if (localTooltipPopup != null)
      {
        localTooltipPopup.hide();
        mPopup = null;
        forceNextChangeSignificant();
        mAnchor.removeOnAttachStateChangeListener(this);
      }
      else
      {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      }
    }
    if (sPendingHandler == this) {
      setPendingHandler(null);
    }
    mAnchor.removeCallbacks(mHideRunnable);
  }
  
  public boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((mPopup != null) && (mFromTouch)) {
      return false;
    }
    paramView = (AccessibilityManager)mAnchor.getContext().getSystemService("accessibility");
    if ((paramView.isEnabled()) && (paramView.isTouchExplorationEnabled())) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    if (i != 7)
    {
      if (i == 10)
      {
        forceNextChangeSignificant();
        hide();
      }
    }
    else if ((mAnchor.isEnabled()) && (mPopup == null) && (updateAnchorPos(paramMotionEvent))) {
      setPendingHandler(this);
    }
    return false;
  }
  
  public boolean onLongClick(View paramView)
  {
    mAnchorX = (paramView.getWidth() / 2);
    mAnchorY = (paramView.getHeight() / 2);
    show(true);
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    hide();
  }
  
  public void show(boolean paramBoolean)
  {
    if (!ViewCompat.isAttachedToWindow(mAnchor)) {
      return;
    }
    setPendingHandler(null);
    Object localObject = sActiveHandler;
    if (localObject != null) {
      ((TooltipCompatHandler)localObject).hide();
    }
    sActiveHandler = this;
    mFromTouch = paramBoolean;
    localObject = new TooltipPopup(mAnchor.getContext());
    mPopup = ((TooltipPopup)localObject);
    ((TooltipPopup)localObject).show(mAnchor, mAnchorX, mAnchorY, mFromTouch, mTooltipText);
    mAnchor.addOnAttachStateChangeListener(this);
    long l;
    if (mFromTouch)
    {
      l = 2500L;
    }
    else
    {
      int i;
      if ((ViewCompat.getWindowSystemUiVisibility(mAnchor) & 0x1) == 1)
      {
        l = 3000L;
        i = ViewConfiguration.getLongPressTimeout();
      }
      else
      {
        l = 15000L;
        i = ViewConfiguration.getLongPressTimeout();
      }
      l -= i;
    }
    mAnchor.removeCallbacks(mHideRunnable);
    mAnchor.postDelayed(mHideRunnable, l);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TooltipCompatHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */