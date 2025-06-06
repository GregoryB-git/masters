package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface MenuBuilder$Callback
{
  public abstract boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem);
  
  public abstract void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder);
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuBuilder.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */