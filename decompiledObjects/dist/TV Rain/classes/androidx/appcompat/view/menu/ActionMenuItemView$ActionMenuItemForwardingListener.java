package androidx.appcompat.view.menu;

import androidx.appcompat.widget.ForwardingListener;

class ActionMenuItemView$ActionMenuItemForwardingListener
  extends ForwardingListener
{
  public ActionMenuItemView$ActionMenuItemForwardingListener(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public ShowableListMenu getPopup()
  {
    ActionMenuItemView.PopupCallback localPopupCallback = this$0.mPopupCallback;
    if (localPopupCallback != null) {
      return localPopupCallback.getPopup();
    }
    return null;
  }
  
  public boolean onForwardingStarted()
  {
    ActionMenuItemView localActionMenuItemView = this$0;
    Object localObject = mItemInvoker;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((MenuBuilder.ItemInvoker)localObject).invokeItem(mItemData))
      {
        localObject = getPopup();
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((ShowableListMenu)localObject).isShowing()) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItemView.ActionMenuItemForwardingListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */