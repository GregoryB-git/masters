package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar.LayoutParams;

public class Toolbar$LayoutParams
  extends ActionBar.LayoutParams
{
  public static final int CUSTOM = 0;
  public static final int EXPANDED = 2;
  public static final int SYSTEM = 1;
  public int mViewType = 0;
  
  public Toolbar$LayoutParams(int paramInt)
  {
    this(-2, -1, paramInt);
  }
  
  public Toolbar$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    gravity = 8388627;
  }
  
  public Toolbar$LayoutParams(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2);
    gravity = paramInt3;
  }
  
  public Toolbar$LayoutParams(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Toolbar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public Toolbar$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    copyMarginsFromCompat(paramMarginLayoutParams);
  }
  
  public Toolbar$LayoutParams(ActionBar.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public Toolbar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    mViewType = mViewType;
  }
  
  public void copyMarginsFromCompat(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    leftMargin = leftMargin;
    topMargin = topMargin;
    rightMargin = rightMargin;
    bottomMargin = bottomMargin;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.LayoutParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */