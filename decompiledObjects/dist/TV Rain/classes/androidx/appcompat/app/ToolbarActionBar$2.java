package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;

class ToolbarActionBar$2
  implements Toolbar.OnMenuItemClickListener
{
  public ToolbarActionBar$2(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return this$0.mWindowCallback.onMenuItemSelected(0, paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */