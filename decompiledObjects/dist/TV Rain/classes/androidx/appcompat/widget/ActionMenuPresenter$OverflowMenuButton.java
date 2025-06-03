package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.graphics.drawable.DrawableCompat;

class ActionMenuPresenter$OverflowMenuButton
  extends AppCompatImageView
  implements ActionMenuView.ActionMenuChildView
{
  public ActionMenuPresenter$OverflowMenuButton(final ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, R.attr.actionOverflowButtonStyle);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    TooltipCompat.setTooltipText(this, getContentDescription());
    setOnTouchListener(new ForwardingListener(this)
    {
      public ShowableListMenu getPopup()
      {
        ActionMenuPresenter.OverflowPopup localOverflowPopup = this$0.mOverflowPopup;
        if (localOverflowPopup == null) {
          return null;
        }
        return localOverflowPopup.getPopup();
      }
      
      public boolean onForwardingStarted()
      {
        this$0.showOverflowMenu();
        return true;
      }
      
      public boolean onForwardingStopped()
      {
        ActionMenuPresenter localActionMenuPresenter = this$0;
        if (mPostedOpenRunnable != null) {
          return false;
        }
        localActionMenuPresenter.hideOverflowMenu();
        return true;
      }
    });
  }
  
  public boolean needsDividerAfter()
  {
    return false;
  }
  
  public boolean needsDividerBefore()
  {
    return false;
  }
  
  public boolean performClick()
  {
    if (super.performClick()) {
      return true;
    }
    playSoundEffect(0);
    this$0.showOverflowMenu();
    return true;
  }
  
  public boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      paramInt2 = getHeight();
      paramInt1 = Math.max(i, paramInt2) / 2;
      int j = getPaddingLeft();
      int k = getPaddingRight();
      paramInt4 = getPaddingTop();
      paramInt3 = getPaddingBottom();
      k = (i + (j - k)) / 2;
      paramInt2 = (paramInt2 + (paramInt4 - paramInt3)) / 2;
      DrawableCompat.setHotspotBounds(localDrawable2, k - paramInt1, paramInt2 - paramInt1, k + paramInt1, paramInt2 + paramInt1);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */