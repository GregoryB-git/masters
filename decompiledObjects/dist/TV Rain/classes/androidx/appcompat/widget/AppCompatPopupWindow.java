package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.styleable;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow
  extends PopupWindow
{
  private static final boolean COMPAT_OVERLAP_ANCHOR = false;
  private boolean mOverlapAnchor;
  
  public AppCompatPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, @AttrRes int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public AppCompatPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, @AttrRes int paramInt1, @StyleRes int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, R.styleable.PopupWindow, paramInt1, paramInt2);
    paramInt1 = R.styleable.PopupWindow_overlapAnchor;
    if (paramContext.hasValue(paramInt1)) {
      setSupportOverlapAnchor(paramContext.getBoolean(paramInt1, false));
    }
    setBackgroundDrawable(paramContext.getDrawable(R.styleable.PopupWindow_android_popupBackground));
    paramContext.recycle();
  }
  
  private void setSupportOverlapAnchor(boolean paramBoolean)
  {
    if (COMPAT_OVERLAP_ANCHOR) {
      mOverlapAnchor = paramBoolean;
    } else {
      PopupWindowCompat.setOverlapAnchor(this, paramBoolean);
    }
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (COMPAT_OVERLAP_ANCHOR)
    {
      i = paramInt2;
      if (mOverlapAnchor) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (COMPAT_OVERLAP_ANCHOR)
    {
      i = paramInt2;
      if (mOverlapAnchor) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2;
    if (COMPAT_OVERLAP_ANCHOR)
    {
      i = paramInt2;
      if (mOverlapAnchor) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.update(paramView, paramInt1, i, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatPopupWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */