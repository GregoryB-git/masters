package androidx.appcompat.widget;

import android.widget.PopupWindow.OnDismissListener;

class PopupMenu$2
  implements PopupWindow.OnDismissListener
{
  public PopupMenu$2(PopupMenu paramPopupMenu) {}
  
  public void onDismiss()
  {
    PopupMenu localPopupMenu = this$0;
    PopupMenu.OnDismissListener localOnDismissListener = mOnDismissListener;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss(localPopupMenu);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.PopupMenu.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */