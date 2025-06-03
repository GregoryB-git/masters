package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.DecorToolbar;

class ToolbarActionBar$ToolbarMenuCallback
  implements AppCompatDelegateImpl.ActionBarMenuCallback
{
  public ToolbarActionBar$ToolbarMenuCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0) {
      return new View(this$0.mDecorToolbar.getContext());
    }
    return null;
  }
  
  public boolean onPreparePanel(int paramInt)
  {
    if (paramInt == 0)
    {
      ToolbarActionBar localToolbarActionBar = this$0;
      if (!mToolbarMenuPrepared)
      {
        mDecorToolbar.setMenuPrepared();
        this$0.mToolbarMenuPrepared = true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.ToolbarMenuCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */