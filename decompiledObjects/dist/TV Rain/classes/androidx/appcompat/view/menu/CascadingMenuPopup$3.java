package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.MenuItemHoverListener;
import java.util.List;

class CascadingMenuPopup$3
  implements MenuItemHoverListener
{
  public CascadingMenuPopup$3(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onItemHoverEnter(@NonNull final MenuBuilder paramMenuBuilder, @NonNull final MenuItem paramMenuItem)
  {
    Handler localHandler = this$0.mSubMenuHoverHandler;
    final CascadingMenuPopup.CascadingMenuInfo localCascadingMenuInfo = null;
    localHandler.removeCallbacksAndMessages(null);
    int i = this$0.mShowingMenus.size();
    for (int j = 0; j < i; j++) {
      if (paramMenuBuilder == this$0.mShowingMenus.get(j)).menu) {
        break label76;
      }
    }
    j = -1;
    label76:
    if (j == -1) {
      return;
    }
    j++;
    if (j < this$0.mShowingMenus.size()) {
      localCascadingMenuInfo = (CascadingMenuPopup.CascadingMenuInfo)this$0.mShowingMenus.get(j);
    }
    paramMenuItem = new Runnable()
    {
      public void run()
      {
        CascadingMenuPopup.CascadingMenuInfo localCascadingMenuInfo = localCascadingMenuInfo;
        if (localCascadingMenuInfo != null)
        {
          this$0.mShouldCloseImmediately = true;
          menu.close(false);
          this$0.mShouldCloseImmediately = false;
        }
        if ((paramMenuItem.isEnabled()) && (paramMenuItem.hasSubMenu())) {
          paramMenuBuilder.performItemAction(paramMenuItem, 4);
        }
      }
    };
    long l = SystemClock.uptimeMillis();
    this$0.mSubMenuHoverHandler.postAtTime(paramMenuItem, paramMenuBuilder, l + 200L);
  }
  
  public void onItemHoverExit(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    this$0.mSubMenuHoverHandler.removeCallbacksAndMessages(paramMenuBuilder);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */