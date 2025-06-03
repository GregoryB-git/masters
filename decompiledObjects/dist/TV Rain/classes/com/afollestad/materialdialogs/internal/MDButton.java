package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.R.dimen;
import com.afollestad.materialdialogs.util.DialogUtils;

@SuppressLint({"AppCompatCustomView"})
public class MDButton
  extends TextView
{
  private Drawable defaultBackground;
  private boolean stacked = false;
  private Drawable stackedBackground;
  private int stackedEndPadding;
  private GravityEnum stackedGravity;
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    stackedEndPadding = paramContext.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
    stackedGravity = GravityEnum.END;
  }
  
  public void setAllCapsCompat(boolean paramBoolean)
  {
    setAllCaps(paramBoolean);
  }
  
  public void setDefaultSelector(Drawable paramDrawable)
  {
    defaultBackground = paramDrawable;
    if (!stacked) {
      setStacked(false, true);
    }
  }
  
  public void setStacked(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((stacked != paramBoolean1) || (paramBoolean2))
    {
      int i;
      if (paramBoolean1) {
        i = stackedGravity.getGravityInt() | 0x10;
      } else {
        i = 17;
      }
      setGravity(i);
      if (paramBoolean1) {
        i = stackedGravity.getTextAlignment();
      } else {
        i = 4;
      }
      setTextAlignment(i);
      Drawable localDrawable;
      if (paramBoolean1) {
        localDrawable = stackedBackground;
      } else {
        localDrawable = defaultBackground;
      }
      DialogUtils.setBackgroundCompat(this, localDrawable);
      if (paramBoolean1) {
        setPadding(stackedEndPadding, getPaddingTop(), stackedEndPadding, getPaddingBottom());
      }
      stacked = paramBoolean1;
    }
  }
  
  public void setStackedGravity(GravityEnum paramGravityEnum)
  {
    stackedGravity = paramGravityEnum;
  }
  
  public void setStackedSelector(Drawable paramDrawable)
  {
    stackedBackground = paramDrawable;
    if (stacked) {
      setStacked(true, true);
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */