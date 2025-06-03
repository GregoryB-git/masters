package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ShowableListMenu;

class ActivityChooserView$4
  extends ForwardingListener
{
  public ActivityChooserView$4(ActivityChooserView paramActivityChooserView, View paramView)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    return this$0.getListPopupWindow();
  }
  
  public boolean onForwardingStarted()
  {
    this$0.showPopup();
    return true;
  }
  
  public boolean onForwardingStopped()
  {
    this$0.dismissPopup();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */