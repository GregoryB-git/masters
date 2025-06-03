package androidx.drawerlayout.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;

class DrawerLayout$1
  implements AccessibilityViewCommand
{
  public DrawerLayout$1(DrawerLayout paramDrawerLayout) {}
  
  public boolean perform(@NonNull View paramView, @Nullable AccessibilityViewCommand.CommandArguments paramCommandArguments)
  {
    if ((this$0.isDrawerOpen(paramView)) && (this$0.getDrawerLockMode(paramView) != 2))
    {
      this$0.closeDrawer(paramView);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */