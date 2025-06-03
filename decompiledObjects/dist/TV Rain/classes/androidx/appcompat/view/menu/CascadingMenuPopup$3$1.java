package androidx.appcompat.view.menu;

import android.view.MenuItem;

class CascadingMenuPopup$3$1
  implements Runnable
{
  public CascadingMenuPopup$3$1(CascadingMenuPopup.3 param3, CascadingMenuPopup.CascadingMenuInfo paramCascadingMenuInfo, MenuItem paramMenuItem, MenuBuilder paramMenuBuilder) {}
  
  public void run()
  {
    CascadingMenuPopup.CascadingMenuInfo localCascadingMenuInfo = val$nextInfo;
    if (localCascadingMenuInfo != null)
    {
      this$1.this$0.mShouldCloseImmediately = true;
      menu.close(false);
      this$1.this$0.mShouldCloseImmediately = false;
    }
    if ((val$item.isEnabled()) && (val$item.hasSubMenu())) {
      val$menu.performItemAction(val$item, 4);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.3.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */