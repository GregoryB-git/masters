package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class TooltipPopup
{
  private static final String TAG = "TooltipPopup";
  private final View mContentView;
  private final Context mContext;
  private final WindowManager.LayoutParams mLayoutParams;
  private final TextView mMessageView;
  private final int[] mTmpAnchorPos;
  private final int[] mTmpAppPos;
  private final Rect mTmpDisplayFrame;
  
  public TooltipPopup(@NonNull Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    mLayoutParams = localLayoutParams;
    mTmpDisplayFrame = new Rect();
    mTmpAnchorPos = new int[2];
    mTmpAppPos = new int[2];
    mContext = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(R.layout.abc_tooltip, null);
    mContentView = localView;
    mMessageView = ((TextView)localView.findViewById(R.id.message));
    localLayoutParams.setTitle(getClass().getSimpleName());
    packageName = paramContext.getPackageName();
    type = 1002;
    width = -2;
    height = -2;
    format = -3;
    windowAnimations = R.style.Animation_AppCompat_Tooltip;
    flags = 24;
  }
  
  private void computePosition(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, WindowManager.LayoutParams paramLayoutParams)
  {
    token = paramView.getApplicationWindowToken();
    int i = mContext.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
    if (paramView.getWidth() < i) {
      paramInt1 = paramView.getWidth() / 2;
    }
    if (paramView.getHeight() >= i)
    {
      j = mContext.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
      i = paramInt2 + j;
      j = paramInt2 - j;
      paramInt2 = i;
      i = j;
    }
    else
    {
      paramInt2 = paramView.getHeight();
      i = 0;
    }
    gravity = 49;
    Object localObject1 = mContext.getResources();
    if (paramBoolean) {
      j = R.dimen.tooltip_y_offset_touch;
    } else {
      j = R.dimen.tooltip_y_offset_non_touch;
    }
    int k = ((Resources)localObject1).getDimensionPixelOffset(j);
    localObject1 = getAppRootView(paramView);
    if (localObject1 == null)
    {
      Log.e("TooltipPopup", "Cannot find app view");
      return;
    }
    ((View)localObject1).getWindowVisibleDisplayFrame(mTmpDisplayFrame);
    Object localObject2 = mTmpDisplayFrame;
    if ((left < 0) && (top < 0))
    {
      localObject2 = mContext.getResources();
      j = ((Resources)localObject2).getIdentifier("status_bar_height", "dimen", "android");
      if (j != 0) {
        j = ((Resources)localObject2).getDimensionPixelSize(j);
      } else {
        j = 0;
      }
      localObject2 = ((Resources)localObject2).getDisplayMetrics();
      mTmpDisplayFrame.set(0, j, widthPixels, heightPixels);
    }
    ((View)localObject1).getLocationOnScreen(mTmpAppPos);
    paramView.getLocationOnScreen(mTmpAnchorPos);
    localObject2 = mTmpAnchorPos;
    int j = localObject2[0];
    paramView = mTmpAppPos;
    j -= paramView[0];
    localObject2[0] = j;
    localObject2[1] -= paramView[1];
    x = (j + paramInt1 - ((View)localObject1).getWidth() / 2);
    paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    mContentView.measure(paramInt1, paramInt1);
    paramInt1 = mContentView.getMeasuredHeight();
    j = mTmpAnchorPos[1];
    i = i + j - k - paramInt1;
    paramInt2 = j + paramInt2 + k;
    if (paramBoolean)
    {
      if (i >= 0) {
        y = i;
      } else {
        y = paramInt2;
      }
    }
    else if (paramInt1 + paramInt2 <= mTmpDisplayFrame.height()) {
      y = paramInt2;
    } else {
      y = i;
    }
  }
  
  private static View getAppRootView(View paramView)
  {
    View localView = paramView.getRootView();
    ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
    if (((localLayoutParams instanceof WindowManager.LayoutParams)) && (type == 2)) {
      return localView;
    }
    for (paramView = paramView.getContext(); (paramView instanceof ContextWrapper); paramView = ((ContextWrapper)paramView).getBaseContext()) {
      if ((paramView instanceof Activity)) {
        return ((Activity)paramView).getWindow().getDecorView();
      }
    }
    return localView;
  }
  
  public void hide()
  {
    if (!isShowing()) {
      return;
    }
    ((WindowManager)mContext.getSystemService("window")).removeView(mContentView);
  }
  
  public boolean isShowing()
  {
    boolean bool;
    if (mContentView.getParent() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void show(View paramView, int paramInt1, int paramInt2, boolean paramBoolean, CharSequence paramCharSequence)
  {
    if (isShowing()) {
      hide();
    }
    mMessageView.setText(paramCharSequence);
    computePosition(paramView, paramInt1, paramInt2, paramBoolean, mLayoutParams);
    ((WindowManager)mContext.getSystemService("window")).addView(mContentView, mLayoutParams);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TooltipPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */